package com.ld1995.controller;

import com.ld1995.models.Patient;
import com.ld1995.models.Role;
import com.ld1995.models.User;
import com.ld1995.services.PatientServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sun.plugin.liveconnect.SecurityContextHelper;

import static java.util.stream.Collectors.joining;

@Controller
public class PatientController {

    @Autowired
    PatientServicesImpl patientServices;

    @RequestMapping(path="/", method= RequestMethod.GET)
    public String goHome(){
        return "index";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("patientForm", new Patient());
        return "new";
    }

    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public String addPatient(@ModelAttribute("patientForm") Patient patient, BindingResult bindingResult, Model model) {
        patientServices.save(patient);
        return "index";
    }

}
