package com.volvo.metis.service;

import com.volvo.metis.domain.Month;
import com.volvo.metis.domain.Report;
import com.volvo.metis.domain.User;
import com.volvo.metis.domain.Year;
import com.volvo.metis.repository.YearReportRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.text.DateFormatSymbols;
import java.util.List;

/**
 * Service class for managing reports.
 */
@Service
public class YearReportService {

    private final Logger log = LoggerFactory.getLogger(YearReportService.class);

    @Inject
    private UserService userService;

    @Inject
    private YearReportRepository yearReportRepository;

    @Inject
    private MongoOperations mongoOperations;


    public void saveReport(Integer year, Integer month, Report report) {
//        DateTime reportMonth = getMinDateTime(report.getCreatedDate().toLocalDateTime());
//        // TODO: сравнить с 10 числом текущего месяца
//        DateTime currentMonth = getMinDateTime(LocalDateTime.now());
//        if (reportMonth.isBefore(currentMonth)) {
//            return;
//        }
        User user = userService.getUserWithAuthorities();
        mongoOperations.updateFirst(new Query(Criteria.where("createdBy").is(user.getId()).where("year").is(year)),
                Update.update(Year.getMonthName(month) + "." + report.getKind(), report), "T_REPORT");
    }

    public List<Year> findByYear(Integer year) {
        return yearReportRepository.findByYear(year);
    }

    private Year getReport(User user, Integer year) {
        return yearReportRepository.findOneByCreatedByAndYear(user.getId(), year);
    }

    public Report getMonthReport(Integer year, Integer monthNum, String kind) {
        User user = userService.getUserWithAuthorities();
        Year yearReport = getReport(user, year);
        if (yearReport == null) {
            yearReport = new Year();
            yearReport.setCode(user.getLogin());
        }
        if (yearReport.get(monthNum) == null) {
            yearReport.set(monthNum, new Month());
            yearReport.setYear(year);
            yearReport = yearReportRepository.save(yearReport);
        }
        return yearReport.get(monthNum, kind);
    }

    public String getMonth(int month) {
        return new DateFormatSymbols().getMonths()[month - 1].toLowerCase();
    }
}
