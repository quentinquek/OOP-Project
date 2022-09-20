package com.app.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.rest.model.Employee;
import com.app.rest.repository.EmployeeRepository;

@Service
public class EmployeeService {
  
  	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
	  	this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees() {
	  	return employeeRepository.findAll();
	}

	public Employee addNewEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
}
