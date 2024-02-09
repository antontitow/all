/*
 * This file is generated by jOOQ.
 */
package ru.tito.jooq.tables.records;


import java.math.BigDecimal;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;

import ru.tito.jooq.tables.Demo2;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Demo2Record extends TableRecordImpl<Demo2Record> implements Record3<Integer, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>greygold.demo2.id_</code>.
     */
    public void setId_(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>greygold.demo2.id_</code>.
     */
    public Integer getId_() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>greygold.demo2.cost_</code>.
     */
    public void setCost_(BigDecimal value) {
        set(1, value);
    }

    /**
     * Getter for <code>greygold.demo2.cost_</code>.
     */
    public BigDecimal getCost_() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>greygold.demo2.in_</code>.
     */
    public void setIn_(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>greygold.demo2.in_</code>.
     */
    public BigDecimal getIn_() {
        return (BigDecimal) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, BigDecimal, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, BigDecimal, BigDecimal> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Demo2.DEMO2.ID_;
    }

    @Override
    public Field<BigDecimal> field2() {
        return Demo2.DEMO2.COST_;
    }

    @Override
    public Field<BigDecimal> field3() {
        return Demo2.DEMO2.IN_;
    }

    @Override
    public Integer component1() {
        return getId_();
    }

    @Override
    public BigDecimal component2() {
        return getCost_();
    }

    @Override
    public BigDecimal component3() {
        return getIn_();
    }

    @Override
    public Integer value1() {
        return getId_();
    }

    @Override
    public BigDecimal value2() {
        return getCost_();
    }

    @Override
    public BigDecimal value3() {
        return getIn_();
    }

    @Override
    public Demo2Record value1(Integer value) {
        setId_(value);
        return this;
    }

    @Override
    public Demo2Record value2(BigDecimal value) {
        setCost_(value);
        return this;
    }

    @Override
    public Demo2Record value3(BigDecimal value) {
        setIn_(value);
        return this;
    }

    @Override
    public Demo2Record values(Integer value1, BigDecimal value2, BigDecimal value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached Demo2Record
     */
    public Demo2Record() {
        super(Demo2.DEMO2);
    }

    /**
     * Create a detached, initialised Demo2Record
     */
    public Demo2Record(Integer id_, BigDecimal cost_, BigDecimal in_) {
        super(Demo2.DEMO2);

        setId_(id_);
        setCost_(cost_);
        setIn_(in_);
        resetChangedOnNotNull();
    }
}
