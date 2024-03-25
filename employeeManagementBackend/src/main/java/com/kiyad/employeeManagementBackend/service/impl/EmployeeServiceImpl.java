package com.kiyad.employeeManagementBackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.kiyad.employeeManagementBackend.model.Employee;
import com.kiyad.employeeManagementBackend.repository.EmployeeRepository;
import com.kiyad.employeeManagementBackend.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {

		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee createEmployee(Employee employee) {
		
		Employee savedEmployee = 	employeeRepository.save(employee);
		
		return savedEmployee;
	}


	@Override
	public Employee getEmployeeById(long id) {
		
		Employee employee = employeeRepository.findById(id).orElseThrow();
		
		return employee;
	}


	@Override
	public List<Employee> getAllEmployee() {
	
		  List<Employee> employeeList= employeeRepository.findAll();
		  
		  return employeeList;
	}


	@Override
	public Employee updateEmployee(Long id, Employee updatedEmployee) {
		
		Employee employee = employeeRepository.findById(id).orElseThrow();
		
		employee.setFirstName(updatedEmployee.getFirstName());
		employee.setLastName(updatedEmployee.getLastName());
		employee.setEmail(updatedEmployee.getEmail());
		
		Employee employeeUpdated = employeeRepository.save(employee);
		
		return employeeUpdated;
	}


	@Override
	public void deleteEmployee(Long id) {
		
		employeeRepository.deleteById(id);
		
	}

}
