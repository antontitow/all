/*
 * This file is generated by jOOQ.
 */
package ru.tito.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import ru.tito.jooq.tables.ActReDeployment;


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
public class ActReDeploymentRecord extends UpdatableRecordImpl<ActReDeploymentRecord> implements Record5<String, String, LocalDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>greygold.act_re_deployment.id_</code>.
     */
    public void setId_(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>greygold.act_re_deployment.id_</code>.
     */
    public String getId_() {
        return (String) get(0);
    }

    /**
     * Setter for <code>greygold.act_re_deployment.name_</code>.
     */
    public void setName_(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>greygold.act_re_deployment.name_</code>.
     */
    public String getName_() {
        return (String) get(1);
    }

    /**
     * Setter for <code>greygold.act_re_deployment.deploy_time_</code>.
     */
    public void setDeployTime_(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>greygold.act_re_deployment.deploy_time_</code>.
     */
    public LocalDateTime getDeployTime_() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>greygold.act_re_deployment.source_</code>.
     */
    public void setSource_(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>greygold.act_re_deployment.source_</code>.
     */
    public String getSource_() {
        return (String) get(3);
    }

    /**
     * Setter for <code>greygold.act_re_deployment.tenant_id_</code>.
     */
    public void setTenantId_(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>greygold.act_re_deployment.tenant_id_</code>.
     */
    public String getTenantId_() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, LocalDateTime, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, LocalDateTime, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ActReDeployment.ACT_RE_DEPLOYMENT.ID_;
    }

    @Override
    public Field<String> field2() {
        return ActReDeployment.ACT_RE_DEPLOYMENT.NAME_;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return ActReDeployment.ACT_RE_DEPLOYMENT.DEPLOY_TIME_;
    }

    @Override
    public Field<String> field4() {
        return ActReDeployment.ACT_RE_DEPLOYMENT.SOURCE_;
    }

    @Override
    public Field<String> field5() {
        return ActReDeployment.ACT_RE_DEPLOYMENT.TENANT_ID_;
    }

    @Override
    public String component1() {
        return getId_();
    }

    @Override
    public String component2() {
        return getName_();
    }

    @Override
    public LocalDateTime component3() {
        return getDeployTime_();
    }

    @Override
    public String component4() {
        return getSource_();
    }

    @Override
    public String component5() {
        return getTenantId_();
    }

    @Override
    public String value1() {
        return getId_();
    }

    @Override
    public String value2() {
        return getName_();
    }

    @Override
    public LocalDateTime value3() {
        return getDeployTime_();
    }

    @Override
    public String value4() {
        return getSource_();
    }

    @Override
    public String value5() {
        return getTenantId_();
    }

    @Override
    public ActReDeploymentRecord value1(String value) {
        setId_(value);
        return this;
    }

    @Override
    public ActReDeploymentRecord value2(String value) {
        setName_(value);
        return this;
    }

    @Override
    public ActReDeploymentRecord value3(LocalDateTime value) {
        setDeployTime_(value);
        return this;
    }

    @Override
    public ActReDeploymentRecord value4(String value) {
        setSource_(value);
        return this;
    }

    @Override
    public ActReDeploymentRecord value5(String value) {
        setTenantId_(value);
        return this;
    }

    @Override
    public ActReDeploymentRecord values(String value1, String value2, LocalDateTime value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActReDeploymentRecord
     */
    public ActReDeploymentRecord() {
        super(ActReDeployment.ACT_RE_DEPLOYMENT);
    }

    /**
     * Create a detached, initialised ActReDeploymentRecord
     */
    public ActReDeploymentRecord(String id_, String name_, LocalDateTime deployTime_, String source_, String tenantId_) {
        super(ActReDeployment.ACT_RE_DEPLOYMENT);

        setId_(id_);
        setName_(name_);
        setDeployTime_(deployTime_);
        setSource_(source_);
        setTenantId_(tenantId_);
        resetChangedOnNotNull();
    }
}
