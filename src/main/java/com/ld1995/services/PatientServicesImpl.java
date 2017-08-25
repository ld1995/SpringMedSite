package com.ld1995.services;

import com.ld1995.dto.PatientDTO;
import com.ld1995.models.Patient;
import com.ld1995.repository.IPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service("patientService")
public class PatientServicesImpl implements IPatientServices {

    @Autowired
    private IPatientRepository patientRepository;

    @Override
    public List<Patient> getPatientsList() {
        return patientRepository.findAll();
    }

    public List<PatientDTO> getPatientsDTOList() {
        return patientRepository.findAll()
                .stream()
                .map(patient -> new PatientDTO(
                        patient.getDepartment().getName(),
                        patient.getNumber(),
                        patient.getDate(),
                        patient.getLast(),
                        patient.getFirst(),
                        patient.getSecond()))
                .collect(Collectors.toList());
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
