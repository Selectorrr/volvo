package com.volvo.metis.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.volvo.metis.domain.Report;
import com.volvo.metis.service.YearReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

/**
 * REST controller for managing reports.
 */
@RestController
@RequestMapping("/api/rest")
public class ReportResource {

    private final Logger log = LoggerFactory.getLogger(ReportResource.class);

    @Inject
    private YearReportService yearReportService;

    /**
     * Отчет за конкретный период.
     */
    @RequestMapping(value = "/reports/{year}/{month}/{kind}",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public Report get(@PathVariable(value = "year") Integer year, @PathVariable(value = "month") Integer month, @PathVariable(value = "kind") String kind) {
        log.debug("REST request to get month report: {}/{}, kind: {}", year, month, kind);
        return yearReportService.getMonthReport(year, month, kind);
    }

    /**
     * Сохранение отчета за текущий период.
     */
    @RequestMapping(value = "/reports/{year}/{month}/{kind}",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public void saveReport(@PathVariable(value = "year") Integer year, @PathVariable(value = "month") Integer month,
                           @PathVariable(value = "kind") String kind, @RequestBody Report report) {
        log.debug("REST request to save current report");
        yearReportService.saveReport(year, month, report);
    }

}
