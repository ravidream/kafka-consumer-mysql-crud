package com.example.service;

import com.example.entity.EmployeeEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumerService {

    @Autowired
    EmployeeService employeeService;
    public boolean process(String message) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        EmployeeEntity employeeEntity = objectMapper.readValue(message, EmployeeEntity.class);
        employeeService.save(employeeEntity);
        return true;
    }
}
