/*
 * This file is generated by jOOQ.
 */
package ru.tito.jooq.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import ru.tito.jooq.Greygold;
import ru.tito.jooq.Indexes;
import ru.tito.jooq.Keys;
import ru.tito.jooq.tables.records.ActHiVarinstRecord;


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
public class ActHiVarinst extends TableImpl<ActHiVarinstRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>greygold.act_hi_varinst</code>
     */
    public static final ActHiVarinst ACT_HI_VARINST = new ActHiVarinst();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActHiVarinstRecord> getRecordType() {
        return ActHiVarinstRecord.class;
    }

    /**
     * The column <code>greygold.act_hi_varinst.id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> ID_ = createField(DSL.name("id_"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.proc_def_key_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> PROC_DEF_KEY_ = createField(DSL.name("proc_def_key_"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.proc_def_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> PROC_DEF_ID_ = createField(DSL.name("proc_def_id_"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.root_proc_inst_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> ROOT_PROC_INST_ID_ = createField(DSL.name("root_proc_inst_id_"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.proc_inst_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> PROC_INST_ID_ = createField(DSL.name("proc_inst_id_"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.execution_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> EXECUTION_ID_ = createField(DSL.name("execution_id_"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.act_inst_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> ACT_INST_ID_ = createField(DSL.name("act_inst_id_"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.case_def_key_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> CASE_DEF_KEY_ = createField(DSL.name("case_def_key_"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.case_def_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> CASE_DEF_ID_ = createField(DSL.name("case_def_id_"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.case_inst_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> CASE_INST_ID_ = createField(DSL.name("case_inst_id_"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.case_execution_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> CASE_EXECUTION_ID_ = createField(DSL.name("case_execution_id_"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.task_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> TASK_ID_ = createField(DSL.name("task_id_"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.name_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> NAME_ = createField(DSL.name("name_"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.var_type_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> VAR_TYPE_ = createField(DSL.name("var_type_"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.create_time_</code>.
     */
    public final TableField<ActHiVarinstRecord, LocalDateTime> CREATE_TIME_ = createField(DSL.name("create_time_"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.rev_</code>.
     */
    public final TableField<ActHiVarinstRecord, Integer> REV_ = createField(DSL.name("rev_"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>greygold.act_hi_varinst.bytearray_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> BYTEARRAY_ID_ = createField(DSL.name("bytearray_id_"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.double_</code>.
     */
    public final TableField<ActHiVarinstRecord, Double> DOUBLE_ = createField(DSL.name("double_"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>greygold.act_hi_varinst.long_</code>.
     */
    public final TableField<ActHiVarinstRecord, Long> LONG_ = createField(DSL.name("long_"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>greygold.act_hi_varinst.text_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> TEXT_ = createField(DSL.name("text_"), SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.text2_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> TEXT2_ = createField(DSL.name("text2_"), SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.tenant_id_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> TENANT_ID_ = createField(DSL.name("tenant_id_"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.state_</code>.
     */
    public final TableField<ActHiVarinstRecord, String> STATE_ = createField(DSL.name("state_"), SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>greygold.act_hi_varinst.removal_time_</code>.
     */
    public final TableField<ActHiVarinstRecord, LocalDateTime> REMOVAL_TIME_ = createField(DSL.name("removal_time_"), SQLDataType.LOCALDATETIME(6), this, "");

    private ActHiVarinst(Name alias, Table<ActHiVarinstRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActHiVarinst(Name alias, Table<ActHiVarinstRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>greygold.act_hi_varinst</code> table reference
     */
    public ActHiVarinst(String alias) {
        this(DSL.name(alias), ACT_HI_VARINST);
    }

    /**
     * Create an aliased <code>greygold.act_hi_varinst</code> table reference
     */
    public ActHiVarinst(Name alias) {
        this(alias, ACT_HI_VARINST);
    }

    /**
     * Create a <code>greygold.act_hi_varinst</code> table reference
     */
    public ActHiVarinst() {
        this(DSL.name("act_hi_varinst"), null);
    }

    public <O extends Record> ActHiVarinst(Table<O> child, ForeignKey<O, ActHiVarinstRecord> key) {
        super(child, key, ACT_HI_VARINST);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Greygold.GREYGOLD;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.ACT_IDX_HI_CASEVAR_CASE_INST, Indexes.ACT_IDX_HI_PROCVAR_NAME_TYPE, Indexes.ACT_IDX_HI_PROCVAR_PROC_INST, Indexes.ACT_IDX_HI_VAR_INST_PROC_DEF_KEY, Indexes.ACT_IDX_HI_VAR_INST_TENANT_ID, Indexes.ACT_IDX_HI_VAR_PI_NAME_TYPE, Indexes.ACT_IDX_HI_VARINST_ACT_INST_ID, Indexes.ACT_IDX_HI_VARINST_BYTEAR, Indexes.ACT_IDX_HI_VARINST_NAME, Indexes.ACT_IDX_HI_VARINST_RM_TIME, Indexes.ACT_IDX_HI_VARINST_ROOT_PI);
    }

    @Override
    public UniqueKey<ActHiVarinstRecord> getPrimaryKey() {
        return Keys.ACT_HI_VARINST_PKEY;
    }

    @Override
    public ActHiVarinst as(String alias) {
        return new ActHiVarinst(DSL.name(alias), this);
    }

    @Override
    public ActHiVarinst as(Name alias) {
        return new ActHiVarinst(alias, this);
    }

    @Override
    public ActHiVarinst as(Table<?> alias) {
        return new ActHiVarinst(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActHiVarinst rename(String name) {
        return new ActHiVarinst(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActHiVarinst rename(Name name) {
        return new ActHiVarinst(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActHiVarinst rename(Table<?> name) {
        return new ActHiVarinst(name.getQualifiedName(), null);
    }
}
