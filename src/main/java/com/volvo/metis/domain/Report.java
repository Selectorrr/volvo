package com.volvo.metis.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * Отчет
 */
@Document(collection = "T_REPORT")
public class Report extends AbstractAuditingEntity implements Serializable {

    @Id
    private String id;

    @Field("type")
    private String type;

    /**
     * Вкладка "Новые автомобили"
     */
    @Field("tab_new_cars")
    private TabNewCars tabNewCars;


}
