package com.volvo.metis.domain;

import java.io.Serializable;

/**
 * Вкладка "Подерж. а/м"
 */
public class TabSecondHandCars implements Serializable {

    /**
     * Продажи подерж. а/м --> Volvo
     */
    private RowContent saleSecondHandCarVolvo;

    /**
     * Продажи подерж. а/м --> Volvo тест-драйв, подменные, служебные  а/м
     */
    private RowContent saleSecondHandCarVolvoTestDriveCompanyCars;

    /**
     * Продажи подерж. а/м --> Другие марки
     */
    private RowContent saleSecondHandCarOtherModels;

    /**
     * Продажи подерж. а/м --> Итого продажи ПА
     */
    private RowContent saleSecondHandCarTotal;

    /**
     * ----------------------------------------------
     */

    /**
     * Другие расходы по подерж. а/м --> Предпродажная подготовка ПА
     */
    private RowContent otherChargesOnSecondHandCarsPreSalePreparationForSecondHandCars;

    /**
     * Другие расходы по подерж. а/м --> Корректировка величины запасов
     */
    private RowContent otherChargesOnSecondHandCarsStockpileCorrection;

    /**
     * Другие расходы по подерж. а/м --> Итого др. расходы
     */
    private RowContent otherChargesOnSecondHandCarsTotal;

    /**
     * ----------------------------------------------
     */

    /**
     * Прочие доходы --> Доход от кредитования (Программа Вольво) - ПА
     */
    private RowContent otherIncomingVolvoCreditingIncoming;

    /**
     * Прочие доходы --> Доход от страхования (Программа Вольво) - ПА
     */
    private RowContent otherIncomingVolvoInsuranceIncoming;

    /**
     * Прочие доходы -->  Доход от кредитования - ПА
     */
    private RowContent otherIncomingCreditingIncoming;

    /**
     * Прочие доходы --> Доход от страхования - ПА
     */
    private RowContent otherIncomingInsuranceIncoming;

    /**
     * Прочие доходы --> Продажа расширенной гарантии
     */
    private RowContent otherIncomingExtendedGuaranteeSale;

    /**
     * Прочие доходы --> Другие доходы/расходы
     */
    private RowContent otherIncomingOtherIncomingCharges;

    /**
     * Прочие доходы --> Итого прочие доходы
     */
    private RowContent otherIncomingTotal;

    /**
     * Прочие доходы --> Валовая прибыль отдела продаж ПА
     */
    private RowContent otherIncomingGrossProfit;

    /**
     * ----------------------------------------------
     */

    /**
     * Переменные расходы --> Оклад продавцов
     */
    private RowContent fluctuatingChargesSellerSalary;

    /**
     * Переменные расходы --> Комиссионные продавцов
     */
    private RowContent fluctuatingChargesSellerCommissions;

    /**
     * Переменные расходы --> Налоги на з/п
     */
    private RowContent fluctuatingChargesSalaryTax;

    /**
     * Переменные расходы --> Всего затрат на продуктивный персонал
     */
    private RowContent fluctuatingChargesTotalProductiveStaffCharges;

    /**
     * Переменные расходы --> Расходы по гарантии ПА
     */
    private RowContent fluctuatingChargesGuaranteeCharges;

    /**
     * Переменные расходы --> Другие переменные расходы
     */
    private RowContent fluctuatingChargesOtherFluctuatingCharges;

    /**
     * Переменные расходы --> Итого переменные расходы
     */
    private RowContent fluctuatingChargesTotal;

    /**
     * Переменные расходы --> Переменная ВП
     */
    private RowContent fluctuatingChargesGrossProfit;

    /**
     * ----------------------------------------------
     */

    /**
     * Расходы по отделу --> Зарплата непродуктивного персонала
     */
    private RowContent departmentChargesNonproductiveStaffSalary;

    /**
     * Расходы по отделу --> Налоги на з/п
     */
    private RowContent departmentChargesSalaryTax;

    /**
     * Расходы по отделу --> Другие расходы на персонал
     */
    private RowContent departmentChargesOtherChargesOnStaff;

    /**
     * Расходы по отделу --> Обучение
     */
    private RowContent departmentChargesEducation;

    /**
     * Расходы по отделу --> Итого расходы на адм. персонал отд. продаж
     */
    private RowContent departmentChargesTotalAdministrationCharges;

    /**
     * Расходы по отделу --> Реклама на ПА
     */
    private RowContent departmentChargesAdvertisingSecondHandCars;

    /**
     * Расходы по отделу --> Расходы на а/м компании
     */
    private RowContent departmentChargesCompanyCarsCharges;

    /**
     * Расходы по отделу --> Выплаты процентов по складу
     */
    private RowContent departmentChargesPayingInterestByStock;

    /**
     * Расходы по отделу --> Амортизация
     */
    private RowContent departmentChargesAmortization;

    /**
     * Расходы по отделу --> Всего расходов по отделу
     */
    private RowContent departmentChargesTotal;

    /**
     * Расходы по отделу --> Прибыль по отделу
     */
    private RowContent departmentChargesTotalIncoming;

    /**
     * ----------------------------------------------
     */

    /**
     * Статистика --> Кол-во ПА на складе
     */
    private RowContent statisticsSecondHandCarsQuantityInStock;

    /**
     * Статистика --> Стоим-ть ПА на складе
     */
    private RowContent statisticsSecondHandCarsCostInStock;

    /**
     * Статистика --> Кол-во ПА в кредит
     */
    private RowContent statisticsSecondHandCarsQuantityOnCredit;

    /**
     * Статистика --> Количество мест для демонстрации ПА
     */
    private RowContent statisticsDemonstrationAreaQuantity;

    /**
     * Статистика --> Продано расширенных гарантийных обязательств
     */
    private RowContent statisticsSoldExtendedGuaranteeQuantity;

    /**
     * Статистика --> Площадь шоурума (м2)
     */
    private RowContent statisticsShowroomArea;

    /**
     * ----------------------------------------------
     */

    public RowContent getSaleSecondHandCarVolvo() {
        return saleSecondHandCarVolvo;
    }

    public void setSaleSecondHandCarVolvo(RowContent saleSecondHandCarVolvo) {
        this.saleSecondHandCarVolvo = saleSecondHandCarVolvo;
    }

    public RowContent getSaleSecondHandCarVolvoTestDriveCompanyCars() {
        return saleSecondHandCarVolvoTestDriveCompanyCars;
    }

    public void setSaleSecondHandCarVolvoTestDriveCompanyCars(RowContent saleSecondHandCarVolvoTestDriveCompanyCars) {
        this.saleSecondHandCarVolvoTestDriveCompanyCars = saleSecondHandCarVolvoTestDriveCompanyCars;
    }

    public RowContent getSaleSecondHandCarOtherModels() {
        return saleSecondHandCarOtherModels;
    }

    public void setSaleSecondHandCarOtherModels(RowContent saleSecondHandCarOtherModels) {
        this.saleSecondHandCarOtherModels = saleSecondHandCarOtherModels;
    }

    public RowContent getSaleSecondHandCarTotal() {
        return saleSecondHandCarTotal;
    }

    public void setSaleSecondHandCarTotal(RowContent saleSecondHandCarTotal) {
        this.saleSecondHandCarTotal = saleSecondHandCarTotal;
    }

    public RowContent getOtherChargesOnSecondHandCarsPreSalePreparationForSecondHandCars() {
        return otherChargesOnSecondHandCarsPreSalePreparationForSecondHandCars;
    }

    public void setOtherChargesOnSecondHandCarsPreSalePreparationForSecondHandCars(RowContent otherChargesOnSecondHandCarsPreSalePreparationForSecondHandCars) {
        this.otherChargesOnSecondHandCarsPreSalePreparationForSecondHandCars = otherChargesOnSecondHandCarsPreSalePreparationForSecondHandCars;
    }

    public RowContent getOtherChargesOnSecondHandCarsStockpileCorrection() {
        return otherChargesOnSecondHandCarsStockpileCorrection;
    }

    public void setOtherChargesOnSecondHandCarsStockpileCorrection(RowContent otherChargesOnSecondHandCarsStockpileCorrection) {
        this.otherChargesOnSecondHandCarsStockpileCorrection = otherChargesOnSecondHandCarsStockpileCorrection;
    }

    public RowContent getOtherChargesOnSecondHandCarsTotal() {
        return otherChargesOnSecondHandCarsTotal;
    }

    public void setOtherChargesOnSecondHandCarsTotal(RowContent otherChargesOnSecondHandCarsTotal) {
        this.otherChargesOnSecondHandCarsTotal = otherChargesOnSecondHandCarsTotal;
    }

    public RowContent getOtherIncomingVolvoCreditingIncoming() {
        return otherIncomingVolvoCreditingIncoming;
    }

    public void setOtherIncomingVolvoCreditingIncoming(RowContent otherIncomingVolvoCreditingIncoming) {
        this.otherIncomingVolvoCreditingIncoming = otherIncomingVolvoCreditingIncoming;
    }

    public RowContent getOtherIncomingVolvoInsuranceIncoming() {
        return otherIncomingVolvoInsuranceIncoming;
    }

    public void setOtherIncomingVolvoInsuranceIncoming(RowContent otherIncomingVolvoInsuranceIncoming) {
        this.otherIncomingVolvoInsuranceIncoming = otherIncomingVolvoInsuranceIncoming;
    }

    public RowContent getOtherIncomingCreditingIncoming() {
        return otherIncomingCreditingIncoming;
    }

    public void setOtherIncomingCreditingIncoming(RowContent otherIncomingCreditingIncoming) {
        this.otherIncomingCreditingIncoming = otherIncomingCreditingIncoming;
    }

    public RowContent getOtherIncomingInsuranceIncoming() {
        return otherIncomingInsuranceIncoming;
    }

    public void setOtherIncomingInsuranceIncoming(RowContent otherIncomingInsuranceIncoming) {
        this.otherIncomingInsuranceIncoming = otherIncomingInsuranceIncoming;
    }

    public RowContent getOtherIncomingExtendedGuaranteeSale() {
        return otherIncomingExtendedGuaranteeSale;
    }

    public void setOtherIncomingExtendedGuaranteeSale(RowContent otherIncomingExtendedGuaranteeSale) {
        this.otherIncomingExtendedGuaranteeSale = otherIncomingExtendedGuaranteeSale;
    }

    public RowContent getOtherIncomingOtherIncomingCharges() {
        return otherIncomingOtherIncomingCharges;
    }

    public void setOtherIncomingOtherIncomingCharges(RowContent otherIncomingOtherIncomingCharges) {
        this.otherIncomingOtherIncomingCharges = otherIncomingOtherIncomingCharges;
    }

    public RowContent getOtherIncomingTotal() {
        return otherIncomingTotal;
    }

    public void setOtherIncomingTotal(RowContent otherIncomingTotal) {
        this.otherIncomingTotal = otherIncomingTotal;
    }

    public RowContent getOtherIncomingGrossProfit() {
        return otherIncomingGrossProfit;
    }

    public void setOtherIncomingGrossProfit(RowContent otherIncomingGrossProfit) {
        this.otherIncomingGrossProfit = otherIncomingGrossProfit;
    }

    public RowContent getFluctuatingChargesSellerSalary() {
        return fluctuatingChargesSellerSalary;
    }

    public void setFluctuatingChargesSellerSalary(RowContent fluctuatingChargesSellerSalary) {
        this.fluctuatingChargesSellerSalary = fluctuatingChargesSellerSalary;
    }

    public RowContent getFluctuatingChargesSellerCommissions() {
        return fluctuatingChargesSellerCommissions;
    }

    public void setFluctuatingChargesSellerCommissions(RowContent fluctuatingChargesSellerCommissions) {
        this.fluctuatingChargesSellerCommissions = fluctuatingChargesSellerCommissions;
    }

    public RowContent getFluctuatingChargesSalaryTax() {
        return fluctuatingChargesSalaryTax;
    }

    public void setFluctuatingChargesSalaryTax(RowContent fluctuatingChargesSalaryTax) {
        this.fluctuatingChargesSalaryTax = fluctuatingChargesSalaryTax;
    }

    public RowContent getFluctuatingChargesTotalProductiveStaffCharges() {
        return fluctuatingChargesTotalProductiveStaffCharges;
    }

    public void setFluctuatingChargesTotalProductiveStaffCharges(RowContent fluctuatingChargesTotalProductiveStaffCharges) {
        this.fluctuatingChargesTotalProductiveStaffCharges = fluctuatingChargesTotalProductiveStaffCharges;
    }

    public RowContent getFluctuatingChargesGuaranteeCharges() {
        return fluctuatingChargesGuaranteeCharges;
    }

    public void setFluctuatingChargesGuaranteeCharges(RowContent fluctuatingChargesGuaranteeCharges) {
        this.fluctuatingChargesGuaranteeCharges = fluctuatingChargesGuaranteeCharges;
    }

    public RowContent getFluctuatingChargesOtherFluctuatingCharges() {
        return fluctuatingChargesOtherFluctuatingCharges;
    }

    public void setFluctuatingChargesOtherFluctuatingCharges(RowContent fluctuatingChargesOtherFluctuatingCharges) {
        this.fluctuatingChargesOtherFluctuatingCharges = fluctuatingChargesOtherFluctuatingCharges;
    }

    public RowContent getFluctuatingChargesTotal() {
        return fluctuatingChargesTotal;
    }

    public void setFluctuatingChargesTotal(RowContent fluctuatingChargesTotal) {
        this.fluctuatingChargesTotal = fluctuatingChargesTotal;
    }

    public RowContent getFluctuatingChargesGrossProfit() {
        return fluctuatingChargesGrossProfit;
    }

    public void setFluctuatingChargesGrossProfit(RowContent fluctuatingChargesGrossProfit) {
        this.fluctuatingChargesGrossProfit = fluctuatingChargesGrossProfit;
    }

    public RowContent getDepartmentChargesNonproductiveStaffSalary() {
        return departmentChargesNonproductiveStaffSalary;
    }

    public void setDepartmentChargesNonproductiveStaffSalary(RowContent departmentChargesNonproductiveStaffSalary) {
        this.departmentChargesNonproductiveStaffSalary = departmentChargesNonproductiveStaffSalary;
    }

    public RowContent getDepartmentChargesSalaryTax() {
        return departmentChargesSalaryTax;
    }

    public void setDepartmentChargesSalaryTax(RowContent departmentChargesSalaryTax) {
        this.departmentChargesSalaryTax = departmentChargesSalaryTax;
    }

    public RowContent getDepartmentChargesOtherChargesOnStaff() {
        return departmentChargesOtherChargesOnStaff;
    }

    public void setDepartmentChargesOtherChargesOnStaff(RowContent departmentChargesOtherChargesOnStaff) {
        this.departmentChargesOtherChargesOnStaff = departmentChargesOtherChargesOnStaff;
    }

    public RowContent getDepartmentChargesEducation() {
        return departmentChargesEducation;
    }

    public void setDepartmentChargesEducation(RowContent departmentChargesEducation) {
        this.departmentChargesEducation = departmentChargesEducation;
    }

    public RowContent getDepartmentChargesTotalAdministrationCharges() {
        return departmentChargesTotalAdministrationCharges;
    }

    public void setDepartmentChargesTotalAdministrationCharges(RowContent departmentChargesTotalAdministrationCharges) {
        this.departmentChargesTotalAdministrationCharges = departmentChargesTotalAdministrationCharges;
    }

    public RowContent getDepartmentChargesAdvertisingSecondHandCars() {
        return departmentChargesAdvertisingSecondHandCars;
    }

    public void setDepartmentChargesAdvertisingSecondHandCars(RowContent departmentChargesAdvertisingSecondHandCars) {
        this.departmentChargesAdvertisingSecondHandCars = departmentChargesAdvertisingSecondHandCars;
    }

    public RowContent getDepartmentChargesCompanyCarsCharges() {
        return departmentChargesCompanyCarsCharges;
    }

    public void setDepartmentChargesCompanyCarsCharges(RowContent departmentChargesCompanyCarsCharges) {
        this.departmentChargesCompanyCarsCharges = departmentChargesCompanyCarsCharges;
    }

    public RowContent getDepartmentChargesPayingInterestByStock() {
        return departmentChargesPayingInterestByStock;
    }

    public void setDepartmentChargesPayingInterestByStock(RowContent departmentChargesPayingInterestByStock) {
        this.departmentChargesPayingInterestByStock = departmentChargesPayingInterestByStock;
    }

    public RowContent getDepartmentChargesAmortization() {
        return departmentChargesAmortization;
    }

    public void setDepartmentChargesAmortization(RowContent departmentChargesAmortization) {
        this.departmentChargesAmortization = departmentChargesAmortization;
    }

    public RowContent getDepartmentChargesTotal() {
        return departmentChargesTotal;
    }

    public void setDepartmentChargesTotal(RowContent departmentChargesTotal) {
        this.departmentChargesTotal = departmentChargesTotal;
    }

    public RowContent getDepartmentChargesTotalIncoming() {
        return departmentChargesTotalIncoming;
    }

    public void setDepartmentChargesTotalIncoming(RowContent departmentChargesTotalIncoming) {
        this.departmentChargesTotalIncoming = departmentChargesTotalIncoming;
    }

    public RowContent getStatisticsSecondHandCarsQuantityInStock() {
        return statisticsSecondHandCarsQuantityInStock;
    }

    public void setStatisticsSecondHandCarsQuantityInStock(RowContent statisticsSecondHandCarsQuantityInStock) {
        this.statisticsSecondHandCarsQuantityInStock = statisticsSecondHandCarsQuantityInStock;
    }

    public RowContent getStatisticsSecondHandCarsCostInStock() {
        return statisticsSecondHandCarsCostInStock;
    }

    public void setStatisticsSecondHandCarsCostInStock(RowContent statisticsSecondHandCarsCostInStock) {
        this.statisticsSecondHandCarsCostInStock = statisticsSecondHandCarsCostInStock;
    }

    public RowContent getStatisticsSecondHandCarsQuantityOnCredit() {
        return statisticsSecondHandCarsQuantityOnCredit;
    }

    public void setStatisticsSecondHandCarsQuantityOnCredit(RowContent statisticsSecondHandCarsQuantityOnCredit) {
        this.statisticsSecondHandCarsQuantityOnCredit = statisticsSecondHandCarsQuantityOnCredit;
    }

    public RowContent getStatisticsDemonstrationAreaQuantity() {
        return statisticsDemonstrationAreaQuantity;
    }

    public void setStatisticsDemonstrationAreaQuantity(RowContent statisticsDemonstrationAreaQuantity) {
        this.statisticsDemonstrationAreaQuantity = statisticsDemonstrationAreaQuantity;
    }

    public RowContent getStatisticsSoldExtendedGuaranteeQuantity() {
        return statisticsSoldExtendedGuaranteeQuantity;
    }

    public void setStatisticsSoldExtendedGuaranteeQuantity(RowContent statisticsSoldExtendedGuaranteeQuantity) {
        this.statisticsSoldExtendedGuaranteeQuantity = statisticsSoldExtendedGuaranteeQuantity;
    }

    public RowContent getStatisticsShowroomArea() {
        return statisticsShowroomArea;
    }

    public void setStatisticsShowroomArea(RowContent statisticsShowroomArea) {
        this.statisticsShowroomArea = statisticsShowroomArea;
    }
}
