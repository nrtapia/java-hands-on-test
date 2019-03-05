package com.ntapia.employeeapp.model;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Employee Entity
 */
@Data
public class Employee implements Serializable {

    public enum ContractType {
        @JsonProperty("HourlySalaryEmployee")
        HOURLY_SALARY_EMPLOYEE,

        @JsonProperty("MonthlySalaryEmployee")
        MONTHLY_SALARY_EMPLOYEE
    }

    private Long id;
    private String name;
    private ContractType contractTypeName;
    private Long roleId;
    private String roleName;
    private String roleDescription;
    private BigDecimal hourlySalary;
    private BigDecimal monthlySalary;
}
