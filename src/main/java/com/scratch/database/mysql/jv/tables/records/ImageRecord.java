/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.records;


import com.scratch.database.mysql.jv.enums.ImageType;
import com.scratch.database.mysql.jv.tables.Image;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class ImageRecord extends UpdatableRecordImpl<ImageRecord> implements Record11<ULong, ImageType, String, String, Byte, String, String, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -2144538500;

    /**
     * Setter for <code>jv_b2c_dev.image.id</code>.
     */
    public ImageRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.image.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>jv_b2c_dev.image.type</code>.
     */
    public ImageRecord setType(ImageType value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.image.type</code>.
     */
    public ImageType getType() {
        return (ImageType) get(1);
    }

    /**
     * Setter for <code>jv_b2c_dev.image.related_id</code>.
     */
    public ImageRecord setRelatedId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.image.related_id</code>.
     */
    public String getRelatedId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jv_b2c_dev.image.filename</code>.
     */
    public ImageRecord setFilename(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.image.filename</code>.
     */
    public String getFilename() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jv_b2c_dev.image.is_primary</code>.
     */
    public ImageRecord setIsPrimary(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.image.is_primary</code>.
     */
    public Byte getIsPrimary() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>jv_b2c_dev.image.title</code>.
     */
    public ImageRecord setTitle(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.image.title</code>.
     */
    public String getTitle() {
        return (String) get(5);
    }

    /**
     * Setter for <code>jv_b2c_dev.image.alt</code>.
     */
    public ImageRecord setAlt(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.image.alt</code>.
     */
    public String getAlt() {
        return (String) get(6);
    }

    /**
     * Setter for <code>jv_b2c_dev.image.sequence_number</code>.
     */
    public ImageRecord setSequenceNumber(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.image.sequence_number</code>.
     */
    public Integer getSequenceNumber() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>jv_b2c_dev.image.is_video</code>.
     */
    public ImageRecord setIsVideo(Byte value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.image.is_video</code>.
     */
    public Byte getIsVideo() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>jv_b2c_dev.image.updated_ts</code>.
     */
    public ImageRecord setUpdatedTs(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.image.updated_ts</code>.
     */
    public Timestamp getUpdatedTs() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>jv_b2c_dev.image.created_ts</code>.
     */
    public ImageRecord setCreatedTs(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.image.created_ts</code>.
     */
    public Timestamp getCreatedTs() {
        return (Timestamp) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<ULong, ImageType, String, String, Byte, String, String, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<ULong, ImageType, String, String, Byte, String, String, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return Image.IMAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ImageType> field2() {
        return Image.IMAGE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Image.IMAGE.RELATED_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Image.IMAGE.FILENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return Image.IMAGE.IS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Image.IMAGE.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Image.IMAGE.ALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Image.IMAGE.SEQUENCE_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return Image.IMAGE.IS_VIDEO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Image.IMAGE.UPDATED_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Image.IMAGE.CREATED_TS;
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
    public ImageType component2() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getRelatedId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getFilename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getIsPrimary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAlt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getSequenceNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component9() {
        return getIsVideo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getUpdatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
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
    public ImageType value2() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getRelatedId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFilename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsPrimary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAlt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getSequenceNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getIsVideo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord value2(ImageType value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord value3(String value) {
        setRelatedId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord value4(String value) {
        setFilename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord value5(Byte value) {
        setIsPrimary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord value6(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord value7(String value) {
        setAlt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord value8(Integer value) {
        setSequenceNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord value9(Byte value) {
        setIsVideo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord value10(Timestamp value) {
        setUpdatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord value11(Timestamp value) {
        setCreatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageRecord values(ULong value1, ImageType value2, String value3, String value4, Byte value5, String value6, String value7, Integer value8, Byte value9, Timestamp value10, Timestamp value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ImageRecord
     */
    public ImageRecord() {
        super(Image.IMAGE);
    }

    /**
     * Create a detached, initialised ImageRecord
     */
    public ImageRecord(ULong id, ImageType type, String relatedId, String filename, Byte isPrimary, String title, String alt, Integer sequenceNumber, Byte isVideo, Timestamp updatedTs, Timestamp createdTs) {
        super(Image.IMAGE);

        set(0, id);
        set(1, type);
        set(2, relatedId);
        set(3, filename);
        set(4, isPrimary);
        set(5, title);
        set(6, alt);
        set(7, sequenceNumber);
        set(8, isVideo);
        set(9, updatedTs);
        set(10, createdTs);
    }
}