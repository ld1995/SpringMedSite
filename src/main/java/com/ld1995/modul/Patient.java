package com.ld1995.modul;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "wards")
    private String wards;
    @Column(name = "number")
    private Integer number;
    @Column(name = "date", columnDefinition="DATETIME")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "last")
    private String last;
    @Column(name = "first")
    private String first;
    @Column(name = "second")
    private String second;

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", wards='" + wards + '\'' +
                ", number=" + number +
                ", date=" + date +
                ", last='" + last + '\'' +
                ", first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWards() {
        return wards;
    }

    public void setWards(String wards) {
        this.wards = wards;
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

}