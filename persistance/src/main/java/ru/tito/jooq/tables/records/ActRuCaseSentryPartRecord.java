/*
 * This file is generated by jOOQ.
 */
package ru.tito.jooq.tables.records;


import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import ru.tito.jooq.tables.ActRuCaseSentryPart;


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
public class ActRuCaseSentryPartRecord extends UpdatableRecordImpl<ActRuCaseSentryPartRecord> implements Record13<String, Integer, String, String, String, String, String, String, String, String, String, Boolean, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>greygold.act_ru_case_sentry_part.id_</code>.
     */
    public void setId_(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>greygold.act_ru_case_sentry_part.id_</code>.
     */
    public String getId_() {
        return (String) get(0);
    }

    /**
     * Setter for <code>greygold.act_ru_case_sentry_part.rev_</code>.
     */
    public void setRev_(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>greygold.act_ru_case_sentry_part.rev_</code>.
     */
    public Integer getRev_() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>greygold.act_ru_case_sentry_part.case_inst_id_</code>.
     */
    public void setCaseInstId_(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>greygold.act_ru_case_sentry_part.case_inst_id_</code>.
     */
    public String getCaseInstId_() {
        return (String) get(2);
    }

    /**
     * Setter for <code>greygold.act_ru_case_sentry_part.case_exec_id_</code>.
     */
    public void setCaseExecId_(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>greygold.act_ru_case_sentry_part.case_exec_id_</code>.
     */
    public String getCaseExecId_() {
        return (String) get(3);
    }

    /**
     * Setter for <code>greygold.act_ru_case_sentry_part.sentry_id_</code>.
     */
    public void setSentryId_(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>greygold.act_ru_case_sentry_part.sentry_id_</code>.
     */
    public String getSentryId_() {
        return (String) get(4);
    }

    /**
     * Setter for <code>greygold.act_ru_case_sentry_part.type_</code>.
     */
    public void setType_(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>greygold.act_ru_case_sentry_part.type_</code>.
     */
    public String getType_() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>greygold.act_ru_case_sentry_part.source_case_exec_id_</code>.
     */
    public void setSourceCaseExecId_(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>greygold.act_ru_case_sentry_part.source_case_exec_id_</code>.
     */
    public String getSourceCaseExecId_() {
        return (String) get(6);
    }

    /**
     * Setter for <code>greygold.act_ru_case_sentry_part.standard_event_</code>.
     */
    public void setStandardEvent_(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>greygold.act_ru_case_sentry_part.standard_event_</code>.
     */
    public String getStandardEvent_() {
        return (String) get(7);
    }

    /**
     * Setter for <code>greygold.act_ru_case_sentry_part.source_</code>.
     */
    public void setSource_(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>greygold.act_ru_case_sentry_part.source_</code>.
     */
    public String getSource_() {
        return (String) get(8);
    }

    /**
     * Setter for <code>greygold.act_ru_case_sentry_part.variable_event_</code>.
     */
    public void setVariableEvent_(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>greygold.act_ru_case_sentry_part.variable_event_</code>.
     */
    public String getVariableEvent_() {
        return (String) get(9);
    }

    /**
     * Setter for <code>greygold.act_ru_case_sentry_part.variable_name_</code>.
     */
    public void setVariableName_(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>greygold.act_ru_case_sentry_part.variable_name_</code>.
     */
    public String getVariableName_() {
        return (String) get(10);
    }

    /**
     * Setter for <code>greygold.act_ru_case_sentry_part.satisfied_</code>.
     */
    public void setSatisfied_(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>greygold.act_ru_case_sentry_part.satisfied_</code>.
     */
    public Boolean getSatisfied_() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>greygold.act_ru_case_sentry_part.tenant_id_</code>.
     */
    public void setTenantId_(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>greygold.act_ru_case_sentry_part.tenant_id_</code>.
     */
    public String getTenantId_() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<String, Integer, String, String, String, String, String, String, String, String, String, Boolean, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<String, Integer, String, String, String, String, String, String, String, String, String, Boolean, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART.ID_;
    }

    @Override
    public Field<Integer> field2() {
        return ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART.REV_;
    }

    @Override
    public Field<String> field3() {
        return ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART.CASE_INST_ID_;
    }

    @Override
    public Field<String> field4() {
        return ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART.CASE_EXEC_ID_;
    }

    @Override
    public Field<String> field5() {
        return ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART.SENTRY_ID_;
    }

    @Override
    public Field<String> field6() {
        return ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART.TYPE_;
    }

    @Override
    public Field<String> field7() {
        return ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART.SOURCE_CASE_EXEC_ID_;
    }

    @Override
    public Field<String> field8() {
        return ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART.STANDARD_EVENT_;
    }

    @Override
    public Field<String> field9() {
        return ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART.SOURCE_;
    }

    @Override
    public Field<String> field10() {
        return ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART.VARIABLE_EVENT_;
    }

    @Override
    public Field<String> field11() {
        return ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART.VARIABLE_NAME_;
    }

    @Override
    public Field<Boolean> field12() {
        return ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART.SATISFIED_;
    }

    @Override
    public Field<String> field13() {
        return ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART.TENANT_ID_;
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
        return getCaseInstId_();
    }

    @Override
    public String component4() {
        return getCaseExecId_();
    }

    @Override
    public String component5() {
        return getSentryId_();
    }

    @Override
    public String component6() {
        return getType_();
    }

    @Override
    public String component7() {
        return getSourceCaseExecId_();
    }

    @Override
    public String component8() {
        return getStandardEvent_();
    }

    @Override
    public String component9() {
        return getSource_();
    }

    @Override
    public String component10() {
        return getVariableEvent_();
    }

    @Override
    public String component11() {
        return getVariableName_();
    }

    @Override
    public Boolean component12() {
        return getSatisfied_();
    }

    @Override
    public String component13() {
        return getTenantId_();
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
        return getCaseInstId_();
    }

    @Override
    public String value4() {
        return getCaseExecId_();
    }

    @Override
    public String value5() {
        return getSentryId_();
    }

    @Override
    public String value6() {
        return getType_();
    }

    @Override
    public String value7() {
        return getSourceCaseExecId_();
    }

    @Override
    public String value8() {
        return getStandardEvent_();
    }

    @Override
    public String value9() {
        return getSource_();
    }

    @Override
    public String value10() {
        return getVariableEvent_();
    }

    @Override
    public String value11() {
        return getVariableName_();
    }

    @Override
    public Boolean value12() {
        return getSatisfied_();
    }

    @Override
    public String value13() {
        return getTenantId_();
    }

    @Override
    public ActRuCaseSentryPartRecord value1(String value) {
        setId_(value);
        return this;
    }

    @Override
    public ActRuCaseSentryPartRecord value2(Integer value) {
        setRev_(value);
        return this;
    }

    @Override
    public ActRuCaseSentryPartRecord value3(String value) {
        setCaseInstId_(value);
        return this;
    }

    @Override
    public ActRuCaseSentryPartRecord value4(String value) {
        setCaseExecId_(value);
        return this;
    }

    @Override
    public ActRuCaseSentryPartRecord value5(String value) {
        setSentryId_(value);
        return this;
    }

    @Override
    public ActRuCaseSentryPartRecord value6(String value) {
        setType_(value);
        return this;
    }

    @Override
    public ActRuCaseSentryPartRecord value7(String value) {
        setSourceCaseExecId_(value);
        return this;
    }

    @Override
    public ActRuCaseSentryPartRecord value8(String value) {
        setStandardEvent_(value);
        return this;
    }

    @Override
    public ActRuCaseSentryPartRecord value9(String value) {
        setSource_(value);
        return this;
    }

    @Override
    public ActRuCaseSentryPartRecord value10(String value) {
        setVariableEvent_(value);
        return this;
    }

    @Override
    public ActRuCaseSentryPartRecord value11(String value) {
        setVariableName_(value);
        return this;
    }

    @Override
    public ActRuCaseSentryPartRecord value12(Boolean value) {
        setSatisfied_(value);
        return this;
    }

    @Override
    public ActRuCaseSentryPartRecord value13(String value) {
        setTenantId_(value);
        return this;
    }

    @Override
    public ActRuCaseSentryPartRecord values(String value1, Integer value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Boolean value12, String value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActRuCaseSentryPartRecord
     */
    public ActRuCaseSentryPartRecord() {
        super(ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART);
    }

    /**
     * Create a detached, initialised ActRuCaseSentryPartRecord
     */
    public ActRuCaseSentryPartRecord(String id_, Integer rev_, String caseInstId_, String caseExecId_, String sentryId_, String type_, String sourceCaseExecId_, String standardEvent_, String source_, String variableEvent_, String variableName_, Boolean satisfied_, String tenantId_) {
        super(ActRuCaseSentryPart.ACT_RU_CASE_SENTRY_PART);

        setId_(id_);
        setRev_(rev_);
        setCaseInstId_(caseInstId_);
        setCaseExecId_(caseExecId_);
        setSentryId_(sentryId_);
        setType_(type_);
        setSourceCaseExecId_(sourceCaseExecId_);
        setStandardEvent_(standardEvent_);
        setSource_(source_);
        setVariableEvent_(variableEvent_);
        setVariableName_(variableName_);
        setSatisfied_(satisfied_);
        setTenantId_(tenantId_);
        resetChangedOnNotNull();
    }
}
