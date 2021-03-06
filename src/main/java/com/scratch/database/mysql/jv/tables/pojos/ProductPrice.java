/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

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
public class ProductPrice implements Serializable {

    private static final long serialVersionUID = -1349834410;

    private ULong      id;
    private String     itemNumber;
    private BigDecimal price;

    public ProductPrice() {}

    public ProductPrice(ProductPrice value) {
        this.id = value.id;
        this.itemNumber = value.itemNumber;
        this.price = value.price;
    }

    public ProductPrice(
        ULong      id,
        String     itemNumber,
        BigDecimal price
    ) {
        this.id = id;
        this.itemNumber = itemNumber;
        this.price = price;
    }

    public ULong getId() {
        return this.id;
    }

    public ProductPrice setId(ULong id) {
        this.id = id;
        return this;
    }

    public String getItemNumber() {
        return this.itemNumber;
    }

    public ProductPrice setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
        return this;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public ProductPrice setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ProductPrice (");

        sb.append(id);
        sb.append(", ").append(itemNumber);
        sb.append(", ").append(price);

        sb.append(")");
        return sb.toString();
    }
}
