package com.volvo.metis.domain;

import java.io.Serializable;

/**
 * Вкладка "Запчасти"
 */
public class TabSpares implements Serializable {

    /**
     * Выручка и ВП --> Продажи через магазин - Volvo
     */
    private RowContent incomingAndGrossProfitShopSaleVolvo;

    /**
     * Выручка и ВП --> Продажи аксессуаров - Volvo
     */
    private RowContent incomingAndGrossProfitSaleAccessoriesVolvo;

    /**
     * Выручка и ВП --> Продажи з/ч др. орг-м - Volvo
     */
    private RowContent incomingAndGrossProfitSaleSparesOtherOrganizationsVolvo;

    /**
     * Выручка и ВП --> Продажи з/ч слес. цех - розница Volvo
     */
    private RowContent incomingAndGrossProfitFittingShopSaleSparesAtRetailVolvo;

    /**
     * Выручка и ВП --> Продажи з/ч слес. цех - внутренние Volvo
     */
    private RowContent incomingAndGrossProfitFittingShopSaleSparesInnerVolvo;

    /**
     * Выручка и ВП --> Продажи з/ч слес. цех - гарантия Volvo
     */
    private RowContent incomingAndGrossProfitFittingShopSaleSparesGuaranteeVolvo;

    /**
     * Выручка и ВП --> Продажи з/ч куз. цех - розница Volvo
     */
    private RowContent incomingAndGrossProfitBodyShopSaleSparesAtRetailVolvo;

    /**
     * Выручка и ВП --> Продажи з/ч куз. цех - страховые Volvo
     */
    private RowContent incomingAndGrossProfitBodyShopSaleSparesInsuranceVolvo;

    /**
     * Выручка и ВП --> Продажи з/ч куз. цех - внутренние Volvo
     */
    private RowContent incomingAndGrossProfitBodyShopSaleSparesInnerVolvo;

    /**
     * Выручка и ВП --> Продажи з/ч куз. цех - гарантия Volvo
     */
    private RowContent incomingAndGrossProfitBodyShopSaleSparesGuaranteeVolvo;

    /**
     * Выручка и ВП --> Розничная продажа других производителей
     */
    private RowContent incomingAndGrossProfitRetailShopSaleOthers;

    /**
     * Выручка и ВП --> Продажи аксессуаров - Другие
     */
    private RowContent incomingAndGrossProfitSaleAccessoriesOthers;

    /**
     * Выручка и ВП --> Продажи др. орг-м - Другие
     */
    private RowContent incomingAndGrossProfitSaleSparesOtherOrganizationsOthers;

    /**
     * Выручка и ВП --> Продажи з/ч слес. цех - розница Другие
     */
    private RowContent incomingAndGrossProfitFittingShopSaleSparesAtRetailOthers;

    /**
     * Выручка и ВП --> Продажи з/ч слес. цех - внутренние Другие
     */
    private RowContent incomingAndGrossProfitFittingShopSaleSparesInnerOthers;

    /**
     * Выручка и ВП --> Продажи з/ч слес. цех - гарантия Другие
     */
    private RowContent incomingAndGrossProfitFittingShopSaleSparesGuaranteeOthers;

    /**
     * Выручка и ВП --> Продажи з/ч куз. цех - розница Другие
     */
    private RowContent incomingAndGrossProfitBodyShopSaleSparesAtRetailOthers;

    /**
     * Выручка и ВП --> Продажи з/ч куз. цех - страховые Другие
     */
    private RowContent incomingAndGrossProfitBodyShopSaleSparesInsuranceOthers;

    /**
     * Выручка и ВП --> Продажи з/ч куз. цех - внутренние Другие
     */
    private RowContent incomingAndGrossProfitBodyShopSaleSparesInnerOthers;

    /**
     * Выручка и ВП --> Продажи з/ч куз. цех - гарантия Другие
     */
    private RowContent incomingAndGrossProfitBodyShopSaleSparesGuaranteeOthers;

    /**
     * Выручка и ВП --> Итог Продажи через магазин
     */
    private RowContent incomingAndGrossProfitTotalShop;

    /**
     * Выручка и ВП --> Итог Продажи аксессуаров
     */
    private RowContent incomingAndGrossProfitTotalAccessories;

    /**
     * Выручка и ВП --> Итог Продажи др. орг-м
     */
    private RowContent incomingAndGrossProfitTotalSaleOtherOrganizations;

    /**
     * Выручка и ВП --> Итог Продажи з/ч слес. цех - розница
     */
    private RowContent incomingAndGrossProfitTotalFlittingShopAtRetail;

    /**
     * Выручка и ВП --> Итог Продажи з/ч слес. цех - внутренние
     */
    private RowContent incomingAndGrossProfitTotalFlittingShopInner;

    /**
     * Выручка и ВП --> Итог Продажи з/ч слес. цех - гарантия
     */
    private RowContent incomingAndGrossProfitTotalFlittingShopGuarantee;

    /**
     * Выручка и ВП --> Итог Продажи з/ч куз. цех - розница
     */
    private RowContent incomingAndGrossProfitTotalBodyShopAtRetail;

    /**
     * Выручка и ВП --> Итог Продажи з/ч куз. цех - страховые
     */
    private RowContent incomingAndGrossProfitTotalBodyShopInsurance;

    /**
     * Выручка и ВП --> Итог Продажи з/ч куз. цех - внутренние
     */
    private RowContent incomingAndGrossProfitTotalBodyShopInner;

    /**
     * Выручка и ВП --> Итог Продажи з/ч куз. цех - гарантия
     */
    private RowContent incomingAndGrossProfitTotalBodyShopGuarantee;

    /**
     * Выручка и ВП --> Итого продажи запчастей
     */
    private RowContent incomingAndGrossProfitTotalSparesSales;

    /**
     * Выручка и ВП --> ГСМ
     */
    private RowContent incomingAndGrossProfitLubricant;

    /**
     * Выручка и ВП --> Продажа краски и сопутствующих материалов
     */
    private RowContent incomingAndGrossProfitColorsTyingProductsSale;

    /**
     * Выручка и ВП --> Продажа шин
     */
    private RowContent incomingAndGrossProfitTyreSale;

    /**
     * Выручка и ВП --> Прочие продажи
     */
    private RowContent incomingAndGrossProfitOtherSales;

    /**
     * Выручка и ВП --> Всего прочие доходы
     */
    private RowContent incomingAndGrossProfitOtherSalesTotal;

    /**
     * Выручка и ВП --> Всего по отделу запчастей
     */
    private RowContent incomingAndGrossProfitTotalDepartment;

    /**
     * ----------------------------------------------
     */

    /**
     * Прочие доходы --> Прочие доходы
     */
    private RowContent otherIncomingOtherIncoming;

    /**
     * Прочие доходы --> Дополнительные расходы
     */
    private RowContent otherIncomingExtraCharge;

    /**
     * Прочие доходы --> Корректировка величины запасов
     */
    private RowContent otherIncomingStockpileCorrection;

    /**
     * Прочие доходы --> Итого продажи и ВП по запчастям
     */
    private RowContent otherIncomingTotalSparesSale;

    /**
     * ----------------------------------------------
     */

    /**
     * Расходы по отделу --> Зарплата непродуктивного персонала
     */
    private RowContent departmentChargeNonproductiveStaffSalary;

    /**
     * Расходы по отделу --> Комиссионные
     */
    private RowContent departmentChargeCommissionCharges;

    /**
     * Расходы по отделу --> Налоги на з/п
     */
    private RowContent departmentChargeSalaryTax;

    /**
     * Расходы по отделу --> Другие расходы на персонал
     */
    private RowContent departmentChargeOtherChargeOnStaff;

    /**
     * Расходы по отделу --> Обучение
     */
    private RowContent departmentChargeEducation;

    /**
     * Расходы по отделу --> Итого расходы на персонал
     */
    private RowContent departmentChargeTotalStaffCharges;

    /**
     * Расходы по отделу --> Расходы на оборудование
     */
    private RowContent departmentChargeEnvironmentCharges;

    /**
     * Расходы по отделу --> Расходы на а/м отдела, трансп. расходы
     */
    private RowContent departmentChargeDepartmentCarsCharges;

    /**
     * Расходы по отделу --> Реклама
     */
    private RowContent departmentChargeAdvertising;

    /**
     * Расходы по отделу --> Расходы дилера по выплате компенсации клиенту
     */
    private RowContent departmentChargeDealerPaymentCharges;

    /**
     * Расходы по отделу --> Другие расходы
     */
    private RowContent departmentChargeOtherCharge;

    /**
     * Расходы по отделу --> Амортизация
     */
    private RowContent departmentChargeAmortization;

    /**
     * Расходы по отделу --> Итого расходов
     */
    private RowContent departmentChargeTotalCharges;

    /**
     * Расходы по отделу --> Прибыль по отделу
     */
    private RowContent departmentChargeDepartmentIncoming;

    /**
     * ----------------------------------------------
     */

    /**
     * Статистика --> Ст-сть запчастей на складе
     */
    private RowContent statisticsSparesCostInStock;

    /**
     * Статистика --> Площадь склада з/ч
     */
    private RowContent statisticsSparesStockArea;

    /**
     * ----------------------------------------------
     */

    public RowContent getIncomingAndGrossProfitShopSaleVolvo() {
        return incomingAndGrossProfitShopSaleVolvo;
    }

    public void setIncomingAndGrossProfitShopSaleVolvo(RowContent incomingAndGrossProfitShopSaleVolvo) {
        this.incomingAndGrossProfitShopSaleVolvo = incomingAndGrossProfitShopSaleVolvo;
    }

    public RowContent getIncomingAndGrossProfitSaleAccessoriesVolvo() {
        return incomingAndGrossProfitSaleAccessoriesVolvo;
    }

    public void setIncomingAndGrossProfitSaleAccessoriesVolvo(RowContent incomingAndGrossProfitSaleAccessoriesVolvo) {
        this.incomingAndGrossProfitSaleAccessoriesVolvo = incomingAndGrossProfitSaleAccessoriesVolvo;
    }

    public RowContent getIncomingAndGrossProfitSaleSparesOtherOrganizationsVolvo() {
        return incomingAndGrossProfitSaleSparesOtherOrganizationsVolvo;
    }

    public void setIncomingAndGrossProfitSaleSparesOtherOrganizationsVolvo(RowContent incomingAndGrossProfitSaleSparesOtherOrganizationsVolvo) {
        this.incomingAndGrossProfitSaleSparesOtherOrganizationsVolvo = incomingAndGrossProfitSaleSparesOtherOrganizationsVolvo;
    }

    public RowContent getIncomingAndGrossProfitFittingShopSaleSparesAtRetailVolvo() {
        return incomingAndGrossProfitFittingShopSaleSparesAtRetailVolvo;
    }

    public void setIncomingAndGrossProfitFittingShopSaleSparesAtRetailVolvo(RowContent incomingAndGrossProfitFittingShopSaleSparesAtRetailVolvo) {
        this.incomingAndGrossProfitFittingShopSaleSparesAtRetailVolvo = incomingAndGrossProfitFittingShopSaleSparesAtRetailVolvo;
    }

    public RowContent getIncomingAndGrossProfitFittingShopSaleSparesInnerVolvo() {
        return incomingAndGrossProfitFittingShopSaleSparesInnerVolvo;
    }

    public void setIncomingAndGrossProfitFittingShopSaleSparesInnerVolvo(RowContent incomingAndGrossProfitFittingShopSaleSparesInnerVolvo) {
        this.incomingAndGrossProfitFittingShopSaleSparesInnerVolvo = incomingAndGrossProfitFittingShopSaleSparesInnerVolvo;
    }

    public RowContent getIncomingAndGrossProfitFittingShopSaleSparesGuaranteeVolvo() {
        return incomingAndGrossProfitFittingShopSaleSparesGuaranteeVolvo;
    }

    public void setIncomingAndGrossProfitFittingShopSaleSparesGuaranteeVolvo(RowContent incomingAndGrossProfitFittingShopSaleSparesGuaranteeVolvo) {
        this.incomingAndGrossProfitFittingShopSaleSparesGuaranteeVolvo = incomingAndGrossProfitFittingShopSaleSparesGuaranteeVolvo;
    }

    public RowContent getIncomingAndGrossProfitBodyShopSaleSparesAtRetailVolvo() {
        return incomingAndGrossProfitBodyShopSaleSparesAtRetailVolvo;
    }

    public void setIncomingAndGrossProfitBodyShopSaleSparesAtRetailVolvo(RowContent incomingAndGrossProfitBodyShopSaleSparesAtRetailVolvo) {
        this.incomingAndGrossProfitBodyShopSaleSparesAtRetailVolvo = incomingAndGrossProfitBodyShopSaleSparesAtRetailVolvo;
    }

    public RowContent getIncomingAndGrossProfitBodyShopSaleSparesInsuranceVolvo() {
        return incomingAndGrossProfitBodyShopSaleSparesInsuranceVolvo;
    }

    public void setIncomingAndGrossProfitBodyShopSaleSparesInsuranceVolvo(RowContent incomingAndGrossProfitBodyShopSaleSparesInsuranceVolvo) {
        this.incomingAndGrossProfitBodyShopSaleSparesInsuranceVolvo = incomingAndGrossProfitBodyShopSaleSparesInsuranceVolvo;
    }

    public RowContent getIncomingAndGrossProfitBodyShopSaleSparesInnerVolvo() {
        return incomingAndGrossProfitBodyShopSaleSparesInnerVolvo;
    }

    public void setIncomingAndGrossProfitBodyShopSaleSparesInnerVolvo(RowContent incomingAndGrossProfitBodyShopSaleSparesInnerVolvo) {
        this.incomingAndGrossProfitBodyShopSaleSparesInnerVolvo = incomingAndGrossProfitBodyShopSaleSparesInnerVolvo;
    }

    public RowContent getIncomingAndGrossProfitBodyShopSaleSparesGuaranteeVolvo() {
        return incomingAndGrossProfitBodyShopSaleSparesGuaranteeVolvo;
    }

    public void setIncomingAndGrossProfitBodyShopSaleSparesGuaranteeVolvo(RowContent incomingAndGrossProfitBodyShopSaleSparesGuaranteeVolvo) {
        this.incomingAndGrossProfitBodyShopSaleSparesGuaranteeVolvo = incomingAndGrossProfitBodyShopSaleSparesGuaranteeVolvo;
    }

    public RowContent getIncomingAndGrossProfitRetailShopSaleOthers() {
        return incomingAndGrossProfitRetailShopSaleOthers;
    }

    public void setIncomingAndGrossProfitRetailShopSaleOthers(RowContent incomingAndGrossProfitRetailShopSaleOthers) {
        this.incomingAndGrossProfitRetailShopSaleOthers = incomingAndGrossProfitRetailShopSaleOthers;
    }

    public RowContent getIncomingAndGrossProfitSaleAccessoriesOthers() {
        return incomingAndGrossProfitSaleAccessoriesOthers;
    }

    public void setIncomingAndGrossProfitSaleAccessoriesOthers(RowContent incomingAndGrossProfitSaleAccessoriesOthers) {
        this.incomingAndGrossProfitSaleAccessoriesOthers = incomingAndGrossProfitSaleAccessoriesOthers;
    }

    public RowContent getIncomingAndGrossProfitSaleSparesOtherOrganizationsOthers() {
        return incomingAndGrossProfitSaleSparesOtherOrganizationsOthers;
    }

    public void setIncomingAndGrossProfitSaleSparesOtherOrganizationsOthers(RowContent incomingAndGrossProfitSaleSparesOtherOrganizationsOthers) {
        this.incomingAndGrossProfitSaleSparesOtherOrganizationsOthers = incomingAndGrossProfitSaleSparesOtherOrganizationsOthers;
    }

    public RowContent getIncomingAndGrossProfitFittingShopSaleSparesAtRetailOthers() {
        return incomingAndGrossProfitFittingShopSaleSparesAtRetailOthers;
    }

    public void setIncomingAndGrossProfitFittingShopSaleSparesAtRetailOthers(RowContent incomingAndGrossProfitFittingShopSaleSparesAtRetailOthers) {
        this.incomingAndGrossProfitFittingShopSaleSparesAtRetailOthers = incomingAndGrossProfitFittingShopSaleSparesAtRetailOthers;
    }

    public RowContent getIncomingAndGrossProfitFittingShopSaleSparesInnerOthers() {
        return incomingAndGrossProfitFittingShopSaleSparesInnerOthers;
    }

    public void setIncomingAndGrossProfitFittingShopSaleSparesInnerOthers(RowContent incomingAndGrossProfitFittingShopSaleSparesInnerOthers) {
        this.incomingAndGrossProfitFittingShopSaleSparesInnerOthers = incomingAndGrossProfitFittingShopSaleSparesInnerOthers;
    }

    public RowContent getIncomingAndGrossProfitFittingShopSaleSparesGuaranteeOthers() {
        return incomingAndGrossProfitFittingShopSaleSparesGuaranteeOthers;
    }

    public void setIncomingAndGrossProfitFittingShopSaleSparesGuaranteeOthers(RowContent incomingAndGrossProfitFittingShopSaleSparesGuaranteeOthers) {
        this.incomingAndGrossProfitFittingShopSaleSparesGuaranteeOthers = incomingAndGrossProfitFittingShopSaleSparesGuaranteeOthers;
    }

    public RowContent getIncomingAndGrossProfitBodyShopSaleSparesAtRetailOthers() {
        return incomingAndGrossProfitBodyShopSaleSparesAtRetailOthers;
    }

    public void setIncomingAndGrossProfitBodyShopSaleSparesAtRetailOthers(RowContent incomingAndGrossProfitBodyShopSaleSparesAtRetailOthers) {
        this.incomingAndGrossProfitBodyShopSaleSparesAtRetailOthers = incomingAndGrossProfitBodyShopSaleSparesAtRetailOthers;
    }

    public RowContent getIncomingAndGrossProfitBodyShopSaleSparesInsuranceOthers() {
        return incomingAndGrossProfitBodyShopSaleSparesInsuranceOthers;
    }

    public void setIncomingAndGrossProfitBodyShopSaleSparesInsuranceOthers(RowContent incomingAndGrossProfitBodyShopSaleSparesInsuranceOthers) {
        this.incomingAndGrossProfitBodyShopSaleSparesInsuranceOthers = incomingAndGrossProfitBodyShopSaleSparesInsuranceOthers;
    }

    public RowContent getIncomingAndGrossProfitBodyShopSaleSparesInnerOthers() {
        return incomingAndGrossProfitBodyShopSaleSparesInnerOthers;
    }

    public void setIncomingAndGrossProfitBodyShopSaleSparesInnerOthers(RowContent incomingAndGrossProfitBodyShopSaleSparesInnerOthers) {
        this.incomingAndGrossProfitBodyShopSaleSparesInnerOthers = incomingAndGrossProfitBodyShopSaleSparesInnerOthers;
    }

    public RowContent getIncomingAndGrossProfitBodyShopSaleSparesGuaranteeOthers() {
        return incomingAndGrossProfitBodyShopSaleSparesGuaranteeOthers;
    }

    public void setIncomingAndGrossProfitBodyShopSaleSparesGuaranteeOthers(RowContent incomingAndGrossProfitBodyShopSaleSparesGuaranteeOthers) {
        this.incomingAndGrossProfitBodyShopSaleSparesGuaranteeOthers = incomingAndGrossProfitBodyShopSaleSparesGuaranteeOthers;
    }

    public RowContent getIncomingAndGrossProfitTotalShop() {
        return incomingAndGrossProfitTotalShop;
    }

    public void setIncomingAndGrossProfitTotalShop(RowContent incomingAndGrossProfitTotalShop) {
        this.incomingAndGrossProfitTotalShop = incomingAndGrossProfitTotalShop;
    }

    public RowContent getIncomingAndGrossProfitTotalAccessories() {
        return incomingAndGrossProfitTotalAccessories;
    }

    public void setIncomingAndGrossProfitTotalAccessories(RowContent incomingAndGrossProfitTotalAccessories) {
        this.incomingAndGrossProfitTotalAccessories = incomingAndGrossProfitTotalAccessories;
    }

    public RowContent getIncomingAndGrossProfitTotalSaleOtherOrganizations() {
        return incomingAndGrossProfitTotalSaleOtherOrganizations;
    }

    public void setIncomingAndGrossProfitTotalSaleOtherOrganizations(RowContent incomingAndGrossProfitTotalSaleOtherOrganizations) {
        this.incomingAndGrossProfitTotalSaleOtherOrganizations = incomingAndGrossProfitTotalSaleOtherOrganizations;
    }

    public RowContent getIncomingAndGrossProfitTotalFlittingShopAtRetail() {
        return incomingAndGrossProfitTotalFlittingShopAtRetail;
    }

    public void setIncomingAndGrossProfitTotalFlittingShopAtRetail(RowContent incomingAndGrossProfitTotalFlittingShopAtRetail) {
        this.incomingAndGrossProfitTotalFlittingShopAtRetail = incomingAndGrossProfitTotalFlittingShopAtRetail;
    }

    public RowContent getIncomingAndGrossProfitTotalFlittingShopInner() {
        return incomingAndGrossProfitTotalFlittingShopInner;
    }

    public void setIncomingAndGrossProfitTotalFlittingShopInner(RowContent incomingAndGrossProfitTotalFlittingShopInner) {
        this.incomingAndGrossProfitTotalFlittingShopInner = incomingAndGrossProfitTotalFlittingShopInner;
    }

    public RowContent getIncomingAndGrossProfitTotalFlittingShopGuarantee() {
        return incomingAndGrossProfitTotalFlittingShopGuarantee;
    }

    public void setIncomingAndGrossProfitTotalFlittingShopGuarantee(RowContent incomingAndGrossProfitTotalFlittingShopGuarantee) {
        this.incomingAndGrossProfitTotalFlittingShopGuarantee = incomingAndGrossProfitTotalFlittingShopGuarantee;
    }

    public RowContent getIncomingAndGrossProfitTotalBodyShopAtRetail() {
        return incomingAndGrossProfitTotalBodyShopAtRetail;
    }

    public void setIncomingAndGrossProfitTotalBodyShopAtRetail(RowContent incomingAndGrossProfitTotalBodyShopAtRetail) {
        this.incomingAndGrossProfitTotalBodyShopAtRetail = incomingAndGrossProfitTotalBodyShopAtRetail;
    }

    public RowContent getIncomingAndGrossProfitTotalBodyShopInsurance() {
        return incomingAndGrossProfitTotalBodyShopInsurance;
    }

    public void setIncomingAndGrossProfitTotalBodyShopInsurance(RowContent incomingAndGrossProfitTotalBodyShopInsurance) {
        this.incomingAndGrossProfitTotalBodyShopInsurance = incomingAndGrossProfitTotalBodyShopInsurance;
    }

    public RowContent getIncomingAndGrossProfitTotalBodyShopInner() {
        return incomingAndGrossProfitTotalBodyShopInner;
    }

    public void setIncomingAndGrossProfitTotalBodyShopInner(RowContent incomingAndGrossProfitTotalBodyShopInner) {
        this.incomingAndGrossProfitTotalBodyShopInner = incomingAndGrossProfitTotalBodyShopInner;
    }

    public RowContent getIncomingAndGrossProfitTotalBodyShopGuarantee() {
        return incomingAndGrossProfitTotalBodyShopGuarantee;
    }

    public void setIncomingAndGrossProfitTotalBodyShopGuarantee(RowContent incomingAndGrossProfitTotalBodyShopGuarantee) {
        this.incomingAndGrossProfitTotalBodyShopGuarantee = incomingAndGrossProfitTotalBodyShopGuarantee;
    }

    public RowContent getIncomingAndGrossProfitTotalSparesSales() {
        return incomingAndGrossProfitTotalSparesSales;
    }

    public void setIncomingAndGrossProfitTotalSparesSales(RowContent incomingAndGrossProfitTotalSparesSales) {
        this.incomingAndGrossProfitTotalSparesSales = incomingAndGrossProfitTotalSparesSales;
    }

    public RowContent getIncomingAndGrossProfitLubricant() {
        return incomingAndGrossProfitLubricant;
    }

    public void setIncomingAndGrossProfitLubricant(RowContent incomingAndGrossProfitLubricant) {
        this.incomingAndGrossProfitLubricant = incomingAndGrossProfitLubricant;
    }

    public RowContent getIncomingAndGrossProfitColorsTyingProductsSale() {
        return incomingAndGrossProfitColorsTyingProductsSale;
    }

    public void setIncomingAndGrossProfitColorsTyingProductsSale(RowContent incomingAndGrossProfitColorsTyingProductsSale) {
        this.incomingAndGrossProfitColorsTyingProductsSale = incomingAndGrossProfitColorsTyingProductsSale;
    }

    public RowContent getIncomingAndGrossProfitTyreSale() {
        return incomingAndGrossProfitTyreSale;
    }

    public void setIncomingAndGrossProfitTyreSale(RowContent incomingAndGrossProfitTyreSale) {
        this.incomingAndGrossProfitTyreSale = incomingAndGrossProfitTyreSale;
    }

    public RowContent getIncomingAndGrossProfitOtherSales() {
        return incomingAndGrossProfitOtherSales;
    }

    public void setIncomingAndGrossProfitOtherSales(RowContent incomingAndGrossProfitOtherSales) {
        this.incomingAndGrossProfitOtherSales = incomingAndGrossProfitOtherSales;
    }

    public RowContent getIncomingAndGrossProfitOtherSalesTotal() {
        return incomingAndGrossProfitOtherSalesTotal;
    }

    public void setIncomingAndGrossProfitOtherSalesTotal(RowContent incomingAndGrossProfitOtherSalesTotal) {
        this.incomingAndGrossProfitOtherSalesTotal = incomingAndGrossProfitOtherSalesTotal;
    }

    public RowContent getIncomingAndGrossProfitTotalDepartment() {
        return incomingAndGrossProfitTotalDepartment;
    }

    public void setIncomingAndGrossProfitTotalDepartment(RowContent incomingAndGrossProfitTotalDepartment) {
        this.incomingAndGrossProfitTotalDepartment = incomingAndGrossProfitTotalDepartment;
    }

    public RowContent getOtherIncomingOtherIncoming() {
        return otherIncomingOtherIncoming;
    }

    public void setOtherIncomingOtherIncoming(RowContent otherIncomingOtherIncoming) {
        this.otherIncomingOtherIncoming = otherIncomingOtherIncoming;
    }

    public RowContent getOtherIncomingExtraCharge() {
        return otherIncomingExtraCharge;
    }

    public void setOtherIncomingExtraCharge(RowContent otherIncomingExtraCharge) {
        this.otherIncomingExtraCharge = otherIncomingExtraCharge;
    }

    public RowContent getOtherIncomingStockpileCorrection() {
        return otherIncomingStockpileCorrection;
    }

    public void setOtherIncomingStockpileCorrection(RowContent otherIncomingStockpileCorrection) {
        this.otherIncomingStockpileCorrection = otherIncomingStockpileCorrection;
    }

    public RowContent getOtherIncomingTotalSparesSale() {
        return otherIncomingTotalSparesSale;
    }

    public void setOtherIncomingTotalSparesSale(RowContent otherIncomingTotalSparesSale) {
        this.otherIncomingTotalSparesSale = otherIncomingTotalSparesSale;
    }

    public RowContent getDepartmentChargeNonproductiveStaffSalary() {
        return departmentChargeNonproductiveStaffSalary;
    }

    public void setDepartmentChargeNonproductiveStaffSalary(RowContent departmentChargeNonproductiveStaffSalary) {
        this.departmentChargeNonproductiveStaffSalary = departmentChargeNonproductiveStaffSalary;
    }

    public RowContent getDepartmentChargeCommissionCharges() {
        return departmentChargeCommissionCharges;
    }

    public void setDepartmentChargeCommissionCharges(RowContent departmentChargeCommissionCharges) {
        this.departmentChargeCommissionCharges = departmentChargeCommissionCharges;
    }

    public RowContent getDepartmentChargeSalaryTax() {
        return departmentChargeSalaryTax;
    }

    public void setDepartmentChargeSalaryTax(RowContent departmentChargeSalaryTax) {
        this.departmentChargeSalaryTax = departmentChargeSalaryTax;
    }

    public RowContent getDepartmentChargeOtherChargeOnStaff() {
        return departmentChargeOtherChargeOnStaff;
    }

    public void setDepartmentChargeOtherChargeOnStaff(RowContent departmentChargeOtherChargeOnStaff) {
        this.departmentChargeOtherChargeOnStaff = departmentChargeOtherChargeOnStaff;
    }

    public RowContent getDepartmentChargeEducation() {
        return departmentChargeEducation;
    }

    public void setDepartmentChargeEducation(RowContent departmentChargeEducation) {
        this.departmentChargeEducation = departmentChargeEducation;
    }

    public RowContent getDepartmentChargeTotalStaffCharges() {
        return departmentChargeTotalStaffCharges;
    }

    public void setDepartmentChargeTotalStaffCharges(RowContent departmentChargeTotalStaffCharges) {
        this.departmentChargeTotalStaffCharges = departmentChargeTotalStaffCharges;
    }

    public RowContent getDepartmentChargeEnvironmentCharges() {
        return departmentChargeEnvironmentCharges;
    }

    public void setDepartmentChargeEnvironmentCharges(RowContent departmentChargeEnvironmentCharges) {
        this.departmentChargeEnvironmentCharges = departmentChargeEnvironmentCharges;
    }

    public RowContent getDepartmentChargeDepartmentCarsCharges() {
        return departmentChargeDepartmentCarsCharges;
    }

    public void setDepartmentChargeDepartmentCarsCharges(RowContent departmentChargeDepartmentCarsCharges) {
        this.departmentChargeDepartmentCarsCharges = departmentChargeDepartmentCarsCharges;
    }

    public RowContent getDepartmentChargeAdvertising() {
        return departmentChargeAdvertising;
    }

    public void setDepartmentChargeAdvertising(RowContent departmentChargeAdvertising) {
        this.departmentChargeAdvertising = departmentChargeAdvertising;
    }

    public RowContent getDepartmentChargeDealerPaymentCharges() {
        return departmentChargeDealerPaymentCharges;
    }

    public void setDepartmentChargeDealerPaymentCharges(RowContent departmentChargeDealerPaymentCharges) {
        this.departmentChargeDealerPaymentCharges = departmentChargeDealerPaymentCharges;
    }

    public RowContent getDepartmentChargeOtherCharge() {
        return departmentChargeOtherCharge;
    }

    public void setDepartmentChargeOtherCharge(RowContent departmentChargeOtherCharge) {
        this.departmentChargeOtherCharge = departmentChargeOtherCharge;
    }

    public RowContent getDepartmentChargeAmortization() {
        return departmentChargeAmortization;
    }

    public void setDepartmentChargeAmortization(RowContent departmentChargeAmortization) {
        this.departmentChargeAmortization = departmentChargeAmortization;
    }

    public RowContent getDepartmentChargeTotalCharges() {
        return departmentChargeTotalCharges;
    }

    public void setDepartmentChargeTotalCharges(RowContent departmentChargeTotalCharges) {
        this.departmentChargeTotalCharges = departmentChargeTotalCharges;
    }

    public RowContent getDepartmentChargeDepartmentIncoming() {
        return departmentChargeDepartmentIncoming;
    }

    public void setDepartmentChargeDepartmentIncoming(RowContent departmentChargeDepartmentIncoming) {
        this.departmentChargeDepartmentIncoming = departmentChargeDepartmentIncoming;
    }

    public RowContent getStatisticsSparesCostInStock() {
        return statisticsSparesCostInStock;
    }

    public void setStatisticsSparesCostInStock(RowContent statisticsSparesCostInStock) {
        this.statisticsSparesCostInStock = statisticsSparesCostInStock;
    }

    public RowContent getStatisticsSparesStockArea() {
        return statisticsSparesStockArea;
    }

    public void setStatisticsSparesStockArea(RowContent statisticsSparesStockArea) {
        this.statisticsSparesStockArea = statisticsSparesStockArea;
    }
}
