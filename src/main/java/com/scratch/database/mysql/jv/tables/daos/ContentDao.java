/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.daos;


import com.scratch.database.mysql.jv.enums.ContentStatus;
import com.scratch.database.mysql.jv.tables.Content;
import com.scratch.database.mysql.jv.tables.records.ContentRecord;

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
public class ContentDao extends DAOImpl<ContentRecord, com.scratch.database.mysql.jv.tables.pojos.Content, ULong> {

    /**
     * Create a new ContentDao without any configuration
     */
    public ContentDao() {
        super(Content.CONTENT, com.scratch.database.mysql.jv.tables.pojos.Content.class);
    }

    /**
     * Create a new ContentDao with an attached configuration
     */
    public ContentDao(Configuration configuration) {
        super(Content.CONTENT, com.scratch.database.mysql.jv.tables.pojos.Content.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(com.scratch.database.mysql.jv.tables.pojos.Content object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Content> fetchById(ULong... values) {
        return fetch(Content.CONTENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.Content fetchOneById(ULong value) {
        return fetchOne(Content.CONTENT.ID, value);
    }

    /**
     * Fetch records that have <code>parent_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Content> fetchByParentId(ULong... values) {
        return fetch(Content.CONTENT.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Content> fetchByStatus(ContentStatus... values) {
        return fetch(Content.CONTENT.STATUS, values);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Content> fetchByTitle(String... values) {
        return fetch(Content.CONTENT.TITLE, values);
    }

    /**
     * Fetch records that have <code>url IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Content> fetchByUrl(String... values) {
        return fetch(Content.CONTENT.URL, values);
    }

    /**
     * Fetch a unique record that has <code>url = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.Content fetchOneByUrl(String value) {
        return fetchOne(Content.CONTENT.URL, value);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Content> fetchByContent(String... values) {
        return fetch(Content.CONTENT.CONTENT_, values);
    }

    /**
     * Fetch records that have <code>updated_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Content> fetchByUpdatedTs(Timestamp... values) {
        return fetch(Content.CONTENT.UPDATED_TS, values);
    }

    /**
     * Fetch records that have <code>created_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Content> fetchByCreatedTs(Timestamp... values) {
        return fetch(Content.CONTENT.CREATED_TS, values);
    }
}
