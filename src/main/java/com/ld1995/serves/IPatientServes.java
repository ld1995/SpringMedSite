package com.ld1995.serves;

import com.ld1995.modul.Patient;

import java.util.List;

public interface IPatientServes {

    public List<Patient> getPatientsList();

    public Patient getPatientById(long id);
}
