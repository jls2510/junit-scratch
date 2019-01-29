/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.pojos;


import com.scratch.database.mysql.jv.enums.RecipeIngredientType;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class RecipeIngredient implements Serializable {

    private static final long serialVersionUID = -1959938647;

    private ULong                id;
    private RecipeIngredientType type;
    private String               relatedId;
    private ULong                recipeIngredientGroupId;
    private String               amount;
    private String               uom;
    private String               description;
    private Timestamp            updatedTs;
    private Timestamp            createdTs;

    public RecipeIngredient() {}

    public RecipeIngredient(RecipeIngredient value) {
        this.id = value.id;
        this.type = value.type;
        this.relatedId = value.relatedId;
        this.recipeIngredientGroupId = value.recipeIngredientGroupId;
        this.amount = value.amount;
        this.uom = value.uom;
        this.description = value.description;
        this.updatedTs = value.updatedTs;
        this.createdTs = value.createdTs;
    }

    public RecipeIngredient(
        ULong                id,
        RecipeIngredientType type,
        String               relatedId,
        ULong                recipeIngredientGroupId,
        String               amount,
        String               uom,
        String               description,
        Timestamp            updatedTs,
        Timestamp            createdTs
    ) {
        this.id = id;
        this.type = type;
        this.relatedId = relatedId;
        this.recipeIngredientGroupId = recipeIngredientGroupId;
        this.amount = amount;
        this.uom = uom;
        this.description = description;
        this.updatedTs = updatedTs;
        this.createdTs = createdTs;
    }

    public ULong getId() {
        return this.id;
    }

    public RecipeIngredient setId(ULong id) {
        this.id = id;
        return this;
    }

    public RecipeIngredientType getType() {
        return this.type;
    }

    public RecipeIngredient setType(RecipeIngredientType type) {
        this.type = type;
        return this;
    }

    public String getRelatedId() {
        return this.relatedId;
    }

    public RecipeIngredient setRelatedId(String relatedId) {
        this.relatedId = relatedId;
        return this;
    }

    public ULong getRecipeIngredientGroupId() {
        return this.recipeIngredientGroupId;
    }

    public RecipeIngredient setRecipeIngredientGroupId(ULong recipeIngredientGroupId) {
        this.recipeIngredientGroupId = recipeIngredientGroupId;
        return this;
    }

    public String getAmount() {
        return this.amount;
    }

    public RecipeIngredient setAmount(String amount) {
        this.amount = amount;
        return this;
    }

    public String getUom() {
        return this.uom;
    }

    public RecipeIngredient setUom(String uom) {
        this.uom = uom;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public RecipeIngredient setDescription(String description) {
        this.description = description;
        return this;
    }

    public Timestamp getUpdatedTs() {
        return this.updatedTs;
    }

    public RecipeIngredient setUpdatedTs(Timestamp updatedTs) {
        this.updatedTs = updatedTs;
        return this;
    }

    public Timestamp getCreatedTs() {
        return this.createdTs;
    }

    public RecipeIngredient setCreatedTs(Timestamp createdTs) {
        this.createdTs = createdTs;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RecipeIngredient (");

        sb.append(id);
        sb.append(", ").append(type);
        sb.append(", ").append(relatedId);
        sb.append(", ").append(recipeIngredientGroupId);
        sb.append(", ").append(amount);
        sb.append(", ").append(uom);
        sb.append(", ").append(description);
        sb.append(", ").append(updatedTs);
        sb.append(", ").append(createdTs);

        sb.append(")");
        return sb.toString();
    }
}