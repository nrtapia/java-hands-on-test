package com.ntapia.employeeapp.dto;

import lombok.Getter;
import com.ntapia.employeeapp.model.Employee;

import java.math.BigDecimal;

/**
 * Abstract Employee DTO
 */
@Getter
public abstract class EmployeeSalaryDTO {

    private final Long id;
    private final String name;
    private final String contractTypeName;
    private final Long roleId;
    private final String roleName;
    private final String roleDescription;
    private final BigDecimal hourlySalary;
    private final BigDecimal monthlySalary;
    private final BigDecimal annualSalary;

    EmployeeSalaryDTO(Employee employee) {
        id = employee.getId();
        name = employee.getName();
        contractTypeName = employee.getContractTypeName().name();
        roleId = employee.getRoleId();
        roleName = employee.getRoleName();
        roleDescription = employee.getRoleDescription();
        hourlySalary = employee.getHourlySalary();
        monthlySalary = employee.getMonthlySalary();

        annualSalary = calculateAnnualSalary(employee);
    }

    /**
     * Abstract method to calculate the annual salary
     *
     * @param employee
     *         employee data
     * @return annual salary
     */
    abstract BigDecimal calculateAnnualSalary(Employee employee);
}
