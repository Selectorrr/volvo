package com.volvo.metis.repository;

import com.volvo.metis.domain.Report;
import org.joda.time.DateTime;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Report entity.
 */
public interface ReportRepository extends MongoRepository<Report, String> {

    Report findOneByCreatedByAndMonth(String userId, Integer month);

}
