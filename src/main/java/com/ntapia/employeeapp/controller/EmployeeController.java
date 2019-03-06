package com.ntapia.employeeapp.controller;

import com.ntapia.employeeapp.dto.EmployeeSalaryDTO;
import com.ntapia.employeeapp.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller to expose Employee REST endpoints
 *
 * GET    /api/employees
 * GET    /api/employees/{id}
 */
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private static final String PATH_ID = "/{id}";
    private static final String PATH_VARIABLE = "id";

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeSalaryDTO> listAll() {
        return employeeService.findAll();
    }

    @RequestMapping(value = PATH_ID, method = RequestMethod.GET)
    public EmployeeSalaryDTO getById(@PathVariable(PATH_VARIABLE) Long id) {
        return employeeService.get(id);
    }
}
