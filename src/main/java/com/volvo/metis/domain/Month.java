package com.volvo.metis.domain;

/**
 * Created by Selector on 25.05.2015.
 */
public class Month {

    public static final String KIND_PLAN = "plan";
    public static final String KIND_FACT = "fact";

    private Report plan = new Report(KIND_PLAN);

    private Report fact = new Report(KIND_FACT);

    public Report getPlan() {
        return plan;
    }

    public void setPlan(Report plan) {
        this.plan = plan;
    }

    public Report getFact() {
        return fact;
    }

    public void setFact(Report fact) {
        this.fact = fact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Month month = (Month) o;

        if (fact != null ? !fact.equals(month.fact) : month.fact != null) return false;
        if (plan != null ? !plan.equals(month.plan) : month.plan != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = plan != null ? plan.hashCode() : 0;
        result = 31 * result + (fact != null ? fact.hashCode() : 0);
        return result;
    }
}
