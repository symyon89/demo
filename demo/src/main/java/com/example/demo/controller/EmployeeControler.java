package com.example.demo.controller;

import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeControler {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping({"/showEmployees","/list"})
    public ModelAndView getAllEmployees() {
        ModelAndView mav = new ModelAndView("list-employees");
        mav.addObject("employees",employeeRepository.findAll());
        return mav;
    }
}
