/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables;


import com.scratch.database.mysql.jv.Indexes;
import com.scratch.database.mysql.jv.JvB2cDev;
import com.scratch.database.mysql.jv.Keys;
import com.scratch.database.mysql.jv.tables.records.CodeTypeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class CodeType extends TableImpl<CodeTypeRecord> {

    private static final long serialVersionUID = 1430991228;

    /**
     * The reference instance of <code>jv_b2c_dev.code_type</code>
     */
    public static final CodeType CODE_TYPE = new CodeType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CodeTypeRecord> getRecordType() {
        return CodeTypeRecord.class;
    }

    /**
     * The column <code>jv_b2c_dev.code_type.id</code>.
     */
    public final TableField<CodeTypeRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>jv_b2c_dev.code_type.type</code>.
     */
    public final TableField<CodeTypeRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>jv_b2c_dev.code_type.description</code>.
     */
    public final TableField<CodeTypeRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>jv_b2c_dev.code_type</code> table reference
     */
    public CodeType() {
        this(DSL.name("code_type"), null);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.code_type</code> table reference
     */
    public CodeType(String alias) {
        this(DSL.name(alias), CODE_TYPE);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.code_type</code> table reference
     */
    public CodeType(Name alias) {
        this(alias, CODE_TYPE);
    }

    private CodeType(Name alias, Table<CodeTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private CodeType(Name alias, Table<CodeTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CodeType(Table<O> child, ForeignKey<O, CodeTypeRecord> key) {
        super(child, key, CODE_TYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return JvB2cDev.JV_B2C_DEV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CODE_TYPE_PRIMARY, Indexes.CODE_TYPE_TYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CodeTypeRecord, Long> getIdentity() {
        return Keys.IDENTITY_CODE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CodeTypeRecord> getPrimaryKey() {
        return Keys.KEY_CODE_TYPE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CodeTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<CodeTypeRecord>>asList(Keys.KEY_CODE_TYPE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeType as(String alias) {
        return new CodeType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CodeType as(Name alias) {
        return new CodeType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CodeType rename(String name) {
        return new CodeType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CodeType rename(Name name) {
        return new CodeType(name, null);
    }
}