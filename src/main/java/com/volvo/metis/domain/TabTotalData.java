package com.volvo.metis.domain;

import java.io.Serializable;

/**
 * Вкладка "Итоговые данные"
 */
public class TabTotalData implements Serializable {

    /**
     * Выручка --> Выручка отдела продаж новых а/м
     */
    private RowContent earningsNewCarsSale;

    /**
     * Выручка --> Выручка отдела продаж подерж. а/м
     */
    private RowContent earningsSecondHandCarsSale;

    /**
     * Выручка --> Выручка по Слесарному Цеху
     */
    private RowContent earningsFlittingShop;

    /**
     * Выручка --> Выручка по Кузовному цеху
     */
    private RowContent earningsBodyShop;

    /**
     * Выручка --> Выручка отдела продаж Запчастей
     */
    private RowContent earningsSpares;

    /**
     * Выручка --> Выручка по проката а/м
     */
    private RowContent earningsRentCars;

    /**
     * Выручка --> Итого выручка по деят-ти Volvo
     */
    private RowContent earningsTotalVolvoWork;

    /**
     * Выручка --> Выручка Лизинг и Дрю отделы
     */
    private RowContent earningsOtherDepartments;

    /**
     * Выручка --> Итого выручка компании
     */
    private RowContent earningsCompanyTotal;

    /**
     * Выручка --> Итого ВП по деят-ти Volvo
     */
    private RowContent earningsGrossProfitVolvoWork;

    /**
     * ----------------------------------------------
     */

    /**
     * Прибыль по отделу --> Прибыль по отделу продаж НА
     */
    private RowContent departmentEarningsNewCarsSale;

    /**
     * Прибыль по отделу --> Прибыль по отделу продаж ПА
     */
    private RowContent departmentEarningsSecondHandCars;

    /**
     * Прибыль по отделу --> Прибыль по Слесарному цеху
     */
    private RowContent departmentEarningsFlittingShop;

    /**
     * Прибыль по отделу --> Прибыль Кузовному цеху
     */
    private RowContent departmentEarningsBodyShop;

    /**
     * Прибыль по отделу --> Прибыль отдела продаж Запчастей
     */
    private RowContent departmentEarningsSpares;

    /**
     * Прибыль по отделу --> Прибыль от проката а/м
     */
    private RowContent departmentEarningsRentCars;

    /**
     * Прибыль по отделу --> Итого прибыль по Volvo
     */
    private RowContent departmentEarningsTotalVolvoWork;

    /**
     * Прибыль по отделу --> Непрямые расходы (искл. %)
     */
    private RowContent departmentEarningsIndirectCharges;

    /**
     * Прибыль по отделу --> Операционная прибыль
     */
    private RowContent departmentEarningsOperatingProfit;

    /**
     * ----------------------------------------------
     */

    /**
     * Другие поступления и отчисления --> Другие доходы по Volvo
     */
    private RowContent otherIncomingVolvo;

    /**
     * Другие поступления и отчисления --> Другие расходы по Volvo
     */
    private RowContent otherIncomingChargesVolvo;

    /**
     * Другие поступления и отчисления --> Дополнительные доходы от непрофильной деятельности
     */
    private RowContent otherIncomingExtraIncoming;

    /**
     * Другие поступления и отчисления --> Сумма условных начислений
     */
    private RowContent otherIncomingSumConditionalAccrual;

    /**
     * Другие поступления и отчисления --> Прибыль до вычета процентов
     */
    private RowContent otherIncomingBeforeTax;

    /**
     * Другие поступления и отчисления --> Проценты к уплате
     */
    private RowContent otherIncomingTaxToPay;

    /**
     * Другие поступления и отчисления --> Проценты к получению
     */
    private RowContent otherIncomingTaxToGet;

    /**
     * Другие поступления и отчисления --> Финансовый результат
     */
    private RowContent otherIncomingFinanceResult;

    /**
     * Другие поступления и отчисления --> Прибыль после вычета процентов
     */
    private RowContent otherIncomingAfterTax;

    /**
     * Другие поступления и отчисления --> Прибыль Лизинг и Др. отделы
     */
    private RowContent otherIncomingLeasingDepartment;

    /**
     * Другие поступления и отчисления --> Итого прибыль до налогообложения
     */
    private RowContent otherIncomingTotalIncomingBeforeTax;

    /**
     * Другие поступления и отчисления --> Налог на прибыль
     */
    private RowContent otherIncomingTaxOnIncoming;

    /**
     * Другие поступления и отчисления --> ЕНВД
     */
    private RowContent otherIncomingTaxOnImputedIncome;

    /**
     * Другие поступления и отчисления --> Итого чистая прибыль
     */
    private RowContent otherIncomingTotalClearProfit;

    /**
     * Другие поступления и отчисления --> Общая м2
     */
    private RowContent otherIncomingArea;

    /**
     * Другие поступления и отчисления --> Рентабельность продаж (%)
     */
    private RowContent otherIncomingSaleEfficiency;

    /**
     * Другие поступления и отчисления --> Коэфф. покрытия (%)
     */
    private RowContent otherIncomingCoverRatio;

    /**
     * ----------------------------------------------
     */

    public RowContent getEarningsNewCarsSale() {
        return earningsNewCarsSale;
    }

    public void setEarningsNewCarsSale(RowContent earningsNewCarsSale) {
        this.earningsNewCarsSale = earningsNewCarsSale;
    }

    public RowContent getEarningsSecondHandCarsSale() {
        return earningsSecondHandCarsSale;
    }

    public void setEarningsSecondHandCarsSale(RowContent earningsSecondHandCarsSale) {
        this.earningsSecondHandCarsSale = earningsSecondHandCarsSale;
    }

    public RowContent getEarningsFlittingShop() {
        return earningsFlittingShop;
    }

    public void setEarningsFlittingShop(RowContent earningsFlittingShop) {
        this.earningsFlittingShop = earningsFlittingShop;
    }

    public RowContent getEarningsBodyShop() {
        return earningsBodyShop;
    }

    public void setEarningsBodyShop(RowContent earningsBodyShop) {
        this.earningsBodyShop = earningsBodyShop;
    }

    public RowContent getEarningsSpares() {
        return earningsSpares;
    }

    public void setEarningsSpares(RowContent earningsSpares) {
        this.earningsSpares = earningsSpares;
    }

    public RowContent getEarningsRentCars() {
        return earningsRentCars;
    }

    public void setEarningsRentCars(RowContent earningsRentCars) {
        this.earningsRentCars = earningsRentCars;
    }

    public RowContent getEarningsTotalVolvoWork() {
        return earningsTotalVolvoWork;
    }

    public void setEarningsTotalVolvoWork(RowContent earningsTotalVolvoWork) {
        this.earningsTotalVolvoWork = earningsTotalVolvoWork;
    }

    public RowContent getEarningsOtherDepartments() {
        return earningsOtherDepartments;
    }

    public void setEarningsOtherDepartments(RowContent earningsOtherDepartments) {
        this.earningsOtherDepartments = earningsOtherDepartments;
    }

    public RowContent getEarningsCompanyTotal() {
        return earningsCompanyTotal;
    }

    public void setEarningsCompanyTotal(RowContent earningsCompanyTotal) {
        this.earningsCompanyTotal = earningsCompanyTotal;
    }

    public RowContent getEarningsGrossProfitVolvoWork() {
        return earningsGrossProfitVolvoWork;
    }

    public void setEarningsGrossProfitVolvoWork(RowContent earningsGrossProfitVolvoWork) {
        this.earningsGrossProfitVolvoWork = earningsGrossProfitVolvoWork;
    }

    public RowContent getDepartmentEarningsNewCarsSale() {
        return departmentEarningsNewCarsSale;
    }

    public void setDepartmentEarningsNewCarsSale(RowContent departmentEarningsNewCarsSale) {
        this.departmentEarningsNewCarsSale = departmentEarningsNewCarsSale;
    }

    public RowContent getDepartmentEarningsSecondHandCars() {
        return departmentEarningsSecondHandCars;
    }

    public void setDepartmentEarningsSecondHandCars(RowContent departmentEarningsSecondHandCars) {
        this.departmentEarningsSecondHandCars = departmentEarningsSecondHandCars;
    }

    public RowContent getDepartmentEarningsFlittingShop() {
        return departmentEarningsFlittingShop;
    }

    public void setDepartmentEarningsFlittingShop(RowContent departmentEarningsFlittingShop) {
        this.departmentEarningsFlittingShop = departmentEarningsFlittingShop;
    }

    public RowContent getDepartmentEarningsBodyShop() {
        return departmentEarningsBodyShop;
    }

    public void setDepartmentEarningsBodyShop(RowContent departmentEarningsBodyShop) {
        this.departmentEarningsBodyShop = departmentEarningsBodyShop;
    }

    public RowContent getDepartmentEarningsSpares() {
        return departmentEarningsSpares;
    }

    public void setDepartmentEarningsSpares(RowContent departmentEarningsSpares) {
        this.departmentEarningsSpares = departmentEarningsSpares;
    }

    public RowContent getDepartmentEarningsRentCars() {
        return departmentEarningsRentCars;
    }

    public void setDepartmentEarningsRentCars(RowContent departmentEarningsRentCars) {
        this.departmentEarningsRentCars = departmentEarningsRentCars;
    }

    public RowContent getDepartmentEarningsTotalVolvoWork() {
        return departmentEarningsTotalVolvoWork;
    }

    public void setDepartmentEarningsTotalVolvoWork(RowContent departmentEarningsTotalVolvoWork) {
        this.departmentEarningsTotalVolvoWork = departmentEarningsTotalVolvoWork;
    }

    public RowContent getDepartmentEarningsIndirectCharges() {
        return departmentEarningsIndirectCharges;
    }

    public void setDepartmentEarningsIndirectCharges(RowContent departmentEarningsIndirectCharges) {
        this.departmentEarningsIndirectCharges = departmentEarningsIndirectCharges;
    }

    public RowContent getDepartmentEarningsOperatingProfit() {
        return departmentEarningsOperatingProfit;
    }

    public void setDepartmentEarningsOperatingProfit(RowContent departmentEarningsOperatingProfit) {
        this.departmentEarningsOperatingProfit = departmentEarningsOperatingProfit;
    }

    public RowContent getOtherIncomingVolvo() {
        return otherIncomingVolvo;
    }

    public void setOtherIncomingVolvo(RowContent otherIncomingVolvo) {
        this.otherIncomingVolvo = otherIncomingVolvo;
    }

    public RowContent getOtherIncomingChargesVolvo() {
        return otherIncomingChargesVolvo;
    }

    public void setOtherIncomingChargesVolvo(RowContent otherIncomingChargesVolvo) {
        this.otherIncomingChargesVolvo = otherIncomingChargesVolvo;
    }

    public RowContent getOtherIncomingExtraIncoming() {
        return otherIncomingExtraIncoming;
    }

    public void setOtherIncomingExtraIncoming(RowContent otherIncomingExtraIncoming) {
        this.otherIncomingExtraIncoming = otherIncomingExtraIncoming;
    }

    public RowContent getOtherIncomingSumConditionalAccrual() {
        return otherIncomingSumConditionalAccrual;
    }

    public void setOtherIncomingSumConditionalAccrual(RowContent otherIncomingSumConditionalAccrual) {
        this.otherIncomingSumConditionalAccrual = otherIncomingSumConditionalAccrual;
    }

    public RowContent getOtherIncomingBeforeTax() {
        return otherIncomingBeforeTax;
    }

    public void setOtherIncomingBeforeTax(RowContent otherIncomingBeforeTax) {
        this.otherIncomingBeforeTax = otherIncomingBeforeTax;
    }

    public RowContent getOtherIncomingTaxToPay() {
        return otherIncomingTaxToPay;
    }

    public void setOtherIncomingTaxToPay(RowContent otherIncomingTaxToPay) {
        this.otherIncomingTaxToPay = otherIncomingTaxToPay;
    }

    public RowContent getOtherIncomingTaxToGet() {
        return otherIncomingTaxToGet;
    }

    public void setOtherIncomingTaxToGet(RowContent otherIncomingTaxToGet) {
        this.otherIncomingTaxToGet = otherIncomingTaxToGet;
    }

    public RowContent getOtherIncomingFinanceResult() {
        return otherIncomingFinanceResult;
    }

    public void setOtherIncomingFinanceResult(RowContent otherIncomingFinanceResult) {
        this.otherIncomingFinanceResult = otherIncomingFinanceResult;
    }

    public RowContent getOtherIncomingAfterTax() {
        return otherIncomingAfterTax;
    }

    public void setOtherIncomingAfterTax(RowContent otherIncomingAfterTax) {
        this.otherIncomingAfterTax = otherIncomingAfterTax;
    }

    public RowContent getOtherIncomingLeasingDepartment() {
        return otherIncomingLeasingDepartment;
    }

    public void setOtherIncomingLeasingDepartment(RowContent otherIncomingLeasingDepartment) {
        this.otherIncomingLeasingDepartment = otherIncomingLeasingDepartment;
    }

    public RowContent getOtherIncomingTotalIncomingBeforeTax() {
        return otherIncomingTotalIncomingBeforeTax;
    }

    public void setOtherIncomingTotalIncomingBeforeTax(RowContent otherIncomingTotalIncomingBeforeTax) {
        this.otherIncomingTotalIncomingBeforeTax = otherIncomingTotalIncomingBeforeTax;
    }

    public RowContent getOtherIncomingTaxOnIncoming() {
        return otherIncomingTaxOnIncoming;
    }

    public void setOtherIncomingTaxOnIncoming(RowContent otherIncomingTaxOnIncoming) {
        this.otherIncomingTaxOnIncoming = otherIncomingTaxOnIncoming;
    }

    public RowContent getOtherIncomingTaxOnImputedIncome() {
        return otherIncomingTaxOnImputedIncome;
    }

    public void setOtherIncomingTaxOnImputedIncome(RowContent otherIncomingTaxOnImputedIncome) {
        this.otherIncomingTaxOnImputedIncome = otherIncomingTaxOnImputedIncome;
    }

    public RowContent getOtherIncomingTotalClearProfit() {
        return otherIncomingTotalClearProfit;
    }

    public void setOtherIncomingTotalClearProfit(RowContent otherIncomingTotalClearProfit) {
        this.otherIncomingTotalClearProfit = otherIncomingTotalClearProfit;
    }

    public RowContent getOtherIncomingArea() {
        return otherIncomingArea;
    }

    public void setOtherIncomingArea(RowContent otherIncomingArea) {
        this.otherIncomingArea = otherIncomingArea;
    }

    public RowContent getOtherIncomingSaleEfficiency() {
        return otherIncomingSaleEfficiency;
    }

    public void setOtherIncomingSaleEfficiency(RowContent otherIncomingSaleEfficiency) {
        this.otherIncomingSaleEfficiency = otherIncomingSaleEfficiency;
    }

    public RowContent getOtherIncomingCoverRatio() {
        return otherIncomingCoverRatio;
    }

    public void setOtherIncomingCoverRatio(RowContent otherIncomingCoverRatio) {
        this.otherIncomingCoverRatio = otherIncomingCoverRatio;
    }
}
