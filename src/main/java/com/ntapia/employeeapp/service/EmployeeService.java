package com.ntapia.employeeapp.service;

import com.ntapia.employeeapp.dto.EmployeeSalaryDTO;

import java.util.List;

/**
 * Employee Service Interface
 */
public interface EmployeeService {

    /**
     * Service to retrieve all employees DTO
     *
     * @return a list of Employee
     */
    List<EmployeeSalaryDTO> findAll();

    /**
     * Method to get a employee DTO data
     *
     * @param id
     *         employee unique id
     * @return Employee DTO data
     */
    EmployeeSalaryDTO get(Long id);
}
