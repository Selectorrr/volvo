package com.volvo.metis.domain;

import java.io.Serializable;

/**
 * Вкладка "Анализ численности персонала"
 */
public class TabStaffQuantity implements Serializable {

    /**
     * Отдел продаж новых а/м --> Руководитель отдела продаж
     */
    private RowContent newCarsSalesDepartmentHeadOfSalesDepartment;

    /**
     * Отдел продаж новых а/м --> Начальник отдела страх. и кредит-ия
     */
    private RowContent newCarsSalesDepartmentHeadOfDepartmentInsurance;

    /**
     * Отдел продаж новых а/м --> Продавцы НА
     */
    private RowContent newCarsSalesDepartmentNewCarsSeller;

    /**
     * Отдел продаж новых а/м --> Другие сотрудники НА
     */
    private RowContent newCarsSalesDepartmentOtherNewCarsStaff;

    /**
     * Отдел продаж новых а/м --> Итого сотрудники отдела продаж
     */
    private RowContent newCarsSalesDepartmentTotalStaff;

    /**
     * ----------------------------------------------
     */

    /**
     * Отдел продаж подерж. а/м --> Руководитель отдела продаж
     */
    private RowContent secondHandCarsSalesDepartmentHeadOfSalesDepartment;

    /**
     * Отдел продаж подерж. а/м --> Начальник отдела страх. и кредит-ия
     */
    private RowContent secondHandCarsSalesDepartmentHeadOfDepartmentInsurance;

    /**
     * Отдел продаж подерж. а/м --> Продавцы ПА
     */
    private RowContent secondHandCarsSalesDepartmentSecondHandCarsSeller;

    /**
     * Отдел продаж подерж. а/м --> Другие сотрудники ПА
     */
    private RowContent secondHandCarsSalesDepartmentOtherSecondHandCarsStaff;

    /**
     * Отдел продаж подерж. а/м --> Итого сотрудники отдела продаж ПА
     */
    private RowContent secondHandCarsSalesDepartmentTotalStaff;

    /**
     * ----------------------------------------------
     */

    /**
     * Слес. Цех --> Руководитель Слес. цеха
     */
    private RowContent flittingShopHeadOfFittingShop;

    /**
     * Слес. Цех --> Административный персонал
     */
    private RowContent flittingShopAdministration;

    /**
     * Слес. Цех --> Другие сотрудники
     */
    private RowContent flittingShopOtherStaff;

    /**
     * Слес. Цех --> Мастера-приемщики
     */
    private RowContent flittingShopMastersAcceptors;

    /**
     * Слес. Цех --> Итого админ. персонал
     */
    private RowContent flittingShopTotalAdministrations;

    /**
     * Слес. Цех --> Технич персонал Слес. цеха (продукт. персонал)
     */
    private RowContent flittingShopTechniciansOfFittingShop;

    /**
     * Слес. Цех --> Стажеры Слес. цеха
     */
    private RowContent flittingShopProbationerOfFittingShop;

    /**
     * Слес. Цех --> Итого сотрудники Слес. цеха
     */
    private RowContent flittingShopTotalFlittingShopStaff;

    /**
     * ----------------------------------------------
     */


    /**
     * Кузовной Цех --> Руководитель Куз. цеха
     */
    private RowContent bodyShopHeadOfBodyShop;

    /**
     * Кузовной Цех --> Административный персонал
     */
    private RowContent bodyShopAdministration;

    /**
     * Кузовной Цех --> Другие сотрудники
     */
    private RowContent bodyShopOtherStaff;

    /**
     * Кузовной Цех --> Мастера-приемщики
     */
    private RowContent bodyShopMastersAcceptors;

    /**
     * Кузовной Цех --> Итого админ. персонал
     */
    private RowContent bodyShopTotalAdministrations;

    /**
     * Кузовной Цех --> Технич персонал Куз. цеха (продукт. персонал)
     */
    private RowContent bodyShopTechniciansOfFittingShop;

    /**
     * Кузовной Цех --> Стажеры Куз. цеха
     */
    private RowContent bodyShopProbationerOfFittingShop;

    /**
     * Кузовной Цех --> Итого сотрудники Куз. цеха
     */
    private RowContent bodyShopTotalBodyShopStaff;

    /**
     * ----------------------------------------------
     */

    /**
     * Отдел запчастей --> Руководитель Запчастей
     */
    private RowContent sparesDepartmentHeadOfSparesDepartments;

    /**
     * Отдел запчастей --> Административный персонал
     */
    private RowContent sparesDepartmentAdministration;

    /**
     * Отдел запчастей --> Продавцы з/ч
     */
    private RowContent sparesDepartmentSellers;

    /**
     * Отдел запчастей --> Всего по отделу Запчасти
     */
    private RowContent sparesDepartmentTotal;

    /**
     * ----------------------------------------------
     */

    /**
     * Другие отделы --> Сотрудники отдела проката а/м
     */
    private RowContent otherDepartmentsRentCarsStaff;

    /**
     * Другие отделы --> Сотрудники отдела лизинга
     */
    private RowContent otherDepartmentsLeasingCarsStaff;

    /**
     * Другие отделы --> Сотрудники других отделов
     */
    private RowContent otherDepartmentsOtherDepartmentsStaff;

    /**
     * Другие отделы --> Всего по другим отделам
     */
    private RowContent otherDepartmentsTotal;

    /**
     * ----------------------------------------------
     */

    /**
     * Административный персонал --> Руководство дилерского центра
     */
    private RowContent administrationsManagementOfTheDealership;

    /**
     * Административный персонал --> Финансовый менеджер
     */
    private RowContent administrationsFinancialManager;

    /**
     * Административный персонал --> Административный персонал
     */
    private RowContent administrationsAdministration;

    /**
     * Административный персонал --> Другие сотрудники
     */
    private RowContent administrationsOtherStaff;

    /**
     * Административный персонал --> Всего по административному отделу
     */
    private RowContent administrationsTotalAdministrationDepartment;

    /**
     * ----------------------------------------------
     */

    /**
     * Общее число сотрудников
     */
    private RowContent totalStaffQuantity;

    /**
     * ----------------------------------------------
     */

    public RowContent getNewCarsSalesDepartmentHeadOfSalesDepartment() {
        return newCarsSalesDepartmentHeadOfSalesDepartment;
    }

    public void setNewCarsSalesDepartmentHeadOfSalesDepartment(RowContent newCarsSalesDepartmentHeadOfSalesDepartment) {
        this.newCarsSalesDepartmentHeadOfSalesDepartment = newCarsSalesDepartmentHeadOfSalesDepartment;
    }

    public RowContent getNewCarsSalesDepartmentHeadOfDepartmentInsurance() {
        return newCarsSalesDepartmentHeadOfDepartmentInsurance;
    }

    public void setNewCarsSalesDepartmentHeadOfDepartmentInsurance(RowContent newCarsSalesDepartmentHeadOfDepartmentInsurance) {
        this.newCarsSalesDepartmentHeadOfDepartmentInsurance = newCarsSalesDepartmentHeadOfDepartmentInsurance;
    }

    public RowContent getNewCarsSalesDepartmentNewCarsSeller() {
        return newCarsSalesDepartmentNewCarsSeller;
    }

    public void setNewCarsSalesDepartmentNewCarsSeller(RowContent newCarsSalesDepartmentNewCarsSeller) {
        this.newCarsSalesDepartmentNewCarsSeller = newCarsSalesDepartmentNewCarsSeller;
    }

    public RowContent getNewCarsSalesDepartmentOtherNewCarsStaff() {
        return newCarsSalesDepartmentOtherNewCarsStaff;
    }

    public void setNewCarsSalesDepartmentOtherNewCarsStaff(RowContent newCarsSalesDepartmentOtherNewCarsStaff) {
        this.newCarsSalesDepartmentOtherNewCarsStaff = newCarsSalesDepartmentOtherNewCarsStaff;
    }

    public RowContent getNewCarsSalesDepartmentTotalStaff() {
        return newCarsSalesDepartmentTotalStaff;
    }

    public void setNewCarsSalesDepartmentTotalStaff(RowContent newCarsSalesDepartmentTotalStaff) {
        this.newCarsSalesDepartmentTotalStaff = newCarsSalesDepartmentTotalStaff;
    }

    public RowContent getSecondHandCarsSalesDepartmentHeadOfSalesDepartment() {
        return secondHandCarsSalesDepartmentHeadOfSalesDepartment;
    }

    public void setSecondHandCarsSalesDepartmentHeadOfSalesDepartment(RowContent secondHandCarsSalesDepartmentHeadOfSalesDepartment) {
        this.secondHandCarsSalesDepartmentHeadOfSalesDepartment = secondHandCarsSalesDepartmentHeadOfSalesDepartment;
    }

    public RowContent getSecondHandCarsSalesDepartmentHeadOfDepartmentInsurance() {
        return secondHandCarsSalesDepartmentHeadOfDepartmentInsurance;
    }

    public void setSecondHandCarsSalesDepartmentHeadOfDepartmentInsurance(RowContent secondHandCarsSalesDepartmentHeadOfDepartmentInsurance) {
        this.secondHandCarsSalesDepartmentHeadOfDepartmentInsurance = secondHandCarsSalesDepartmentHeadOfDepartmentInsurance;
    }

    public RowContent getSecondHandCarsSalesDepartmentSecondHandCarsSeller() {
        return secondHandCarsSalesDepartmentSecondHandCarsSeller;
    }

    public void setSecondHandCarsSalesDepartmentSecondHandCarsSeller(RowContent secondHandCarsSalesDepartmentSecondHandCarsSeller) {
        this.secondHandCarsSalesDepartmentSecondHandCarsSeller = secondHandCarsSalesDepartmentSecondHandCarsSeller;
    }

    public RowContent getSecondHandCarsSalesDepartmentOtherSecondHandCarsStaff() {
        return secondHandCarsSalesDepartmentOtherSecondHandCarsStaff;
    }

    public void setSecondHandCarsSalesDepartmentOtherSecondHandCarsStaff(RowContent secondHandCarsSalesDepartmentOtherSecondHandCarsStaff) {
        this.secondHandCarsSalesDepartmentOtherSecondHandCarsStaff = secondHandCarsSalesDepartmentOtherSecondHandCarsStaff;
    }

    public RowContent getSecondHandCarsSalesDepartmentTotalStaff() {
        return secondHandCarsSalesDepartmentTotalStaff;
    }

    public void setSecondHandCarsSalesDepartmentTotalStaff(RowContent secondHandCarsSalesDepartmentTotalStaff) {
        this.secondHandCarsSalesDepartmentTotalStaff = secondHandCarsSalesDepartmentTotalStaff;
    }

    public RowContent getFlittingShopHeadOfFittingShop() {
        return flittingShopHeadOfFittingShop;
    }

    public void setFlittingShopHeadOfFittingShop(RowContent flittingShopHeadOfFittingShop) {
        this.flittingShopHeadOfFittingShop = flittingShopHeadOfFittingShop;
    }

    public RowContent getFlittingShopAdministration() {
        return flittingShopAdministration;
    }

    public void setFlittingShopAdministration(RowContent flittingShopAdministration) {
        this.flittingShopAdministration = flittingShopAdministration;
    }

    public RowContent getFlittingShopOtherStaff() {
        return flittingShopOtherStaff;
    }

    public void setFlittingShopOtherStaff(RowContent flittingShopOtherStaff) {
        this.flittingShopOtherStaff = flittingShopOtherStaff;
    }

    public RowContent getFlittingShopMastersAcceptors() {
        return flittingShopMastersAcceptors;
    }

    public void setFlittingShopMastersAcceptors(RowContent flittingShopMastersAcceptors) {
        this.flittingShopMastersAcceptors = flittingShopMastersAcceptors;
    }

    public RowContent getFlittingShopTotalAdministrations() {
        return flittingShopTotalAdministrations;
    }

    public void setFlittingShopTotalAdministrations(RowContent flittingShopTotalAdministrations) {
        this.flittingShopTotalAdministrations = flittingShopTotalAdministrations;
    }

    public RowContent getFlittingShopTechniciansOfFittingShop() {
        return flittingShopTechniciansOfFittingShop;
    }

    public void setFlittingShopTechniciansOfFittingShop(RowContent flittingShopTechniciansOfFittingShop) {
        this.flittingShopTechniciansOfFittingShop = flittingShopTechniciansOfFittingShop;
    }

    public RowContent getFlittingShopProbationerOfFittingShop() {
        return flittingShopProbationerOfFittingShop;
    }

    public void setFlittingShopProbationerOfFittingShop(RowContent flittingShopProbationerOfFittingShop) {
        this.flittingShopProbationerOfFittingShop = flittingShopProbationerOfFittingShop;
    }

    public RowContent getFlittingShopTotalFlittingShopStaff() {
        return flittingShopTotalFlittingShopStaff;
    }

    public void setFlittingShopTotalFlittingShopStaff(RowContent flittingShopTotalFlittingShopStaff) {
        this.flittingShopTotalFlittingShopStaff = flittingShopTotalFlittingShopStaff;
    }

    public RowContent getBodyShopHeadOfBodyShop() {
        return bodyShopHeadOfBodyShop;
    }

    public void setBodyShopHeadOfBodyShop(RowContent bodyShopHeadOfBodyShop) {
        this.bodyShopHeadOfBodyShop = bodyShopHeadOfBodyShop;
    }

    public RowContent getBodyShopAdministration() {
        return bodyShopAdministration;
    }

    public void setBodyShopAdministration(RowContent bodyShopAdministration) {
        this.bodyShopAdministration = bodyShopAdministration;
    }

    public RowContent getBodyShopOtherStaff() {
        return bodyShopOtherStaff;
    }

    public void setBodyShopOtherStaff(RowContent bodyShopOtherStaff) {
        this.bodyShopOtherStaff = bodyShopOtherStaff;
    }

    public RowContent getBodyShopMastersAcceptors() {
        return bodyShopMastersAcceptors;
    }

    public void setBodyShopMastersAcceptors(RowContent bodyShopMastersAcceptors) {
        this.bodyShopMastersAcceptors = bodyShopMastersAcceptors;
    }

    public RowContent getBodyShopTotalAdministrations() {
        return bodyShopTotalAdministrations;
    }

    public void setBodyShopTotalAdministrations(RowContent bodyShopTotalAdministrations) {
        this.bodyShopTotalAdministrations = bodyShopTotalAdministrations;
    }

    public RowContent getBodyShopTechniciansOfFittingShop() {
        return bodyShopTechniciansOfFittingShop;
    }

    public void setBodyShopTechniciansOfFittingShop(RowContent bodyShopTechniciansOfFittingShop) {
        this.bodyShopTechniciansOfFittingShop = bodyShopTechniciansOfFittingShop;
    }

    public RowContent getBodyShopProbationerOfFittingShop() {
        return bodyShopProbationerOfFittingShop;
    }

    public void setBodyShopProbationerOfFittingShop(RowContent bodyShopProbationerOfFittingShop) {
        this.bodyShopProbationerOfFittingShop = bodyShopProbationerOfFittingShop;
    }

    public RowContent getBodyShopTotalBodyShopStaff() {
        return bodyShopTotalBodyShopStaff;
    }

    public void setBodyShopTotalBodyShopStaff(RowContent bodyShopTotalBodyShopStaff) {
        this.bodyShopTotalBodyShopStaff = bodyShopTotalBodyShopStaff;
    }

    public RowContent getSparesDepartmentHeadOfSparesDepartments() {
        return sparesDepartmentHeadOfSparesDepartments;
    }

    public void setSparesDepartmentHeadOfSparesDepartments(RowContent sparesDepartmentHeadOfSparesDepartments) {
        this.sparesDepartmentHeadOfSparesDepartments = sparesDepartmentHeadOfSparesDepartments;
    }

    public RowContent getSparesDepartmentAdministration() {
        return sparesDepartmentAdministration;
    }

    public void setSparesDepartmentAdministration(RowContent sparesDepartmentAdministration) {
        this.sparesDepartmentAdministration = sparesDepartmentAdministration;
    }

    public RowContent getSparesDepartmentSellers() {
        return sparesDepartmentSellers;
    }

    public void setSparesDepartmentSellers(RowContent sparesDepartmentSellers) {
        this.sparesDepartmentSellers = sparesDepartmentSellers;
    }

    public RowContent getSparesDepartmentTotal() {
        return sparesDepartmentTotal;
    }

    public void setSparesDepartmentTotal(RowContent sparesDepartmentTotal) {
        this.sparesDepartmentTotal = sparesDepartmentTotal;
    }

    public RowContent getOtherDepartmentsRentCarsStaff() {
        return otherDepartmentsRentCarsStaff;
    }

    public void setOtherDepartmentsRentCarsStaff(RowContent otherDepartmentsRentCarsStaff) {
        this.otherDepartmentsRentCarsStaff = otherDepartmentsRentCarsStaff;
    }

    public RowContent getOtherDepartmentsLeasingCarsStaff() {
        return otherDepartmentsLeasingCarsStaff;
    }

    public void setOtherDepartmentsLeasingCarsStaff(RowContent otherDepartmentsLeasingCarsStaff) {
        this.otherDepartmentsLeasingCarsStaff = otherDepartmentsLeasingCarsStaff;
    }

    public RowContent getOtherDepartmentsOtherDepartmentsStaff() {
        return otherDepartmentsOtherDepartmentsStaff;
    }

    public void setOtherDepartmentsOtherDepartmentsStaff(RowContent otherDepartmentsOtherDepartmentsStaff) {
        this.otherDepartmentsOtherDepartmentsStaff = otherDepartmentsOtherDepartmentsStaff;
    }

    public RowContent getOtherDepartmentsTotal() {
        return otherDepartmentsTotal;
    }

    public void setOtherDepartmentsTotal(RowContent otherDepartmentsTotal) {
        this.otherDepartmentsTotal = otherDepartmentsTotal;
    }

    public RowContent getAdministrationsManagementOfTheDealership() {
        return administrationsManagementOfTheDealership;
    }

    public void setAdministrationsManagementOfTheDealership(RowContent administrationsManagementOfTheDealership) {
        this.administrationsManagementOfTheDealership = administrationsManagementOfTheDealership;
    }

    public RowContent getAdministrationsFinancialManager() {
        return administrationsFinancialManager;
    }

    public void setAdministrationsFinancialManager(RowContent administrationsFinancialManager) {
        this.administrationsFinancialManager = administrationsFinancialManager;
    }

    public RowContent getAdministrationsAdministration() {
        return administrationsAdministration;
    }

    public void setAdministrationsAdministration(RowContent administrationsAdministration) {
        this.administrationsAdministration = administrationsAdministration;
    }

    public RowContent getAdministrationsOtherStaff() {
        return administrationsOtherStaff;
    }

    public void setAdministrationsOtherStaff(RowContent administrationsOtherStaff) {
        this.administrationsOtherStaff = administrationsOtherStaff;
    }

    public RowContent getAdministrationsTotalAdministrationDepartment() {
        return administrationsTotalAdministrationDepartment;
    }

    public void setAdministrationsTotalAdministrationDepartment(RowContent administrationsTotalAdministrationDepartment) {
        this.administrationsTotalAdministrationDepartment = administrationsTotalAdministrationDepartment;
    }

    public RowContent getTotalStaffQuantity() {
        return totalStaffQuantity;
    }

    public void setTotalStaffQuantity(RowContent totalStaffQuantity) {
        this.totalStaffQuantity = totalStaffQuantity;
    }
}
