/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.daos;


import com.scratch.database.mysql.jv.enums.TagRelationType;
import com.scratch.database.mysql.jv.tables.TagRelation;
import com.scratch.database.mysql.jv.tables.records.TagRelationRecord;

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
public class TagRelationDao extends DAOImpl<TagRelationRecord, com.scratch.database.mysql.jv.tables.pojos.TagRelation, ULong> {

    /**
     * Create a new TagRelationDao without any configuration
     */
    public TagRelationDao() {
        super(TagRelation.TAG_RELATION, com.scratch.database.mysql.jv.tables.pojos.TagRelation.class);
    }

    /**
     * Create a new TagRelationDao with an attached configuration
     */
    public TagRelationDao(Configuration configuration) {
        super(TagRelation.TAG_RELATION, com.scratch.database.mysql.jv.tables.pojos.TagRelation.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(com.scratch.database.mysql.jv.tables.pojos.TagRelation object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.TagRelation> fetchById(ULong... values) {
        return fetch(TagRelation.TAG_RELATION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.TagRelation fetchOneById(ULong value) {
        return fetchOne(TagRelation.TAG_RELATION.ID, value);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.TagRelation> fetchByType(TagRelationType... values) {
        return fetch(TagRelation.TAG_RELATION.TYPE, values);
    }

    /**
     * Fetch records that have <code>tag_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.TagRelation> fetchByTagId(ULong... values) {
        return fetch(TagRelation.TAG_RELATION.TAG_ID, values);
    }

    /**
     * Fetch records that have <code>related_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.TagRelation> fetchByRelatedId(String... values) {
        return fetch(TagRelation.TAG_RELATION.RELATED_ID, values);
    }

    /**
     * Fetch records that have <code>created_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.TagRelation> fetchByCreatedTs(Timestamp... values) {
        return fetch(TagRelation.TAG_RELATION.CREATED_TS, values);
    }
}
