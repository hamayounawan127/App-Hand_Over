package com.symplified.order.models.order;

import androidx.annotation.NonNull;

import com.symplified.order.enums.Status;
import com.symplified.order.models.HttpResponse;
import com.symplified.order.models.Store.Store;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {
    public String id;
    public String storeId;
    public Double deliveryCharges;
    public Double subTotal;
    public Double total;
    public String completionStatus;
    public String paymentStatus;
    public String customerNotes;
    public String privateAdminNotes;
    public String cartId;
    public String customerId;
    public String created;
    public String updated;
    public String invoiceId;
    public Double klCommission;
    public Double storeServiceCharges;
    public Double storeShare;
    public String paymentType;
    public Double appliedDiscount;
    public Double deliveryDiscount;
    public String appliedDiscountDescription;
    public String deliveryDiscountDescription;
    public OrderShipmentDetail orderShipmentDetail;
    public OrderPaymentDetail orderPaymentDetail;
//    private Store store;
    public Customer customer;
    public List<OrderRefund> orderRefund;
    public boolean isRevised;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public Double getDeliveryCharges() {
        return deliveryCharges;
    }

    public void setDeliveryCharges(Double deliveryCharges) {
        this.deliveryCharges = deliveryCharges;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getCustomerNotes() {
        return customerNotes;
    }

    public void setCustomerNotes(String customerNotes) {
        this.customerNotes = customerNotes;
    }

    public String getPrivateAdminNotes() {
        return privateAdminNotes;
    }

    public void setPrivateAdminNotes(String privateAdminNotes) {
        this.privateAdminNotes = privateAdminNotes;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Double getKlCommission() {
        return klCommission;
    }

    public void setKlCommission(Double klCommission) {
        this.klCommission = klCommission;
    }

    public Double getStoreServiceCharges() {
        return storeServiceCharges;
    }

    public void setStoreServiceCharges(Double storeServiceCharges) {
        this.storeServiceCharges = storeServiceCharges;
    }

    public Double getStoreShare() {
        return storeShare;
    }

    public void setStoreShare(Double storeShare) {
        this.storeShare = storeShare;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Double getAppliedDiscount() {
        return appliedDiscount;
    }

    public void setAppliedDiscount(Double appliedDiscount) {
        this.appliedDiscount = appliedDiscount;
    }

    public Double getDeliveryDiscount() {
        return deliveryDiscount;
    }

    public void setDeliveryDiscount(Double deliveryDiscount) {
        this.deliveryDiscount = deliveryDiscount;
    }

    public String getAppliedDiscountDescription() {
        return appliedDiscountDescription;
    }

    public void setAppliedDiscountDescription(String appliedDiscountDescription) {
        this.appliedDiscountDescription = appliedDiscountDescription;
    }

    public String getDeliveryDiscountDescription() {
        return deliveryDiscountDescription;
    }

    public void setDeliveryDiscountDescription(String deliveryDiscountDescription) {
        this.deliveryDiscountDescription = deliveryDiscountDescription;
    }

    public OrderShipmentDetail getOrderShipmentDetail() {
        return orderShipmentDetail;
    }

    public void setOrderShipmentDetail(OrderShipmentDetail orderShipmentDetail) {
        this.orderShipmentDetail = orderShipmentDetail;
    }

    public OrderPaymentDetail getOrderPaymentDetail() {
        return orderPaymentDetail;
    }

    public void setOrderPaymentDetail(OrderPaymentDetail orderPaymentDetail) {
        this.orderPaymentDetail = orderPaymentDetail;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderRefund> getOrderRefund() {
        return orderRefund;
    }

    public void setOrderRefund(List<OrderRefund> orderRefund) {
        this.orderRefund = orderRefund;
    }

    public boolean isRevised() {
        return isRevised;
    }

    public void setRevised(boolean revised) {
        isRevised = revised;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", storeId='" + storeId + '\'' +
                ", deliveryCharges=" + deliveryCharges +
                ", subTotal=" + subTotal +
                ", total=" + total +
                ", completionStatus='" + completionStatus + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", customerNotes='" + customerNotes + '\'' +
                ", privateAdminNotes='" + privateAdminNotes + '\'' +
                ", cartId='" + cartId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", created='" + created + '\'' +
                ", updated='" + updated + '\'' +
                ", invoiceId='" + invoiceId + '\'' +
                ", klCommission=" + klCommission +
                ", storeServiceCharges=" + storeServiceCharges +
                ", storeShare=" + storeShare +
                ", paymentType='" + paymentType + '\'' +
                ", appliedDiscount=" + appliedDiscount +
                ", deliveryDiscount=" + deliveryDiscount +
                ", appliedDiscountDescription='" + appliedDiscountDescription + '\'' +
                ", deliveryDiscountDescription='" + deliveryDiscountDescription + '\'' +
                ", orderShipmentDetail=" + orderShipmentDetail +
                ", orderPaymentDetail=" + orderPaymentDetail +
                ", customer=" + customer +
                ", orderRefund=" + orderRefund +
                ", isRevised=" + isRevised +
                '}';
    }

    public static class DeliveryPeriod implements Serializable {
        public String id;

        public String name;

        public String description;

        @Override
        public String toString() {
            return "DeliveryPeriod{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    public static class OrderShipmentDetail implements Serializable{
        public String receiverName;
        public String phoneNumber;
        public String address;
        public String city;
        public String zipcode;
        public String email;
        public Integer deliveryProviderId;
        public String state;
        public String country;
        public String trackingUrl;
        public String orderId;
        public boolean storePickup;
        public String merchantTrackingUrl;
        public String customerTrackingUrl;
        public String trackingNumber;
        public DeliveryPeriod deliveryPeriodDetails;
    }

    public static class OrderPaymentDetail implements Serializable{
        public String accountName;
        public String gatewayId;
        public String couponId;
        public String time;
        public String orderId;
        public String deliveryQuotationReferenceId;
        public Double deliveryQuotationAmount;
    }

    public static class Customer implements Serializable{
        public String id;

        public String name;

        public String email;
        public String phoneNumber;
        public String created;
        public String updated;
    }

    public static class OrderRefund implements Serializable{
        private String id;

        public String orderId;
        public Double refundAmount;
        public String remarks;
        public String paymentChannel;
        public String refundStatus;
        public String refundType;
        public String created;
        public String updated;
        public String refunded;

        @Override
        public String toString() {
            return "OrderRefund{" +
                    "id='" + id + '\'' +
                    ", orderId='" + orderId + '\'' +
                    ", refundAmount=" + refundAmount +
                    ", remarks='" + remarks + '\'' +
                    ", paymentChannel='" + paymentChannel + '\'' +
                    ", refundStatus='" + refundStatus + '\'' +
                    ", refundType='" + refundType + '\'' +
                    ", created='" + created + '\'' +
                    ", updated='" + updated + '\'' +
                    ", refunded='" + refunded + '\'' +
                    '}';
        }
    }

    public static class OrderList implements Serializable{
        public List<Order> content;
    }

    public static class OrderUpdate{
        public String orderId;
        public Status status;

        public OrderUpdate(String orderId, Status status){
            this.orderId = orderId;
            this.status = status;
        }
    }

    public static class UpdatedOrder extends HttpResponse implements Serializable{

        public Order data;

    }

    public static class OrderStatusDetailsResponse extends HttpResponse implements Serializable{
        public Order order;
        public String currentCompletionStatus;
        public String nextCompletionStatus;
        public String nextActionText;

        @Override
        public String toString() {
            return "OrderStatusDetailsResponse{" +
                    "order=" + order +
                    ", currentCompletionStatus='" + currentCompletionStatus + '\'' +
                    ", nextCompletionStatus='" + nextCompletionStatus + '\'' +
                    ", nextActionText='" + nextActionText + '\'' +
                    '}';
        }
    }

    public static class OrderByIdResponse extends HttpResponse implements Serializable{
        public Order data;
    }

}