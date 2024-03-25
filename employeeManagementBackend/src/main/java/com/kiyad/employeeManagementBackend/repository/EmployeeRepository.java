package com.kiyad.employeeManagementBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiyad.employeeManagementBackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
