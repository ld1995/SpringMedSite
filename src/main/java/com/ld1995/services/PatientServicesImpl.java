package com.ld1995.services;

import com.ld1995.models.Patient;
import com.ld1995.repository.IPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("patientService")
public class PatientServicesImpl implements IPatientServices {

    @Autowired
    private IPatientRepository patientRepository;

    @Override
    public List<Patient> getPatientsList() {
        List<Patient> list = new ArrayList<>();
        for (Patient patient : patientRepository.findAll()) {
            list.add(new Patient(patient.getWards().getName(),patient.getNumber(),patient.getDate(),patient.getLast(),patient.getFirst(),patient.getSecond()));
        }
        return list;
    }

    @Override
    public Patient getPatientById(long id) {
        return patientRepository.findOne(id);
    }

    @Override
    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);
    }

    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }
}
