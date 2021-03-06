/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.daos;


import com.scratch.database.mysql.jv.tables.CategoryRelation;
import com.scratch.database.mysql.jv.tables.records.CategoryRelationRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
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
public class CategoryRelationDao extends DAOImpl<CategoryRelationRecord, com.scratch.database.mysql.jv.tables.pojos.CategoryRelation, ULong> {

    /**
     * Create a new CategoryRelationDao without any configuration
     */
    public CategoryRelationDao() {
        super(CategoryRelation.CATEGORY_RELATION, com.scratch.database.mysql.jv.tables.pojos.CategoryRelation.class);
    }

    /**
     * Create a new CategoryRelationDao with an attached configuration
     */
    public CategoryRelationDao(Configuration configuration) {
        super(CategoryRelation.CATEGORY_RELATION, com.scratch.database.mysql.jv.tables.pojos.CategoryRelation.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(com.scratch.database.mysql.jv.tables.pojos.CategoryRelation object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.CategoryRelation> fetchById(ULong... values) {
        return fetch(CategoryRelation.CATEGORY_RELATION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.CategoryRelation fetchOneById(ULong value) {
        return fetchOne(CategoryRelation.CATEGORY_RELATION.ID, value);
    }

    /**
     * Fetch records that have <code>category_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.CategoryRelation> fetchByCategoryId(ULong... values) {
        return fetch(CategoryRelation.CATEGORY_RELATION.CATEGORY_ID, values);
    }

    /**
     * Fetch records that have <code>parent_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.CategoryRelation> fetchByParentId(ULong... values) {
        return fetch(CategoryRelation.CATEGORY_RELATION.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>sequence IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.CategoryRelation> fetchBySequence(Integer... values) {
        return fetch(CategoryRelation.CATEGORY_RELATION.SEQUENCE, values);
    }

    /**
     * Fetch records that have <code>updated_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.CategoryRelation> fetchByUpdatedTs(Timestamp... values) {
        return fetch(CategoryRelation.CATEGORY_RELATION.UPDATED_TS, values);
    }

    /**
     * Fetch records that have <code>created_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.CategoryRelation> fetchByCreatedTs(Timestamp... values) {
        return fetch(CategoryRelation.CATEGORY_RELATION.CREATED_TS, values);
    }
}
