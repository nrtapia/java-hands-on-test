package com.ntapia.employeeapp.service.impl;

import com.ntapia.employeeapp.dao.EmployeeDAO;
import com.ntapia.employeeapp.service.FactoryEmployeeDTO;
import com.ntapia.employeeapp.exception.EmployeeNotFoundException;
import com.ntapia.employeeapp.service.EmployeeService;
import com.ntapia.employeeapp.dto.EmployeeSalaryDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Employee Service Implementation
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<EmployeeSalaryDTO> findAll() {
        return employeeDAO.findAll().stream()
                .map(FactoryEmployeeDTO::getEmployeeDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeSalaryDTO get(Long id) {
        return employeeDAO.get(id)
                .map(FactoryEmployeeDTO::getEmployeeDTO)
                .orElseThrow(EmployeeNotFoundException::new);
    }
}
