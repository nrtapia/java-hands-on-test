package com.ntapia.employeeapp.dto;

import com.ntapia.employeeapp.model.Employee;

import java.math.BigDecimal;

/**
 * Employee Hourly Salary DTO
 */
public final class EmployeeHourlySalaryDTO extends EmployeeSalaryDTO {

    public EmployeeHourlySalaryDTO(Employee employee) {
        super(employee);
    }

    @Override
    protected BigDecimal calculateAnnualSalary(Employee employee) {
        return Util._120_MULTIPLIED_BY_12.multiply(employee.getHourlySalary());
    }
}
