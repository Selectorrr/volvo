package com.volvo.metis.domain;

import java.io.Serializable;

/**
 * Вкладка "Непрямые расходы"
 */
public class TabIndirectCharges implements Serializable {

    /**
     * Общие расходы --> Зарплата непродуктивного персонала
     */
    private RowContent commonChargesNonproductiveStaffSalary;

    /**
     * Общие расходы --> Налоги на з/п
     */
    private RowContent commonChargesSalaryTax;

    /**
     * Общие расходы --> Пенсионн. и мед. страх-ие
     */
    private RowContent commonChargesOptionalInsuranceAdministration;

    /**
     * Общие расходы --> Расходы на питание сотрудников и пособия
     */
    private RowContent commonChargesEmployeeMealsCharges;

    /**
     * Общие расходы --> Спецодежда и химчистка
     */
    private RowContent commonChargesWorkingClothesDryCleaning;

    /**
     * Общие расходы --> Другие расходы на персонал
     */
    private RowContent commonChargesOtherChargeOnStaff;

    /**
     * Общие расходы --> Обучение
     */
    private RowContent commonChargesEducation;

    /**
     * Общие расходы --> Командировочные расходы
     */
    private RowContent commonChargesTravelingAllowance;

    /**
     * Общие расходы --> Итого непрямые расходы на персонал
     */
    private RowContent commonChargesTotalIndirectStaffCharges;

    /**
     * Общие расходы --> Почта
     */
    private RowContent commonChargesPost;

    /**
     * Общие расходы --> Связь
     */
    private RowContent commonChargesCommunication;

    /**
     * Общие расходы --> Реклама
     */
    private RowContent commonChargesAdvertising;

    /**
     * Общие расходы --> Представительские расходы
     */
    private RowContent commonChargesExpenseAccount;

    /**
     * Общие расходы --> Подписка, вступительный взнос и пожертвования
     */
    private RowContent commonChargesEntranceFeeDonations;

    /**
     * Общие расходы --> Обслуживание компьютерной техники
     */
    private RowContent commonChargesComputerServices;

    /**
     * Общие расходы --> Расходы на офисы
     */
    private RowContent commonChargesOfficeCharges;

    /**
     * Общие расходы --> Обслуживание оборудования
     */
    private RowContent commonChargesEquipmentService;

    /**
     * Общие расходы --> Лизинг оборудования / Расходы
     */
    private RowContent commonChargesEquipmentLeasingCharges;

    /**
     * Общие расходы --> Расходы на а/м компании
     */
    private RowContent commonChargesCompanyCarsCharges;

    /**
     * Общие расходы --> Амортизация - компьютерная техника
     */
    private RowContent commonChargesAmortizationComputers;

    /**
     * Общие расходы --> Амортизация - Другие материальные активы, кроме собственности
     */
    private RowContent commonChargesAmortizationOtherTangibleAssets;

    /**
     * Общие расходы --> Итого аморт-ия активов, кроме собственности
     */
    private RowContent commonChargesTotalAmortization;

    /**
     * Общие расходы --> Коммунальные платежи
     */
    private RowContent commonChargesHouseholdCosts;

    /**
     * Общие расходы --> Расходы на страхование, исключая объекты собственности
     */
    private RowContent commonChargesInsuranceCharges;

    /**
     * Общие расходы --> Расходы на аудиторско-консультационные услуги
     */
    private RowContent commonChargesConsultingCharges;

    /**
     * Общие расходы --> Оплата услуг специалистов
     */
    private RowContent commonChargesExpertConsultingCost;

    /**
     * Общие расходы --> Расходы на головной офис
     */
    private RowContent commonChargesHeadOfficeCharges;

    /**
     * Общие расходы --> Убытки по безнадежным долгам
     */
    private RowContent commonChargesBadArrearsDamage;

    /**
     * Общие расходы --> Комиссия банка
     */
    private RowContent commonChargesBankCommission;

    /**
     * Общие расходы --> Банковские расходы (краткосрочн. вложения)
     */
    private RowContent commonChargesBankChargesShortTerm;

    /**
     * Общие расходы --> Банковские расходы (долгосрочн. вложения)
     */
    private RowContent commonChargesBankChargesLongTerm;

    /**
     * Общие расходы --> Другие налоги
     */
    private RowContent commonChargesOtherTaxes;

    /**
     * Общие расходы --> Другое
     */
    private RowContent commonChargesOther;

    /**
     * Общие расходы --> Итого общие непрямые расходы компании
     */
    private RowContent commonChargesTotalIndirectCompanyCharges;

    /**
     * ----------------------------------------------
     */

    /**
     * Недвижимость --> Аренда
     */
    private RowContent immovablePropertyRent;

    /**
     * Недвижимость --> Ремонт и обслуживание
     */
    private RowContent immovablePropertyRepairService;

    /**
     * Недвижимость --> Страхование объектов собственности
     */
    private RowContent immovablePropertyInsuranceProperty;

    /**
     * Недвижимость --> Амортизация собственности
     */
    private RowContent immovablePropertyAmortizationProperty;

    /**
     * Недвижимость --> Другие расходы, связанные с объектами собственности
     */
    private RowContent immovablePropertyOtherPropertyCharges;

    /**
     * Недвижимость --> Всего расходов по собственности
     */
    private RowContent immovablePropertyTotalCharges;

    /**
     * ----------------------------------------------
     */

    /**
     * Начисление процентов --> Выплаты процентов по овердрафту
     */
    private RowContent chargingInterestPaymentOfInterestOnOverdraft;

    /**
     * Начисление процентов --> Выплаты процентов по краткосрочным займам и кредитам
     */
    private RowContent chargingInterestInterestPaymentsOnShortNoticeAndCredit;

    /**
     * Начисление процентов --> Выплаты процентов по прочим краткосрочным займам
     */
    private RowContent chargingInterestInterestPaymentsOnOtherShortNotice;

    /**
     * Начисление процентов --> Выплаты процентов по долгосрочным займам и кредитам
     */
    private RowContent chargingInterestInterestPaymentsOnLongNoticeAndCredit;

    /**
     * Начисление процентов --> Итого расходы по выплате процентов
     */
    private RowContent chargingInterestTotalChargesFromInterest;

    /**
     * ----------------------------------------------
     */

    /**
     * Условные начисления --> Итого непрямых расходов
     */
    private RowContent totalIndirectCharges;

    /**
     * ----------------------------------------------
     */

    public RowContent getCommonChargesNonproductiveStaffSalary() {
        return commonChargesNonproductiveStaffSalary;
    }

    public void setCommonChargesNonproductiveStaffSalary(RowContent commonChargesNonproductiveStaffSalary) {
        this.commonChargesNonproductiveStaffSalary = commonChargesNonproductiveStaffSalary;
    }

    public RowContent getCommonChargesSalaryTax() {
        return commonChargesSalaryTax;
    }

    public void setCommonChargesSalaryTax(RowContent commonChargesSalaryTax) {
        this.commonChargesSalaryTax = commonChargesSalaryTax;
    }

    public RowContent getCommonChargesOptionalInsuranceAdministration() {
        return commonChargesOptionalInsuranceAdministration;
    }

    public void setCommonChargesOptionalInsuranceAdministration(RowContent commonChargesOptionalInsuranceAdministration) {
        this.commonChargesOptionalInsuranceAdministration = commonChargesOptionalInsuranceAdministration;
    }

    public RowContent getCommonChargesEmployeeMealsCharges() {
        return commonChargesEmployeeMealsCharges;
    }

    public void setCommonChargesEmployeeMealsCharges(RowContent commonChargesEmployeeMealsCharges) {
        this.commonChargesEmployeeMealsCharges = commonChargesEmployeeMealsCharges;
    }

    public RowContent getCommonChargesWorkingClothesDryCleaning() {
        return commonChargesWorkingClothesDryCleaning;
    }

    public void setCommonChargesWorkingClothesDryCleaning(RowContent commonChargesWorkingClothesDryCleaning) {
        this.commonChargesWorkingClothesDryCleaning = commonChargesWorkingClothesDryCleaning;
    }

    public RowContent getCommonChargesOtherChargeOnStaff() {
        return commonChargesOtherChargeOnStaff;
    }

    public void setCommonChargesOtherChargeOnStaff(RowContent commonChargesOtherChargeOnStaff) {
        this.commonChargesOtherChargeOnStaff = commonChargesOtherChargeOnStaff;
    }

    public RowContent getCommonChargesEducation() {
        return commonChargesEducation;
    }

    public void setCommonChargesEducation(RowContent commonChargesEducation) {
        this.commonChargesEducation = commonChargesEducation;
    }

    public RowContent getCommonChargesTravelingAllowance() {
        return commonChargesTravelingAllowance;
    }

    public void setCommonChargesTravelingAllowance(RowContent commonChargesTravelingAllowance) {
        this.commonChargesTravelingAllowance = commonChargesTravelingAllowance;
    }

    public RowContent getCommonChargesTotalIndirectStaffCharges() {
        return commonChargesTotalIndirectStaffCharges;
    }

    public void setCommonChargesTotalIndirectStaffCharges(RowContent commonChargesTotalIndirectStaffCharges) {
        this.commonChargesTotalIndirectStaffCharges = commonChargesTotalIndirectStaffCharges;
    }

    public RowContent getCommonChargesPost() {
        return commonChargesPost;
    }

    public void setCommonChargesPost(RowContent commonChargesPost) {
        this.commonChargesPost = commonChargesPost;
    }

    public RowContent getCommonChargesCommunication() {
        return commonChargesCommunication;
    }

    public void setCommonChargesCommunication(RowContent commonChargesCommunication) {
        this.commonChargesCommunication = commonChargesCommunication;
    }

    public RowContent getCommonChargesAdvertising() {
        return commonChargesAdvertising;
    }

    public void setCommonChargesAdvertising(RowContent commonChargesAdvertising) {
        this.commonChargesAdvertising = commonChargesAdvertising;
    }

    public RowContent getCommonChargesExpenseAccount() {
        return commonChargesExpenseAccount;
    }

    public void setCommonChargesExpenseAccount(RowContent commonChargesExpenseAccount) {
        this.commonChargesExpenseAccount = commonChargesExpenseAccount;
    }

    public RowContent getCommonChargesEntranceFeeDonations() {
        return commonChargesEntranceFeeDonations;
    }

    public void setCommonChargesEntranceFeeDonations(RowContent commonChargesEntranceFeeDonations) {
        this.commonChargesEntranceFeeDonations = commonChargesEntranceFeeDonations;
    }

    public RowContent getCommonChargesComputerServices() {
        return commonChargesComputerServices;
    }

    public void setCommonChargesComputerServices(RowContent commonChargesComputerServices) {
        this.commonChargesComputerServices = commonChargesComputerServices;
    }

    public RowContent getCommonChargesOfficeCharges() {
        return commonChargesOfficeCharges;
    }

    public void setCommonChargesOfficeCharges(RowContent commonChargesOfficeCharges) {
        this.commonChargesOfficeCharges = commonChargesOfficeCharges;
    }

    public RowContent getCommonChargesEquipmentService() {
        return commonChargesEquipmentService;
    }

    public void setCommonChargesEquipmentService(RowContent commonChargesEquipmentService) {
        this.commonChargesEquipmentService = commonChargesEquipmentService;
    }

    public RowContent getCommonChargesEquipmentLeasingCharges() {
        return commonChargesEquipmentLeasingCharges;
    }

    public void setCommonChargesEquipmentLeasingCharges(RowContent commonChargesEquipmentLeasingCharges) {
        this.commonChargesEquipmentLeasingCharges = commonChargesEquipmentLeasingCharges;
    }

    public RowContent getCommonChargesCompanyCarsCharges() {
        return commonChargesCompanyCarsCharges;
    }

    public void setCommonChargesCompanyCarsCharges(RowContent commonChargesCompanyCarsCharges) {
        this.commonChargesCompanyCarsCharges = commonChargesCompanyCarsCharges;
    }

    public RowContent getCommonChargesAmortizationComputers() {
        return commonChargesAmortizationComputers;
    }

    public void setCommonChargesAmortizationComputers(RowContent commonChargesAmortizationComputers) {
        this.commonChargesAmortizationComputers = commonChargesAmortizationComputers;
    }

    public RowContent getCommonChargesAmortizationOtherTangibleAssets() {
        return commonChargesAmortizationOtherTangibleAssets;
    }

    public void setCommonChargesAmortizationOtherTangibleAssets(RowContent commonChargesAmortizationOtherTangibleAssets) {
        this.commonChargesAmortizationOtherTangibleAssets = commonChargesAmortizationOtherTangibleAssets;
    }

    public RowContent getCommonChargesTotalAmortization() {
        return commonChargesTotalAmortization;
    }

    public void setCommonChargesTotalAmortization(RowContent commonChargesTotalAmortization) {
        this.commonChargesTotalAmortization = commonChargesTotalAmortization;
    }

    public RowContent getCommonChargesHouseholdCosts() {
        return commonChargesHouseholdCosts;
    }

    public void setCommonChargesHouseholdCosts(RowContent commonChargesHouseholdCosts) {
        this.commonChargesHouseholdCosts = commonChargesHouseholdCosts;
    }

    public RowContent getCommonChargesInsuranceCharges() {
        return commonChargesInsuranceCharges;
    }

    public void setCommonChargesInsuranceCharges(RowContent commonChargesInsuranceCharges) {
        this.commonChargesInsuranceCharges = commonChargesInsuranceCharges;
    }

    public RowContent getCommonChargesConsultingCharges() {
        return commonChargesConsultingCharges;
    }

    public void setCommonChargesConsultingCharges(RowContent commonChargesConsultingCharges) {
        this.commonChargesConsultingCharges = commonChargesConsultingCharges;
    }

    public RowContent getCommonChargesExpertConsultingCost() {
        return commonChargesExpertConsultingCost;
    }

    public void setCommonChargesExpertConsultingCost(RowContent commonChargesExpertConsultingCost) {
        this.commonChargesExpertConsultingCost = commonChargesExpertConsultingCost;
    }

    public RowContent getCommonChargesHeadOfficeCharges() {
        return commonChargesHeadOfficeCharges;
    }

    public void setCommonChargesHeadOfficeCharges(RowContent commonChargesHeadOfficeCharges) {
        this.commonChargesHeadOfficeCharges = commonChargesHeadOfficeCharges;
    }

    public RowContent getCommonChargesBadArrearsDamage() {
        return commonChargesBadArrearsDamage;
    }

    public void setCommonChargesBadArrearsDamage(RowContent commonChargesBadArrearsDamage) {
        this.commonChargesBadArrearsDamage = commonChargesBadArrearsDamage;
    }

    public RowContent getCommonChargesBankCommission() {
        return commonChargesBankCommission;
    }

    public void setCommonChargesBankCommission(RowContent commonChargesBankCommission) {
        this.commonChargesBankCommission = commonChargesBankCommission;
    }

    public RowContent getCommonChargesBankChargesShortTerm() {
        return commonChargesBankChargesShortTerm;
    }

    public void setCommonChargesBankChargesShortTerm(RowContent commonChargesBankChargesShortTerm) {
        this.commonChargesBankChargesShortTerm = commonChargesBankChargesShortTerm;
    }

    public RowContent getCommonChargesBankChargesLongTerm() {
        return commonChargesBankChargesLongTerm;
    }

    public void setCommonChargesBankChargesLongTerm(RowContent commonChargesBankChargesLongTerm) {
        this.commonChargesBankChargesLongTerm = commonChargesBankChargesLongTerm;
    }

    public RowContent getCommonChargesOtherTaxes() {
        return commonChargesOtherTaxes;
    }

    public void setCommonChargesOtherTaxes(RowContent commonChargesOtherTaxes) {
        this.commonChargesOtherTaxes = commonChargesOtherTaxes;
    }

    public RowContent getCommonChargesOther() {
        return commonChargesOther;
    }

    public void setCommonChargesOther(RowContent commonChargesOther) {
        this.commonChargesOther = commonChargesOther;
    }

    public RowContent getCommonChargesTotalIndirectCompanyCharges() {
        return commonChargesTotalIndirectCompanyCharges;
    }

    public void setCommonChargesTotalIndirectCompanyCharges(RowContent commonChargesTotalIndirectCompanyCharges) {
        this.commonChargesTotalIndirectCompanyCharges = commonChargesTotalIndirectCompanyCharges;
    }

    public RowContent getImmovablePropertyRent() {
        return immovablePropertyRent;
    }

    public void setImmovablePropertyRent(RowContent immovablePropertyRent) {
        this.immovablePropertyRent = immovablePropertyRent;
    }

    public RowContent getImmovablePropertyRepairService() {
        return immovablePropertyRepairService;
    }

    public void setImmovablePropertyRepairService(RowContent immovablePropertyRepairService) {
        this.immovablePropertyRepairService = immovablePropertyRepairService;
    }

    public RowContent getImmovablePropertyInsuranceProperty() {
        return immovablePropertyInsuranceProperty;
    }

    public void setImmovablePropertyInsuranceProperty(RowContent immovablePropertyInsuranceProperty) {
        this.immovablePropertyInsuranceProperty = immovablePropertyInsuranceProperty;
    }

    public RowContent getImmovablePropertyAmortizationProperty() {
        return immovablePropertyAmortizationProperty;
    }

    public void setImmovablePropertyAmortizationProperty(RowContent immovablePropertyAmortizationProperty) {
        this.immovablePropertyAmortizationProperty = immovablePropertyAmortizationProperty;
    }

    public RowContent getImmovablePropertyOtherPropertyCharges() {
        return immovablePropertyOtherPropertyCharges;
    }

    public void setImmovablePropertyOtherPropertyCharges(RowContent immovablePropertyOtherPropertyCharges) {
        this.immovablePropertyOtherPropertyCharges = immovablePropertyOtherPropertyCharges;
    }

    public RowContent getImmovablePropertyTotalCharges() {
        return immovablePropertyTotalCharges;
    }

    public void setImmovablePropertyTotalCharges(RowContent immovablePropertyTotalCharges) {
        this.immovablePropertyTotalCharges = immovablePropertyTotalCharges;
    }

    public RowContent getChargingInterestPaymentOfInterestOnOverdraft() {
        return chargingInterestPaymentOfInterestOnOverdraft;
    }

    public void setChargingInterestPaymentOfInterestOnOverdraft(RowContent chargingInterestPaymentOfInterestOnOverdraft) {
        this.chargingInterestPaymentOfInterestOnOverdraft = chargingInterestPaymentOfInterestOnOverdraft;
    }

    public RowContent getChargingInterestInterestPaymentsOnShortNoticeAndCredit() {
        return chargingInterestInterestPaymentsOnShortNoticeAndCredit;
    }

    public void setChargingInterestInterestPaymentsOnShortNoticeAndCredit(RowContent chargingInterestInterestPaymentsOnShortNoticeAndCredit) {
        this.chargingInterestInterestPaymentsOnShortNoticeAndCredit = chargingInterestInterestPaymentsOnShortNoticeAndCredit;
    }

    public RowContent getChargingInterestInterestPaymentsOnOtherShortNotice() {
        return chargingInterestInterestPaymentsOnOtherShortNotice;
    }

    public void setChargingInterestInterestPaymentsOnOtherShortNotice(RowContent chargingInterestInterestPaymentsOnOtherShortNotice) {
        this.chargingInterestInterestPaymentsOnOtherShortNotice = chargingInterestInterestPaymentsOnOtherShortNotice;
    }

    public RowContent getChargingInterestInterestPaymentsOnLongNoticeAndCredit() {
        return chargingInterestInterestPaymentsOnLongNoticeAndCredit;
    }

    public void setChargingInterestInterestPaymentsOnLongNoticeAndCredit(RowContent chargingInterestInterestPaymentsOnLongNoticeAndCredit) {
        this.chargingInterestInterestPaymentsOnLongNoticeAndCredit = chargingInterestInterestPaymentsOnLongNoticeAndCredit;
    }

    public RowContent getChargingInterestTotalChargesFromInterest() {
        return chargingInterestTotalChargesFromInterest;
    }

    public void setChargingInterestTotalChargesFromInterest(RowContent chargingInterestTotalChargesFromInterest) {
        this.chargingInterestTotalChargesFromInterest = chargingInterestTotalChargesFromInterest;
    }

    public RowContent getTotalIndirectCharges() {
        return totalIndirectCharges;
    }

    public void setTotalIndirectCharges(RowContent totalIndirectCharges) {
        this.totalIndirectCharges = totalIndirectCharges;
    }
}
