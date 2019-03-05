package com.ntapia.employeeapp.service;

import com.ntapia.employeeapp.dto.EmployeeHourlySalaryDTO;
import com.ntapia.employeeapp.dto.EmployeeMonthlySalaryDTO;
import com.ntapia.employeeapp.dto.EmployeeSalaryDTO;
import com.ntapia.employeeapp.exception.EmployeeContractTypeNotSupported;
import com.ntapia.employeeapp.model.Employee;

/**
 * Employee DTO Factory
 */
public final class FactoryEmployeeDTO {

    private FactoryEmployeeDTO() {
    }

    /**
     * Method to build a Employee Salary DTO
     *
     * @param employee
     *         employee data
     * @return EmployeeSalaryDTO instance
     */
    public static EmployeeSalaryDTO getEmployeeDTO(Employee employee) {

        switch (employee.getContractTypeName()) {
            case HOURLY_SALARY_EMPLOYEE:
                return new EmployeeHourlySalaryDTO(employee);
            case MONTHLY_SALARY_EMPLOYEE:
                return new EmployeeMonthlySalaryDTO(employee);
            default:
                throw new EmployeeContractTypeNotSupported();
        }
    }
}
