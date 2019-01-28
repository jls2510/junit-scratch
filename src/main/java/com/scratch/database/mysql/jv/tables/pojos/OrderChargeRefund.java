/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;

import org.jooq.types.UInteger;


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
public class OrderChargeRefund implements Serializable {

    private static final long serialVersionUID = 1800976976;

    private final UInteger id;
    private final UInteger orderId;
    private final String   stripeChargeId;
    private final String   stripeRefundId;

    public OrderChargeRefund(OrderChargeRefund value) {
        this.id = value.id;
        this.orderId = value.orderId;
        this.stripeChargeId = value.stripeChargeId;
        this.stripeRefundId = value.stripeRefundId;
    }

    public OrderChargeRefund(
        UInteger id,
        UInteger orderId,
        String   stripeChargeId,
        String   stripeRefundId
    ) {
        this.id = id;
        this.orderId = orderId;
        this.stripeChargeId = stripeChargeId;
        this.stripeRefundId = stripeRefundId;
    }

    public UInteger getId() {
        return this.id;
    }

    public UInteger getOrderId() {
        return this.orderId;
    }

    public String getStripeChargeId() {
        return this.stripeChargeId;
    }

    public String getStripeRefundId() {
        return this.stripeRefundId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OrderChargeRefund (");

        sb.append(id);
        sb.append(", ").append(orderId);
        sb.append(", ").append(stripeChargeId);
        sb.append(", ").append(stripeRefundId);

        sb.append(")");
        return sb.toString();
    }
}
