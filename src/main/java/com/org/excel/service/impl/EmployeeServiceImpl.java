package com.org.excel.service.impl;

import com.org.excel.dao.EmployeeDao;
import com.org.excel.model.Employee;
import com.org.excel.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;

	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
	}

	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}
}
