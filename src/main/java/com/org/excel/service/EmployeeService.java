package com.org.excel.service;

import java.util.List;

import com.org.excel.model.Employee;


public interface EmployeeService {
	void insertEmployee(Employee emp);
	List<Employee> getAllEmployees();
}