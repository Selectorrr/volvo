package com.volvo.metis.domain;

public class Report {

    public static final String STATUS_DRAFT = "DRAFT";
    public static final String STATUS_UNDER_CONSIDERATION = "UNDER_CONSIDERATION";
    public static final String STATUS_APPROVED = "APPROVED";

    public Report() {
    }

    public Report(String kind) {
        this.kind = kind;
    }

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

    private String kind; //вид отчета план/факт

    private String status = STATUS_DRAFT;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
