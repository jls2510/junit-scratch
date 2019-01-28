/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.daos;


import com.scratch.database.mysql.jv.enums.PromotionDetailDetailType;
import com.scratch.database.mysql.jv.enums.PromotionDetailDiscountType;
import com.scratch.database.mysql.jv.tables.PromotionDetail;
import com.scratch.database.mysql.jv.tables.records.PromotionDetailRecord;

import java.math.BigDecimal;
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
public class PromotionDetailDao extends DAOImpl<PromotionDetailRecord, com.scratch.database.mysql.jv.tables.pojos.PromotionDetail, ULong> {

    /**
     * Create a new PromotionDetailDao without any configuration
     */
    public PromotionDetailDao() {
        super(PromotionDetail.PROMOTION_DETAIL, com.scratch.database.mysql.jv.tables.pojos.PromotionDetail.class);
    }

    /**
     * Create a new PromotionDetailDao with an attached configuration
     */
    public PromotionDetailDao(Configuration configuration) {
        super(PromotionDetail.PROMOTION_DETAIL, com.scratch.database.mysql.jv.tables.pojos.PromotionDetail.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ULong getId(com.scratch.database.mysql.jv.tables.pojos.PromotionDetail object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.PromotionDetail> fetchById(ULong... values) {
        return fetch(PromotionDetail.PROMOTION_DETAIL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.scratch.database.mysql.jv.tables.pojos.PromotionDetail fetchOneById(ULong value) {
        return fetchOne(PromotionDetail.PROMOTION_DETAIL.ID, value);
    }

    /**
     * Fetch records that have <code>promotion_id IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.PromotionDetail> fetchByPromotionId(ULong... values) {
        return fetch(PromotionDetail.PROMOTION_DETAIL.PROMOTION_ID, values);
    }

    /**
     * Fetch records that have <code>detail_type IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.PromotionDetail> fetchByDetailType(PromotionDetailDetailType... values) {
        return fetch(PromotionDetail.PROMOTION_DETAIL.DETAIL_TYPE, values);
    }

    /**
     * Fetch records that have <code>key IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.PromotionDetail> fetchByKey(String... values) {
        return fetch(PromotionDetail.PROMOTION_DETAIL.KEY, values);
    }

    /**
     * Fetch records that have <code>discount_type IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.PromotionDetail> fetchByDiscountType(PromotionDetailDiscountType... values) {
        return fetch(PromotionDetail.PROMOTION_DETAIL.DISCOUNT_TYPE, values);
    }

    /**
     * Fetch records that have <code>discount_amount IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.PromotionDetail> fetchByDiscountAmount(BigDecimal... values) {
        return fetch(PromotionDetail.PROMOTION_DETAIL.DISCOUNT_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>is_deleted IN (values)</code>
     */
    public List<com.scratch.database.mysql.jv.tables.pojos.PromotionDetail> fetchByIsDeleted(Byte... values) {
        return fetch(PromotionDetail.PROMOTION_DETAIL.IS_DELETED, values);
    }
}
