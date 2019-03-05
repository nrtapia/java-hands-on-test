package com.ntapia.employeeapp.dao;

import com.ntapia.employeeapp.model.Employee;

import java.util.List;
import java.util.Optional;

/**
 * Data Access Object for Employee Entity
 */
public interface EmployeeDAO {

    /**
     * Method to retrieve all employees
     *
     * @return a list of Employee
     */
    List<Employee> findAll();

    /**
     * Method to get a employee data
     *
     * @param id
     *         employee unique id
     * @return Employee data
     */
    Optional<Employee> get(Long id);
}
