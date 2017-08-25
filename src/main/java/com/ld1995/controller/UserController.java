package com.ld1995.controller;

import com.ld1995.models.Department;
import com.ld1995.models.Role;
import com.ld1995.models.User;
import com.ld1995.repository.IDepartmentRepository;
import com.ld1995.services.DepartmentServicesImpl;
import com.ld1995.services.SecurityServicesImpl;
import com.ld1995.services.UserServiceImpl;
import com.ld1995.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static java.util.stream.Collectors.joining;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private UserValidator userValidator;

    @Autowired
    private SecurityServicesImpl securityServices;

    @Autowired
    private DepartmentServicesImpl departmentServices;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());
        //model.addAttribute("getDepartments", departmentServices.getDepartmentList());
        return "registration";
    }

    @ModelAttribute("getDepartmentList")
    public List<Department> departments() {
        return departmentServices.getDepartmentList();
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingUserForm,
                               @ModelAttribute("getDepartmentList") Department department, BindingResult bindingGetDepartment,
                               Model model) {
        //получить департамент? с формы передается лишь 1 option
        userForm.setDepartment(department);
        userValidator.validate(userForm, bindingUserForm);

        if (bindingUserForm.hasErrors())
            return "registration";

        userService.saveUser(userForm);
        securityServices.autologin(userForm.getUsername(), userForm.getPasswordConfirm());
        return "redirect:/";
    }

    @RequestMapping(path = "/login")
    public String getLogin(@RequestParam(value = "error",required = false) String error,
                           @RequestParam(value = "logout",required = false) String logout,
                           Model model) { //request - обязательный атрибут или нет
        model.addAttribute("error", error != null);
        model.addAttribute("logout", logout != null);
        return "login";
    }

    @RequestMapping(path = "/info")
    public String getInfo(Model model){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = (User) authentication.getPrincipal();
        model.addAttribute("username", user.getUsername());
        model.addAttribute("role", user.getAuthorities().stream().map(Role::getAuthority).collect(joining(",")));
        return "info";
    }
}
