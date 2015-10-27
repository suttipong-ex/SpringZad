/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springzad.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author suttipong
 */
@Entity
public class Stock implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String stock_Unit;
    private String stock_Date;
    private String stock_Price;
    private String stock_NameR;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getStock_Unit() {
        return stock_Unit;
    }

    public void setStock_Unit(String stock_Unit) {
        this.stock_Unit = stock_Unit;
    }

    public String getStock_Date() {
        return stock_Date;
    }
    public void setStock_Date(String stock_Date) {
        this.stock_Date = stock_Date;
    }
    public String getStock_Price() {
        return stock_Price;
    }
    public void setStock_Price(String stock_Price) {
        this.stock_Price = stock_Price;
    }
    public String getStock_NameR() {
        return stock_NameR;
    }
    public void setStock_NameR(String stock_NameR) {
        this.stock_NameR = stock_NameR;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.Id);
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Stock other = (Stock) obj;
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }
}
