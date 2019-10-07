package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.EmployeeServiceException;
import com.exception.ResourceNotFoundException;
import com.models.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/emp")
	public Employee getEmployee() throws EmployeeServiceException, ResourceNotFoundException {
		Employee employee = null;
		try {
			employee = employeeService.getEmployee();
			if(employee == null) {
				throw new ResourceNotFoundException("Resource not found.");
			}
		} catch(EmployeeServiceException e) {
			throw new EmployeeServiceException(e.getMessage());
		}		
		return employee;
	}
	
	@RequestMapping("/emp1")
	public Employee getEmployeeNull() throws EmployeeServiceException, ResourceNotFoundException {
		Employee employee = null;
		try {
			employee = employeeService.getEmployeeNull();
			if(employee == null) {
				throw new ResourceNotFoundException("Resource not found.");
			}
		} catch(EmployeeServiceException e) {
			throw new EmployeeServiceException(e.getMessage());
		}		
		return employee;
	}
	
	@RequestMapping("/emp2")
	public Employee getEmployeeException() throws Exception {
		Employee employee = null;
		try {
			employee = employeeService.getEmployeeException();
			if(employee == null) {
				throw new ResourceNotFoundException("Resource not found.");
			}
		} catch(EmployeeServiceException e) {
			throw new EmployeeServiceException(e.getMessage());
		}		
		return employee;
	}
}
