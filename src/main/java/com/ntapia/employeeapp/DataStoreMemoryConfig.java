package com.ntapia.employeeapp;

import com.ntapia.employeeapp.dao.EmployeeDAO;
import com.ntapia.employeeapp.dao.impl.EmployeeDAOMemoryStoreImpl;
import com.ntapia.employeeapp.model.Employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Config to download the Employee information to create the memory data store
 */
@Configuration
public class DataStoreMemoryConfig {

    private static final Logger LOG = LoggerFactory.getLogger(DataStoreMemoryConfig.class);

    @Value("${app.employee.apiUrl}")
    private String employeeApiUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    @Bean
    public EmployeeDAO employeeDAO() {
        LOG.info("Start to download the Employee data from API");

        ResponseEntity<List<Employee>> response = this.restTemplate.exchange(
                employeeApiUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Employee>>() {}
                );

        LOG.info("Download Employee data finished!");

        return new EmployeeDAOMemoryStoreImpl(response.getBody());
    }
}
