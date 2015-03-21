package com.volvo.metis.domain;

import java.io.Serializable;

/**
 * Вкладка "Новые автомобили"
 */
public class TabNewCars implements Serializable {

    /**
     * Новые а/м Volvo Розница --> C30
     */
    private RowContent newVolvoRetailC30;

    /**
     * Новые а/м Volvo Розница --> S40
     */
    private RowContent newVolvoRetailS40;

    /**
     * Новые а/м Volvo Розница --> V40
     */
    private RowContent newVolvoRetailV40;

    /**
     * Новые а/м Volvo Розница --> S60
     */
    private RowContent newVolvoRetailS60;

    /**
     * Новые а/м Volvo Розница --> XC60
     */
    private RowContent newVolvoRetailXc60;

    /**
     * Новые а/м Volvo Розница --> C70
     */
    private RowContent newVolvoRetailC70;

    /**
     * Новые а/м Volvo Розница --> XC70
     */
    private RowContent newVolvoRetailXc70;

    /**
     * Новые а/м Volvo Розница --> S80
     */
    private RowContent newVolvoRetailS80;

    /**
     * Новые а/м Volvo Розница --> XC90
     */
    private RowContent newVolvoRetailXc90;

    /**
     * Новые а/м Volvo Розница --> V60
     */
    private RowContent newVolvoRetailV60;

    /**
     * Новые а/м Volvo Розница --> Итого Новые а/м Volvo Розница
     */
    private RowContent newVolvoRetailTotal;

    /**
     * ----------------------------------------------
     */

    /**
     * Новые а/м Volvo Флит --> C30
     */
    private RowContent newVolvoFlitC30;

    /**
     * Новые а/м Volvo Флит --> S40
     */
    private RowContent newVolvoFlitS40;

    /**
     * Новые а/м Volvo Флит --> V40
     */
    private RowContent newVolvoFlitV40;

    /**
     * Новые а/м Volvo Флит --> S60
     */
    private RowContent newVolvoFlitS60;

    /**
     * Новые а/м Volvo Флит --> XC60
     */
    private RowContent newVolvoFlitXc60;

    /**
     * Новые а/м Volvo Флит --> C70
     */
    private RowContent newVolvoFlitC70;

    /**
     * Новые а/м Volvo Флит --> XC70
     */
    private RowContent newVolvoFlitXc70;

    /**
     * Новые а/м Volvo Флит --> S80
     */
    private RowContent newVolvoFlitS80;

    /**
     * Новые а/м Volvo Флит --> XC90
     */
    private RowContent newVolvoFlitXc90;

    /**
     * Новые а/м Volvo Флит --> V60
     */
    private RowContent newVolvoFlitV60;

    /**
     * Новые а/м Volvo Флит --> Итого Новые а/м Volvo Флит
     */
    private RowContent newVolvoFlitTotal;

    /**
     * Итого продажи а/м Volvo
     */
    private RowContent newVolvoTotal;

    /**
     * ----------------------------------------------
     */

    /**
     * Прочие доходы --> Доход от кредитования (Программа Вольво) - новые а/м
     */
    private RowContent otherIncomingVolvoCreditingIncoming;

    /**
     * Прочие доходы --> Доход от страхования (Программа Вольво) - новые а/м
     */
    private RowContent otherIncomingVolvoInsuranceIncoming;

    /**
     * Прочие доходы --> Доход от кредитования - новые а/м
     */
    private RowContent otherIncomingCreditingIncoming;

    /**
     * Прочие доходы --> Доход от страхования - новые а/м
     */
    private RowContent otherIncomingInsuranceIncoming;

    /**
     * Прочие доходы --> Авизо (начисленные)
     */
    private RowContent otherIncomingAccrualAviso;

    /**
     * Прочие доходы --> Авизо (полученные)
     */
    private RowContent otherIncomingDerivedAviso;

    /**
     * Прочие доходы --> Предпродажн. подготовка
     */
    private RowContent otherIncomingPreSalePreparation;

    /**
     * Прочие доходы --> Продажа расширенной гарантии
     */
    private RowContent otherIncomingExtendedGuaranteeSale;

    /**
     * Прочие доходы --> Другие доходы/расходы
     */
    private RowContent otherIncomingOtherIncomingCharges;

    /**
     * Прочие доходы --> Аксессуары
     */
    private RowContent otherIncomingAccessories;

    /**
     * Прочие доходы --> Итого прочие доходы
     */
    private RowContent otherIncomingTotal;

    /**
     * Валовая Прибыль отдела продаж новых а/м
     */
    private RowContent grossProfitNewCarsDepartment;

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
     * Переменные расходы --> Расходы по склад-ию а/м
     */
    private RowContent fluctuatingChargesStoringCharges;

    /**
     * Переменные расходы --> Другие переменные расходы
     */
    private RowContent fluctuatingChargesOtherVaryingCharges;

    /**
     * Переменные расходы --> Итого переменные расходы
     */
    private RowContent fluctuatingChargesTotalFluctuatingCharge;

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
     * Расходы по отделу --> Итого расходы на адм. персонал отд. Продаж
     */
    private RowContent departmentChargesTotalAdministrationCharges;

    /**
     * Расходы по отделу --> Реклама на новые а/м
     */
    private RowContent departmentChargesAdvertisingNewCars;

    /**
     * Расходы по отделу --> Амортизация
     */
    private RowContent departmentChargesAmortization;

    /**
     * Расходы по отделу --> Расходы на а/м компании
     */
    private RowContent departmentChargesCompanyCarsCharges;

    /**
     * Расходы по отделу --> Консигнация
     */
    private RowContent departmentChargesConsignment;

    /**
     * Расходы по отделу --> Выплата % по складу (Пени)
     */
    private RowContent departmentChargesPayingInterestByStockPenaltyFee;

    /**
     * Расходы по отделу --> Выплата % по складу (Банк)
     */
    private RowContent departmentChargesPayingInterestByStockBank;

    /**
     * Расходы по отделу --> Другие расходы
     */
    private RowContent departmentChargesOtherCharges;

    /**
     * Расходы по отделу --> Всего расходов по отделу
     */
    private RowContent departmentChargesTotalDepartmentCharges;

    /**
     * Расходы по отделу --> Прибыль по отделу
     */
    private RowContent departmentChargesTotalDepartmentIncoming;

    /**
     * ----------------------------------------------
     */

    /**
     * Статистика --> Кол-во НА на складе
     */
    private RowContent statisticsNewCarsQuantityInStock;

    /**
     * Статистика --> Стоим-ть НА на складе
     */
    private RowContent statisticsNewCarsCostInStock;

    /**
     * Статистика --> Кол-во НА в кредит
     */
    private RowContent statisticsNewCarsQuantityOnCredit;

    /**
     * Статистика --> Кол-во полностью оплаченных а/м на складе
     */
    private RowContent statisticsFullyPaidCarsQuantityInStock;

    /**
     * Статистика --> Кол-во неоплач. а/м на складе
     */
    private RowContent statisticsUnpaidCarsQuantityInStock;

    /**
     * Статистика --> Кол-во а/м выставленных в шоу-руме
     */
    private RowContent statisticsCarsQuantityInShowroom;

    /**
     * Статистика --> Кол-во а/м для тест-драйва
     */
    private RowContent statisticsCarsQuantityForTestDrive;

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

    public RowContent getNewVolvoRetailC30() {
        return newVolvoRetailC30;
    }

    public void setNewVolvoRetailC30(RowContent newVolvoRetailC30) {
        this.newVolvoRetailC30 = newVolvoRetailC30;
    }

    public RowContent getNewVolvoRetailS40() {
        return newVolvoRetailS40;
    }

    public void setNewVolvoRetailS40(RowContent newVolvoRetailS40) {
        this.newVolvoRetailS40 = newVolvoRetailS40;
    }

    public RowContent getNewVolvoRetailV40() {
        return newVolvoRetailV40;
    }

    public void setNewVolvoRetailV40(RowContent newVolvoRetailV40) {
        this.newVolvoRetailV40 = newVolvoRetailV40;
    }

    public RowContent getNewVolvoRetailS60() {
        return newVolvoRetailS60;
    }

    public void setNewVolvoRetailS60(RowContent newVolvoRetailS60) {
        this.newVolvoRetailS60 = newVolvoRetailS60;
    }

    public RowContent getNewVolvoRetailXc60() {
        return newVolvoRetailXc60;
    }

    public void setNewVolvoRetailXc60(RowContent newVolvoRetailXc60) {
        this.newVolvoRetailXc60 = newVolvoRetailXc60;
    }

    public RowContent getNewVolvoRetailC70() {
        return newVolvoRetailC70;
    }

    public void setNewVolvoRetailC70(RowContent newVolvoRetailC70) {
        this.newVolvoRetailC70 = newVolvoRetailC70;
    }

    public RowContent getNewVolvoRetailXc70() {
        return newVolvoRetailXc70;
    }

    public void setNewVolvoRetailXc70(RowContent newVolvoRetailXc70) {
        this.newVolvoRetailXc70 = newVolvoRetailXc70;
    }

    public RowContent getNewVolvoRetailS80() {
        return newVolvoRetailS80;
    }

    public void setNewVolvoRetailS80(RowContent newVolvoRetailS80) {
        this.newVolvoRetailS80 = newVolvoRetailS80;
    }

    public RowContent getNewVolvoRetailXc90() {
        return newVolvoRetailXc90;
    }

    public void setNewVolvoRetailXc90(RowContent newVolvoRetailXc90) {
        this.newVolvoRetailXc90 = newVolvoRetailXc90;
    }

    public RowContent getNewVolvoRetailV60() {
        return newVolvoRetailV60;
    }

    public void setNewVolvoRetailV60(RowContent newVolvoRetailV60) {
        this.newVolvoRetailV60 = newVolvoRetailV60;
    }

    public RowContent getNewVolvoRetailTotal() {
        return newVolvoRetailTotal;
    }

    public void setNewVolvoRetailTotal(RowContent newVolvoRetailTotal) {
        this.newVolvoRetailTotal = newVolvoRetailTotal;
    }

    public RowContent getNewVolvoFlitC30() {
        return newVolvoFlitC30;
    }

    public void setNewVolvoFlitC30(RowContent newVolvoFlitC30) {
        this.newVolvoFlitC30 = newVolvoFlitC30;
    }

    public RowContent getNewVolvoFlitS40() {
        return newVolvoFlitS40;
    }

    public void setNewVolvoFlitS40(RowContent newVolvoFlitS40) {
        this.newVolvoFlitS40 = newVolvoFlitS40;
    }

    public RowContent getNewVolvoFlitV40() {
        return newVolvoFlitV40;
    }

    public void setNewVolvoFlitV40(RowContent newVolvoFlitV40) {
        this.newVolvoFlitV40 = newVolvoFlitV40;
    }

    public RowContent getNewVolvoFlitS60() {
        return newVolvoFlitS60;
    }

    public void setNewVolvoFlitS60(RowContent newVolvoFlitS60) {
        this.newVolvoFlitS60 = newVolvoFlitS60;
    }

    public RowContent getNewVolvoFlitXc60() {
        return newVolvoFlitXc60;
    }

    public void setNewVolvoFlitXc60(RowContent newVolvoFlitXc60) {
        this.newVolvoFlitXc60 = newVolvoFlitXc60;
    }

    public RowContent getNewVolvoFlitC70() {
        return newVolvoFlitC70;
    }

    public void setNewVolvoFlitC70(RowContent newVolvoFlitC70) {
        this.newVolvoFlitC70 = newVolvoFlitC70;
    }

    public RowContent getNewVolvoFlitXc70() {
        return newVolvoFlitXc70;
    }

    public void setNewVolvoFlitXc70(RowContent newVolvoFlitXc70) {
        this.newVolvoFlitXc70 = newVolvoFlitXc70;
    }

    public RowContent getNewVolvoFlitS80() {
        return newVolvoFlitS80;
    }

    public void setNewVolvoFlitS80(RowContent newVolvoFlitS80) {
        this.newVolvoFlitS80 = newVolvoFlitS80;
    }

    public RowContent getNewVolvoFlitXc90() {
        return newVolvoFlitXc90;
    }

    public void setNewVolvoFlitXc90(RowContent newVolvoFlitXc90) {
        this.newVolvoFlitXc90 = newVolvoFlitXc90;
    }

    public RowContent getNewVolvoFlitV60() {
        return newVolvoFlitV60;
    }

    public void setNewVolvoFlitV60(RowContent newVolvoFlitV60) {
        this.newVolvoFlitV60 = newVolvoFlitV60;
    }

    public RowContent getNewVolvoFlitTotal() {
        return newVolvoFlitTotal;
    }

    public void setNewVolvoFlitTotal(RowContent newVolvoFlitTotal) {
        this.newVolvoFlitTotal = newVolvoFlitTotal;
    }

    public RowContent getNewVolvoTotal() {
        return newVolvoTotal;
    }

    public void setNewVolvoTotal(RowContent newVolvoTotal) {
        this.newVolvoTotal = newVolvoTotal;
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

    public RowContent getOtherIncomingAccrualAviso() {
        return otherIncomingAccrualAviso;
    }

    public void setOtherIncomingAccrualAviso(RowContent otherIncomingAccrualAviso) {
        this.otherIncomingAccrualAviso = otherIncomingAccrualAviso;
    }

    public RowContent getOtherIncomingDerivedAviso() {
        return otherIncomingDerivedAviso;
    }

    public void setOtherIncomingDerivedAviso(RowContent otherIncomingDerivedAviso) {
        this.otherIncomingDerivedAviso = otherIncomingDerivedAviso;
    }

    public RowContent getOtherIncomingPreSalePreparation() {
        return otherIncomingPreSalePreparation;
    }

    public void setOtherIncomingPreSalePreparation(RowContent otherIncomingPreSalePreparation) {
        this.otherIncomingPreSalePreparation = otherIncomingPreSalePreparation;
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

    public RowContent getOtherIncomingAccessories() {
        return otherIncomingAccessories;
    }

    public void setOtherIncomingAccessories(RowContent otherIncomingAccessories) {
        this.otherIncomingAccessories = otherIncomingAccessories;
    }

    public RowContent getOtherIncomingTotal() {
        return otherIncomingTotal;
    }

    public void setOtherIncomingTotal(RowContent otherIncomingTotal) {
        this.otherIncomingTotal = otherIncomingTotal;
    }

    public RowContent getGrossProfitNewCarsDepartment() {
        return grossProfitNewCarsDepartment;
    }

    public void setGrossProfitNewCarsDepartment(RowContent grossProfitNewCarsDepartment) {
        this.grossProfitNewCarsDepartment = grossProfitNewCarsDepartment;
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

    public RowContent getFluctuatingChargesStoringCharges() {
        return fluctuatingChargesStoringCharges;
    }

    public void setFluctuatingChargesStoringCharges(RowContent fluctuatingChargesStoringCharges) {
        this.fluctuatingChargesStoringCharges = fluctuatingChargesStoringCharges;
    }

    public RowContent getFluctuatingChargesOtherVaryingCharges() {
        return fluctuatingChargesOtherVaryingCharges;
    }

    public void setFluctuatingChargesOtherVaryingCharges(RowContent fluctuatingChargesOtherVaryingCharges) {
        this.fluctuatingChargesOtherVaryingCharges = fluctuatingChargesOtherVaryingCharges;
    }

    public RowContent getFluctuatingChargesTotalFluctuatingCharge() {
        return fluctuatingChargesTotalFluctuatingCharge;
    }

    public void setFluctuatingChargesTotalFluctuatingCharge(RowContent fluctuatingChargesTotalFluctuatingCharge) {
        this.fluctuatingChargesTotalFluctuatingCharge = fluctuatingChargesTotalFluctuatingCharge;
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

    public RowContent getDepartmentChargesAdvertisingNewCars() {
        return departmentChargesAdvertisingNewCars;
    }

    public void setDepartmentChargesAdvertisingNewCars(RowContent departmentChargesAdvertisingNewCars) {
        this.departmentChargesAdvertisingNewCars = departmentChargesAdvertisingNewCars;
    }

    public RowContent getDepartmentChargesAmortization() {
        return departmentChargesAmortization;
    }

    public void setDepartmentChargesAmortization(RowContent departmentChargesAmortization) {
        this.departmentChargesAmortization = departmentChargesAmortization;
    }

    public RowContent getDepartmentChargesCompanyCarsCharges() {
        return departmentChargesCompanyCarsCharges;
    }

    public void setDepartmentChargesCompanyCarsCharges(RowContent departmentChargesCompanyCarsCharges) {
        this.departmentChargesCompanyCarsCharges = departmentChargesCompanyCarsCharges;
    }

    public RowContent getDepartmentChargesConsignment() {
        return departmentChargesConsignment;
    }

    public void setDepartmentChargesConsignment(RowContent departmentChargesConsignment) {
        this.departmentChargesConsignment = departmentChargesConsignment;
    }

    public RowContent getDepartmentChargesPayingInterestByStockPenaltyFee() {
        return departmentChargesPayingInterestByStockPenaltyFee;
    }

    public void setDepartmentChargesPayingInterestByStockPenaltyFee(RowContent departmentChargesPayingInterestByStockPenaltyFee) {
        this.departmentChargesPayingInterestByStockPenaltyFee = departmentChargesPayingInterestByStockPenaltyFee;
    }

    public RowContent getDepartmentChargesPayingInterestByStockBank() {
        return departmentChargesPayingInterestByStockBank;
    }

    public void setDepartmentChargesPayingInterestByStockBank(RowContent departmentChargesPayingInterestByStockBank) {
        this.departmentChargesPayingInterestByStockBank = departmentChargesPayingInterestByStockBank;
    }

    public RowContent getDepartmentChargesOtherCharges() {
        return departmentChargesOtherCharges;
    }

    public void setDepartmentChargesOtherCharges(RowContent departmentChargesOtherCharges) {
        this.departmentChargesOtherCharges = departmentChargesOtherCharges;
    }

    public RowContent getDepartmentChargesTotalDepartmentCharges() {
        return departmentChargesTotalDepartmentCharges;
    }

    public void setDepartmentChargesTotalDepartmentCharges(RowContent departmentChargesTotalDepartmentCharges) {
        this.departmentChargesTotalDepartmentCharges = departmentChargesTotalDepartmentCharges;
    }

    public RowContent getDepartmentChargesTotalDepartmentIncoming() {
        return departmentChargesTotalDepartmentIncoming;
    }

    public void setDepartmentChargesTotalDepartmentIncoming(RowContent departmentChargesTotalDepartmentIncoming) {
        this.departmentChargesTotalDepartmentIncoming = departmentChargesTotalDepartmentIncoming;
    }

    public RowContent getStatisticsNewCarsQuantityInStock() {
        return statisticsNewCarsQuantityInStock;
    }

    public void setStatisticsNewCarsQuantityInStock(RowContent statisticsNewCarsQuantityInStock) {
        this.statisticsNewCarsQuantityInStock = statisticsNewCarsQuantityInStock;
    }

    public RowContent getStatisticsNewCarsCostInStock() {
        return statisticsNewCarsCostInStock;
    }

    public void setStatisticsNewCarsCostInStock(RowContent statisticsNewCarsCostInStock) {
        this.statisticsNewCarsCostInStock = statisticsNewCarsCostInStock;
    }

    public RowContent getStatisticsNewCarsQuantityOnCredit() {
        return statisticsNewCarsQuantityOnCredit;
    }

    public void setStatisticsNewCarsQuantityOnCredit(RowContent statisticsNewCarsQuantityOnCredit) {
        this.statisticsNewCarsQuantityOnCredit = statisticsNewCarsQuantityOnCredit;
    }

    public RowContent getStatisticsFullyPaidCarsQuantityInStock() {
        return statisticsFullyPaidCarsQuantityInStock;
    }

    public void setStatisticsFullyPaidCarsQuantityInStock(RowContent statisticsFullyPaidCarsQuantityInStock) {
        this.statisticsFullyPaidCarsQuantityInStock = statisticsFullyPaidCarsQuantityInStock;
    }

    public RowContent getStatisticsUnpaidCarsQuantityInStock() {
        return statisticsUnpaidCarsQuantityInStock;
    }

    public void setStatisticsUnpaidCarsQuantityInStock(RowContent statisticsUnpaidCarsQuantityInStock) {
        this.statisticsUnpaidCarsQuantityInStock = statisticsUnpaidCarsQuantityInStock;
    }

    public RowContent getStatisticsCarsQuantityInShowroom() {
        return statisticsCarsQuantityInShowroom;
    }

    public void setStatisticsCarsQuantityInShowroom(RowContent statisticsCarsQuantityInShowroom) {
        this.statisticsCarsQuantityInShowroom = statisticsCarsQuantityInShowroom;
    }

    public RowContent getStatisticsCarsQuantityForTestDrive() {
        return statisticsCarsQuantityForTestDrive;
    }

    public void setStatisticsCarsQuantityForTestDrive(RowContent statisticsCarsQuantityForTestDrive) {
        this.statisticsCarsQuantityForTestDrive = statisticsCarsQuantityForTestDrive;
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
