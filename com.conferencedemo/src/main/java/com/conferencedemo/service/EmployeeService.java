package com.conferencedemo.service;

import java.util.List;
import java.util.Optional;

import com.conferencedemo.model.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	Employee updateEmp(Employee emp);
	void deleteEmp(Employee emp);
	Optional<Employee> getEmp(Employee emp);
	Employee insertEmp(Employee emp);
}
