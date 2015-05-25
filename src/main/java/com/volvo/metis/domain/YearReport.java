package com.volvo.metis.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Отчет
 */
@Document(collection = "T_REPORT")
public class YearReport extends AbstractAuditingEntity implements Serializable {

    @Id
    private String id;
    private String kind; //вид отчета план/факт
    private Integer year;

    private MonthReport january;
    private MonthReport february;
    private MonthReport march;
    private MonthReport april;
    private MonthReport may;
    private MonthReport june;
    private MonthReport july;
    private MonthReport august;
    private MonthReport september;
    private MonthReport october;
    private MonthReport november;
    private MonthReport december;

    private String status; //состояние отчета черновик/согласован


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MonthReport getJanuary() {
        return january;
    }

    public void setJanuary(MonthReport january) {
        this.january = january;
    }

    public MonthReport getFebruary() {
        return february;
    }

    public void setFebruary(MonthReport february) {
        this.february = february;
    }

    public MonthReport getMarch() {
        return march;
    }

    public void setMarch(MonthReport march) {
        this.march = march;
    }

    public MonthReport getApril() {
        return april;
    }

    public void setApril(MonthReport april) {
        this.april = april;
    }

    public MonthReport getMay() {
        return may;
    }

    public void setMay(MonthReport may) {
        this.may = may;
    }

    public MonthReport getJune() {
        return june;
    }

    public void setJune(MonthReport june) {
        this.june = june;
    }

    public MonthReport getJuly() {
        return july;
    }

    public void setJuly(MonthReport july) {
        this.july = july;
    }

    public MonthReport getAugust() {
        return august;
    }

    public void setAugust(MonthReport august) {
        this.august = august;
    }

    public MonthReport getSeptember() {
        return september;
    }

    public void setSeptember(MonthReport september) {
        this.september = september;
    }

    public MonthReport getOctober() {
        return october;
    }

    public void setOctober(MonthReport october) {
        this.october = october;
    }

    public MonthReport getNovember() {
        return november;
    }

    public void setNovember(MonthReport november) {
        this.november = november;
    }

    public MonthReport getDecember() {
        return december;
    }

    public void setDecember(MonthReport december) {
        this.december = december;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MonthReport get(int month) {
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

    public void set(int month, MonthReport monthReport) {
        switch (month) {
            default:
                break;
            case 1:
                january = monthReport;
                break;
            case 2:
                february = monthReport;
                break;
            case 3:
                march = monthReport;
                break;
            case 4:
                april = monthReport;
                break;
            case 5:
                may = monthReport;
                break;
            case 6:
                june = monthReport;
                break;
            case 7:
                july = monthReport;
                break;
            case 8:
                august = monthReport;
                break;
            case 9:
                september = monthReport;
                break;
            case 10:
                october = monthReport;
                break;
            case 11:
                november = monthReport;
                break;
            case 12:
                december = monthReport;
                break;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YearReport that = (YearReport) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (january != null ? !january.equals(that.january) : that.january != null) return false;
        if (february != null ? !february.equals(that.february) : that.february != null) return false;
        if (march != null ? !march.equals(that.march) : that.march != null) return false;
        if (april != null ? !april.equals(that.april) : that.april != null) return false;
        if (may != null ? !may.equals(that.may) : that.may != null) return false;
        if (june != null ? !june.equals(that.june) : that.june != null) return false;
        if (july != null ? !july.equals(that.july) : that.july != null) return false;
        if (august != null ? !august.equals(that.august) : that.august != null) return false;
        if (september != null ? !september.equals(that.september) : that.september != null) return false;
        if (october != null ? !october.equals(that.october) : that.october != null) return false;
        if (november != null ? !november.equals(that.november) : that.november != null) return false;
        return !(december != null ? !december.equals(that.december) : that.december != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
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
