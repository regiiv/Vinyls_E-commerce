package com.mindHub.vinilysEcommerce.models;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String number;

    private Double deliveryAmount, grossAmount, netAmount, totalAmount;

    private Delivery delivery;

    private LocalDateTime date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name= "client_id")
    private Client client;

    @OneToMany(mappedBy = "bill", fetch = FetchType.EAGER)
    private Set<ProductBill> productBills = new HashSet<>();

    public Bill() {
    }

    public Bill(String number,Double deliveryAmount, Delivery delivery, Double grossAmount, Double netAmount,Double totalAmount, LocalDateTime date, Client client) {
        this.number = number;
        this.deliveryAmount = deliveryAmount;
        this.delivery = delivery;
        this.grossAmount = grossAmount;
        this.totalAmount = totalAmount;
        this.netAmount = netAmount;
        this.date = date;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery deliveryAmount) {
        this.delivery = deliveryAmount;
    }

    public Double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(Double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public Double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Set<ProductBill> getProductBills() {
        return productBills;
    }

    public void setProductBills(Set<ProductBill> productBills) {
        this.productBills = productBills;
    }

    public Double getDeliveryAmount() {
        return deliveryAmount;
    }

    public void setDeliveryAmount(Double deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
