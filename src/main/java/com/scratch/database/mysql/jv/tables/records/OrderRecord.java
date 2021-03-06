/*
 * This file is generated by jOOQ.
 */
package com.scratch.database.mysql.jv.tables.records;


import com.scratch.database.mysql.jv.enums.OrderOrderStatus;
import com.scratch.database.mysql.jv.enums.OrderShippingPromotionType;
import com.scratch.database.mysql.jv.tables.Order;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;
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
public class OrderRecord extends UpdatableRecordImpl<OrderRecord> {

    private static final long serialVersionUID = 198847930;

    /**
     * Setter for <code>jv_b2c_dev.order.id</code>.
     */
    public OrderRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.session_id</code>.
     */
    public OrderRecord setSessionId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.session_id</code>.
     */
    public String getSessionId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.s2k_order_number</code>.
     */
    public OrderRecord setS2kOrderNumber(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.s2k_order_number</code>.
     */
    public String getS2kOrderNumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.stripe_source_id</code>.
     */
    public OrderRecord setStripeSourceId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.stripe_source_id</code>.
     */
    public String getStripeSourceId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.stripe_customer_id</code>.
     */
    public OrderRecord setStripeCustomerId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.stripe_customer_id</code>.
     */
    public String getStripeCustomerId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.stripe_charge_id</code>.
     */
    public OrderRecord setStripeChargeId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.stripe_charge_id</code>.
     */
    public String getStripeChargeId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.stripe_captured_amount</code>.
     */
    public OrderRecord setStripeCapturedAmount(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.stripe_captured_amount</code>.
     */
    public BigDecimal getStripeCapturedAmount() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.stripe_captured_ts</code>.
     */
    public OrderRecord setStripeCapturedTs(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.stripe_captured_ts</code>.
     */
    public Timestamp getStripeCapturedTs() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.s2k_status</code>.
     */
    public OrderRecord setS2kStatus(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.s2k_status</code>.
     */
    public String getS2kStatus() {
        return (String) get(8);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.s2k_status_description</code>.
     */
    public OrderRecord setS2kStatusDescription(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.s2k_status_description</code>.
     */
    public String getS2kStatusDescription() {
        return (String) get(9);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.account_id</code>.
     */
    public OrderRecord setAccountId(ULong value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.account_id</code>.
     */
    public ULong getAccountId() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.order_date</code>.
     */
    public OrderRecord setOrderDate(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.order_date</code>.
     */
    public String getOrderDate() {
        return (String) get(11);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.product_total</code>.
     */
    public OrderRecord setProductTotal(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.product_total</code>.
     */
    public BigDecimal getProductTotal() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.freight</code>.
     */
    public OrderRecord setFreight(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.freight</code>.
     */
    public BigDecimal getFreight() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.order_total</code>.
     */
    public OrderRecord setOrderTotal(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.order_total</code>.
     */
    public BigDecimal getOrderTotal() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.gift_flag</code>.
     */
    public OrderRecord setGiftFlag(Byte value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.gift_flag</code>.
     */
    public Byte getGiftFlag() {
        return (Byte) get(15);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.gift_receipt</code>.
     */
    public OrderRecord setGiftReceipt(Byte value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.gift_receipt</code>.
     */
    public Byte getGiftReceipt() {
        return (Byte) get(16);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.gift_message</code>.
     */
    public OrderRecord setGiftMessage(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.gift_message</code>.
     */
    public String getGiftMessage() {
        return (String) get(17);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.ship_via</code>.
     */
    public OrderRecord setShipVia(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.ship_via</code>.
     */
    public String getShipVia() {
        return (String) get(18);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.ship_method</code>.
     */
    public OrderRecord setShipMethod(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.ship_method</code>.
     */
    public String getShipMethod() {
        return (String) get(19);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.ship_classification</code>.
     */
    public OrderRecord setShipClassification(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.ship_classification</code>.
     */
    public String getShipClassification() {
        return (String) get(20);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.promo_code</code>.
     */
    public OrderRecord setPromoCode(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.promo_code</code>.
     */
    public String getPromoCode() {
        return (String) get(21);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.shipping_discount_percent</code>.
     */
    public OrderRecord setShippingDiscountPercent(Integer value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.shipping_discount_percent</code>.
     */
    public Integer getShippingDiscountPercent() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.shipping_discount_amount</code>.
     */
    public OrderRecord setShippingDiscountAmount(BigDecimal value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.shipping_discount_amount</code>.
     */
    public BigDecimal getShippingDiscountAmount() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.shipping_promotion_type</code>.
     */
    public OrderRecord setShippingPromotionType(OrderShippingPromotionType value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.shipping_promotion_type</code>.
     */
    public OrderShippingPromotionType getShippingPromotionType() {
        return (OrderShippingPromotionType) get(24);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.shipping_promotion_amount</code>.
     */
    public OrderRecord setShippingPromotionAmount(BigDecimal value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.shipping_promotion_amount</code>.
     */
    public BigDecimal getShippingPromotionAmount() {
        return (BigDecimal) get(25);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.shipping_promotion_method</code>.
     */
    public OrderRecord setShippingPromotionMethod(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.shipping_promotion_method</code>.
     */
    public String getShippingPromotionMethod() {
        return (String) get(26);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.bill_to_zip</code>.
     */
    public OrderRecord setBillToZip(String value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.bill_to_zip</code>.
     */
    public String getBillToZip() {
        return (String) get(27);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.bill_to_email</code>.
     */
    public OrderRecord setBillToEmail(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.bill_to_email</code>.
     */
    public String getBillToEmail() {
        return (String) get(28);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.ship_to_name</code>.
     */
    public OrderRecord setShipToName(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.ship_to_name</code>.
     */
    public String getShipToName() {
        return (String) get(29);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.ship_to_address1</code>.
     */
    public OrderRecord setShipToAddress1(String value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.ship_to_address1</code>.
     */
    public String getShipToAddress1() {
        return (String) get(30);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.ship_to_address2</code>.
     */
    public OrderRecord setShipToAddress2(String value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.ship_to_address2</code>.
     */
    public String getShipToAddress2() {
        return (String) get(31);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.ship_to_city</code>.
     */
    public OrderRecord setShipToCity(String value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.ship_to_city</code>.
     */
    public String getShipToCity() {
        return (String) get(32);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.ship_to_state</code>.
     */
    public OrderRecord setShipToState(String value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.ship_to_state</code>.
     */
    public String getShipToState() {
        return (String) get(33);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.ship_to_zip</code>.
     */
    public OrderRecord setShipToZip(String value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.ship_to_zip</code>.
     */
    public String getShipToZip() {
        return (String) get(34);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.ship_to_country</code>.
     */
    public OrderRecord setShipToCountry(String value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.ship_to_country</code>.
     */
    public String getShipToCountry() {
        return (String) get(35);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.ship_to_phone</code>.
     */
    public OrderRecord setShipToPhone(String value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.ship_to_phone</code>.
     */
    public String getShipToPhone() {
        return (String) get(36);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.placeholder</code>.
     */
    public OrderRecord setPlaceholder(Byte value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.placeholder</code>.
     */
    public Byte getPlaceholder() {
        return (Byte) get(37);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.order_status</code>.
     */
    public OrderRecord setOrderStatus(OrderOrderStatus value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.order_status</code>.
     */
    public OrderOrderStatus getOrderStatus() {
        return (OrderOrderStatus) get(38);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.ship_to_care_of</code>.
     */
    public OrderRecord setShipToCareOf(String value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.ship_to_care_of</code>.
     */
    public String getShipToCareOf() {
        return (String) get(39);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.bill_to_care_of</code>.
     */
    public OrderRecord setBillToCareOf(String value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.bill_to_care_of</code>.
     */
    public String getBillToCareOf() {
        return (String) get(40);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.shipping_status</code>.
     */
    public OrderRecord setShippingStatus(String value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.shipping_status</code>.
     */
    public String getShippingStatus() {
        return (String) get(41);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.tracking_number</code>.
     */
    public OrderRecord setTrackingNumber(String value) {
        set(42, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.tracking_number</code>.
     */
    public String getTrackingNumber() {
        return (String) get(42);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.po_number</code>.
     */
    public OrderRecord setPoNumber(String value) {
        set(43, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.po_number</code>.
     */
    public String getPoNumber() {
        return (String) get(43);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.so_number</code>.
     */
    public OrderRecord setSoNumber(String value) {
        set(44, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.so_number</code>.
     */
    public String getSoNumber() {
        return (String) get(44);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.weight</code>.
     */
    public OrderRecord setWeight(BigDecimal value) {
        set(45, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.weight</code>.
     */
    public BigDecimal getWeight() {
        return (BigDecimal) get(45);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.weight_uom</code>.
     */
    public OrderRecord setWeightUom(String value) {
        set(46, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.weight_uom</code>.
     */
    public String getWeightUom() {
        return (String) get(46);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.tax_total</code>.
     */
    public OrderRecord setTaxTotal(BigDecimal value) {
        set(47, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.tax_total</code>.
     */
    public BigDecimal getTaxTotal() {
        return (BigDecimal) get(47);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.tax_rate_state</code>.
     */
    public OrderRecord setTaxRateState(BigDecimal value) {
        set(48, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.tax_rate_state</code>.
     */
    public BigDecimal getTaxRateState() {
        return (BigDecimal) get(48);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.tax_rate_cnty</code>.
     */
    public OrderRecord setTaxRateCnty(BigDecimal value) {
        set(49, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.tax_rate_cnty</code>.
     */
    public BigDecimal getTaxRateCnty() {
        return (BigDecimal) get(49);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.tax_rate_local_1</code>.
     */
    public OrderRecord setTaxRateLocal_1(BigDecimal value) {
        set(50, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.tax_rate_local_1</code>.
     */
    public BigDecimal getTaxRateLocal_1() {
        return (BigDecimal) get(50);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.tax_rate_local_2</code>.
     */
    public OrderRecord setTaxRateLocal_2(BigDecimal value) {
        set(51, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.tax_rate_local_2</code>.
     */
    public BigDecimal getTaxRateLocal_2() {
        return (BigDecimal) get(51);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.has_perishables</code>.
     */
    public OrderRecord setHasPerishables(Byte value) {
        set(52, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.has_perishables</code>.
     */
    public Byte getHasPerishables() {
        return (Byte) get(52);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.has_nonperishables</code>.
     */
    public OrderRecord setHasNonperishables(Byte value) {
        set(53, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.has_nonperishables</code>.
     */
    public Byte getHasNonperishables() {
        return (Byte) get(53);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.cubic_volume</code>.
     */
    public OrderRecord setCubicVolume(BigDecimal value) {
        set(54, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.cubic_volume</code>.
     */
    public BigDecimal getCubicVolume() {
        return (BigDecimal) get(54);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.cubic_volume_uom</code>.
     */
    public OrderRecord setCubicVolumeUom(String value) {
        set(55, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.cubic_volume_uom</code>.
     */
    public String getCubicVolumeUom() {
        return (String) get(55);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.refund_freight</code>.
     */
    public OrderRecord setRefundFreight(BigDecimal value) {
        set(56, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.refund_freight</code>.
     */
    public BigDecimal getRefundFreight() {
        return (BigDecimal) get(56);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.refund_total</code>.
     */
    public OrderRecord setRefundTotal(BigDecimal value) {
        set(57, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.refund_total</code>.
     */
    public BigDecimal getRefundTotal() {
        return (BigDecimal) get(57);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.s2k_retry_count</code>.
     */
    public OrderRecord setS2kRetryCount(Integer value) {
        set(58, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.s2k_retry_count</code>.
     */
    public Integer getS2kRetryCount() {
        return (Integer) get(58);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.s2k_retry_ts</code>.
     */
    public OrderRecord setS2kRetryTs(Timestamp value) {
        set(59, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.s2k_retry_ts</code>.
     */
    public Timestamp getS2kRetryTs() {
        return (Timestamp) get(59);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.s2k_payload</code>.
     */
    public OrderRecord setS2kPayload(String value) {
        set(60, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.s2k_payload</code>.
     */
    public String getS2kPayload() {
        return (String) get(60);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.s2k_response</code>.
     */
    public OrderRecord setS2kResponse(String value) {
        set(61, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.s2k_response</code>.
     */
    public String getS2kResponse() {
        return (String) get(61);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.s2k_error_message</code>.
     */
    public OrderRecord setS2kErrorMessage(String value) {
        set(62, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.s2k_error_message</code>.
     */
    public String getS2kErrorMessage() {
        return (String) get(62);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.tax_payload</code>.
     */
    public OrderRecord setTaxPayload(String value) {
        set(63, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.tax_payload</code>.
     */
    public String getTaxPayload() {
        return (String) get(63);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.tax_response</code>.
     */
    public OrderRecord setTaxResponse(String value) {
        set(64, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.tax_response</code>.
     */
    public String getTaxResponse() {
        return (String) get(64);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.created_ts</code>.
     */
    public OrderRecord setCreatedTs(Timestamp value) {
        set(65, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.created_ts</code>.
     */
    public Timestamp getCreatedTs() {
        return (Timestamp) get(65);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.updated_ts</code>.
     */
    public OrderRecord setUpdatedTs(Timestamp value) {
        set(66, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.updated_ts</code>.
     */
    public Timestamp getUpdatedTs() {
        return (Timestamp) get(66);
    }

    /**
     * Setter for <code>jv_b2c_dev.order.is_deleted</code>.
     */
    public OrderRecord setIsDeleted(Byte value) {
        set(67, value);
        return this;
    }

    /**
     * Getter for <code>jv_b2c_dev.order.is_deleted</code>.
     */
    public Byte getIsDeleted() {
        return (Byte) get(67);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderRecord
     */
    public OrderRecord() {
        super(Order.ORDER);
    }

    /**
     * Create a detached, initialised OrderRecord
     */
    public OrderRecord(ULong id, String sessionId, String s2kOrderNumber, String stripeSourceId, String stripeCustomerId, String stripeChargeId, BigDecimal stripeCapturedAmount, Timestamp stripeCapturedTs, String s2kStatus, String s2kStatusDescription, ULong accountId, String orderDate, BigDecimal productTotal, BigDecimal freight, BigDecimal orderTotal, Byte giftFlag, Byte giftReceipt, String giftMessage, String shipVia, String shipMethod, String shipClassification, String promoCode, Integer shippingDiscountPercent, BigDecimal shippingDiscountAmount, OrderShippingPromotionType shippingPromotionType, BigDecimal shippingPromotionAmount, String shippingPromotionMethod, String billToZip, String billToEmail, String shipToName, String shipToAddress1, String shipToAddress2, String shipToCity, String shipToState, String shipToZip, String shipToCountry, String shipToPhone, Byte placeholder, OrderOrderStatus orderStatus, String shipToCareOf, String billToCareOf, String shippingStatus, String trackingNumber, String poNumber, String soNumber, BigDecimal weight, String weightUom, BigDecimal taxTotal, BigDecimal taxRateState, BigDecimal taxRateCnty, BigDecimal taxRateLocal_1, BigDecimal taxRateLocal_2, Byte hasPerishables, Byte hasNonperishables, BigDecimal cubicVolume, String cubicVolumeUom, BigDecimal refundFreight, BigDecimal refundTotal, Integer s2kRetryCount, Timestamp s2kRetryTs, String s2kPayload, String s2kResponse, String s2kErrorMessage, String taxPayload, String taxResponse, Timestamp createdTs, Timestamp updatedTs, Byte isDeleted) {
        super(Order.ORDER);

        set(0, id);
        set(1, sessionId);
        set(2, s2kOrderNumber);
        set(3, stripeSourceId);
        set(4, stripeCustomerId);
        set(5, stripeChargeId);
        set(6, stripeCapturedAmount);
        set(7, stripeCapturedTs);
        set(8, s2kStatus);
        set(9, s2kStatusDescription);
        set(10, accountId);
        set(11, orderDate);
        set(12, productTotal);
        set(13, freight);
        set(14, orderTotal);
        set(15, giftFlag);
        set(16, giftReceipt);
        set(17, giftMessage);
        set(18, shipVia);
        set(19, shipMethod);
        set(20, shipClassification);
        set(21, promoCode);
        set(22, shippingDiscountPercent);
        set(23, shippingDiscountAmount);
        set(24, shippingPromotionType);
        set(25, shippingPromotionAmount);
        set(26, shippingPromotionMethod);
        set(27, billToZip);
        set(28, billToEmail);
        set(29, shipToName);
        set(30, shipToAddress1);
        set(31, shipToAddress2);
        set(32, shipToCity);
        set(33, shipToState);
        set(34, shipToZip);
        set(35, shipToCountry);
        set(36, shipToPhone);
        set(37, placeholder);
        set(38, orderStatus);
        set(39, shipToCareOf);
        set(40, billToCareOf);
        set(41, shippingStatus);
        set(42, trackingNumber);
        set(43, poNumber);
        set(44, soNumber);
        set(45, weight);
        set(46, weightUom);
        set(47, taxTotal);
        set(48, taxRateState);
        set(49, taxRateCnty);
        set(50, taxRateLocal_1);
        set(51, taxRateLocal_2);
        set(52, hasPerishables);
        set(53, hasNonperishables);
        set(54, cubicVolume);
        set(55, cubicVolumeUom);
        set(56, refundFreight);
        set(57, refundTotal);
        set(58, s2kRetryCount);
        set(59, s2kRetryTs);
        set(60, s2kPayload);
        set(61, s2kResponse);
        set(62, s2kErrorMessage);
        set(63, taxPayload);
        set(64, taxResponse);
        set(65, createdTs);
        set(66, updatedTs);
        set(67, isDeleted);
    }
}
