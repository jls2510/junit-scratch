/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.records;


import com.scratch.database.mysql.jv.tables.Recipe;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
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
public class RecipeRecord extends UpdatableRecordImpl<RecipeRecord> implements Record13<ULong, String, String, String, Integer, String, String, String, String, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 607118951;

    /**
     * Setter for <code>jv_b2c_dev.recipe.id</code>.
     */
    public RecipeRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe.name</code>.
     */
    public RecipeRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe.url</code>.
     */
    public RecipeRecord setUrl(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe.url</code>.
     */
    public String getUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe.description</code>.
     */
    public RecipeRecord setDescription(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe.description</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe.sequence</code>.
     */
    public RecipeRecord setSequence(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe.sequence</code>.
     */
    public Integer getSequence() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe.servings</code>.
     */
    public RecipeRecord setServings(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe.servings</code>.
     */
    public String getServings() {
        return (String) get(5);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe.prep_time</code>.
     */
    public RecipeRecord setPrepTime(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe.prep_time</code>.
     */
    public String getPrepTime() {
        return (String) get(6);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe.instructions</code>.
     */
    public RecipeRecord setInstructions(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe.instructions</code>.
     */
    public String getInstructions() {
        return (String) get(7);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe.meta_title</code>.
     */
    public RecipeRecord setMetaTitle(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe.meta_title</code>.
     */
    public String getMetaTitle() {
        return (String) get(8);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe.meta_description</code>.
     */
    public RecipeRecord setMetaDescription(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe.meta_description</code>.
     */
    public String getMetaDescription() {
        return (String) get(9);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe.is_deleted</code>.
     */
    public RecipeRecord setIsDeleted(Byte value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe.is_deleted</code>.
     */
    public Byte getIsDeleted() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe.created_ts</code>.
     */
    public RecipeRecord setCreatedTs(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe.created_ts</code>.
     */
    public Timestamp getCreatedTs() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe.updated_ts</code>.
     */
    public RecipeRecord setUpdatedTs(Timestamp value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe.updated_ts</code>.
     */
    public Timestamp getUpdatedTs() {
        return (Timestamp) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<ULong, String, String, String, Integer, String, String, String, String, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<ULong, String, String, String, Integer, String, String, String, String, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return Recipe.RECIPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Recipe.RECIPE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Recipe.RECIPE.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Recipe.RECIPE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Recipe.RECIPE.SEQUENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Recipe.RECIPE.SERVINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Recipe.RECIPE.PREP_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Recipe.RECIPE.INSTRUCTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Recipe.RECIPE.META_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Recipe.RECIPE.META_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return Recipe.RECIPE.IS_DELETED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Recipe.RECIPE.CREATED_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return Recipe.RECIPE.UPDATED_TS;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSequence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getServings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPrepTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getInstructions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getMetaTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getMetaDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getIsDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getCreatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getUpdatedTs();
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSequence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getServings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPrepTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getInstructions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMetaTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getMetaDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getIsDeleted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCreatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getUpdatedTs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeRecord value3(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeRecord value5(Integer value) {
        setSequence(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeRecord value6(String value) {
        setServings(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeRecord value7(String value) {
        setPrepTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeRecord value8(String value) {
        setInstructions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeRecord value9(String value) {
        setMetaTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeRecord value10(String value) {
        setMetaDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeRecord value11(Byte value) {
        setIsDeleted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeRecord value12(Timestamp value) {
        setCreatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeRecord value13(Timestamp value) {
        setUpdatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeRecord values(ULong value1, String value2, String value3, String value4, Integer value5, String value6, String value7, String value8, String value9, String value10, Byte value11, Timestamp value12, Timestamp value13) {
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
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RecipeRecord
     */
    public RecipeRecord() {
        super(Recipe.RECIPE);
    }

    /**
     * Create a detached, initialised RecipeRecord
     */
    public RecipeRecord(ULong id, String name, String url, String description, Integer sequence, String servings, String prepTime, String instructions, String metaTitle, String metaDescription, Byte isDeleted, Timestamp createdTs, Timestamp updatedTs) {
        super(Recipe.RECIPE);

        set(0, id);
        set(1, name);
        set(2, url);
        set(3, description);
        set(4, sequence);
        set(5, servings);
        set(6, prepTime);
        set(7, instructions);
        set(8, metaTitle);
        set(9, metaDescription);
        set(10, isDeleted);
        set(11, createdTs);
        set(12, updatedTs);
    }
}
