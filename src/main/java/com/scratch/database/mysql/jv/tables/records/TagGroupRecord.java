/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.records;


import com.scratch.database.mysql.jv.enums.TagGroupConstants;
import com.scratch.database.mysql.jv.tables.TagGroup;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class TagGroupRecord extends UpdatableRecordImpl<TagGroupRecord> implements Record8<ULong, String, String, Byte, Byte, Timestamp, Timestamp, TagGroupConstants> {

    private static final long serialVersionUID = 149530812;

    /**
     * Setter for <code>jv_b2c_dev.tag_group.id</code>.
     */
    public TagGroupRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.tag_group.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>jv_b2c_dev.tag_group.section</code>.
     */
    public TagGroupRecord setSection(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.tag_group.section</code>.
     */
    public String getSection() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jv_b2c_dev.tag_group.name</code>.
     */
    public TagGroupRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.tag_group.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jv_b2c_dev.tag_group.is_filter</code>.
     */
    public TagGroupRecord setIsFilter(Byte value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.tag_group.is_filter</code>.
     */
    public Byte getIsFilter() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>jv_b2c_dev.tag_group.isRelatable</code>.
     */
    public TagGroupRecord setIsrelatable(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.tag_group.isRelatable</code>.
     */
    public Byte getIsrelatable() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>jv_b2c_dev.tag_group.updated_ts</code>.
     */
    public TagGroupRecord setUpdatedTs(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.tag_group.updated_ts</code>.
     */
    public Timestamp getUpdatedTs() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>jv_b2c_dev.tag_group.created_ts</code>.
     */
    public TagGroupRecord setCreatedTs(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.tag_group.created_ts</code>.
     */
    public Timestamp getCreatedTs() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>jv_b2c_dev.tag_group.constants</code>.
     */
    public TagGroupRecord setConstants(TagGroupConstants value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.tag_group.constants</code>.
     */
    public TagGroupConstants getConstants() {
        return (TagGroupConstants) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, String, String, Byte, Byte, Timestamp, Timestamp, TagGroupConstants> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, String, String, Byte, Byte, Timestamp, Timestamp, TagGroupConstants> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TagGroup.TAG_GROUP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TagGroup.TAG_GROUP.SECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TagGroup.TAG_GROUP.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TagGroup.TAG_GROUP.IS_FILTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TagGroup.TAG_GROUP.ISRELATABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TagGroup.TAG_GROUP.UPDATED_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TagGroup.TAG_GROUP.CREATED_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<TagGroupConstants> field8() {
        return TagGroup.TAG_GROUP.CONSTANTS;
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
        return getSection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getIsFilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getIsrelatable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getUpdatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagGroupConstants component8() {
        return getConstants();
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
        return getSection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getIsFilter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsrelatable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagGroupConstants value8() {
        return getConstants();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagGroupRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagGroupRecord value2(String value) {
        setSection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagGroupRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagGroupRecord value4(Byte value) {
        setIsFilter(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagGroupRecord value5(Byte value) {
        setIsrelatable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagGroupRecord value6(Timestamp value) {
        setUpdatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagGroupRecord value7(Timestamp value) {
        setCreatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagGroupRecord value8(TagGroupConstants value) {
        setConstants(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TagGroupRecord values(ULong value1, String value2, String value3, Byte value4, Byte value5, Timestamp value6, Timestamp value7, TagGroupConstants value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TagGroupRecord
     */
    public TagGroupRecord() {
        super(TagGroup.TAG_GROUP);
    }

    /**
     * Create a detached, initialised TagGroupRecord
     */
    public TagGroupRecord(ULong id, String section, String name, Byte isFilter, Byte isrelatable, Timestamp updatedTs, Timestamp createdTs, TagGroupConstants constants) {
        super(TagGroup.TAG_GROUP);

        set(0, id);
        set(1, section);
        set(2, name);
        set(3, isFilter);
        set(4, isrelatable);
        set(5, updatedTs);
        set(6, createdTs);
        set(7, constants);
    }
}
