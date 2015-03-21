package com.volvo.metis.domain;

import java.io.Serializable;

/**
 * Вкладка "Баланс"
 */
public class TabBalance implements Serializable {

    /**
     * Внеоборотные активы --> Земля и здания в собст-ти
     */
    private RowContent nonCurrentAssetsAreaBuildingsBelonging;

    /**
     * Внеоборотные активы --> Земля и здания в лизинг/аренду
     */
    private RowContent nonCurrentAssetsAreaBuildingsLeasingRent;

    /**
     * Внеоборотные активы --> Земля и здания - улучшения
     */
    private RowContent nonCurrentAssetsAreaBuildingsImprovement;

    /**
     * Внеоборотные активы --> Оборудование и инструменты
     */
    private RowContent nonCurrentAssetsEquipmentTooling;

    /**
     * Внеоборотные активы --> Мебель и др. принадлежности
     */
    private RowContent nonCurrentAssetsFurnitureAndOthers;

    /**
     * Внеоборотные активы --> Компьютерное оборудование
     */
    private RowContent nonCurrentAssetsComputers;

    /**
     * Внеоборотные активы --> А/м компании
     */
    private RowContent nonCurrentAssetsCompanyCars;

    /**
     * Внеоборотные активы --> Гудвил и др. нематер. Активы
     */
    private RowContent nonCurrentAssetsGoodwillAndOtherAssets;

    /**
     * Внеоборотные активы --> Другие основные средства 1
     */
    private RowContent nonCurrentAssetsOtherMainTools;

    /**
     * Внеоборотные активы --> Итого основные средства
     */
    private RowContent nonCurrentAssetsTotalMainTools;

    /**
     * ----------------------------------------------
     */

    /**
     * Оборотные активы --> Склад новых а/м - Volvo (выкупленные)
     */
    private RowContent negotiableAssetStorageNewCarsVolvoBoughtBack;

    /**
     * Оборотные активы --> Склад новых а/м - Volvo (консигнация)
     */
    private RowContent negotiableAssetStorageNewCarsConsignment;

    /**
     * Оборотные активы --> Итого склад новых а/м
     */
    private RowContent negotiableAssetTotalStorageNewCars;

    /**
     * Оборотные активы --> Склад подержанных а/м - Volvo
     */
    private RowContent negotiableAssetStorageSecondHandCarsVolvo;

    /**
     * Оборотные активы --> Склад подержанных а/м - Другие
     */
    private RowContent negotiableAssetStorageSecondHandCarsOthers;

    /**
     * Оборотные активы --> Итого склад подержанных а/м
     */
    private RowContent negotiableAssetTotalStorageSecondHandCars;

    /**
     * Оборотные активы --> Склад демо а/м - Volvo
     */
    private RowContent negotiableAssetStorageDemoCarsVolvo;

    /**
     * Оборотные активы --> Склад подменных а/м
     */
    private RowContent negotiableAssetStorageAlternateCars;

    /**
     * Оборотные активы --> Склад а/м для проката
     */
    private RowContent negotiableAssetStorageRentCars;

    /**
     * Оборотные активы --> Склад запчастей - Volvo
     */
    private RowContent negotiableAssetStorageSparesVolvo;

    /**
     * Оборотные активы --> Склад др. товары 1
     */
    private RowContent negotiableAssetStorageOtherGoods;

    /**
     * Оборотные активы --> Итого по складам
     */
    private RowContent negotiableAssetTotalInStorage;

    /**
     * Оборотные активы --> Дебиторы по а/м
     */
    private RowContent negotiableAssetCarsDebtor;

    /**
     * Оборотные активы --> Дебиторы - страховые компании
     */
    private RowContent negotiableAssetInsuranceCompanyDebtor;

    /**
     * Оборотные активы --> Дебиторы - гарантия Volvo
     */
    private RowContent negotiableAssetVolvoGuaranteeDebtor;

    /**
     * Оборотные активы --> Дебиторы - другие производители
     */
    private RowContent negotiableAssetOtherProducerDebtor;

    /**
     * Оборотные активы --> Другие дебиторы 1
     */
    private RowContent negotiableAssetOtherDebtors;

    /**
     * Оборотные активы --> Дебиторы по НДС
     */
    private RowContent negotiableAssetVatDebtor;

    /**
     * Оборотные активы --> Внутрикорпоратиные дебиторы
     */
    private RowContent negotiableAssetCorporateDebtor;

    /**
     * Оборотные активы --> Итого по дебиторам
     */
    private RowContent negotiableAssetTotalByDebtor;

    /**
     * Оборотные активы --> Предоплата
     */
    private RowContent negotiableAssetPrepayment;

    /**
     * Оборотные активы --> Другие оборотные активы
     */
    private RowContent negotiableAssetOtherNegotiableAsset;

    /**
     * Оборотные активы --> Депозиты по а/м
     */
    private RowContent negotiableAssetCarsDeposit;

    /**
     * Оборотные активы --> Наличные в кассе
     */
    private RowContent negotiableAssetCashInDesk;

    /**
     * Оборотные активы --> Наличные в банке
     */
    private RowContent negotiableAssetCashInBank;

    /**
     * Оборотные активы --> Итого актив баланса
     */
    private RowContent negotiableAssetTotalBalance;

    /**
     * ----------------------------------------------
     */

    /**
     * Капитал и резервы --> Нераспределенная прибыль прошлых лет
     */
    private RowContent capitalAndReservesUndividedProfits;

    /**
     * Капитал и резервы --> Уставный капитал
     */
    private RowContent capitalAndReservesAuthorizedCapital;

    /**
     * Капитал и резервы --> Итого Акционерный капитал
     */
    private RowContent capitalAndReservesTotalCapital;

    /**
     * Капитал и резервы --> Резерв на погашение капитала
     */
    private RowContent capitalAndReservesProvisionForRepaymentOfCapital;

    /**
     * Капитал и резервы --> Резервы за счет прибыли
     */
    private RowContent capitalAndReservesProfitReserve;

    /**
     * Капитал и резервы --> Итого резервы прибыли
     */
    private RowContent capitalAndReservesTotalProfitReserve;

    /**
     * Капитал и резервы --> Резерв по переоценке
     */
    private RowContent capitalAndReservesRevaluationReserve;

    /**
     * Капитал и резервы --> Капитальные резервы
     */
    private RowContent capitalAndReservesCapitalReserve;

    /**
     * Капитал и резервы --> Итого резервы
     */
    private RowContent capitalAndReservesTotalReserve;

    /**
     * Капитал и резервы --> Прибыль текущего года
     */
    private RowContent capitalAndReservesProfitForTheCurrentYear;

    /**
     * Капитал и резервы --> За вычетом: Промежуточная выплата прибыли
     */
    private RowContent capitalAndReservesInterimPayments;

    /**
     * Капитал и резервы --> Итого собственный капитал
     */
    private RowContent capitalAndReservesTotalOwnCapital;

    /**
     * ----------------------------------------------
     */

    /**
     * Долгосрочные обязательства --> Займы акционеров
     */
    private RowContent longTermLiabilitiesShareholderLoans;

    /**
     * Долгосрочные обязательства --> Внутрикорпоративные займы
     */
    private RowContent longTermLiabilitiesCorporateLoans;

    /**
     * Долгосрочные обязательства --> Итого внутрикорпоративные займы
     */
    private RowContent longTermLiabilitiesTotalCorporateLoans;

    /**
     * Долгосрочные обязательства --> Долгосрочные займы (обеспеч.)
     */
    private RowContent longTermLiabilitiesLongLoanSecure;

    /**
     * Долгосрочные обязательства --> Долгосрочные займы (необеспеч.)
     */
    private RowContent longTermLiabilitiesLongLoanUnsecured;

    /**
     * Долгосрочные обязательства --> Итого долгосрочные займы
     */
    private RowContent longTermLiabilitiesTotalLongLoan;

    /**
     * Долгосрочные обязательства --> Закладные
     */
    private RowContent longTermLiabilitiesEncumbrance;

    /**
     * Долгосрочные обязательства --> Покупка в лизинг
     */
    private RowContent longTermLiabilitiesBuyOnLease;

    /**
     * Долгосрочные обязательства --> Другие долгосрочные обязательства 1
     */
    private RowContent longTermLiabilitiesOtherLongTermLiabilities;

    /**
     * Долгосрочные обязательства --> Итого другие долгосрочные обяз-ва
     */
    private RowContent longTermLiabilitiesTotalOtherLongTermLiabilities;

    /**
     * Долгосрочные обязательства --> Итого по долгосрочным обяз-вам
     */
    private RowContent longTermLiabilitiesTotalLongTermLiabilities;

    /**
     * ----------------------------------------------
     */

    /**
     * Краткосрочные обязательства --> Задолженность поставщикам
     */
    private RowContent shortTermLiabilitiesMerchandiseCreditors;

    /**
     * Краткосрочные обязательства --> Предоплата по а/м
     */
    private RowContent shortTermLiabilitiesCarsPrepayment;

    /**
     * Краткосрочные обязательства --> Задолженность по НДС
     */
    private RowContent shortTermLiabilitiesVatDebts;

    /**
     * Краткосрочные обязательства --> Задолженность по другим налогам
     */
    private RowContent shortTermLiabilitiesTaxDebts;

    /**
     * Краткосрочные обязательства --> Другая задолженность
     */
    private RowContent shortTermLiabilitiesOtherDebts;

    /**
     * Краткосрочные обязательства --> Итого задолженность
     */
    private RowContent shortTermLiabilitiesTotalDebts;

    /**
     * Краткосрочные обязательства --> Задолженность перед персоналом
     */
    private RowContent shortTermLiabilitiesStaffDebts;

    /**
     * Краткосрочные обязательства --> Внутригрупповая задолженность по товарам
     */
    private RowContent shortTermLiabilitiesGoodDebts;

    /**
     * Краткосрочные обязательства --> Краткосрочные займы
     */
    private RowContent shortTermLiabilitiesShortLoan;

    /**
     * Краткосрочные обязательства --> Кредиторская задолженность - склад НА
     */
    private RowContent shortTermLiabilitiesAccountsPayableNewCarsStock;

    /**
     * Краткосрочные обязательства --> Кредиторская задолженность - склад ПА
     */
    private RowContent shortTermLiabilitiesAccountsPayableSecondHandCarsStock;

    /**
     * Краткосрочные обязательства --> Кредиторская задолженность - склад Демо и Подменные а/м
     */
    private RowContent shortTermLiabilitiesAccountsPayableDemoCars;

    /**
     * Краткосрочные обязательства --> Кредиторская задолженность - склад а/м для проката
     */
    private RowContent shortTermLiabilitiesAccountsPayableRentCars;

    /**
     * Краткосрочные обязательства --> Банковский овердрафт и Баланс
     */
    private RowContent shortTermLiabilitiesBankOverdraftAndBalance;

    /**
     * Краткосрочные обязательства --> Предоплата от производителя
     */
    private RowContent shortTermLiabilitiesPrepaymentFromTheManufacturer;

    /**
     * Краткосрочные обязательства --> Счет акционера
     */
    private RowContent shortTermLiabilitiesShareholderAccount;

    /**
     * Краткосрочные обязательства --> Другие текущие обязательства
     */
    private RowContent shortTermLiabilitiesOtherCurrentLiability;

    /**
     * Краткосрочные обязательства --> Задолженность по выплате дивидендов
     */
    private RowContent shortTermLiabilitiesArrearsInThePaymentOfDividends;

    /**
     * Краткосрочные обязательства --> Итого другие текущие обязательства
     */
    private RowContent shortTermLiabilitiesTotalOtherCurrentLiability;

    /**
     * Краткосрочные обязательства --> Итого текущие обязательства
     */
    private RowContent shortTermLiabilitiesTotalCurrentLiability;

    /**
     * Краткосрочные обязательства --> Итого пассив баланса
     */
    private RowContent shortTermLiabilitiesPassiveBalance;

    /**
     * ----------------------------------------------
     */

    public RowContent getNonCurrentAssetsAreaBuildingsBelonging() {
        return nonCurrentAssetsAreaBuildingsBelonging;
    }

    public void setNonCurrentAssetsAreaBuildingsBelonging(RowContent nonCurrentAssetsAreaBuildingsBelonging) {
        this.nonCurrentAssetsAreaBuildingsBelonging = nonCurrentAssetsAreaBuildingsBelonging;
    }

    public RowContent getNonCurrentAssetsAreaBuildingsLeasingRent() {
        return nonCurrentAssetsAreaBuildingsLeasingRent;
    }

    public void setNonCurrentAssetsAreaBuildingsLeasingRent(RowContent nonCurrentAssetsAreaBuildingsLeasingRent) {
        this.nonCurrentAssetsAreaBuildingsLeasingRent = nonCurrentAssetsAreaBuildingsLeasingRent;
    }

    public RowContent getNonCurrentAssetsAreaBuildingsImprovement() {
        return nonCurrentAssetsAreaBuildingsImprovement;
    }

    public void setNonCurrentAssetsAreaBuildingsImprovement(RowContent nonCurrentAssetsAreaBuildingsImprovement) {
        this.nonCurrentAssetsAreaBuildingsImprovement = nonCurrentAssetsAreaBuildingsImprovement;
    }

    public RowContent getNonCurrentAssetsEquipmentTooling() {
        return nonCurrentAssetsEquipmentTooling;
    }

    public void setNonCurrentAssetsEquipmentTooling(RowContent nonCurrentAssetsEquipmentTooling) {
        this.nonCurrentAssetsEquipmentTooling = nonCurrentAssetsEquipmentTooling;
    }

    public RowContent getNonCurrentAssetsFurnitureAndOthers() {
        return nonCurrentAssetsFurnitureAndOthers;
    }

    public void setNonCurrentAssetsFurnitureAndOthers(RowContent nonCurrentAssetsFurnitureAndOthers) {
        this.nonCurrentAssetsFurnitureAndOthers = nonCurrentAssetsFurnitureAndOthers;
    }

    public RowContent getNonCurrentAssetsComputers() {
        return nonCurrentAssetsComputers;
    }

    public void setNonCurrentAssetsComputers(RowContent nonCurrentAssetsComputers) {
        this.nonCurrentAssetsComputers = nonCurrentAssetsComputers;
    }

    public RowContent getNonCurrentAssetsCompanyCars() {
        return nonCurrentAssetsCompanyCars;
    }

    public void setNonCurrentAssetsCompanyCars(RowContent nonCurrentAssetsCompanyCars) {
        this.nonCurrentAssetsCompanyCars = nonCurrentAssetsCompanyCars;
    }

    public RowContent getNonCurrentAssetsGoodwillAndOtherAssets() {
        return nonCurrentAssetsGoodwillAndOtherAssets;
    }

    public void setNonCurrentAssetsGoodwillAndOtherAssets(RowContent nonCurrentAssetsGoodwillAndOtherAssets) {
        this.nonCurrentAssetsGoodwillAndOtherAssets = nonCurrentAssetsGoodwillAndOtherAssets;
    }

    public RowContent getNonCurrentAssetsOtherMainTools() {
        return nonCurrentAssetsOtherMainTools;
    }

    public void setNonCurrentAssetsOtherMainTools(RowContent nonCurrentAssetsOtherMainTools) {
        this.nonCurrentAssetsOtherMainTools = nonCurrentAssetsOtherMainTools;
    }

    public RowContent getNonCurrentAssetsTotalMainTools() {
        return nonCurrentAssetsTotalMainTools;
    }

    public void setNonCurrentAssetsTotalMainTools(RowContent nonCurrentAssetsTotalMainTools) {
        this.nonCurrentAssetsTotalMainTools = nonCurrentAssetsTotalMainTools;
    }

    public RowContent getNegotiableAssetStorageNewCarsVolvoBoughtBack() {
        return negotiableAssetStorageNewCarsVolvoBoughtBack;
    }

    public void setNegotiableAssetStorageNewCarsVolvoBoughtBack(RowContent negotiableAssetStorageNewCarsVolvoBoughtBack) {
        this.negotiableAssetStorageNewCarsVolvoBoughtBack = negotiableAssetStorageNewCarsVolvoBoughtBack;
    }

    public RowContent getNegotiableAssetStorageNewCarsConsignment() {
        return negotiableAssetStorageNewCarsConsignment;
    }

    public void setNegotiableAssetStorageNewCarsConsignment(RowContent negotiableAssetStorageNewCarsConsignment) {
        this.negotiableAssetStorageNewCarsConsignment = negotiableAssetStorageNewCarsConsignment;
    }

    public RowContent getNegotiableAssetTotalStorageNewCars() {
        return negotiableAssetTotalStorageNewCars;
    }

    public void setNegotiableAssetTotalStorageNewCars(RowContent negotiableAssetTotalStorageNewCars) {
        this.negotiableAssetTotalStorageNewCars = negotiableAssetTotalStorageNewCars;
    }

    public RowContent getNegotiableAssetStorageSecondHandCarsVolvo() {
        return negotiableAssetStorageSecondHandCarsVolvo;
    }

    public void setNegotiableAssetStorageSecondHandCarsVolvo(RowContent negotiableAssetStorageSecondHandCarsVolvo) {
        this.negotiableAssetStorageSecondHandCarsVolvo = negotiableAssetStorageSecondHandCarsVolvo;
    }

    public RowContent getNegotiableAssetStorageSecondHandCarsOthers() {
        return negotiableAssetStorageSecondHandCarsOthers;
    }

    public void setNegotiableAssetStorageSecondHandCarsOthers(RowContent negotiableAssetStorageSecondHandCarsOthers) {
        this.negotiableAssetStorageSecondHandCarsOthers = negotiableAssetStorageSecondHandCarsOthers;
    }

    public RowContent getNegotiableAssetTotalStorageSecondHandCars() {
        return negotiableAssetTotalStorageSecondHandCars;
    }

    public void setNegotiableAssetTotalStorageSecondHandCars(RowContent negotiableAssetTotalStorageSecondHandCars) {
        this.negotiableAssetTotalStorageSecondHandCars = negotiableAssetTotalStorageSecondHandCars;
    }

    public RowContent getNegotiableAssetStorageDemoCarsVolvo() {
        return negotiableAssetStorageDemoCarsVolvo;
    }

    public void setNegotiableAssetStorageDemoCarsVolvo(RowContent negotiableAssetStorageDemoCarsVolvo) {
        this.negotiableAssetStorageDemoCarsVolvo = negotiableAssetStorageDemoCarsVolvo;
    }

    public RowContent getNegotiableAssetStorageAlternateCars() {
        return negotiableAssetStorageAlternateCars;
    }

    public void setNegotiableAssetStorageAlternateCars(RowContent negotiableAssetStorageAlternateCars) {
        this.negotiableAssetStorageAlternateCars = negotiableAssetStorageAlternateCars;
    }

    public RowContent getNegotiableAssetStorageRentCars() {
        return negotiableAssetStorageRentCars;
    }

    public void setNegotiableAssetStorageRentCars(RowContent negotiableAssetStorageRentCars) {
        this.negotiableAssetStorageRentCars = negotiableAssetStorageRentCars;
    }

    public RowContent getNegotiableAssetStorageSparesVolvo() {
        return negotiableAssetStorageSparesVolvo;
    }

    public void setNegotiableAssetStorageSparesVolvo(RowContent negotiableAssetStorageSparesVolvo) {
        this.negotiableAssetStorageSparesVolvo = negotiableAssetStorageSparesVolvo;
    }

    public RowContent getNegotiableAssetStorageOtherGoods() {
        return negotiableAssetStorageOtherGoods;
    }

    public void setNegotiableAssetStorageOtherGoods(RowContent negotiableAssetStorageOtherGoods) {
        this.negotiableAssetStorageOtherGoods = negotiableAssetStorageOtherGoods;
    }

    public RowContent getNegotiableAssetTotalInStorage() {
        return negotiableAssetTotalInStorage;
    }

    public void setNegotiableAssetTotalInStorage(RowContent negotiableAssetTotalInStorage) {
        this.negotiableAssetTotalInStorage = negotiableAssetTotalInStorage;
    }

    public RowContent getNegotiableAssetCarsDebtor() {
        return negotiableAssetCarsDebtor;
    }

    public void setNegotiableAssetCarsDebtor(RowContent negotiableAssetCarsDebtor) {
        this.negotiableAssetCarsDebtor = negotiableAssetCarsDebtor;
    }

    public RowContent getNegotiableAssetInsuranceCompanyDebtor() {
        return negotiableAssetInsuranceCompanyDebtor;
    }

    public void setNegotiableAssetInsuranceCompanyDebtor(RowContent negotiableAssetInsuranceCompanyDebtor) {
        this.negotiableAssetInsuranceCompanyDebtor = negotiableAssetInsuranceCompanyDebtor;
    }

    public RowContent getNegotiableAssetVolvoGuaranteeDebtor() {
        return negotiableAssetVolvoGuaranteeDebtor;
    }

    public void setNegotiableAssetVolvoGuaranteeDebtor(RowContent negotiableAssetVolvoGuaranteeDebtor) {
        this.negotiableAssetVolvoGuaranteeDebtor = negotiableAssetVolvoGuaranteeDebtor;
    }

    public RowContent getNegotiableAssetOtherProducerDebtor() {
        return negotiableAssetOtherProducerDebtor;
    }

    public void setNegotiableAssetOtherProducerDebtor(RowContent negotiableAssetOtherProducerDebtor) {
        this.negotiableAssetOtherProducerDebtor = negotiableAssetOtherProducerDebtor;
    }

    public RowContent getNegotiableAssetOtherDebtors() {
        return negotiableAssetOtherDebtors;
    }

    public void setNegotiableAssetOtherDebtors(RowContent negotiableAssetOtherDebtors) {
        this.negotiableAssetOtherDebtors = negotiableAssetOtherDebtors;
    }

    public RowContent getNegotiableAssetVatDebtor() {
        return negotiableAssetVatDebtor;
    }

    public void setNegotiableAssetVatDebtor(RowContent negotiableAssetVatDebtor) {
        this.negotiableAssetVatDebtor = negotiableAssetVatDebtor;
    }

    public RowContent getNegotiableAssetCorporateDebtor() {
        return negotiableAssetCorporateDebtor;
    }

    public void setNegotiableAssetCorporateDebtor(RowContent negotiableAssetCorporateDebtor) {
        this.negotiableAssetCorporateDebtor = negotiableAssetCorporateDebtor;
    }

    public RowContent getNegotiableAssetTotalByDebtor() {
        return negotiableAssetTotalByDebtor;
    }

    public void setNegotiableAssetTotalByDebtor(RowContent negotiableAssetTotalByDebtor) {
        this.negotiableAssetTotalByDebtor = negotiableAssetTotalByDebtor;
    }

    public RowContent getNegotiableAssetPrepayment() {
        return negotiableAssetPrepayment;
    }

    public void setNegotiableAssetPrepayment(RowContent negotiableAssetPrepayment) {
        this.negotiableAssetPrepayment = negotiableAssetPrepayment;
    }

    public RowContent getNegotiableAssetOtherNegotiableAsset() {
        return negotiableAssetOtherNegotiableAsset;
    }

    public void setNegotiableAssetOtherNegotiableAsset(RowContent negotiableAssetOtherNegotiableAsset) {
        this.negotiableAssetOtherNegotiableAsset = negotiableAssetOtherNegotiableAsset;
    }

    public RowContent getNegotiableAssetCarsDeposit() {
        return negotiableAssetCarsDeposit;
    }

    public void setNegotiableAssetCarsDeposit(RowContent negotiableAssetCarsDeposit) {
        this.negotiableAssetCarsDeposit = negotiableAssetCarsDeposit;
    }

    public RowContent getNegotiableAssetCashInDesk() {
        return negotiableAssetCashInDesk;
    }

    public void setNegotiableAssetCashInDesk(RowContent negotiableAssetCashInDesk) {
        this.negotiableAssetCashInDesk = negotiableAssetCashInDesk;
    }

    public RowContent getNegotiableAssetCashInBank() {
        return negotiableAssetCashInBank;
    }

    public void setNegotiableAssetCashInBank(RowContent negotiableAssetCashInBank) {
        this.negotiableAssetCashInBank = negotiableAssetCashInBank;
    }

    public RowContent getNegotiableAssetTotalBalance() {
        return negotiableAssetTotalBalance;
    }

    public void setNegotiableAssetTotalBalance(RowContent negotiableAssetTotalBalance) {
        this.negotiableAssetTotalBalance = negotiableAssetTotalBalance;
    }

    public RowContent getCapitalAndReservesUndividedProfits() {
        return capitalAndReservesUndividedProfits;
    }

    public void setCapitalAndReservesUndividedProfits(RowContent capitalAndReservesUndividedProfits) {
        this.capitalAndReservesUndividedProfits = capitalAndReservesUndividedProfits;
    }

    public RowContent getCapitalAndReservesAuthorizedCapital() {
        return capitalAndReservesAuthorizedCapital;
    }

    public void setCapitalAndReservesAuthorizedCapital(RowContent capitalAndReservesAuthorizedCapital) {
        this.capitalAndReservesAuthorizedCapital = capitalAndReservesAuthorizedCapital;
    }

    public RowContent getCapitalAndReservesTotalCapital() {
        return capitalAndReservesTotalCapital;
    }

    public void setCapitalAndReservesTotalCapital(RowContent capitalAndReservesTotalCapital) {
        this.capitalAndReservesTotalCapital = capitalAndReservesTotalCapital;
    }

    public RowContent getCapitalAndReservesProvisionForRepaymentOfCapital() {
        return capitalAndReservesProvisionForRepaymentOfCapital;
    }

    public void setCapitalAndReservesProvisionForRepaymentOfCapital(RowContent capitalAndReservesProvisionForRepaymentOfCapital) {
        this.capitalAndReservesProvisionForRepaymentOfCapital = capitalAndReservesProvisionForRepaymentOfCapital;
    }

    public RowContent getCapitalAndReservesProfitReserve() {
        return capitalAndReservesProfitReserve;
    }

    public void setCapitalAndReservesProfitReserve(RowContent capitalAndReservesProfitReserve) {
        this.capitalAndReservesProfitReserve = capitalAndReservesProfitReserve;
    }

    public RowContent getCapitalAndReservesTotalProfitReserve() {
        return capitalAndReservesTotalProfitReserve;
    }

    public void setCapitalAndReservesTotalProfitReserve(RowContent capitalAndReservesTotalProfitReserve) {
        this.capitalAndReservesTotalProfitReserve = capitalAndReservesTotalProfitReserve;
    }

    public RowContent getCapitalAndReservesRevaluationReserve() {
        return capitalAndReservesRevaluationReserve;
    }

    public void setCapitalAndReservesRevaluationReserve(RowContent capitalAndReservesRevaluationReserve) {
        this.capitalAndReservesRevaluationReserve = capitalAndReservesRevaluationReserve;
    }

    public RowContent getCapitalAndReservesCapitalReserve() {
        return capitalAndReservesCapitalReserve;
    }

    public void setCapitalAndReservesCapitalReserve(RowContent capitalAndReservesCapitalReserve) {
        this.capitalAndReservesCapitalReserve = capitalAndReservesCapitalReserve;
    }

    public RowContent getCapitalAndReservesTotalReserve() {
        return capitalAndReservesTotalReserve;
    }

    public void setCapitalAndReservesTotalReserve(RowContent capitalAndReservesTotalReserve) {
        this.capitalAndReservesTotalReserve = capitalAndReservesTotalReserve;
    }

    public RowContent getCapitalAndReservesProfitForTheCurrentYear() {
        return capitalAndReservesProfitForTheCurrentYear;
    }

    public void setCapitalAndReservesProfitForTheCurrentYear(RowContent capitalAndReservesProfitForTheCurrentYear) {
        this.capitalAndReservesProfitForTheCurrentYear = capitalAndReservesProfitForTheCurrentYear;
    }

    public RowContent getCapitalAndReservesInterimPayments() {
        return capitalAndReservesInterimPayments;
    }

    public void setCapitalAndReservesInterimPayments(RowContent capitalAndReservesInterimPayments) {
        this.capitalAndReservesInterimPayments = capitalAndReservesInterimPayments;
    }

    public RowContent getCapitalAndReservesTotalOwnCapital() {
        return capitalAndReservesTotalOwnCapital;
    }

    public void setCapitalAndReservesTotalOwnCapital(RowContent capitalAndReservesTotalOwnCapital) {
        this.capitalAndReservesTotalOwnCapital = capitalAndReservesTotalOwnCapital;
    }

    public RowContent getLongTermLiabilitiesShareholderLoans() {
        return longTermLiabilitiesShareholderLoans;
    }

    public void setLongTermLiabilitiesShareholderLoans(RowContent longTermLiabilitiesShareholderLoans) {
        this.longTermLiabilitiesShareholderLoans = longTermLiabilitiesShareholderLoans;
    }

    public RowContent getLongTermLiabilitiesCorporateLoans() {
        return longTermLiabilitiesCorporateLoans;
    }

    public void setLongTermLiabilitiesCorporateLoans(RowContent longTermLiabilitiesCorporateLoans) {
        this.longTermLiabilitiesCorporateLoans = longTermLiabilitiesCorporateLoans;
    }

    public RowContent getLongTermLiabilitiesTotalCorporateLoans() {
        return longTermLiabilitiesTotalCorporateLoans;
    }

    public void setLongTermLiabilitiesTotalCorporateLoans(RowContent longTermLiabilitiesTotalCorporateLoans) {
        this.longTermLiabilitiesTotalCorporateLoans = longTermLiabilitiesTotalCorporateLoans;
    }

    public RowContent getLongTermLiabilitiesLongLoanSecure() {
        return longTermLiabilitiesLongLoanSecure;
    }

    public void setLongTermLiabilitiesLongLoanSecure(RowContent longTermLiabilitiesLongLoanSecure) {
        this.longTermLiabilitiesLongLoanSecure = longTermLiabilitiesLongLoanSecure;
    }

    public RowContent getLongTermLiabilitiesLongLoanUnsecured() {
        return longTermLiabilitiesLongLoanUnsecured;
    }

    public void setLongTermLiabilitiesLongLoanUnsecured(RowContent longTermLiabilitiesLongLoanUnsecured) {
        this.longTermLiabilitiesLongLoanUnsecured = longTermLiabilitiesLongLoanUnsecured;
    }

    public RowContent getLongTermLiabilitiesTotalLongLoan() {
        return longTermLiabilitiesTotalLongLoan;
    }

    public void setLongTermLiabilitiesTotalLongLoan(RowContent longTermLiabilitiesTotalLongLoan) {
        this.longTermLiabilitiesTotalLongLoan = longTermLiabilitiesTotalLongLoan;
    }

    public RowContent getLongTermLiabilitiesEncumbrance() {
        return longTermLiabilitiesEncumbrance;
    }

    public void setLongTermLiabilitiesEncumbrance(RowContent longTermLiabilitiesEncumbrance) {
        this.longTermLiabilitiesEncumbrance = longTermLiabilitiesEncumbrance;
    }

    public RowContent getLongTermLiabilitiesBuyOnLease() {
        return longTermLiabilitiesBuyOnLease;
    }

    public void setLongTermLiabilitiesBuyOnLease(RowContent longTermLiabilitiesBuyOnLease) {
        this.longTermLiabilitiesBuyOnLease = longTermLiabilitiesBuyOnLease;
    }

    public RowContent getLongTermLiabilitiesOtherLongTermLiabilities() {
        return longTermLiabilitiesOtherLongTermLiabilities;
    }

    public void setLongTermLiabilitiesOtherLongTermLiabilities(RowContent longTermLiabilitiesOtherLongTermLiabilities) {
        this.longTermLiabilitiesOtherLongTermLiabilities = longTermLiabilitiesOtherLongTermLiabilities;
    }

    public RowContent getLongTermLiabilitiesTotalOtherLongTermLiabilities() {
        return longTermLiabilitiesTotalOtherLongTermLiabilities;
    }

    public void setLongTermLiabilitiesTotalOtherLongTermLiabilities(RowContent longTermLiabilitiesTotalOtherLongTermLiabilities) {
        this.longTermLiabilitiesTotalOtherLongTermLiabilities = longTermLiabilitiesTotalOtherLongTermLiabilities;
    }

    public RowContent getLongTermLiabilitiesTotalLongTermLiabilities() {
        return longTermLiabilitiesTotalLongTermLiabilities;
    }

    public void setLongTermLiabilitiesTotalLongTermLiabilities(RowContent longTermLiabilitiesTotalLongTermLiabilities) {
        this.longTermLiabilitiesTotalLongTermLiabilities = longTermLiabilitiesTotalLongTermLiabilities;
    }

    public RowContent getShortTermLiabilitiesMerchandiseCreditors() {
        return shortTermLiabilitiesMerchandiseCreditors;
    }

    public void setShortTermLiabilitiesMerchandiseCreditors(RowContent shortTermLiabilitiesMerchandiseCreditors) {
        this.shortTermLiabilitiesMerchandiseCreditors = shortTermLiabilitiesMerchandiseCreditors;
    }

    public RowContent getShortTermLiabilitiesCarsPrepayment() {
        return shortTermLiabilitiesCarsPrepayment;
    }

    public void setShortTermLiabilitiesCarsPrepayment(RowContent shortTermLiabilitiesCarsPrepayment) {
        this.shortTermLiabilitiesCarsPrepayment = shortTermLiabilitiesCarsPrepayment;
    }

    public RowContent getShortTermLiabilitiesVatDebts() {
        return shortTermLiabilitiesVatDebts;
    }

    public void setShortTermLiabilitiesVatDebts(RowContent shortTermLiabilitiesVatDebts) {
        this.shortTermLiabilitiesVatDebts = shortTermLiabilitiesVatDebts;
    }

    public RowContent getShortTermLiabilitiesTaxDebts() {
        return shortTermLiabilitiesTaxDebts;
    }

    public void setShortTermLiabilitiesTaxDebts(RowContent shortTermLiabilitiesTaxDebts) {
        this.shortTermLiabilitiesTaxDebts = shortTermLiabilitiesTaxDebts;
    }

    public RowContent getShortTermLiabilitiesOtherDebts() {
        return shortTermLiabilitiesOtherDebts;
    }

    public void setShortTermLiabilitiesOtherDebts(RowContent shortTermLiabilitiesOtherDebts) {
        this.shortTermLiabilitiesOtherDebts = shortTermLiabilitiesOtherDebts;
    }

    public RowContent getShortTermLiabilitiesTotalDebts() {
        return shortTermLiabilitiesTotalDebts;
    }

    public void setShortTermLiabilitiesTotalDebts(RowContent shortTermLiabilitiesTotalDebts) {
        this.shortTermLiabilitiesTotalDebts = shortTermLiabilitiesTotalDebts;
    }

    public RowContent getShortTermLiabilitiesStaffDebts() {
        return shortTermLiabilitiesStaffDebts;
    }

    public void setShortTermLiabilitiesStaffDebts(RowContent shortTermLiabilitiesStaffDebts) {
        this.shortTermLiabilitiesStaffDebts = shortTermLiabilitiesStaffDebts;
    }

    public RowContent getShortTermLiabilitiesGoodDebts() {
        return shortTermLiabilitiesGoodDebts;
    }

    public void setShortTermLiabilitiesGoodDebts(RowContent shortTermLiabilitiesGoodDebts) {
        this.shortTermLiabilitiesGoodDebts = shortTermLiabilitiesGoodDebts;
    }

    public RowContent getShortTermLiabilitiesShortLoan() {
        return shortTermLiabilitiesShortLoan;
    }

    public void setShortTermLiabilitiesShortLoan(RowContent shortTermLiabilitiesShortLoan) {
        this.shortTermLiabilitiesShortLoan = shortTermLiabilitiesShortLoan;
    }

    public RowContent getShortTermLiabilitiesAccountsPayableNewCarsStock() {
        return shortTermLiabilitiesAccountsPayableNewCarsStock;
    }

    public void setShortTermLiabilitiesAccountsPayableNewCarsStock(RowContent shortTermLiabilitiesAccountsPayableNewCarsStock) {
        this.shortTermLiabilitiesAccountsPayableNewCarsStock = shortTermLiabilitiesAccountsPayableNewCarsStock;
    }

    public RowContent getShortTermLiabilitiesAccountsPayableSecondHandCarsStock() {
        return shortTermLiabilitiesAccountsPayableSecondHandCarsStock;
    }

    public void setShortTermLiabilitiesAccountsPayableSecondHandCarsStock(RowContent shortTermLiabilitiesAccountsPayableSecondHandCarsStock) {
        this.shortTermLiabilitiesAccountsPayableSecondHandCarsStock = shortTermLiabilitiesAccountsPayableSecondHandCarsStock;
    }

    public RowContent getShortTermLiabilitiesAccountsPayableDemoCars() {
        return shortTermLiabilitiesAccountsPayableDemoCars;
    }

    public void setShortTermLiabilitiesAccountsPayableDemoCars(RowContent shortTermLiabilitiesAccountsPayableDemoCars) {
        this.shortTermLiabilitiesAccountsPayableDemoCars = shortTermLiabilitiesAccountsPayableDemoCars;
    }

    public RowContent getShortTermLiabilitiesAccountsPayableRentCars() {
        return shortTermLiabilitiesAccountsPayableRentCars;
    }

    public void setShortTermLiabilitiesAccountsPayableRentCars(RowContent shortTermLiabilitiesAccountsPayableRentCars) {
        this.shortTermLiabilitiesAccountsPayableRentCars = shortTermLiabilitiesAccountsPayableRentCars;
    }

    public RowContent getShortTermLiabilitiesBankOverdraftAndBalance() {
        return shortTermLiabilitiesBankOverdraftAndBalance;
    }

    public void setShortTermLiabilitiesBankOverdraftAndBalance(RowContent shortTermLiabilitiesBankOverdraftAndBalance) {
        this.shortTermLiabilitiesBankOverdraftAndBalance = shortTermLiabilitiesBankOverdraftAndBalance;
    }

    public RowContent getShortTermLiabilitiesPrepaymentFromTheManufacturer() {
        return shortTermLiabilitiesPrepaymentFromTheManufacturer;
    }

    public void setShortTermLiabilitiesPrepaymentFromTheManufacturer(RowContent shortTermLiabilitiesPrepaymentFromTheManufacturer) {
        this.shortTermLiabilitiesPrepaymentFromTheManufacturer = shortTermLiabilitiesPrepaymentFromTheManufacturer;
    }

    public RowContent getShortTermLiabilitiesShareholderAccount() {
        return shortTermLiabilitiesShareholderAccount;
    }

    public void setShortTermLiabilitiesShareholderAccount(RowContent shortTermLiabilitiesShareholderAccount) {
        this.shortTermLiabilitiesShareholderAccount = shortTermLiabilitiesShareholderAccount;
    }

    public RowContent getShortTermLiabilitiesOtherCurrentLiability() {
        return shortTermLiabilitiesOtherCurrentLiability;
    }

    public void setShortTermLiabilitiesOtherCurrentLiability(RowContent shortTermLiabilitiesOtherCurrentLiability) {
        this.shortTermLiabilitiesOtherCurrentLiability = shortTermLiabilitiesOtherCurrentLiability;
    }

    public RowContent getShortTermLiabilitiesArrearsInThePaymentOfDividends() {
        return shortTermLiabilitiesArrearsInThePaymentOfDividends;
    }

    public void setShortTermLiabilitiesArrearsInThePaymentOfDividends(RowContent shortTermLiabilitiesArrearsInThePaymentOfDividends) {
        this.shortTermLiabilitiesArrearsInThePaymentOfDividends = shortTermLiabilitiesArrearsInThePaymentOfDividends;
    }

    public RowContent getShortTermLiabilitiesTotalOtherCurrentLiability() {
        return shortTermLiabilitiesTotalOtherCurrentLiability;
    }

    public void setShortTermLiabilitiesTotalOtherCurrentLiability(RowContent shortTermLiabilitiesTotalOtherCurrentLiability) {
        this.shortTermLiabilitiesTotalOtherCurrentLiability = shortTermLiabilitiesTotalOtherCurrentLiability;
    }

    public RowContent getShortTermLiabilitiesTotalCurrentLiability() {
        return shortTermLiabilitiesTotalCurrentLiability;
    }

    public void setShortTermLiabilitiesTotalCurrentLiability(RowContent shortTermLiabilitiesTotalCurrentLiability) {
        this.shortTermLiabilitiesTotalCurrentLiability = shortTermLiabilitiesTotalCurrentLiability;
    }

    public RowContent getShortTermLiabilitiesPassiveBalance() {
        return shortTermLiabilitiesPassiveBalance;
    }

    public void setShortTermLiabilitiesPassiveBalance(RowContent shortTermLiabilitiesPassiveBalance) {
        this.shortTermLiabilitiesPassiveBalance = shortTermLiabilitiesPassiveBalance;
    }
}
