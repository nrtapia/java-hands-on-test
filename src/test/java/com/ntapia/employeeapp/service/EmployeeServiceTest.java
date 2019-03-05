package com.ntapia.employeeapp.service;

import com.ntapia.employeeapp.dao.EmployeeDAO;
import com.ntapia.employeeapp.dto.EmployeeHourlySalaryDTO;
import com.ntapia.employeeapp.dto.EmployeeMonthlySalaryDTO;
import com.ntapia.employeeapp.dto.EmployeeSalaryDTO;
import com.ntapia.employeeapp.dto.Util;
import com.ntapia.employeeapp.exception.EmployeeNotFoundException;
import com.ntapia.employeeapp.model.Employee;
import com.ntapia.employeeapp.service.impl.EmployeeServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.Optional;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Employee Service Implementation Unit Test
 */
@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {

    @Mock
    private EmployeeDAO employeeDAO;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Test(expected = EmployeeNotFoundException.class)
    public void testGetEmployeeNotFound() {
        Long id = 1L;
        when(employeeDAO.get(id)).thenThrow(new EmployeeNotFoundException());

        employeeService.get(id);

        verify(employeeDAO, times(1)).get(id);
    }

    @Test
    public void testGetEmployeeMonthlySalaryDTOData() {
        Long id = 1L;
        BigDecimal salary = BigDecimal.valueOf(100);
        BigDecimal expected = Util._12.multiply(salary);

        Employee employee = new Employee();
        employee.setId(id);
        employee.setContractTypeName(Employee.ContractType.MONTHLY_SALARY_EMPLOYEE);
        employee.setMonthlySalary(salary);

        when(employeeDAO.get(id)).thenReturn(Optional.of(employee));

        EmployeeSalaryDTO dto = employeeService.get(id);
        assertTrue("EmployeeMonthlySalaryDTO expected!", dto instanceof EmployeeMonthlySalaryDTO);
        assertEquals("Annual salary wrong!", expected, dto.getAnnualSalary());

        verify(employeeDAO, times(1)).get(id);
    }

    @Test
    public void testGetEmployeeHourlySalaryDTOData() {
        Long id = 1L;
        BigDecimal salary = BigDecimal.valueOf(100);
        BigDecimal expected = Util._120_MULTIPLIED_BY_12.multiply(salary);

        Employee employee = new Employee();
        employee.setId(id);
        employee.setContractTypeName(Employee.ContractType.HOURLY_SALARY_EMPLOYEE);
        employee.setHourlySalary(salary);

        when(employeeDAO.get(id)).thenReturn(Optional.of(employee));

        EmployeeSalaryDTO dto = employeeService.get(id);
        assertTrue("EmployeeHourlySalaryDTO expected!", dto instanceof EmployeeHourlySalaryDTO);
        assertEquals("Annual salary wrong!", expected, dto.getAnnualSalary());

        verify(employeeDAO, times(1)).get(id);
    }
}
