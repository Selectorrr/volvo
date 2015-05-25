package com.volvo.metis.repository;

import com.volvo.metis.domain.YearReport;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Report entity.
 */
public interface YearReportRepository extends MongoRepository<YearReport, String> {

//    YearReport findOneByCreatedByAndMonth(String userId, Integer month);

    YearReport findOneByCreatedByAndYear(String userId, Integer year);
}
