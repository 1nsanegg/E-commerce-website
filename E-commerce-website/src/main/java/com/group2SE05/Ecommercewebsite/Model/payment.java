package com.group2SE05.Ecommercewebsite.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int orderId;
    private Date paymentDate;
    private double totalPrice;
    private String paymentMethod;

    public payment(int id, int orderId, Date paymentDate, double totalPrice, String paymentMethod) {
        this.id = id;
        this.orderId = orderId;
        this.paymentDate = paymentDate;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
    }

    public payment(int orderId, Date paymentDate, double totalPrice, String paymentMethod) {
        this.orderId = orderId;
        this.paymentDate = paymentDate;
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
    }

    public payment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "payment{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", paymentDate=" + paymentDate +
                ", totalPrice=" + totalPrice +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
