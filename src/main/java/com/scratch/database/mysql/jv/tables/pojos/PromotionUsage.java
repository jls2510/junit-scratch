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
public class PromotionUsage implements Serializable {

    private static final long serialVersionUID = 364745116;

    private ULong     id;
    private ULong     promotionId;
    private ULong     accountId;
    private Integer   count;
    private Timestamp createdTs;

    public PromotionUsage() {}

    public PromotionUsage(PromotionUsage value) {
        this.id = value.id;
        this.promotionId = value.promotionId;
        this.accountId = value.accountId;
        this.count = value.count;
        this.createdTs = value.createdTs;
    }

    public PromotionUsage(
        ULong     id,
        ULong     promotionId,
        ULong     accountId,
        Integer   count,
        Timestamp createdTs
    ) {
        this.id = id;
        this.promotionId = promotionId;
        this.accountId = accountId;
        this.count = count;
        this.createdTs = createdTs;
    }

    public ULong getId() {
        return this.id;
    }

    public PromotionUsage setId(ULong id) {
        this.id = id;
        return this;
    }

    public ULong getPromotionId() {
        return this.promotionId;
    }

    public PromotionUsage setPromotionId(ULong promotionId) {
        this.promotionId = promotionId;
        return this;
    }

    public ULong getAccountId() {
        return this.accountId;
    }

    public PromotionUsage setAccountId(ULong accountId) {
        this.accountId = accountId;
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    public PromotionUsage setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Timestamp getCreatedTs() {
        return this.createdTs;
    }

    public PromotionUsage setCreatedTs(Timestamp createdTs) {
        this.createdTs = createdTs;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PromotionUsage (");

        sb.append(id);
        sb.append(", ").append(promotionId);
        sb.append(", ").append(accountId);
        sb.append(", ").append(count);
        sb.append(", ").append(createdTs);

        sb.append(")");
        return sb.toString();
    }
}