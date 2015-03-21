package com.volvo.metis.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * Данные в строке
 */
@Document(collection = "T_ROW_CONTENT")
public class RowContent extends AbstractAuditingEntity implements Serializable {

    @Id
    private String id;

    @Field("first")
    private Double first;

    @Field("second")
    private Double second;

    @Field("third")
    private Double third;

    @Field("fourth")
    private Double fourth;

    @Field("fifth")
    private Double fifth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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
