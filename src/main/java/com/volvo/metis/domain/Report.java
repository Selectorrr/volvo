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

    /**
     * Вкладка "Подержанные автомобили"
     */
    private TabSecondHandCars tabSecondHandCars;

    /**
     * Вкладка "Слес. цех"
     */
    private TabFlittingShop tabFlittingShop;

    /**
     * Вкладка "Кузовной цех"
     */
    private TabBodyShop tabBodyShop;

    /**
     * Вкладка "Запчасти"
     */
    private TabSpares tabSpares;

    /**
     * Вкладка "Другие отделы"
     */
    private TabOtherDepartments tabOtherDepartments;

    /**
     * Вкладка "Непрямые расходы"
     */
    private TabIndirectCharges tabIndirectCharges;

    /**
     * Вкладка "Баланс"
     */
    private TabBalance tabBalance;

    /**
     * Вкладка "Итоговые данные"
     */
    private TabTotalData tabTotalData;

    /**
     * Вкладка "Численность персонала"
     */
    private TabStaffQuantity tabStaffQuantity;

}
