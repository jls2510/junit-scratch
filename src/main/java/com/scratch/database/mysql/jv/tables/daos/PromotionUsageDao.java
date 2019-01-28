/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.daos;


import com.scratch.database.mysql.jv.tables.PromotionUsage;
import com.scratch.database.mysql.jv.tables.records.PromotionUsageRecord;

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
public class PromotionUsageDao extends DAOImpl<PromotionUsageRecord, com.scratch.database.mysql.jv.tables.pojos.PromotionUsage, ULong> {

    /**
     * Create a new PromotionUsageDao without any configuration
     */
    public PromotionUsageDao() {
        super(PromotionUsage.PROMOTION_USAGE, com.scratch.database.mysql.jv.tables.pojos.PromotionUsage.class);
    }

    /**
     * Create a new PromotionUsageDao with an attached configuration
     */
    public PromotionUsageDao(Configuration configuration) {
        super(PromotionUsage.PROMOTION_USAGE, com.scratch.database.mysql.jv.tables.pojos.PromotionUsage.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(com.scratch.database.mysql.jv.tables.pojos.PromotionUsage object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.PromotionUsage> fetchById(ULong... values) {
        return fetch(PromotionUsage.PROMOTION_USAGE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.PromotionUsage fetchOneById(ULong value) {
        return fetchOne(PromotionUsage.PROMOTION_USAGE.ID, value);
    }

    /**
     * Fetch records that have <code>promotion_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.PromotionUsage> fetchByPromotionId(ULong... values) {
        return fetch(PromotionUsage.PROMOTION_USAGE.PROMOTION_ID, values);
    }

    /**
     * Fetch records that have <code>account_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.PromotionUsage> fetchByAccountId(ULong... values) {
        return fetch(PromotionUsage.PROMOTION_USAGE.ACCOUNT_ID, values);
    }

    /**
     * Fetch records that have <code>count IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.PromotionUsage> fetchByCount(Integer... values) {
        return fetch(PromotionUsage.PROMOTION_USAGE.COUNT, values);
    }

    /**
     * Fetch records that have <code>created_ts IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.PromotionUsage> fetchByCreatedTs(Timestamp... values) {
        return fetch(PromotionUsage.PROMOTION_USAGE.CREATED_TS, values);
    }
}
