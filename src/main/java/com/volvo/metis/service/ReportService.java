package com.volvo.metis.service;

import com.volvo.metis.domain.Report;
import com.volvo.metis.domain.User;
import com.volvo.metis.repository.ReportRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Service class for managing reports.
 */
@Service
public class ReportService {

    private final Logger log = LoggerFactory.getLogger(ReportService.class);

    @Inject
    private UserService userService;

    @Inject
    private ReportRepository reportRepository;


    public void saveReport(Report report) {
//        DateTime reportMonth = getMinDateTime(report.getCreatedDate().toLocalDateTime());
//        // TODO: сравнить с 10 числом текущего месяца
//        DateTime currentMonth = getMinDateTime(LocalDateTime.now());
//        if (reportMonth.isBefore(currentMonth)) {
//            return;
//        }
        reportRepository.save(report);
    }

    private Report getReport(User user, Integer month) {
        return reportRepository.findOneByCreatedByAndMonth(user.getId(), month);
    }

    public Report getMonthReport(int monthNum) {
        User user = userService.getUserWithAuthorities();
        ;
        Report report = getReport(user, monthNum);
        if (report == null) {
            report = Report.createNewReport("month");
            report.setMonth(monthNum);
            report = reportRepository.save(report);
        }
        return report;
    }
}
