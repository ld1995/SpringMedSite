package com.ld1995.controller;

import com.ld1995.models.Patient;
import com.ld1995.services.IPatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestController {

    @Autowired
    private IPatientServices patientServes;

    @RequestMapping(path="/patients", method= RequestMethod.GET)
    public List<Patient> getAllEmployees(){
        return patientServes.getPatientsList();
    }

    @RequestMapping(value = "/patients/{id}", method = RequestMethod.GET)
    public Patient getEmployeeById(@PathVariable("id") long id){
        return patientServes.getPatientById(id);
    }
}
