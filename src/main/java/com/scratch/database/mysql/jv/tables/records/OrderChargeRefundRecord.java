/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.records;


import com.scratch.database.mysql.jv.tables.OrderChargeRefund;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
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
public class OrderChargeRefundRecord extends UpdatableRecordImpl<OrderChargeRefundRecord> implements Record4<UInteger, UInteger, String, String> {

    private static final long serialVersionUID = 1510603768;

    /**
     * Setter for <code>jv_b2c_dev.order_charge_refund.id</code>.
     */
    public OrderChargeRefundRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order_charge_refund.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>jv_b2c_dev.order_charge_refund.order_id</code>.
     */
    public OrderChargeRefundRecord setOrderId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order_charge_refund.order_id</code>.
     */
    public UInteger getOrderId() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>jv_b2c_dev.order_charge_refund.stripe_charge_id</code>.
     */
    public OrderChargeRefundRecord setStripeChargeId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order_charge_refund.stripe_charge_id</code>.
     */
    public String getStripeChargeId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jv_b2c_dev.order_charge_refund.stripe_refund_id</code>.
     */
    public OrderChargeRefundRecord setStripeRefundId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order_charge_refund.stripe_refund_id</code>.
     */
    public String getStripeRefundId() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UInteger, UInteger, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UInteger, UInteger, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return OrderChargeRefund.ORDER_CHARGE_REFUND.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field2() {
        return OrderChargeRefund.ORDER_CHARGE_REFUND.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return OrderChargeRefund.ORDER_CHARGE_REFUND.STRIPE_CHARGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return OrderChargeRefund.ORDER_CHARGE_REFUND.STRIPE_REFUND_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component2() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getStripeChargeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getStripeRefundId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value2() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getStripeChargeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getStripeRefundId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderChargeRefundRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderChargeRefundRecord value2(UInteger value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderChargeRefundRecord value3(String value) {
        setStripeChargeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderChargeRefundRecord value4(String value) {
        setStripeRefundId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OrderChargeRefundRecord values(UInteger value1, UInteger value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderChargeRefundRecord
     */
    public OrderChargeRefundRecord() {
        super(OrderChargeRefund.ORDER_CHARGE_REFUND);
    }

    /**
     * Create a detached, initialised OrderChargeRefundRecord
     */
    public OrderChargeRefundRecord(UInteger id, UInteger orderId, String stripeChargeId, String stripeRefundId) {
        super(OrderChargeRefund.ORDER_CHARGE_REFUND);

        set(0, id);
        set(1, orderId);
        set(2, stripeChargeId);
        set(3, stripeRefundId);
    }
}
