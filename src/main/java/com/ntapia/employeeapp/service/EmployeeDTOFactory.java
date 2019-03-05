package com.ntapia.employeeapp.service;

import com.ntapia.employeeapp.model.Employee;
import com.ntapia.employeeapp.service.dto.EmployeeHourlySalaryDTO;
import com.ntapia.employeeapp.service.dto.EmployeeMonthlySalaryDTO;
import com.ntapia.employeeapp.service.dto.EmployeeSalaryDTO;

import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class EmployeeDTOFactory {

    public EmployeeSalaryDTO getEmployeeDTO(Employee employee){
        EmployeeSalaryDTO dto = Employee.ContractType.HOURLY_SALARY_EMPLOYEE == employee.getContractTypeName()
                ? buildHourlySalary(employee) : buildMonthlySalary(employee);

        dto.calculateAndSetAnnualSalary();
        return dto;
    }

    private EmployeeSalaryDTO buildMonthlySalary(Employee employee) {
        return new EmployeeMonthlySalaryDTO(employee);
    }

    private EmployeeSalaryDTO buildHourlySalary(Employee employee){
        return new EmployeeHourlySalaryDTO(employee);
    }
}
