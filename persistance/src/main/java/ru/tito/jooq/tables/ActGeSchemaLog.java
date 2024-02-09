/*
 * This file is generated by jOOQ.
 */
package ru.tito.jooq.tables;


import java.time.LocalDateTime;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import ru.tito.jooq.Greygold;
import ru.tito.jooq.Keys;
import ru.tito.jooq.tables.records.ActGeSchemaLogRecord;


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
public class ActGeSchemaLog extends TableImpl<ActGeSchemaLogRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>greygold.act_ge_schema_log</code>
     */
    public static final ActGeSchemaLog ACT_GE_SCHEMA_LOG = new ActGeSchemaLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActGeSchemaLogRecord> getRecordType() {
        return ActGeSchemaLogRecord.class;
    }

    /**
     * The column <code>greygold.act_ge_schema_log.id_</code>.
     */
    public final TableField<ActGeSchemaLogRecord, String> ID_ = createField(DSL.name("id_"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>greygold.act_ge_schema_log.timestamp_</code>.
     */
    public final TableField<ActGeSchemaLogRecord, LocalDateTime> TIMESTAMP_ = createField(DSL.name("timestamp_"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>greygold.act_ge_schema_log.version_</code>.
     */
    public final TableField<ActGeSchemaLogRecord, String> VERSION_ = createField(DSL.name("version_"), SQLDataType.VARCHAR(255), this, "");

    private ActGeSchemaLog(Name alias, Table<ActGeSchemaLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActGeSchemaLog(Name alias, Table<ActGeSchemaLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>greygold.act_ge_schema_log</code> table reference
     */
    public ActGeSchemaLog(String alias) {
        this(DSL.name(alias), ACT_GE_SCHEMA_LOG);
    }

    /**
     * Create an aliased <code>greygold.act_ge_schema_log</code> table reference
     */
    public ActGeSchemaLog(Name alias) {
        this(alias, ACT_GE_SCHEMA_LOG);
    }

    /**
     * Create a <code>greygold.act_ge_schema_log</code> table reference
     */
    public ActGeSchemaLog() {
        this(DSL.name("act_ge_schema_log"), null);
    }

    public <O extends Record> ActGeSchemaLog(Table<O> child, ForeignKey<O, ActGeSchemaLogRecord> key) {
        super(child, key, ACT_GE_SCHEMA_LOG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Greygold.GREYGOLD;
    }

    @Override
    public UniqueKey<ActGeSchemaLogRecord> getPrimaryKey() {
        return Keys.ACT_GE_SCHEMA_LOG_PKEY;
    }

    @Override
    public ActGeSchemaLog as(String alias) {
        return new ActGeSchemaLog(DSL.name(alias), this);
    }

    @Override
    public ActGeSchemaLog as(Name alias) {
        return new ActGeSchemaLog(alias, this);
    }

    @Override
    public ActGeSchemaLog as(Table<?> alias) {
        return new ActGeSchemaLog(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActGeSchemaLog rename(String name) {
        return new ActGeSchemaLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActGeSchemaLog rename(Name name) {
        return new ActGeSchemaLog(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActGeSchemaLog rename(Table<?> name) {
        return new ActGeSchemaLog(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, LocalDateTime, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
