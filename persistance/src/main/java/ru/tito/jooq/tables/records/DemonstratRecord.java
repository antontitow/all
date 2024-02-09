/*
 * This file is generated by jOOQ.
 */
package ru.tito.jooq.tables.records;


import java.util.UUID;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import ru.tito.jooq.tables.Demonstrat;


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
public class DemonstratRecord extends TableRecordImpl<DemonstratRecord> implements Record2<UUID, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>greygold.demonstrat.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>greygold.demonstrat.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>greygold.demonstrat.status</code>.
     */
    public void setStatus(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>greygold.demonstrat.status</code>.
     */
    public String getStatus() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<UUID, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<UUID, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Demonstrat.DEMONSTRAT.ID;
    }

    @Override
    public Field<String> field2() {
        return Demonstrat.DEMONSTRAT.STATUS;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getStatus();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getStatus();
    }

    @Override
    public DemonstratRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public DemonstratRecord value2(String value) {
        setStatus(value);
        return this;
    }

    @Override
    public DemonstratRecord values(UUID value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DemonstratRecord
     */
    public DemonstratRecord() {
        super(Demonstrat.DEMONSTRAT);
    }

    /**
     * Create a detached, initialised DemonstratRecord
     */
    public DemonstratRecord(UUID id, String status) {
        super(Demonstrat.DEMONSTRAT);

        setId(id);
        setStatus(status);
        resetChangedOnNotNull();
    }
}
