package com.volvo.metis.domain;

import java.io.Serializable;

/**
 * Вкладка "Слес. цех"
 */
public class TabFlittingShop implements Serializable {

    /**
     * Выручка и ВП --> Слес. цех Розница - Volvo
     */
    private RowContent incomingAndGrossProfitVolvoRetail;

    /**
     * Выручка и ВП --> Слес. цех Внутренние - Volvo
     */
    private RowContent incomingAndGrossProfitVolvoInner;

    /**
     * Выручка и ВП --> Слес. цех Гарантия - Volvo
     */
    private RowContent incomingAndGrossProfitVolvoGuaranty;

    /**
     * Выручка и ВП --> Слес. цех Розница - Другие
     */
    private RowContent incomingAndGrossProfitOthersRetail;

    /**
     * Выручка и ВП --> Слес. цех Внутренние - Другие
     */
    private RowContent incomingAndGrossProfitOthersInner;

    /**
     * Выручка и ВП --> Слес. цех Гарантия - Другие
     */
    private RowContent incomingAndGrossProfitOthersGuaranty;

    /**
     * Выручка и ВП --> Итого Слес. цех Розница
     */
    private RowContent incomingAndGrossProfitRetailTotal;

    /**
     * Выручка и ВП --> Итого Слес. цех Внутренние
     */
    private RowContent incomingAndGrossProfitInnerTotal;

    /**
     * Выручка и ВП --> Итого Слес. цех Гарантия
     */
    private RowContent incomingAndGrossProfitGuarantyTotal;

    /**
     * Выручка и ВП --> Итого по Слесарному цеху
     */
    private RowContent incomingAndGrossProfitTotal;

    /**
     * ----------------------------------------------
     */

    /**
     * Доходы по субконтрактам --> Субконтракты Слес. Цех
     */
    private RowContent subcontractIncoming;

    /**
     * Доходы по субконтрактам --> Итого доходы по субконтрактам
     */
    private RowContent subcontractIncomingTotal;

    /**
     * ----------------------------------------------
     */

    /**
     * Прочие доходы --> ГСМ
     */
    private RowContent otherIncomingLubricant;

    /**
     * Прочие доходы --> Прочие доходы
     */
    private RowContent otherIncomingOtherIncoming;

    /**
     * Прочие доходы --> Всего прочие  доходы
     */
    private RowContent otherIncomingTotal;

    /**
     * Прочие доходы --> Валовая прибыль Слесарного Цеха
     */
    private RowContent otherIncomingGrossProfit;

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
    private RowContent departmentChargesOtherChargeOnStaff;

    /**
     * Расходы по отделу --> Обучение
     */
    private RowContent departmentChargesEducation;

    /**
     * Расходы по отделу --> Итого расходы на адм. персонал Слесарного цеха
     */
    private RowContent departmentChargesTotalAdministrationCharges;

    /**
     * Расходы по отделу --> Расходы на подменные а/м
     */
    private RowContent departmentChargesSupposititiousCarsCharge;

    /**
     * Расходы по отделу --> Ремонт и обслуж. оборудования
     */
    private RowContent departmentChargesRepairService;

    /**
     * Расходы по отделу --> Расходы на а/м компании
     */
    private RowContent departmentChargesCompanyCarsCharge;

    /**
     * Расходы по отделу --> Расходы дилера по выплате компенсации клиенту
     */
    private RowContent departmentChargesClientCompensation;

    /**
     * Расходы по отделу --> Реклама
     */
    private RowContent departmentChargesAdvertising;

    /**
     * Расходы по отделу --> Стоимость расходных материалов и инструмента
     */
    private RowContent departmentChargesConsumableCost;

    /**
     * Расходы по отделу --> Амортизация
     */
    private RowContent departmentChargesAmortization;

    /**
     * Расходы по отделу --> Другие расходы
     */
    private RowContent departmentChargesOtherCharge;

    /**
     * Расходы по отделу --> Итого расходов
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
     * Статистика --> Часы присутствия Volvo
     */
    private RowContent statisticsVolvoPresenceHours;

    /**
     * Статистика --> Итого часов присутствия
     */
    private RowContent statisticsVolvoPresenceHoursTotal;

    /**
     * Статистика --> Продуктивные часы в розницу Volvo
     */
    private RowContent statisticsProductiveHoursAtRetailVolvo;

    /**
     * Статистика --> Продуктивные часы в розницу Другие
     */
    private RowContent statisticsProductiveHoursAtRetailOthers;

    /**
     * Статистика --> Итого продуктивные в розницу часы
     */
    private RowContent statisticsProductiveHoursAtRetailTotal;

    /**
     * Статистика --> Продуктивные внутренние часы Volvo
     */
    private RowContent statisticsProductiveHoursInnerVolvo;

    /**
     * Статистика --> Продуктивные внутренние часы Другие
     */
    private RowContent statisticsProductiveHoursInnerOthers;

    /**
     * Статистика --> Итого продуктивные внутренние часы
     */
    private RowContent statisticsProductiveHoursInnerTotal;

    /**
     * Статистика --> Продуктивные часы по гарантии Volvo
     */
    private RowContent statisticsProductiveHoursGuaranteeVolvo;

    /**
     * Статистика --> Продуктивные часы по гарантии Другие
     */
    private RowContent statisticsProductiveHoursGuaranteeOthers;

    /**
     * Статистика --> Итого продуктивные часы по гарантии
     */
    private RowContent statisticsProductiveHoursGuaranteeTotal;

    /**
     * Статистика --> Итого продуктивные часы
     */
    private RowContent statisticsProductiveHoursTotal;

    /**
     * Статистика --> Стоим-ть нормо-часа по прайс-листу - розница
     */
    private RowContent statisticsCostPerHourAtRetail;

    /**
     * Статистика --> Стоим-ть нормо-часа по прайс-листу - внутренние
     */
    private RowContent statisticsCostPerHourInner;

    /**
     * Статистика --> Стоим-ть нормо-часа по прайс-листу - гарантийные
     */
    private RowContent statisticsCostPerHourGuarantee;

    /**
     * Статистика --> Кол-во проданных з/н - розница Volvo
     */
    private RowContent statisticsQuantitySparesAtRetailVolvo;

    /**
     * Статистика --> Кол-во проданных з/н - внутренние Volvo
     */
    private RowContent statisticsQuantitySparesInnerVolvo;

    /**
     * Статистика --> Кол-во проданных з/н - гарантийные Volvo
     */
    private RowContent statisticsQuantitySparesGuaranteeVolvo;

    /**
     * Статистика --> Кол-во проданных з/н - Volvo
     */
    private RowContent statisticsQuantitySparesVolvo;

    /**
     * Статистика --> Кол-во проданных з/н - розница Другие
     */
    private RowContent statisticsQuantitySparesAtRetailOthers;

    /**
     * Статистика --> Кол-во проданных з/н - внутренние Другие
     */
    private RowContent statisticsQuantitySparesInnerOthers;

    /**
     * Статистика --> Кол-во проданных з/н - гарантийные Другие
     */
    private RowContent statisticsQuantitySparesGuaranteeOthers;

    /**
     * Статистика --> Кол-во проданных з/н - Другие
     */
    private RowContent statisticsQuantitySparesOthers;

    /**
     * Статистика --> Итого кол-во проданных з/н
     */
    private RowContent statisticsQuantitySparesOthersTotal;

    /**
     * Статистика --> Кол-во рабочих постов
     */
    private RowContent statisticsWorkingPostQuantity;

    /**
     * Статистика --> Кол-во подъемников
     */
    private RowContent statisticsElevatorQuantity;

    /**
     * Статистика --> Время работы цеха
     */
    private RowContent statisticsShopWorkingHours;

    /**
     * ----------------------------------------------
     */

    public RowContent getIncomingAndGrossProfitVolvoRetail() {
        return incomingAndGrossProfitVolvoRetail;
    }

    public void setIncomingAndGrossProfitVolvoRetail(RowContent incomingAndGrossProfitVolvoRetail) {
        this.incomingAndGrossProfitVolvoRetail = incomingAndGrossProfitVolvoRetail;
    }

    public RowContent getIncomingAndGrossProfitVolvoInner() {
        return incomingAndGrossProfitVolvoInner;
    }

    public void setIncomingAndGrossProfitVolvoInner(RowContent incomingAndGrossProfitVolvoInner) {
        this.incomingAndGrossProfitVolvoInner = incomingAndGrossProfitVolvoInner;
    }

    public RowContent getIncomingAndGrossProfitVolvoGuaranty() {
        return incomingAndGrossProfitVolvoGuaranty;
    }

    public void setIncomingAndGrossProfitVolvoGuaranty(RowContent incomingAndGrossProfitVolvoGuaranty) {
        this.incomingAndGrossProfitVolvoGuaranty = incomingAndGrossProfitVolvoGuaranty;
    }

    public RowContent getIncomingAndGrossProfitOthersRetail() {
        return incomingAndGrossProfitOthersRetail;
    }

    public void setIncomingAndGrossProfitOthersRetail(RowContent incomingAndGrossProfitOthersRetail) {
        this.incomingAndGrossProfitOthersRetail = incomingAndGrossProfitOthersRetail;
    }

    public RowContent getIncomingAndGrossProfitOthersInner() {
        return incomingAndGrossProfitOthersInner;
    }

    public void setIncomingAndGrossProfitOthersInner(RowContent incomingAndGrossProfitOthersInner) {
        this.incomingAndGrossProfitOthersInner = incomingAndGrossProfitOthersInner;
    }

    public RowContent getIncomingAndGrossProfitOthersGuaranty() {
        return incomingAndGrossProfitOthersGuaranty;
    }

    public void setIncomingAndGrossProfitOthersGuaranty(RowContent incomingAndGrossProfitOthersGuaranty) {
        this.incomingAndGrossProfitOthersGuaranty = incomingAndGrossProfitOthersGuaranty;
    }

    public RowContent getIncomingAndGrossProfitRetailTotal() {
        return incomingAndGrossProfitRetailTotal;
    }

    public void setIncomingAndGrossProfitRetailTotal(RowContent incomingAndGrossProfitRetailTotal) {
        this.incomingAndGrossProfitRetailTotal = incomingAndGrossProfitRetailTotal;
    }

    public RowContent getIncomingAndGrossProfitInnerTotal() {
        return incomingAndGrossProfitInnerTotal;
    }

    public void setIncomingAndGrossProfitInnerTotal(RowContent incomingAndGrossProfitInnerTotal) {
        this.incomingAndGrossProfitInnerTotal = incomingAndGrossProfitInnerTotal;
    }

    public RowContent getIncomingAndGrossProfitGuarantyTotal() {
        return incomingAndGrossProfitGuarantyTotal;
    }

    public void setIncomingAndGrossProfitGuarantyTotal(RowContent incomingAndGrossProfitGuarantyTotal) {
        this.incomingAndGrossProfitGuarantyTotal = incomingAndGrossProfitGuarantyTotal;
    }

    public RowContent getIncomingAndGrossProfitTotal() {
        return incomingAndGrossProfitTotal;
    }

    public void setIncomingAndGrossProfitTotal(RowContent incomingAndGrossProfitTotal) {
        this.incomingAndGrossProfitTotal = incomingAndGrossProfitTotal;
    }

    public RowContent getSubcontractIncoming() {
        return subcontractIncoming;
    }

    public void setSubcontractIncoming(RowContent subcontractIncoming) {
        this.subcontractIncoming = subcontractIncoming;
    }

    public RowContent getSubcontractIncomingTotal() {
        return subcontractIncomingTotal;
    }

    public void setSubcontractIncomingTotal(RowContent subcontractIncomingTotal) {
        this.subcontractIncomingTotal = subcontractIncomingTotal;
    }

    public RowContent getOtherIncomingLubricant() {
        return otherIncomingLubricant;
    }

    public void setOtherIncomingLubricant(RowContent otherIncomingLubricant) {
        this.otherIncomingLubricant = otherIncomingLubricant;
    }

    public RowContent getOtherIncomingOtherIncoming() {
        return otherIncomingOtherIncoming;
    }

    public void setOtherIncomingOtherIncoming(RowContent otherIncomingOtherIncoming) {
        this.otherIncomingOtherIncoming = otherIncomingOtherIncoming;
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

    public RowContent getDepartmentChargesOtherChargeOnStaff() {
        return departmentChargesOtherChargeOnStaff;
    }

    public void setDepartmentChargesOtherChargeOnStaff(RowContent departmentChargesOtherChargeOnStaff) {
        this.departmentChargesOtherChargeOnStaff = departmentChargesOtherChargeOnStaff;
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

    public RowContent getDepartmentChargesSupposititiousCarsCharge() {
        return departmentChargesSupposititiousCarsCharge;
    }

    public void setDepartmentChargesSupposititiousCarsCharge(RowContent departmentChargesSupposititiousCarsCharge) {
        this.departmentChargesSupposititiousCarsCharge = departmentChargesSupposititiousCarsCharge;
    }

    public RowContent getDepartmentChargesRepairService() {
        return departmentChargesRepairService;
    }

    public void setDepartmentChargesRepairService(RowContent departmentChargesRepairService) {
        this.departmentChargesRepairService = departmentChargesRepairService;
    }

    public RowContent getDepartmentChargesCompanyCarsCharge() {
        return departmentChargesCompanyCarsCharge;
    }

    public void setDepartmentChargesCompanyCarsCharge(RowContent departmentChargesCompanyCarsCharge) {
        this.departmentChargesCompanyCarsCharge = departmentChargesCompanyCarsCharge;
    }

    public RowContent getDepartmentChargesClientCompensation() {
        return departmentChargesClientCompensation;
    }

    public void setDepartmentChargesClientCompensation(RowContent departmentChargesClientCompensation) {
        this.departmentChargesClientCompensation = departmentChargesClientCompensation;
    }

    public RowContent getDepartmentChargesAdvertising() {
        return departmentChargesAdvertising;
    }

    public void setDepartmentChargesAdvertising(RowContent departmentChargesAdvertising) {
        this.departmentChargesAdvertising = departmentChargesAdvertising;
    }

    public RowContent getDepartmentChargesConsumableCost() {
        return departmentChargesConsumableCost;
    }

    public void setDepartmentChargesConsumableCost(RowContent departmentChargesConsumableCost) {
        this.departmentChargesConsumableCost = departmentChargesConsumableCost;
    }

    public RowContent getDepartmentChargesAmortization() {
        return departmentChargesAmortization;
    }

    public void setDepartmentChargesAmortization(RowContent departmentChargesAmortization) {
        this.departmentChargesAmortization = departmentChargesAmortization;
    }

    public RowContent getDepartmentChargesOtherCharge() {
        return departmentChargesOtherCharge;
    }

    public void setDepartmentChargesOtherCharge(RowContent departmentChargesOtherCharge) {
        this.departmentChargesOtherCharge = departmentChargesOtherCharge;
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

    public RowContent getStatisticsVolvoPresenceHours() {
        return statisticsVolvoPresenceHours;
    }

    public void setStatisticsVolvoPresenceHours(RowContent statisticsVolvoPresenceHours) {
        this.statisticsVolvoPresenceHours = statisticsVolvoPresenceHours;
    }

    public RowContent getStatisticsVolvoPresenceHoursTotal() {
        return statisticsVolvoPresenceHoursTotal;
    }

    public void setStatisticsVolvoPresenceHoursTotal(RowContent statisticsVolvoPresenceHoursTotal) {
        this.statisticsVolvoPresenceHoursTotal = statisticsVolvoPresenceHoursTotal;
    }

    public RowContent getStatisticsProductiveHoursAtRetailVolvo() {
        return statisticsProductiveHoursAtRetailVolvo;
    }

    public void setStatisticsProductiveHoursAtRetailVolvo(RowContent statisticsProductiveHoursAtRetailVolvo) {
        this.statisticsProductiveHoursAtRetailVolvo = statisticsProductiveHoursAtRetailVolvo;
    }

    public RowContent getStatisticsProductiveHoursAtRetailOthers() {
        return statisticsProductiveHoursAtRetailOthers;
    }

    public void setStatisticsProductiveHoursAtRetailOthers(RowContent statisticsProductiveHoursAtRetailOthers) {
        this.statisticsProductiveHoursAtRetailOthers = statisticsProductiveHoursAtRetailOthers;
    }

    public RowContent getStatisticsProductiveHoursAtRetailTotal() {
        return statisticsProductiveHoursAtRetailTotal;
    }

    public void setStatisticsProductiveHoursAtRetailTotal(RowContent statisticsProductiveHoursAtRetailTotal) {
        this.statisticsProductiveHoursAtRetailTotal = statisticsProductiveHoursAtRetailTotal;
    }

    public RowContent getStatisticsProductiveHoursInnerVolvo() {
        return statisticsProductiveHoursInnerVolvo;
    }

    public void setStatisticsProductiveHoursInnerVolvo(RowContent statisticsProductiveHoursInnerVolvo) {
        this.statisticsProductiveHoursInnerVolvo = statisticsProductiveHoursInnerVolvo;
    }

    public RowContent getStatisticsProductiveHoursInnerOthers() {
        return statisticsProductiveHoursInnerOthers;
    }

    public void setStatisticsProductiveHoursInnerOthers(RowContent statisticsProductiveHoursInnerOthers) {
        this.statisticsProductiveHoursInnerOthers = statisticsProductiveHoursInnerOthers;
    }

    public RowContent getStatisticsProductiveHoursInnerTotal() {
        return statisticsProductiveHoursInnerTotal;
    }

    public void setStatisticsProductiveHoursInnerTotal(RowContent statisticsProductiveHoursInnerTotal) {
        this.statisticsProductiveHoursInnerTotal = statisticsProductiveHoursInnerTotal;
    }

    public RowContent getStatisticsProductiveHoursGuaranteeVolvo() {
        return statisticsProductiveHoursGuaranteeVolvo;
    }

    public void setStatisticsProductiveHoursGuaranteeVolvo(RowContent statisticsProductiveHoursGuaranteeVolvo) {
        this.statisticsProductiveHoursGuaranteeVolvo = statisticsProductiveHoursGuaranteeVolvo;
    }

    public RowContent getStatisticsProductiveHoursGuaranteeOthers() {
        return statisticsProductiveHoursGuaranteeOthers;
    }

    public void setStatisticsProductiveHoursGuaranteeOthers(RowContent statisticsProductiveHoursGuaranteeOthers) {
        this.statisticsProductiveHoursGuaranteeOthers = statisticsProductiveHoursGuaranteeOthers;
    }

    public RowContent getStatisticsProductiveHoursGuaranteeTotal() {
        return statisticsProductiveHoursGuaranteeTotal;
    }

    public void setStatisticsProductiveHoursGuaranteeTotal(RowContent statisticsProductiveHoursGuaranteeTotal) {
        this.statisticsProductiveHoursGuaranteeTotal = statisticsProductiveHoursGuaranteeTotal;
    }

    public RowContent getStatisticsProductiveHoursTotal() {
        return statisticsProductiveHoursTotal;
    }

    public void setStatisticsProductiveHoursTotal(RowContent statisticsProductiveHoursTotal) {
        this.statisticsProductiveHoursTotal = statisticsProductiveHoursTotal;
    }

    public RowContent getStatisticsCostPerHourAtRetail() {
        return statisticsCostPerHourAtRetail;
    }

    public void setStatisticsCostPerHourAtRetail(RowContent statisticsCostPerHourAtRetail) {
        this.statisticsCostPerHourAtRetail = statisticsCostPerHourAtRetail;
    }

    public RowContent getStatisticsCostPerHourInner() {
        return statisticsCostPerHourInner;
    }

    public void setStatisticsCostPerHourInner(RowContent statisticsCostPerHourInner) {
        this.statisticsCostPerHourInner = statisticsCostPerHourInner;
    }

    public RowContent getStatisticsCostPerHourGuarantee() {
        return statisticsCostPerHourGuarantee;
    }

    public void setStatisticsCostPerHourGuarantee(RowContent statisticsCostPerHourGuarantee) {
        this.statisticsCostPerHourGuarantee = statisticsCostPerHourGuarantee;
    }

    public RowContent getStatisticsQuantitySparesAtRetailVolvo() {
        return statisticsQuantitySparesAtRetailVolvo;
    }

    public void setStatisticsQuantitySparesAtRetailVolvo(RowContent statisticsQuantitySparesAtRetailVolvo) {
        this.statisticsQuantitySparesAtRetailVolvo = statisticsQuantitySparesAtRetailVolvo;
    }

    public RowContent getStatisticsQuantitySparesInnerVolvo() {
        return statisticsQuantitySparesInnerVolvo;
    }

    public void setStatisticsQuantitySparesInnerVolvo(RowContent statisticsQuantitySparesInnerVolvo) {
        this.statisticsQuantitySparesInnerVolvo = statisticsQuantitySparesInnerVolvo;
    }

    public RowContent getStatisticsQuantitySparesGuaranteeVolvo() {
        return statisticsQuantitySparesGuaranteeVolvo;
    }

    public void setStatisticsQuantitySparesGuaranteeVolvo(RowContent statisticsQuantitySparesGuaranteeVolvo) {
        this.statisticsQuantitySparesGuaranteeVolvo = statisticsQuantitySparesGuaranteeVolvo;
    }

    public RowContent getStatisticsQuantitySparesVolvo() {
        return statisticsQuantitySparesVolvo;
    }

    public void setStatisticsQuantitySparesVolvo(RowContent statisticsQuantitySparesVolvo) {
        this.statisticsQuantitySparesVolvo = statisticsQuantitySparesVolvo;
    }

    public RowContent getStatisticsQuantitySparesAtRetailOthers() {
        return statisticsQuantitySparesAtRetailOthers;
    }

    public void setStatisticsQuantitySparesAtRetailOthers(RowContent statisticsQuantitySparesAtRetailOthers) {
        this.statisticsQuantitySparesAtRetailOthers = statisticsQuantitySparesAtRetailOthers;
    }

    public RowContent getStatisticsQuantitySparesInnerOthers() {
        return statisticsQuantitySparesInnerOthers;
    }

    public void setStatisticsQuantitySparesInnerOthers(RowContent statisticsQuantitySparesInnerOthers) {
        this.statisticsQuantitySparesInnerOthers = statisticsQuantitySparesInnerOthers;
    }

    public RowContent getStatisticsQuantitySparesGuaranteeOthers() {
        return statisticsQuantitySparesGuaranteeOthers;
    }

    public void setStatisticsQuantitySparesGuaranteeOthers(RowContent statisticsQuantitySparesGuaranteeOthers) {
        this.statisticsQuantitySparesGuaranteeOthers = statisticsQuantitySparesGuaranteeOthers;
    }

    public RowContent getStatisticsQuantitySparesOthers() {
        return statisticsQuantitySparesOthers;
    }

    public void setStatisticsQuantitySparesOthers(RowContent statisticsQuantitySparesOthers) {
        this.statisticsQuantitySparesOthers = statisticsQuantitySparesOthers;
    }

    public RowContent getStatisticsQuantitySparesOthersTotal() {
        return statisticsQuantitySparesOthersTotal;
    }

    public void setStatisticsQuantitySparesOthersTotal(RowContent statisticsQuantitySparesOthersTotal) {
        this.statisticsQuantitySparesOthersTotal = statisticsQuantitySparesOthersTotal;
    }

    public RowContent getStatisticsWorkingPostQuantity() {
        return statisticsWorkingPostQuantity;
    }

    public void setStatisticsWorkingPostQuantity(RowContent statisticsWorkingPostQuantity) {
        this.statisticsWorkingPostQuantity = statisticsWorkingPostQuantity;
    }

    public RowContent getStatisticsElevatorQuantity() {
        return statisticsElevatorQuantity;
    }

    public void setStatisticsElevatorQuantity(RowContent statisticsElevatorQuantity) {
        this.statisticsElevatorQuantity = statisticsElevatorQuantity;
    }

    public RowContent getStatisticsShopWorkingHours() {
        return statisticsShopWorkingHours;
    }

    public void setStatisticsShopWorkingHours(RowContent statisticsShopWorkingHours) {
        this.statisticsShopWorkingHours = statisticsShopWorkingHours;
    }
}
