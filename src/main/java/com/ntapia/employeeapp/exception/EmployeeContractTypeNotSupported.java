package com.ntapia.employeeapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Employee Contract Type Not Supported
 */
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Employee contract type not supported!")
public class EmployeeContractTypeNotSupported extends RuntimeException {

    public EmployeeContractTypeNotSupported() {
        super();
    }
}
