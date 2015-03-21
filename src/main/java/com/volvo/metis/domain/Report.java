package com.volvo.metis.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Отчет
 */
@Document(collection = "T_REPORT")
public class Report extends AbstractAuditingEntity implements Serializable {

    @Id
    private String id;

    /**
     * Тип отчета (годовой/месячный)
     */
    private String type;

    /**
     * Вкладка "Новые автомобили"
     */
    private TabNewCars tabNewCars;


}
