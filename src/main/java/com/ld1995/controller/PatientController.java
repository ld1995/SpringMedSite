package com.ld1995.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PatientController {

    @RequestMapping(path="/", method= RequestMethod.GET)
    public String goHome(){
        return "index";
    }

}
