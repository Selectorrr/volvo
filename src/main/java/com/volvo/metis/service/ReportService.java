package com.volvo.metis.service;

import com.volvo.metis.domain.Report;
import com.volvo.metis.domain.User;
import com.volvo.metis.repository.ReportRepository;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
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


    public Report getCurrentReport() {
        User user = userService.getUserWithAuthorities();
        Report report = getCurrentReport(user);
        if (report == null) {
            // TODO: type
            report = Report.createNewReport("month");
            reportRepository.save(report);
            log.debug("Created new report for user with id {} and login {}", user.getId(), user.getLogin());
        }
        return report;
    }

    public void saveReport(Report report) {
        reportRepository.save(report);
    }

    private Report getCurrentReport(User user) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTime dateTimeStart = localDateTime.dayOfMonth().withMinimumValue().millisOfDay().withMinimumValue().toDateTime();
        DateTime dateTimeEnd = localDateTime.dayOfMonth().withMaximumValue().millisOfDay().withMaximumValue().toDateTime();
        return reportRepository.findOneByCreatedByAndCreatedDateBetween(user.getId(), dateTimeStart, dateTimeEnd);
    }
}
