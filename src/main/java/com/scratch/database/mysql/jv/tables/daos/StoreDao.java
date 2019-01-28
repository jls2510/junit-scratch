/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.daos;


import com.scratch.database.mysql.jv.tables.Store;
import com.scratch.database.mysql.jv.tables.records.StoreRecord;

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
public class StoreDao extends DAOImpl<StoreRecord, com.scratch.database.mysql.jv.tables.pojos.Store, ULong> {

    /**
     * Create a new StoreDao without any configuration
     */
    public StoreDao() {
        super(Store.STORE, com.scratch.database.mysql.jv.tables.pojos.Store.class);
    }

    /**
     * Create a new StoreDao with an attached configuration
     */
    public StoreDao(Configuration configuration) {
        super(Store.STORE, com.scratch.database.mysql.jv.tables.pojos.Store.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(com.scratch.database.mysql.jv.tables.pojos.Store object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.Store> fetchById(ULong... values) {
        return fetch(Store.STORE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.Store fetchOneById(ULong value) {
        return fetchOne(Store.STORE.ID, value);
    }
}
