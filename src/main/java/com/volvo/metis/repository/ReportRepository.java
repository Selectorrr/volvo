package com.volvo.metis.repository;

import com.volvo.metis.domain.Report;
import org.joda.time.DateTime;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Spring Data MongoDB repository for the Report entity.
 */
public interface ReportRepository extends MongoRepository<Report, String> {

    List<Report> findAllByCreatedByAndCreatedDateBetween(String userId, DateTime fromDate, DateTime toDate);

}
