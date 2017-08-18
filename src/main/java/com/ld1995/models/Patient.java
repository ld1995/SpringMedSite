package com.ld1995.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patient")
public class Patient {

    public Patient() {
    }

    public Patient(Wards wards, Integer number, Date date, String last, String first, String second) {
        this.wards = wards;
        this.number = number;
        this.date = date;
        this.last = last;
        this.first = first;
        this.second = second;
    }

    public Patient(String wardsName, Integer number, Date date, String last, String first, String second) {
        this.number = number;
        this.date = date;
        this.last = last;
        this.first = first;
        this.second = second;
        this.wardsName = wardsName;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wards_id")
    private Wards wards;

    @Column(name = "number")
    private Integer number;

    @Column(name = "date", columnDefinition="DATETIME")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "last")
    private String last;

    @Column(name = "first")
    private String first;

    @Column(name = "second")
    private String second;

    @Transient
    private String wardsName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public void setWards(Wards wards) {
        this.wards = wards;
    }

    public Wards getWards() {
        return wards;
    }
}