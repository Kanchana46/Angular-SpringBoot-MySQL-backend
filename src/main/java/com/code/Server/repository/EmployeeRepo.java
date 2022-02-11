package com.code.Server.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.Server.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
