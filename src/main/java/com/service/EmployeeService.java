package com.service;

import org.springframework.stereotype.Service;

import com.exception.EmployeeServiceException;
import com.models.Employee;

@Service
public class EmployeeService {
	public Employee getEmployee() throws EmployeeServiceException {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Emp");
		return emp;
	}
	
	public Employee getEmployeeNull() throws EmployeeServiceException {
		return null;
	}
	
	public Employee getEmployeeException() throws EmployeeServiceException {
		throw new EmployeeServiceException("Employee service exception");
	}
}
