package com.org.excel.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.org.excel.dao.EmployeeDao;
import com.org.excel.model.Employee;



@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private MongoTemplate mongoTemplate;
     

	public List<Employee> getAllEmployees() {
		return mongoTemplate.findAll(Employee.class);
	}

	public Employee getEmployeeById(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		return mongoTemplate.findOne(query, Employee.class);
	}

	public Employee addNewEmployee(Employee employee) {
		mongoTemplate.save(employee);
		return employee;
	}
	
	public Employee editEmployee(Employee employee) {
		mongoTemplate.updateFirst(new Query(Criteria.where("id").is(employee.getEmpId())),Update.update("name", employee.getEmpName()), Employee.class);
		return employee;
	}
	
	
	public void deleteEmployee(Integer employeeId) {
		 mongoTemplate.remove(new Query(Criteria.where("employeeId").is(employeeId)), Employee.class);
	}

	public void insertEmployee(Employee employee) {
		mongoTemplate.save(employee);
		
	}

}