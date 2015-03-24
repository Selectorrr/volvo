package com.volvo.metis.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.volvo.metis.domain.Report;
import com.volvo.metis.service.ReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

/**
 * REST controller for managing reports.
 */
@RestController
@RequestMapping("/api")
public class ReportResource {

    private final Logger log = LoggerFactory.getLogger(ReportResource.class);

    @Inject
    private ReportService reportService;

    /**
     * Отчет за текущий период.
     */
    @RequestMapping(value = "/current-report",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public Report getCurrentReport() {
        log.debug("REST request to get current report");
        return reportService.getCurrentReport();
    }

    /**
     * Сохранение отчета за текущий период.
     */
    @RequestMapping(value = "/save-report",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public void saveReport(@RequestBody Report report) {
        log.debug("REST request to save current report");
        reportService.saveReport(report);
    }


}
