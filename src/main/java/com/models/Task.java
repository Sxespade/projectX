package com.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "Persons")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long id;

    @Column
    String name;

    @Column
    String address;

    @Column
    String personOrder;

    @Column
    String cost;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void setPersonOrder(String personOrder) {
        this.personOrder = personOrder;
    }


    public void setCost(String cost) {
        this.cost = cost;
    }


    public String getCost() {
        return cost;
    }


    public String getPersonOrder() {
        return personOrder;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }


}
