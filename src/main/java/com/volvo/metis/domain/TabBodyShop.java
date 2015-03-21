package com.volvo.metis.domain;

import java.io.Serializable;

/**
 * Вкладка "Кузовной цех"
 */
public class TabBodyShop implements Serializable {

    /**
     * Выручка и ВП --> Куз. цех Розница - Volvo
     */
    private RowContent incomingAndGrossProfitVolvoRetail;

    /**
     * Выручка и ВП --> Куз. цех Страховые - Volvo
     */
    private RowContent incomingAndGrossProfitVolvoInsurance;

    /**
     * Выручка и ВП --> Куз. цех Внутренние - Volvo
     */
    private RowContent incomingAndGrossProfitVolvoInner;

    /**
     * Выручка и ВП --> Куз. цех Гарантийные - Volvo
     */
    private RowContent incomingAndGrossProfitVolvoGuaranty;

    /**
     * Выручка и ВП --> Куз. цех Розница - Другие
     */
    private RowContent incomingAndGrossProfitOthersRetail;

    /**
     * Выручка и ВП --> Куз. цех Страховые - Другие
     */
    private RowContent incomingAndGrossProfitOthersInsurance;

    /**
     * Выручка и ВП --> Куз. цех Внутренние - Другие
     */
    private RowContent incomingAndGrossProfitOthersInner;

    /**
     * Выручка и ВП --> Куз. цех Гарантийные - Другие
     */
    private RowContent incomingAndGrossProfitOthersGuaranty;

    /**
     * Выручка и ВП --> Итого куз. цех Розница
     */
    private RowContent incomingAndGrossProfitRetailTotal;

    /**
     * Выручка и ВП --> Итого куз. цех Страховые
     */
    private RowContent incomingAndGrossProfitInsuranceTotal;

    /**
     * Выручка и ВП --> Итого куз. цех Внутренние
     */
    private RowContent incomingAndGrossProfitInnerTotal;

    /**
     * Выручка и ВП --> Итого куз. цех Гарантия
     */
    private RowContent incomingAndGrossProfitGuarantyTotal;

    /**
     * Выручка и ВП --> Итого по куз. цеху
     */
    private RowContent incomingAndGrossProfitTotal;

    /**
     * Выручка и ВП --> Убыток от простоя куз.цеха
     */
    private RowContent incomingAndGrossProfitBodyShopLoss;

    /**
     * Выручка и ВП --> Итого по Кузовному цеху
     */
    private RowContent incomingAndGrossProfitBodyShopTotal;

    /**
     * ----------------------------------------------
     */

    /**
     * Доходы по субконтрактам --> Субконтракты Куз.цеха
     */
    private RowContent subcontractIncomingBodyShop;

    /**
     * Доходы по субконтрактам --> Итого доходы по субконтрактам
     */
    private RowContent subcontractIncomingBodyShopTotal;

    /**
     * ----------------------------------------------
     */

    /**
     * Прочие доходы --> Продажа краски и сопутствующих материалов
     */
    private RowContent otherIncomingColorsTyingProductsSale;

    /**
     * Прочие доходы --> Прочие доходы
     */
    private RowContent otherIncomingOtherIncoming;

    /**
     * Прочие доходы --> Всего прочие  доходы
     */
    private RowContent otherIncomingTotal;

    /**
     * Прочие доходы -->  Валовая прибыль Кузовного цеха
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
     * Расходы по отделу --> Итого расходы на адм. персонал Кузовного цеха
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
     * Статистика --> Продуктивные часы по страховым Volvo
     */
    private RowContent statisticsProductiveHoursInsuranceVolvo;

    /**
     * Статистика --> Продуктивные часы по страховым Другие
     */
    private RowContent statisticsProductiveHoursInsuranceOthers;

    /**
     * Статистика --> Итого продуктивные часы по страховым
     */
    private RowContent statisticsProductiveHoursInsuranceTotal;

    /**
     * Статистика --> Итого продуктивные внутренние часы
     */
    private RowContent statisticsProductiveHoursInnerTotal;

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
     * Статистика --> Стоим-ть нормо-часа по прайс-листу- страховые
     */
    private RowContent statisticsCostPerHourInsurance;

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
     * Статистика --> Кол-во проданных з/н - страховые Volvo
     */
    private RowContent statisticsQuantitySparesInsuranceVolvo;

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
     * Статистика --> Кол-во проданных з/н - страховые Другие
     */
    private RowContent statisticsQuantitySparesInsuranceOthers;

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
     * Статистика --> Кол-во  рабочих постов
     */
    private RowContent statisticsWorkingPostQuantity;

    /**
     * Статистика --> Кол-во покрасочных камер
     */
    private RowContent statisticsColoredCameraQuantity;

    /**
     * Статистика --> Время работы цеха
     */
    private RowContent statisticsHoursOfShopService;

    /**
     * ----------------------------------------------
     */

    public RowContent getIncomingAndGrossProfitVolvoRetail() {
        return incomingAndGrossProfitVolvoRetail;
    }

    public void setIncomingAndGrossProfitVolvoRetail(RowContent incomingAndGrossProfitVolvoRetail) {
        this.incomingAndGrossProfitVolvoRetail = incomingAndGrossProfitVolvoRetail;
    }

    public RowContent getIncomingAndGrossProfitVolvoInsurance() {
        return incomingAndGrossProfitVolvoInsurance;
    }

    public void setIncomingAndGrossProfitVolvoInsurance(RowContent incomingAndGrossProfitVolvoInsurance) {
        this.incomingAndGrossProfitVolvoInsurance = incomingAndGrossProfitVolvoInsurance;
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

    public RowContent getIncomingAndGrossProfitOthersInsurance() {
        return incomingAndGrossProfitOthersInsurance;
    }

    public void setIncomingAndGrossProfitOthersInsurance(RowContent incomingAndGrossProfitOthersInsurance) {
        this.incomingAndGrossProfitOthersInsurance = incomingAndGrossProfitOthersInsurance;
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

    public RowContent getIncomingAndGrossProfitInsuranceTotal() {
        return incomingAndGrossProfitInsuranceTotal;
    }

    public void setIncomingAndGrossProfitInsuranceTotal(RowContent incomingAndGrossProfitInsuranceTotal) {
        this.incomingAndGrossProfitInsuranceTotal = incomingAndGrossProfitInsuranceTotal;
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

    public RowContent getIncomingAndGrossProfitBodyShopLoss() {
        return incomingAndGrossProfitBodyShopLoss;
    }

    public void setIncomingAndGrossProfitBodyShopLoss(RowContent incomingAndGrossProfitBodyShopLoss) {
        this.incomingAndGrossProfitBodyShopLoss = incomingAndGrossProfitBodyShopLoss;
    }

    public RowContent getIncomingAndGrossProfitBodyShopTotal() {
        return incomingAndGrossProfitBodyShopTotal;
    }

    public void setIncomingAndGrossProfitBodyShopTotal(RowContent incomingAndGrossProfitBodyShopTotal) {
        this.incomingAndGrossProfitBodyShopTotal = incomingAndGrossProfitBodyShopTotal;
    }

    public RowContent getSubcontractIncomingBodyShop() {
        return subcontractIncomingBodyShop;
    }

    public void setSubcontractIncomingBodyShop(RowContent subcontractIncomingBodyShop) {
        this.subcontractIncomingBodyShop = subcontractIncomingBodyShop;
    }

    public RowContent getSubcontractIncomingBodyShopTotal() {
        return subcontractIncomingBodyShopTotal;
    }

    public void setSubcontractIncomingBodyShopTotal(RowContent subcontractIncomingBodyShopTotal) {
        this.subcontractIncomingBodyShopTotal = subcontractIncomingBodyShopTotal;
    }

    public RowContent getOtherIncomingColorsTyingProductsSale() {
        return otherIncomingColorsTyingProductsSale;
    }

    public void setOtherIncomingColorsTyingProductsSale(RowContent otherIncomingColorsTyingProductsSale) {
        this.otherIncomingColorsTyingProductsSale = otherIncomingColorsTyingProductsSale;
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

    public RowContent getStatisticsProductiveHoursInsuranceVolvo() {
        return statisticsProductiveHoursInsuranceVolvo;
    }

    public void setStatisticsProductiveHoursInsuranceVolvo(RowContent statisticsProductiveHoursInsuranceVolvo) {
        this.statisticsProductiveHoursInsuranceVolvo = statisticsProductiveHoursInsuranceVolvo;
    }

    public RowContent getStatisticsProductiveHoursInsuranceOthers() {
        return statisticsProductiveHoursInsuranceOthers;
    }

    public void setStatisticsProductiveHoursInsuranceOthers(RowContent statisticsProductiveHoursInsuranceOthers) {
        this.statisticsProductiveHoursInsuranceOthers = statisticsProductiveHoursInsuranceOthers;
    }

    public RowContent getStatisticsProductiveHoursInsuranceTotal() {
        return statisticsProductiveHoursInsuranceTotal;
    }

    public void setStatisticsProductiveHoursInsuranceTotal(RowContent statisticsProductiveHoursInsuranceTotal) {
        this.statisticsProductiveHoursInsuranceTotal = statisticsProductiveHoursInsuranceTotal;
    }

    public RowContent getStatisticsProductiveHoursInnerTotal() {
        return statisticsProductiveHoursInnerTotal;
    }

    public void setStatisticsProductiveHoursInnerTotal(RowContent statisticsProductiveHoursInnerTotal) {
        this.statisticsProductiveHoursInnerTotal = statisticsProductiveHoursInnerTotal;
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

    public RowContent getStatisticsCostPerHourInsurance() {
        return statisticsCostPerHourInsurance;
    }

    public void setStatisticsCostPerHourInsurance(RowContent statisticsCostPerHourInsurance) {
        this.statisticsCostPerHourInsurance = statisticsCostPerHourInsurance;
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

    public RowContent getStatisticsQuantitySparesInsuranceVolvo() {
        return statisticsQuantitySparesInsuranceVolvo;
    }

    public void setStatisticsQuantitySparesInsuranceVolvo(RowContent statisticsQuantitySparesInsuranceVolvo) {
        this.statisticsQuantitySparesInsuranceVolvo = statisticsQuantitySparesInsuranceVolvo;
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

    public RowContent getStatisticsQuantitySparesInsuranceOthers() {
        return statisticsQuantitySparesInsuranceOthers;
    }

    public void setStatisticsQuantitySparesInsuranceOthers(RowContent statisticsQuantitySparesInsuranceOthers) {
        this.statisticsQuantitySparesInsuranceOthers = statisticsQuantitySparesInsuranceOthers;
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

    public RowContent getStatisticsColoredCameraQuantity() {
        return statisticsColoredCameraQuantity;
    }

    public void setStatisticsColoredCameraQuantity(RowContent statisticsColoredCameraQuantity) {
        this.statisticsColoredCameraQuantity = statisticsColoredCameraQuantity;
    }

    public RowContent getStatisticsHoursOfShopService() {
        return statisticsHoursOfShopService;
    }

    public void setStatisticsHoursOfShopService(RowContent statisticsHoursOfShopService) {
        this.statisticsHoursOfShopService = statisticsHoursOfShopService;
    }
}
