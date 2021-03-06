/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables;


import com.scratch.database.mysql.jv.Indexes;
import com.scratch.database.mysql.jv.JvB2cDev;
import com.scratch.database.mysql.jv.Keys;
import com.scratch.database.mysql.jv.enums.ContentStatus;
import com.scratch.database.mysql.jv.tables.records.ContentRecord;

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
public class Content extends TableImpl<ContentRecord> {

    private static final long serialVersionUID = 754242287;

    /**
     * The reference instance of <code>jv_b2c_dev.content</code>
     */
    public static final Content CONTENT = new Content();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContentRecord> getRecordType() {
        return ContentRecord.class;
    }

    /**
     * The column <code>jv_b2c_dev.content.id</code>.
     */
    public final TableField<ContentRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>jv_b2c_dev.content.parent_id</code>.
     */
    public final TableField<ContentRecord, ULong> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>jv_b2c_dev.content.status</code>.
     */
    public final TableField<ContentRecord, ContentStatus> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR(9).asEnumDataType(com.scratch.database.mysql.jv.enums.ContentStatus.class), this, "");

    /**
     * The column <code>jv_b2c_dev.content.title</code>.
     */
    public final TableField<ContentRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>jv_b2c_dev.content.url</code>.
     */
    public final TableField<ContentRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>jv_b2c_dev.content.content</code>.
     */
    public final TableField<ContentRecord, String> CONTENT_ = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>jv_b2c_dev.content.updated_ts</code>.
     */
    public final TableField<ContentRecord, Timestamp> UPDATED_TS = createField("updated_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>jv_b2c_dev.content.created_ts</code>.
     */
    public final TableField<ContentRecord, Timestamp> CREATED_TS = createField("created_ts", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>jv_b2c_dev.content</code> table reference
     */
    public Content() {
        this(DSL.name("content"), null);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.content</code> table reference
     */
    public Content(String alias) {
        this(DSL.name(alias), CONTENT);
    }

    /**
     * Create an aliased <code>jv_b2c_dev.content</code> table reference
     */
    public Content(Name alias) {
        this(alias, CONTENT);
    }

    private Content(Name alias, Table<ContentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Content(Name alias, Table<ContentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Content(Table<O> child, ForeignKey<O, ContentRecord> key) {
        super(child, key, CONTENT);
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
        return Arrays.<Index>asList(Indexes.CONTENT_PRIMARY, Indexes.CONTENT_URL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ContentRecord, ULong> getIdentity() {
        return Keys.IDENTITY_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContentRecord> getPrimaryKey() {
        return Keys.KEY_CONTENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContentRecord>> getKeys() {
        return Arrays.<UniqueKey<ContentRecord>>asList(Keys.KEY_CONTENT_PRIMARY, Keys.KEY_CONTENT_URL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Content as(String alias) {
        return new Content(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Content as(Name alias) {
        return new Content(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Content rename(String name) {
        return new Content(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Content rename(Name name) {
        return new Content(name, null);
    }
}
