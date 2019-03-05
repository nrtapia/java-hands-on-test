package com.ntapia.employeeapp.dto;

import com.ntapia.employeeapp.model.Employee;

import java.math.BigDecimal;

/**
 * Employee Monthly Salary DTO
 */
public final class EmployeeMonthlySalaryDTO extends EmployeeSalaryDTO {

    public EmployeeMonthlySalaryDTO(Employee employee) {
        super(employee);
    }

    @Override
    BigDecimal calculateAnnualSalary(Employee employee) {
        return employee.getMonthlySalary().multiply(Util._12);
    }
}
