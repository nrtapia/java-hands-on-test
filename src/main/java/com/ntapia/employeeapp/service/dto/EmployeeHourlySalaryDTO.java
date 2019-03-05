package com.ntapia.employeeapp.service.dto;

import lombok.Setter;
import lombok.experimental.SuperBuilder;
import com.ntapia.employeeapp.model.Employee;

/**
 *
 */
@Setter
@SuperBuilder
public class EmployeeHourlySalaryDTO extends EmployeeSalaryDTO {

    public EmployeeHourlySalaryDTO(Employee employee) {
        super(employee);
    }

    @Override
    public void calculateAndSetAnnualSalary() {
        setAnnualSalary(Util._120_12.multiply(getHourlySalary()));
    }
}
