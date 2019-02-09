package com.org.excel.dao;

import java.util.List;

import com.org.excel.model.Employee;



public interface EmployeeDao {
	void insertEmployee(Employee cus);
	List<Employee> getAllEmployees();
}