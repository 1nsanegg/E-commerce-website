package com.group2SE05.Ecommercewebsite.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class shoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private Date creationDate;
    private Date modificationDate;

    public shoppingCart(int id, int userId, Date creationDate, Date modificationDate) {
        this.id = id;
        this.userId = userId;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
    }

    public shoppingCart(int userId, Date creationDate, Date modificationDate) {
        this.userId = userId;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
    }

    public shoppingCart() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    @Override
    public String toString() {
        return "shoppingCart{" +
                "id=" + id +
                ", userId=" + userId +
                ", creationDate=" + creationDate +
                ", modificationDate=" + modificationDate +
                '}';
    }
}
