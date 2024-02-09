/*
 * This file is generated by jOOQ.
 */
package ru.tito.jooq.tables.records;


import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import ru.tito.jooq.tables.ActRuFilter;


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
public class ActRuFilterRecord extends UpdatableRecordImpl<ActRuFilterRecord> implements Record7<String, Integer, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>greygold.act_ru_filter.id_</code>.
     */
    public void setId_(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>greygold.act_ru_filter.id_</code>.
     */
    public String getId_() {
        return (String) get(0);
    }

    /**
     * Setter for <code>greygold.act_ru_filter.rev_</code>.
     */
    public void setRev_(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>greygold.act_ru_filter.rev_</code>.
     */
    public Integer getRev_() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>greygold.act_ru_filter.resource_type_</code>.
     */
    public void setResourceType_(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>greygold.act_ru_filter.resource_type_</code>.
     */
    public String getResourceType_() {
        return (String) get(2);
    }

    /**
     * Setter for <code>greygold.act_ru_filter.name_</code>.
     */
    public void setName_(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>greygold.act_ru_filter.name_</code>.
     */
    public String getName_() {
        return (String) get(3);
    }

    /**
     * Setter for <code>greygold.act_ru_filter.owner_</code>.
     */
    public void setOwner_(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>greygold.act_ru_filter.owner_</code>.
     */
    public String getOwner_() {
        return (String) get(4);
    }

    /**
     * Setter for <code>greygold.act_ru_filter.query_</code>.
     */
    public void setQuery_(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>greygold.act_ru_filter.query_</code>.
     */
    public String getQuery_() {
        return (String) get(5);
    }

    /**
     * Setter for <code>greygold.act_ru_filter.properties_</code>.
     */
    public void setProperties_(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>greygold.act_ru_filter.properties_</code>.
     */
    public String getProperties_() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, Integer, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, Integer, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ActRuFilter.ACT_RU_FILTER.ID_;
    }

    @Override
    public Field<Integer> field2() {
        return ActRuFilter.ACT_RU_FILTER.REV_;
    }

    @Override
    public Field<String> field3() {
        return ActRuFilter.ACT_RU_FILTER.RESOURCE_TYPE_;
    }

    @Override
    public Field<String> field4() {
        return ActRuFilter.ACT_RU_FILTER.NAME_;
    }

    @Override
    public Field<String> field5() {
        return ActRuFilter.ACT_RU_FILTER.OWNER_;
    }

    @Override
    public Field<String> field6() {
        return ActRuFilter.ACT_RU_FILTER.QUERY_;
    }

    @Override
    public Field<String> field7() {
        return ActRuFilter.ACT_RU_FILTER.PROPERTIES_;
    }

    @Override
    public String component1() {
        return getId_();
    }

    @Override
    public Integer component2() {
        return getRev_();
    }

    @Override
    public String component3() {
        return getResourceType_();
    }

    @Override
    public String component4() {
        return getName_();
    }

    @Override
    public String component5() {
        return getOwner_();
    }

    @Override
    public String component6() {
        return getQuery_();
    }

    @Override
    public String component7() {
        return getProperties_();
    }

    @Override
    public String value1() {
        return getId_();
    }

    @Override
    public Integer value2() {
        return getRev_();
    }

    @Override
    public String value3() {
        return getResourceType_();
    }

    @Override
    public String value4() {
        return getName_();
    }

    @Override
    public String value5() {
        return getOwner_();
    }

    @Override
    public String value6() {
        return getQuery_();
    }

    @Override
    public String value7() {
        return getProperties_();
    }

    @Override
    public ActRuFilterRecord value1(String value) {
        setId_(value);
        return this;
    }

    @Override
    public ActRuFilterRecord value2(Integer value) {
        setRev_(value);
        return this;
    }

    @Override
    public ActRuFilterRecord value3(String value) {
        setResourceType_(value);
        return this;
    }

    @Override
    public ActRuFilterRecord value4(String value) {
        setName_(value);
        return this;
    }

    @Override
    public ActRuFilterRecord value5(String value) {
        setOwner_(value);
        return this;
    }

    @Override
    public ActRuFilterRecord value6(String value) {
        setQuery_(value);
        return this;
    }

    @Override
    public ActRuFilterRecord value7(String value) {
        setProperties_(value);
        return this;
    }

    @Override
    public ActRuFilterRecord values(String value1, Integer value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActRuFilterRecord
     */
    public ActRuFilterRecord() {
        super(ActRuFilter.ACT_RU_FILTER);
    }

    /**
     * Create a detached, initialised ActRuFilterRecord
     */
    public ActRuFilterRecord(String id_, Integer rev_, String resourceType_, String name_, String owner_, String query_, String properties_) {
        super(ActRuFilter.ACT_RU_FILTER);

        setId_(id_);
        setRev_(rev_);
        setResourceType_(resourceType_);
        setName_(name_);
        setOwner_(owner_);
        setQuery_(query_);
        setProperties_(properties_);
        resetChangedOnNotNull();
    }
}
