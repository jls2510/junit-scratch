/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.records;


import com.scratch.database.mysql.jv.tables.Admin;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminRecord extends UpdatableRecordImpl<AdminRecord> implements Record5<ULong, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -2028805126;

    /**
     * Setter for <code>jv_b2c_dev.admin.id</code>.
     */
    public AdminRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.admin.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>jv_b2c_dev.admin.username</code>.
     */
    public AdminRecord setUsername(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.admin.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jv_b2c_dev.admin.password</code>.
     */
    public AdminRecord setPassword(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.admin.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jv_b2c_dev.admin.updated_ts</code>.
     */
    public AdminRecord setUpdatedTs(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.admin.updated_ts</code>.
     */
    public Timestamp getUpdatedTs() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>jv_b2c_dev.admin.created_ts</code>.
     */
    public AdminRecord setCreatedTs(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.admin.created_ts</code>.
     */
    public Timestamp getCreatedTs() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<ULong, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<ULong, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return Admin.ADMIN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Admin.ADMIN.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Admin.ADMIN.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Admin.ADMIN.UPDATED_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Admin.ADMIN.CREATED_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getUpdatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord value4(Timestamp value) {
        setUpdatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord value5(Timestamp value) {
        setCreatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AdminRecord values(ULong value1, String value2, String value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached AdminRecord
     */
    public AdminRecord() {
        super(Admin.ADMIN);
    }

    /**
     * Create a detached, initialised AdminRecord
     */
    public AdminRecord(ULong id, String username, String password, Timestamp updatedTs, Timestamp createdTs) {
        super(Admin.ADMIN);

        set(0, id);
        set(1, username);
        set(2, password);
        set(3, updatedTs);
        set(4, createdTs);
    }
}
