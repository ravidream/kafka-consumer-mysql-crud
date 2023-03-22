package com.example.repo;

import com.example.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dto.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {

}
