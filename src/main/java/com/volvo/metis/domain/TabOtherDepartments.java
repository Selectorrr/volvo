package com.volvo.metis.domain;

import java.io.Serializable;

/**
 * Вкладка "Другие отделы"
 */
public class TabOtherDepartments implements Serializable {

    /**
     * Прокат а/м --> Выручка от проката а/м
     */
    private RowContent carsRentEarnings;

    /**
     * ----------------------------------------------
     */

    /**
     * Прямые расходы --> Амортизация
     */
    private RowContent directChargesAmortization;

    /**
     * Прямые расходы --> Проценты
     */
    private RowContent directChargesInterests;

    /**
     * Прямые расходы --> Другие прямые расходы
     */
    private RowContent directChargesOtherDirectCharges;

    /**
     * Прямые расходы --> Итого прямые расходы
     */
    private RowContent directChargesTotalDirectCharges;

    /**
     * Прямые расходы --> Итого ВП отдела
     */
    private RowContent directChargesTotalGrossProfit;

    /**
     * ----------------------------------------------
     */

    /**
     * Расходы --> Зарплата непродуктивного персонала
     */
    private RowContent chargesNonproductiveStaffSalary;

    /**
     * Расходы --> Другие расходы
     */
    private RowContent chargesOtherCharges;

    /**
     * Расходы --> Итого расходов
     */
    private RowContent chargesTotalCharges;

    /**
     * Расходы --> Прибыль по отделу
     */
    private RowContent chargesTotalIncoming;

    /**
     * ----------------------------------------------
     */

    /**
     * Статистика --> Прокат а/м - Флит (кол-во)
     */
    private RowContent statisticsRentCarsFlitQuantity;

    /**
     * ----------------------------------------------
     */

    /**
     * Лизинг а/м --> Продажи и ВП
     */
    private RowContent leasingSalesAndGrossProfit;

    /**
     * ----------------------------------------------
     */

    /**
     * Расходы 2 --> Амортизация
     */
    private RowContent charges2Amortization;

    /**
     * Расходы 2 --> Проценты
     */
    private RowContent charges2Interests;

    /**
     * Расходы 2 --> Зарплата непродуктивного персонала
     */
    private RowContent charges2NonproductiveStaffSalary;

    /**
     * Расходы 2 --> Другие расходы
     */
    private RowContent charges2OtherCharges;

    /**
     * Расходы 2 --> Итого расходов
     */
    private RowContent charges2TotalCharges;

    /**
     * Расходы 2 --> Прибыль по отделу
     */
    private RowContent charges2TotalIncoming;

    /**
     * ----------------------------------------------
     */

    /**
     * Другие отделы --> Продажи и ВП
     */
    private RowContent otherDepartmentsSalesAndGrossProfit;

    /**
     * ----------------------------------------------
     */

    /**
     * Расходы 3 --> Зарплата непродуктивного персонала
     */
    private RowContent charges3NonproductiveStaffSalary;

    /**
     * Расходы 3 --> Другие расходы
     */
    private RowContent charges3OtherCharges;

    /**
     * Расходы 3 --> Итого расходов
     */
    private RowContent charges3TotalCharges;

    /**
     * Расходы 3 --> Прибыль по отделу
     */
    private RowContent charges3TotalIncoming;

    /**
     * ----------------------------------------------
     */

    public RowContent getCarsRentEarnings() {
        return carsRentEarnings;
    }

    public void setCarsRentEarnings(RowContent carsRentEarnings) {
        this.carsRentEarnings = carsRentEarnings;
    }

    public RowContent getDirectChargesAmortization() {
        return directChargesAmortization;
    }

    public void setDirectChargesAmortization(RowContent directChargesAmortization) {
        this.directChargesAmortization = directChargesAmortization;
    }

    public RowContent getDirectChargesInterests() {
        return directChargesInterests;
    }

    public void setDirectChargesInterests(RowContent directChargesInterests) {
        this.directChargesInterests = directChargesInterests;
    }

    public RowContent getDirectChargesOtherDirectCharges() {
        return directChargesOtherDirectCharges;
    }

    public void setDirectChargesOtherDirectCharges(RowContent directChargesOtherDirectCharges) {
        this.directChargesOtherDirectCharges = directChargesOtherDirectCharges;
    }

    public RowContent getDirectChargesTotalDirectCharges() {
        return directChargesTotalDirectCharges;
    }

    public void setDirectChargesTotalDirectCharges(RowContent directChargesTotalDirectCharges) {
        this.directChargesTotalDirectCharges = directChargesTotalDirectCharges;
    }

    public RowContent getDirectChargesTotalGrossProfit() {
        return directChargesTotalGrossProfit;
    }

    public void setDirectChargesTotalGrossProfit(RowContent directChargesTotalGrossProfit) {
        this.directChargesTotalGrossProfit = directChargesTotalGrossProfit;
    }

    public RowContent getChargesNonproductiveStaffSalary() {
        return chargesNonproductiveStaffSalary;
    }

    public void setChargesNonproductiveStaffSalary(RowContent chargesNonproductiveStaffSalary) {
        this.chargesNonproductiveStaffSalary = chargesNonproductiveStaffSalary;
    }

    public RowContent getChargesOtherCharges() {
        return chargesOtherCharges;
    }

    public void setChargesOtherCharges(RowContent chargesOtherCharges) {
        this.chargesOtherCharges = chargesOtherCharges;
    }

    public RowContent getChargesTotalCharges() {
        return chargesTotalCharges;
    }

    public void setChargesTotalCharges(RowContent chargesTotalCharges) {
        this.chargesTotalCharges = chargesTotalCharges;
    }

    public RowContent getChargesTotalIncoming() {
        return chargesTotalIncoming;
    }

    public void setChargesTotalIncoming(RowContent chargesTotalIncoming) {
        this.chargesTotalIncoming = chargesTotalIncoming;
    }

    public RowContent getStatisticsRentCarsFlitQuantity() {
        return statisticsRentCarsFlitQuantity;
    }

    public void setStatisticsRentCarsFlitQuantity(RowContent statisticsRentCarsFlitQuantity) {
        this.statisticsRentCarsFlitQuantity = statisticsRentCarsFlitQuantity;
    }

    public RowContent getLeasingSalesAndGrossProfit() {
        return leasingSalesAndGrossProfit;
    }

    public void setLeasingSalesAndGrossProfit(RowContent leasingSalesAndGrossProfit) {
        this.leasingSalesAndGrossProfit = leasingSalesAndGrossProfit;
    }

    public RowContent getCharges2Amortization() {
        return charges2Amortization;
    }

    public void setCharges2Amortization(RowContent charges2Amortization) {
        this.charges2Amortization = charges2Amortization;
    }

    public RowContent getCharges2Interests() {
        return charges2Interests;
    }

    public void setCharges2Interests(RowContent charges2Interests) {
        this.charges2Interests = charges2Interests;
    }

    public RowContent getCharges2NonproductiveStaffSalary() {
        return charges2NonproductiveStaffSalary;
    }

    public void setCharges2NonproductiveStaffSalary(RowContent charges2NonproductiveStaffSalary) {
        this.charges2NonproductiveStaffSalary = charges2NonproductiveStaffSalary;
    }

    public RowContent getCharges2OtherCharges() {
        return charges2OtherCharges;
    }

    public void setCharges2OtherCharges(RowContent charges2OtherCharges) {
        this.charges2OtherCharges = charges2OtherCharges;
    }

    public RowContent getCharges2TotalCharges() {
        return charges2TotalCharges;
    }

    public void setCharges2TotalCharges(RowContent charges2TotalCharges) {
        this.charges2TotalCharges = charges2TotalCharges;
    }

    public RowContent getCharges2TotalIncoming() {
        return charges2TotalIncoming;
    }

    public void setCharges2TotalIncoming(RowContent charges2TotalIncoming) {
        this.charges2TotalIncoming = charges2TotalIncoming;
    }

    public RowContent getOtherDepartmentsSalesAndGrossProfit() {
        return otherDepartmentsSalesAndGrossProfit;
    }

    public void setOtherDepartmentsSalesAndGrossProfit(RowContent otherDepartmentsSalesAndGrossProfit) {
        this.otherDepartmentsSalesAndGrossProfit = otherDepartmentsSalesAndGrossProfit;
    }

    public RowContent getCharges3NonproductiveStaffSalary() {
        return charges3NonproductiveStaffSalary;
    }

    public void setCharges3NonproductiveStaffSalary(RowContent charges3NonproductiveStaffSalary) {
        this.charges3NonproductiveStaffSalary = charges3NonproductiveStaffSalary;
    }

    public RowContent getCharges3OtherCharges() {
        return charges3OtherCharges;
    }

    public void setCharges3OtherCharges(RowContent charges3OtherCharges) {
        this.charges3OtherCharges = charges3OtherCharges;
    }

    public RowContent getCharges3TotalCharges() {
        return charges3TotalCharges;
    }

    public void setCharges3TotalCharges(RowContent charges3TotalCharges) {
        this.charges3TotalCharges = charges3TotalCharges;
    }

    public RowContent getCharges3TotalIncoming() {
        return charges3TotalIncoming;
    }

    public void setCharges3TotalIncoming(RowContent charges3TotalIncoming) {
        this.charges3TotalIncoming = charges3TotalIncoming;
    }
}
