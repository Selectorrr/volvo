package com.volvo.metis.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.volvo.metis.domain.TabNewCars;
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
     * Данные вкладки "Новые автомобили" за текущий период.
     */
    @RequestMapping(value = "/current-report/tab-new-cars",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public TabNewCars getCurrentTabNewCars() {
        log.debug("REST request to get tab new cars for current report");
        return reportService.getCurrentTabNewCars();
    }

    /**
     * Сохранение данных вкладки "Новые автомобили" за текущий период.
     */
    @RequestMapping(value = "/current-report/save-tab-new-cars",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public void saveCurrentTabNewCars(@RequestBody TabNewCars tabNewCars) {
        log.debug("REST request to save tab new cars for current report");
        reportService.saveCurrentTabNewCars(tabNewCars);
    }


}
