package com.ld1995.services;

import com.ld1995.models.Patient;

import java.util.List;

public interface IPatientServices {

    public List<Patient> getPatientsList();

    public Patient getPatientById(long id);
}
