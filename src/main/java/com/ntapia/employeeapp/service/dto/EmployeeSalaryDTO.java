package com.ntapia.employeeapp.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.ntapia.employeeapp.model.Employee;

import java.math.BigDecimal;

/**
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class EmployeeSalaryDTO extends Employee {

    private BigDecimal annualSalary;

    public EmployeeSalaryDTO(Employee employee) {
        super(employee.getId(),
                employee.getName(),
                employee.getContractTypeName(),
                employee.getRoleId(),
                employee.getRoleName(),
                employee.getRoleDescription(),
                employee.getHourlySalary(),
                employee.getMonthlySalary());
    }

    public abstract void calculateAndSetAnnualSalary();

}
