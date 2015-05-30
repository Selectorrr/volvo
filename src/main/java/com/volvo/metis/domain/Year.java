package com.volvo.metis.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Отчет
 */
@Document(collection = "T_REPORT")
public class Year extends AbstractAuditingEntity implements Serializable {

    @Id
    private String id;
    private String code;

    private Integer year;

    private Month january;
    private Month february;
    private Month march;
    private Month april;
    private Month may;
    private Month june;
    private Month july;
    private Month august;
    private Month september;
    private Month october;
    private Month november;
    private Month december;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Month getJanuary() {
        return january;
    }

    public void setJanuary(Month january) {
        this.january = january;
    }

    public Month getFebruary() {
        return february;
    }

    public void setFebruary(Month february) {
        this.february = february;
    }

    public Month getMarch() {
        return march;
    }

    public void setMarch(Month march) {
        this.march = march;
    }

    public Month getApril() {
        return april;
    }

    public void setApril(Month april) {
        this.april = april;
    }

    public Month getMay() {
        return may;
    }

    public void setMay(Month may) {
        this.may = may;
    }

    public Month getJune() {
        return june;
    }

    public void setJune(Month june) {
        this.june = june;
    }

    public Month getJuly() {
        return july;
    }

    public void setJuly(Month july) {
        this.july = july;
    }

    public Month getAugust() {
        return august;
    }

    public void setAugust(Month august) {
        this.august = august;
    }

    public Month getSeptember() {
        return september;
    }

    public void setSeptember(Month september) {
        this.september = september;
    }

    public Month getOctober() {
        return october;
    }

    public void setOctober(Month october) {
        this.october = october;
    }

    public Month getNovember() {
        return november;
    }

    public void setNovember(Month november) {
        this.november = november;
    }

    public Month getDecember() {
        return december;
    }

    public void setDecember(Month december) {
        this.december = december;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Report get(int month, String kind) {
        Month result = get(month);
        switch (kind) {
            default:
                return null;
            case Month.KIND_PLAN:
                return result.getPlan();
            case Month.KIND_FACT:
                return result.getFact();
        }
    }

    public Month get(int month) {
        switch (month) {
            default:
                return null;
            case 1:
                return january;
            case 2:
                return february;
            case 3:
                return march;
            case 4:
                return april;
            case 5:
                return may;
            case 6:
                return june;
            case 7:
                return july;
            case 8:
                return august;
            case 9:
                return september;
            case 10:
                return october;
            case 11:
                return november;
            case 12:
                return december;
        }
    }

    public static String getMonthName(int month) {
        switch (month) {
            default:
                return null;
            case 1:
                return "january";
            case 2:
                return "february";
            case 3:
                return "march";
            case 4:
                return "april";
            case 5:
                return "may";
            case 6:
                return "june";
            case 7:
                return "july";
            case 8:
                return "august";
            case 9:
                return "september";
            case 10:
                return "october";
            case 11:
                return "november";
            case 12:
                return "december";
        }
    }

    public void set(int month, Month report) {
        switch (month) {
            default:
                break;
            case 1:
                january = report;
                break;
            case 2:
                february = report;
                break;
            case 3:
                march = report;
                break;
            case 4:
                april = report;
                break;
            case 5:
                may = report;
                break;
            case 6:
                june = report;
                break;
            case 7:
                july = report;
                break;
            case 8:
                august = report;
                break;
            case 9:
                september = report;
                break;
            case 10:
                october = report;
                break;
            case 11:
                november = report;
                break;
            case 12:
                december = report;
                break;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Year year1 = (Year) o;

        if (id != null ? !id.equals(year1.id) : year1.id != null) return false;
        if (code != null ? !code.equals(year1.code) : year1.code != null) return false;
        if (year != null ? !year.equals(year1.year) : year1.year != null) return false;
        if (january != null ? !january.equals(year1.january) : year1.january != null) return false;
        if (february != null ? !february.equals(year1.february) : year1.february != null) return false;
        if (march != null ? !march.equals(year1.march) : year1.march != null) return false;
        if (april != null ? !april.equals(year1.april) : year1.april != null) return false;
        if (may != null ? !may.equals(year1.may) : year1.may != null) return false;
        if (june != null ? !june.equals(year1.june) : year1.june != null) return false;
        if (july != null ? !july.equals(year1.july) : year1.july != null) return false;
        if (august != null ? !august.equals(year1.august) : year1.august != null) return false;
        if (september != null ? !september.equals(year1.september) : year1.september != null) return false;
        if (october != null ? !october.equals(year1.october) : year1.october != null) return false;
        if (november != null ? !november.equals(year1.november) : year1.november != null) return false;
        return !(december != null ? !december.equals(year1.december) : year1.december != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (january != null ? january.hashCode() : 0);
        result = 31 * result + (february != null ? february.hashCode() : 0);
        result = 31 * result + (march != null ? march.hashCode() : 0);
        result = 31 * result + (april != null ? april.hashCode() : 0);
        result = 31 * result + (may != null ? may.hashCode() : 0);
        result = 31 * result + (june != null ? june.hashCode() : 0);
        result = 31 * result + (july != null ? july.hashCode() : 0);
        result = 31 * result + (august != null ? august.hashCode() : 0);
        result = 31 * result + (september != null ? september.hashCode() : 0);
        result = 31 * result + (october != null ? october.hashCode() : 0);
        result = 31 * result + (november != null ? november.hashCode() : 0);
        result = 31 * result + (december != null ? december.hashCode() : 0);
        return result;
    }
}
