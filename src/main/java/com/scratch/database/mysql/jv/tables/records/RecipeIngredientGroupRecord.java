/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.records;


import com.scratch.database.mysql.jv.tables.RecipeIngredientGroup;

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
public class RecipeIngredientGroupRecord extends UpdatableRecordImpl<RecipeIngredientGroupRecord> implements Record5<ULong, ULong, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 356896427;

    /**
     * Setter for <code>jv_b2c_dev.recipe_ingredient_group.id</code>.
     */
    public RecipeIngredientGroupRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe_ingredient_group.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe_ingredient_group.recipe_id</code>.
     */
    public RecipeIngredientGroupRecord setRecipeId(ULong value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe_ingredient_group.recipe_id</code>.
     */
    public ULong getRecipeId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe_ingredient_group.name</code>.
     */
    public RecipeIngredientGroupRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe_ingredient_group.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe_ingredient_group.updated_ts</code>.
     */
    public RecipeIngredientGroupRecord setUpdatedTs(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe_ingredient_group.updated_ts</code>.
     */
    public Timestamp getUpdatedTs() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>jv_b2c_dev.recipe_ingredient_group.created_ts</code>.
     */
    public RecipeIngredientGroupRecord setCreatedTs(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.recipe_ingredient_group.created_ts</code>.
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
    public Row5<ULong, ULong, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<ULong, ULong, String, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return RecipeIngredientGroup.RECIPE_INGREDIENT_GROUP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return RecipeIngredientGroup.RECIPE_INGREDIENT_GROUP.RECIPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RecipeIngredientGroup.RECIPE_INGREDIENT_GROUP.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return RecipeIngredientGroup.RECIPE_INGREDIENT_GROUP.UPDATED_TS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return RecipeIngredientGroup.RECIPE_INGREDIENT_GROUP.CREATED_TS;
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
    public ULong component2() {
        return getRecipeId();
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
    public ULong value2() {
        return getRecipeId();
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
    public RecipeIngredientGroupRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeIngredientGroupRecord value2(ULong value) {
        setRecipeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeIngredientGroupRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeIngredientGroupRecord value4(Timestamp value) {
        setUpdatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeIngredientGroupRecord value5(Timestamp value) {
        setCreatedTs(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RecipeIngredientGroupRecord values(ULong value1, ULong value2, String value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached RecipeIngredientGroupRecord
     */
    public RecipeIngredientGroupRecord() {
        super(RecipeIngredientGroup.RECIPE_INGREDIENT_GROUP);
    }

    /**
     * Create a detached, initialised RecipeIngredientGroupRecord
     */
    public RecipeIngredientGroupRecord(ULong id, ULong recipeId, String name, Timestamp updatedTs, Timestamp createdTs) {
        super(RecipeIngredientGroup.RECIPE_INGREDIENT_GROUP);

        set(0, id);
        set(1, recipeId);
        set(2, name);
        set(3, updatedTs);
        set(4, createdTs);
    }
}
