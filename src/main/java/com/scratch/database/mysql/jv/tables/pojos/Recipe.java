/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.pojos;


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
public class Recipe implements Serializable {

    private static final long serialVersionUID = -265956997;

    private ULong     id;
    private String    name;
    private String    url;
    private String    description;
    private Integer   sequence;
    private String    servings;
    private String    prepTime;
    private String    instructions;
    private String    metaTitle;
    private String    metaDescription;
    private Byte      isDeleted;
    private Timestamp createdTs;
    private Timestamp updatedTs;

    public Recipe() {}

    public Recipe(Recipe value) {
        this.id = value.id;
        this.name = value.name;
        this.url = value.url;
        this.description = value.description;
        this.sequence = value.sequence;
        this.servings = value.servings;
        this.prepTime = value.prepTime;
        this.instructions = value.instructions;
        this.metaTitle = value.metaTitle;
        this.metaDescription = value.metaDescription;
        this.isDeleted = value.isDeleted;
        this.createdTs = value.createdTs;
        this.updatedTs = value.updatedTs;
    }

    public Recipe(
        ULong     id,
        String    name,
        String    url,
        String    description,
        Integer   sequence,
        String    servings,
        String    prepTime,
        String    instructions,
        String    metaTitle,
        String    metaDescription,
        Byte      isDeleted,
        Timestamp createdTs,
        Timestamp updatedTs
    ) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.description = description;
        this.sequence = sequence;
        this.servings = servings;
        this.prepTime = prepTime;
        this.instructions = instructions;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.isDeleted = isDeleted;
        this.createdTs = createdTs;
        this.updatedTs = updatedTs;
    }

    public ULong getId() {
        return this.id;
    }

    public Recipe setId(ULong id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Recipe setName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    public Recipe setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Recipe setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getSequence() {
        return this.sequence;
    }

    public Recipe setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    public String getServings() {
        return this.servings;
    }

    public Recipe setServings(String servings) {
        this.servings = servings;
        return this;
    }

    public String getPrepTime() {
        return this.prepTime;
    }

    public Recipe setPrepTime(String prepTime) {
        this.prepTime = prepTime;
        return this;
    }

    public String getInstructions() {
        return this.instructions;
    }

    public Recipe setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }

    public String getMetaTitle() {
        return this.metaTitle;
    }

    public Recipe setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    public String getMetaDescription() {
        return this.metaDescription;
    }

    public Recipe setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
        return this;
    }

    public Byte getIsDeleted() {
        return this.isDeleted;
    }

    public Recipe setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    public Timestamp getCreatedTs() {
        return this.createdTs;
    }

    public Recipe setCreatedTs(Timestamp createdTs) {
        this.createdTs = createdTs;
        return this;
    }

    public Timestamp getUpdatedTs() {
        return this.updatedTs;
    }

    public Recipe setUpdatedTs(Timestamp updatedTs) {
        this.updatedTs = updatedTs;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Recipe (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(url);
        sb.append(", ").append(description);
        sb.append(", ").append(sequence);
        sb.append(", ").append(servings);
        sb.append(", ").append(prepTime);
        sb.append(", ").append(instructions);
        sb.append(", ").append(metaTitle);
        sb.append(", ").append(metaDescription);
        sb.append(", ").append(isDeleted);
        sb.append(", ").append(createdTs);
        sb.append(", ").append(updatedTs);

        sb.append(")");
        return sb.toString();
    }
}