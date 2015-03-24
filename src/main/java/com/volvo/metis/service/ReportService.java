package com.volvo.metis.service;

import com.volvo.metis.domain.Report;
import com.volvo.metis.domain.TabNewCars;
import com.volvo.metis.domain.User;
import com.volvo.metis.repository.ReportRepository;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

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


    public TabNewCars getCurrentTabNewCars() {
        User user = userService.getUserWithAuthorities();
        Report report = getCurrentReport(user);
        if (report == null) {
            // TODO: type
            report = Report.createNewReport("month");
            reportRepository.save(report);
            log.debug("Created new report for user with id {} and login {}", user.getId(), user.getLogin());
        }
        return report.getTabNewCars();
    }

    public void saveCurrentTabNewCars(TabNewCars tabNewCars) {
        User user = userService.getUserWithAuthorities();
        Report report = getCurrentReport(user);
        report.setTabNewCars(tabNewCars);
        reportRepository.save(report);
    }

    private Report getCurrentReport(User user) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime start = localDateTime.withDayOfMonth(1).withHourOfDay(0).withMinuteOfHour(0).withSecondOfMinute(0).withMillisOfSecond(0);
        LocalDateTime end = localDateTime.withDayOfMonth(31).withHourOfDay(23).withMinuteOfHour(59).withSecondOfMinute(59).withMillisOfSecond(999);
        DateTime dateTimeStart = start.toDateTime();
        DateTime dateTimeEnd = end.toDateTime();
        List<Report> reportList = reportRepository.findAllByCreatedByAndCreatedDateBetween(user.getLogin(), dateTimeStart, dateTimeEnd);
        return reportList.isEmpty() ? null : reportList.get(0);
    }
}
