package com.ld1995.serves;

import com.ld1995.modul.Patient;
import com.ld1995.repository.IPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("patientService")
public class PatientServesImpl implements IPatientServes {

    @Autowired
    private IPatientRepository patientRepository;


    @Override
    public List<Patient> getPatientsList() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(long id) {
        return patientRepository.findOne(id);
    }
}
