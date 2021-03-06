/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.pojos;


import com.scratch.database.mysql.jv.enums.CartShippingPromotionType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.types.UInteger;
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
public class Cart implements Serializable {

    private static final long serialVersionUID = 436642644;

    private ULong                     id;
    private String                    sessionId;
    private ULong                     userId;
    private String                    itemNumber;
    private BigDecimal                price;
    private BigDecimal                quantity;
    private UInteger                  discountPercent;
    private BigDecimal                discountPrice;
    private String                    promoCode;
    private CartShippingPromotionType shippingPromotionType;
    private BigDecimal                shippingPromotionAmount;
    private String                    shippingPromotionMethod;
    private Timestamp                 updatedTs;
    private Timestamp                 createdTs;

    public Cart() {}

    public Cart(Cart value) {
        this.id = value.id;
        this.sessionId = value.sessionId;
        this.userId = value.userId;
        this.itemNumber = value.itemNumber;
        this.price = value.price;
        this.quantity = value.quantity;
        this.discountPercent = value.discountPercent;
        this.discountPrice = value.discountPrice;
        this.promoCode = value.promoCode;
        this.shippingPromotionType = value.shippingPromotionType;
        this.shippingPromotionAmount = value.shippingPromotionAmount;
        this.shippingPromotionMethod = value.shippingPromotionMethod;
        this.updatedTs = value.updatedTs;
        this.createdTs = value.createdTs;
    }

    public Cart(
        ULong                     id,
        String                    sessionId,
        ULong                     userId,
        String                    itemNumber,
        BigDecimal                price,
        BigDecimal                quantity,
        UInteger                  discountPercent,
        BigDecimal                discountPrice,
        String                    promoCode,
        CartShippingPromotionType shippingPromotionType,
        BigDecimal                shippingPromotionAmount,
        String                    shippingPromotionMethod,
        Timestamp                 updatedTs,
        Timestamp                 createdTs
    ) {
        this.id = id;
        this.sessionId = sessionId;
        this.userId = userId;
        this.itemNumber = itemNumber;
        this.price = price;
        this.quantity = quantity;
        this.discountPercent = discountPercent;
        this.discountPrice = discountPrice;
        this.promoCode = promoCode;
        this.shippingPromotionType = shippingPromotionType;
        this.shippingPromotionAmount = shippingPromotionAmount;
        this.shippingPromotionMethod = shippingPromotionMethod;
        this.updatedTs = updatedTs;
        this.createdTs = createdTs;
    }

    public ULong getId() {
        return this.id;
    }

    public Cart setId(ULong id) {
        this.id = id;
        return this;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public Cart setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public ULong getUserId() {
        return this.userId;
    }

    public Cart setUserId(ULong userId) {
        this.userId = userId;
        return this;
    }

    public String getItemNumber() {
        return this.itemNumber;
    }

    public Cart setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
        return this;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public Cart setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BigDecimal getQuantity() {
        return this.quantity;
    }

    public Cart setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    public UInteger getDiscountPercent() {
        return this.discountPercent;
    }

    public Cart setDiscountPercent(UInteger discountPercent) {
        this.discountPercent = discountPercent;
        return this;
    }

    public BigDecimal getDiscountPrice() {
        return this.discountPrice;
    }

    public Cart setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
        return this;
    }

    public String getPromoCode() {
        return this.promoCode;
    }

    public Cart setPromoCode(String promoCode) {
        this.promoCode = promoCode;
        return this;
    }

    public CartShippingPromotionType getShippingPromotionType() {
        return this.shippingPromotionType;
    }

    public Cart setShippingPromotionType(CartShippingPromotionType shippingPromotionType) {
        this.shippingPromotionType = shippingPromotionType;
        return this;
    }

    public BigDecimal getShippingPromotionAmount() {
        return this.shippingPromotionAmount;
    }

    public Cart setShippingPromotionAmount(BigDecimal shippingPromotionAmount) {
        this.shippingPromotionAmount = shippingPromotionAmount;
        return this;
    }

    public String getShippingPromotionMethod() {
        return this.shippingPromotionMethod;
    }

    public Cart setShippingPromotionMethod(String shippingPromotionMethod) {
        this.shippingPromotionMethod = shippingPromotionMethod;
        return this;
    }

    public Timestamp getUpdatedTs() {
        return this.updatedTs;
    }

    public Cart setUpdatedTs(Timestamp updatedTs) {
        this.updatedTs = updatedTs;
        return this;
    }

    public Timestamp getCreatedTs() {
        return this.createdTs;
    }

    public Cart setCreatedTs(Timestamp createdTs) {
        this.createdTs = createdTs;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cart (");

        sb.append(id);
        sb.append(", ").append(sessionId);
        sb.append(", ").append(userId);
        sb.append(", ").append(itemNumber);
        sb.append(", ").append(price);
        sb.append(", ").append(quantity);
        sb.append(", ").append(discountPercent);
        sb.append(", ").append(discountPrice);
        sb.append(", ").append(promoCode);
        sb.append(", ").append(shippingPromotionType);
        sb.append(", ").append(shippingPromotionAmount);
        sb.append(", ").append(shippingPromotionMethod);
        sb.append(", ").append(updatedTs);
        sb.append(", ").append(createdTs);

        sb.append(")");
        return sb.toString();
    }
}
