package com.ld1995.models;

import javax.persistence.*;

@Entity
@Table(name = "wards")
public class Wards {

    public Wards() {
    }

    public Wards(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "wards_id")
    private int id;

    @Column(name = "name")
    private String name;

//    @OneToOne(mappedBy = "patient")
//    private Patient patient;
//
//    @OneToOne(mappedBy = "user")
//    private User user;

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

    @Override
    public String toString() {
        return name;
    }

    //    public Patient getPatient() {
//        return patient;
//    }
//
//    public void setPatient(Patient patient) {
//        this.patient = patient;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
}