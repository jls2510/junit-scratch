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
public enum TagGroupConstants implements EnumType {

    RELATED_ITEM("RELATED_ITEM"),

    USER_PREFERENCE("USER_PREFERENCE"),

    PACKAGE_TYPE("PACKAGE_TYPE"),

    ATTRIBUTE("ATTRIBUTE"),

    PACKAGE_SIZE("PACKAGE_SIZE");

    private final String literal;

    private TagGroupConstants(String literal) {
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
        return "tag_group_constants";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
