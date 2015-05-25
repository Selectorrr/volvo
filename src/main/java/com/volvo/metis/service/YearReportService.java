package com.volvo.metis.service;

import com.volvo.metis.domain.MonthReport;
import com.volvo.metis.domain.User;
import com.volvo.metis.domain.YearReport;
import com.volvo.metis.repository.YearReportRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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


    public void saveReport(Integer year, Integer month, MonthReport monthReport) {
//        DateTime reportMonth = getMinDateTime(report.getCreatedDate().toLocalDateTime());
//        // TODO: сравнить с 10 числом текущего месяца
//        DateTime currentMonth = getMinDateTime(LocalDateTime.now());
//        if (reportMonth.isBefore(currentMonth)) {
//            return;
//        }
        User user = userService.getUserWithAuthorities();
        //todo: переписать на 1 запрос т.к. возможна ситуация гонки
        YearReport report = yearReportRepository.findOneByCreatedByAndYear(user.getId(), year);
        report.set(month, monthReport);
        yearReportRepository.save(report);
    }

    private YearReport getReport(User user, Integer year) {
        return yearReportRepository.findOneByCreatedByAndYear(user.getId(), year);
    }

    public MonthReport getMonthReport(Integer year, int monthNum) {
        User user = userService.getUserWithAuthorities();
        YearReport yearReport = getReport(user, year);
        if (yearReport == null) {
            yearReport = new YearReport();
            yearReport.set(monthNum, new MonthReport());
            yearReport.setYear(year);
            yearReport = yearReportRepository.save(yearReport);
        }
        return yearReport.get(monthNum);
    }

    public String getMonth(int month) {
        return new DateFormatSymbols().getMonths()[month - 1].toLowerCase();
    }
}
