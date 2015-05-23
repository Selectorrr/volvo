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

    private Integer month;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TabNewCars getTabNewCars() {
        return tabNewCars;
    }

    public void setTabNewCars(TabNewCars tabNewCars) {
        this.tabNewCars = tabNewCars;
    }

    public TabSecondHandCars getTabSecondHandCars() {
        return tabSecondHandCars;
    }

    public void setTabSecondHandCars(TabSecondHandCars tabSecondHandCars) {
        this.tabSecondHandCars = tabSecondHandCars;
    }

    public TabFlittingShop getTabFlittingShop() {
        return tabFlittingShop;
    }

    public void setTabFlittingShop(TabFlittingShop tabFlittingShop) {
        this.tabFlittingShop = tabFlittingShop;
    }

    public TabBodyShop getTabBodyShop() {
        return tabBodyShop;
    }

    public void setTabBodyShop(TabBodyShop tabBodyShop) {
        this.tabBodyShop = tabBodyShop;
    }

    public TabSpares getTabSpares() {
        return tabSpares;
    }

    public void setTabSpares(TabSpares tabSpares) {
        this.tabSpares = tabSpares;
    }

    public TabOtherDepartments getTabOtherDepartments() {
        return tabOtherDepartments;
    }

    public void setTabOtherDepartments(TabOtherDepartments tabOtherDepartments) {
        this.tabOtherDepartments = tabOtherDepartments;
    }

    public TabIndirectCharges getTabIndirectCharges() {
        return tabIndirectCharges;
    }

    public void setTabIndirectCharges(TabIndirectCharges tabIndirectCharges) {
        this.tabIndirectCharges = tabIndirectCharges;
    }

    public TabBalance getTabBalance() {
        return tabBalance;
    }

    public void setTabBalance(TabBalance tabBalance) {
        this.tabBalance = tabBalance;
    }

    public TabTotalData getTabTotalData() {
        return tabTotalData;
    }

    public void setTabTotalData(TabTotalData tabTotalData) {
        this.tabTotalData = tabTotalData;
    }

    public TabStaffQuantity getTabStaffQuantity() {
        return tabStaffQuantity;
    }

    public void setTabStaffQuantity(TabStaffQuantity tabStaffQuantity) {
        this.tabStaffQuantity = tabStaffQuantity;
    }

    public static Report createNewReport(String type) {
        Report report = new Report();
        report.setType(type);
        return report;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }
}
