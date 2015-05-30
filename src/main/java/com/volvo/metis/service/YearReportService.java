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
        log.debug("Save report for user {} with id {}, year {}, month {}", user.getLogin(), user.getId(), year, month);
        Query query = new Query(Criteria.where("createdBy").is(user.getId()).where("year").is(year));
        Update update = Update.update(Year.getMonthName(month) + "." + report.getKind(), report);
        mongoOperations.updateFirst(query, update, "T_REPORT");
    }

    private Year getReport(User user, Integer year) {
        return yearReportRepository.findOneByCreatedByAndYear(user.getId(), year);
    }

    public Report getMonthReport(Integer year, int monthNum, String kind) {
        User user = userService.getUserWithAuthorities();
        Year yearReport = getReport(user, year);
        if (yearReport == null) {
            yearReport = new Year(year);
        }
        if (yearReport.get(monthNum) == null) {
            yearReport.set(monthNum, new Month());
            yearReport = yearReportRepository.save(yearReport);
        }
        return yearReport.get(monthNum, kind);
    }

    public String getMonth(int month) {
        return new DateFormatSymbols().getMonths()[month - 1].toLowerCase();
    }
}
