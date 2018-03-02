package com.shop.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="products")
public class Product implements Serializable{

    @Id
    @Column//(unique = true,nullable = false)
    @GeneratedValue
    private int id;

    @Column(name="product_name", nullable = false,length = 65)
    private String name;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAdd;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdate;

    @Column(length = 65)
    private String ownerName;

    @Column(name="description")
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(Date dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
