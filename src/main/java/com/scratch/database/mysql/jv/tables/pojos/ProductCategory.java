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
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = 1213495763;

    private ULong     id;
    private String    itemNumber;
    private ULong     categoryId;
    private Timestamp updatedTs;
    private Timestamp createdTs;

    public ProductCategory() {}

    public ProductCategory(ProductCategory value) {
        this.id = value.id;
        this.itemNumber = value.itemNumber;
        this.categoryId = value.categoryId;
        this.updatedTs = value.updatedTs;
        this.createdTs = value.createdTs;
    }

    public ProductCategory(
        ULong     id,
        String    itemNumber,
        ULong     categoryId,
        Timestamp updatedTs,
        Timestamp createdTs
    ) {
        this.id = id;
        this.itemNumber = itemNumber;
        this.categoryId = categoryId;
        this.updatedTs = updatedTs;
        this.createdTs = createdTs;
    }

    public ULong getId() {
        return this.id;
    }

    public ProductCategory setId(ULong id) {
        this.id = id;
        return this;
    }

    public String getItemNumber() {
        return this.itemNumber;
    }

    public ProductCategory setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
        return this;
    }

    public ULong getCategoryId() {
        return this.categoryId;
    }

    public ProductCategory setCategoryId(ULong categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Timestamp getUpdatedTs() {
        return this.updatedTs;
    }

    public ProductCategory setUpdatedTs(Timestamp updatedTs) {
        this.updatedTs = updatedTs;
        return this;
    }

    public Timestamp getCreatedTs() {
        return this.createdTs;
    }

    public ProductCategory setCreatedTs(Timestamp createdTs) {
        this.createdTs = createdTs;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProductCategory (");

        sb.append(id);
        sb.append(", ").append(itemNumber);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(updatedTs);
        sb.append(", ").append(createdTs);

        sb.append(")");
        return sb.toString();
    }
}