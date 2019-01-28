/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables;


import com.scratch.database.mysql.jv.Indexes;
import com.scratch.database.mysql.jv.JvB2cDev;
import com.scratch.database.mysql.jv.Keys;
import com.scratch.database.mysql.jv.enums.LogLevel;
import com.scratch.database.mysql.jv.tables.records.LogRecord;

import java.sql.Timestamp;
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
public class Log extends TableImpl<LogRecord> {

    private static final long serialVersionUID = 492355370;

    /**
     * The reference instance of <code>jv_b2c_dev.log</code>
     */
    public static final Log LOG = new Log();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LogRecord> getRecordType() {
        return LogRecord.class;
    }

    /**
     * The column <code>jv_b2c_dev.log.id</code>.
     */
    public final TableField<LogRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>jv_b2c_dev.log.created_ts</code>.
     */
    public final TableField<LogRecord, Timestamp> CREATED_TS = createField("created_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jv_b2c_dev.log.level</code>.
     */
    public final TableField<LogRecord, LogLevel> LEVEL = createField("level", org.jooq.impl.SQLDataType.VARCHAR(7).defaultValue(org.jooq.impl.DSL.inline("DEFAULT", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(com.scratch.database.mysql.jv.enums.LogLevel.class), this, "");

    /**
     * The column <code>jv_b2c_dev.log.event</code>.
     */
    public final TableField<LogRecord, String> EVENT = createField("event", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.log.description</code>.
     */
    public final TableField<LogRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>jv_b2c_dev.log.before</code>.
     */
    public final TableField<LogRecord, String> BEFORE = createField("before", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>jv_b2c_dev.log.after</code>.
     */
    public final TableField<LogRecord, String> AFTER = createField("after", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>jv_b2c_dev.log</code> table reference
     */
    public Log() {
        this(DSL.name("log"), null);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.log</code> table reference
     */
    public Log(String alias) {
        this(DSL.name(alias), LOG);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.log</code> table reference
     */
    public Log(Name alias) {
        this(alias, LOG);
    }

    private Log(Name alias, Table<LogRecord> aliased) {
        this(alias, aliased, null);
    }

    private Log(Name alias, Table<LogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Log(Table<O> child, ForeignKey<O, LogRecord> key) {
        super(child, key, LOG);
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
        return Arrays.<Index>asList(Indexes.LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LogRecord, ULong> getIdentity() {
        return Keys.IDENTITY_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LogRecord> getPrimaryKey() {
        return Keys.KEY_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LogRecord>> getKeys() {
        return Arrays.<UniqueKey<LogRecord>>asList(Keys.KEY_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Log as(String alias) {
        return new Log(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Log as(Name alias) {
        return new Log(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Log rename(String name) {
        return new Log(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Log rename(Name name) {
        return new Log(name, null);
    }
}
