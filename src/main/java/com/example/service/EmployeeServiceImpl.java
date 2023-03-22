package com.example.service;

import com.example.entity.EmployeeEntity;
import com.example.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public void save(EmployeeEntity employee) {
        employeeRepo.save(employee);
    }
}
