/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.enums;


import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum PromotionDetailDetailType implements EnumType {

    ITEM("ITEM"),

    ORDER("ORDER"),

    CATEGORY("CATEGORY"),

    SITE("SITE"),

    GIFT("GIFT"),

    SHIP("SHIP");

    private final String literal;

    private PromotionDetailDetailType(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "promotion_detail_detail_type";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
