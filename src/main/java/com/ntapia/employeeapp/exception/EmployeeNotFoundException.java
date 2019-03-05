package com.ntapia.employeeapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Employee Not Found
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Employee not found!")
public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException() {
        super();
    }
}
