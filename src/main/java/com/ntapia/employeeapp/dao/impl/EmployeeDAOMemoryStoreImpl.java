package com.ntapia.employeeapp.dao.impl;

import com.ntapia.employeeapp.dao.EmployeeDAO;
import com.ntapia.employeeapp.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Data Access Object implementation for Memory Data
 */
public class EmployeeDAOMemoryStoreImpl implements EmployeeDAO {

    private final Map<Long, Employee> dataStore = new ConcurrentHashMap<>();

    public EmployeeDAOMemoryStoreImpl(List<Employee> employeeList) {
        employeeList.forEach(employee -> dataStore.put(employee.getId(), employee));
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(dataStore.values());
    }

    @Override
    public Optional<Employee> get(Long id) {
        return Optional.ofNullable(dataStore.get(id));
    }
}
