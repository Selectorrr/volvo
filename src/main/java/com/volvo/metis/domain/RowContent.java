package com.volvo.metis.domain;

import java.io.Serializable;

/**
 * Данные в строке
 */
public class RowContent implements Serializable {

    private Double first;

    private Double second;

    private Double third;

    private Double fourth;

    private Double fifth;

    public Double getFirst() {
        return first;
    }

    public void setFirst(Double first) {
        this.first = first;
    }

    public Double getSecond() {
        return second;
    }

    public void setSecond(Double second) {
        this.second = second;
    }

    public Double getThird() {
        return third;
    }

    public void setThird(Double third) {
        this.third = third;
    }

    public Double getFourth() {
        return fourth;
    }

    public void setFourth(Double fourth) {
        this.fourth = fourth;
    }

    public Double getFifth() {
        return fifth;
    }

    public void setFifth(Double fifth) {
        this.fifth = fifth;
    }
}
