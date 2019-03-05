package com.ntapia.employeeapp.service.dto;

import lombok.Setter;
import lombok.experimental.SuperBuilder;
import com.ntapia.employeeapp.model.Employee;

/**
 *
 */
@Setter
@SuperBuilder
public class EmployeeMonthlySalaryDTO extends EmployeeSalaryDTO {

    public EmployeeMonthlySalaryDTO(Employee employee) {
        super(employee);
    }

    @Override
    public void calculateAndSetAnnualSalary() {
        setAnnualSalary(getMonthlySalary().multiply(Util._12));
    }
}
