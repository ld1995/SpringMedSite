package com.ld1995.dto;

import java.util.Date;

public class PatientDTO extends BasePersistenceDTO {

    public PatientDTO(String departmentName, Integer number, Date date, String last, String first, String second) {
        this.departmentName = departmentName;
        this.number = number;
        this.date = date;
        this.last = last;
        this.first = first;
        this.second = second;
    }

    private String departmentName;

    private Integer number;

    private Date date;

    private String last;

    private String first;

    private String second;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
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
