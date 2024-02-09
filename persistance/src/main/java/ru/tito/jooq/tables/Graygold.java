/*
 * This file is generated by jOOQ.
 */
package ru.tito.jooq.tables;


import java.math.BigDecimal;
import java.util.function.Function;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import ru.tito.jooq.Greygold;
import ru.tito.jooq.tables.records.GraygoldRecord;


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
public class Graygold extends TableImpl<GraygoldRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>greygold.graygold</code>
     */
    public static final Graygold GRAYGOLD = new Graygold();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GraygoldRecord> getRecordType() {
        return GraygoldRecord.class;
    }

    /**
     * The column <code>greygold.graygold.id</code>.
     */
    public final TableField<GraygoldRecord, BigDecimal> ID = createField(DSL.name("id"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>greygold.graygold.version</code>.
     */
    public final TableField<GraygoldRecord, String> VERSION = createField(DSL.name("version"), SQLDataType.VARCHAR, this, "");

    private Graygold(Name alias, Table<GraygoldRecord> aliased) {
        this(alias, aliased, null);
    }

    private Graygold(Name alias, Table<GraygoldRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>greygold.graygold</code> table reference
     */
    public Graygold(String alias) {
        this(DSL.name(alias), GRAYGOLD);
    }

    /**
     * Create an aliased <code>greygold.graygold</code> table reference
     */
    public Graygold(Name alias) {
        this(alias, GRAYGOLD);
    }

    /**
     * Create a <code>greygold.graygold</code> table reference
     */
    public Graygold() {
        this(DSL.name("graygold"), null);
    }

    public <O extends Record> Graygold(Table<O> child, ForeignKey<O, GraygoldRecord> key) {
        super(child, key, GRAYGOLD);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Greygold.GREYGOLD;
    }

    @Override
    public Graygold as(String alias) {
        return new Graygold(DSL.name(alias), this);
    }

    @Override
    public Graygold as(Name alias) {
        return new Graygold(alias, this);
    }

    @Override
    public Graygold as(Table<?> alias) {
        return new Graygold(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Graygold rename(String name) {
        return new Graygold(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Graygold rename(Name name) {
        return new Graygold(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Graygold rename(Table<?> name) {
        return new Graygold(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<BigDecimal, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super BigDecimal, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super BigDecimal, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
