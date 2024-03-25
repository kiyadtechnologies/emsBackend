package com.kiyad.employeeManagementBackend.service;

import java.util.List;

import com.kiyad.employeeManagementBackend.model.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	List<Employee> getAllEmployee();
	
	Employee updateEmployee(Long id, Employee updatedEmployee);
	
	void deleteEmployee(Long id);

}
