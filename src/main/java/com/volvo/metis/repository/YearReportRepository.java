package com.volvo.metis.repository;

import com.volvo.metis.domain.Year;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Spring Data MongoDB repository for the Report entity.
 */
public interface YearReportRepository extends MongoRepository<Year, String> {

//    Year findOneByCreatedByAndMonth(String userId, Integer month);

    Year findOneByCreatedByAndYear(String userId, Integer year);

    List<Year> findByYear(Integer year);
}
