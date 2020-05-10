package com.conferencedemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conferencedemo.model.Employee;
import com.conferencedemo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {
	}
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Optional<Employee> getEmp(Employee emp) {
		return employeeRepository.findById(emp.getId());
	}
	
	@Override
	public Employee updateEmp(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	@Override
	public void deleteEmp(Employee emp) {
		System.out.println("Id to delete:" + emp.getId());
		employeeRepository.deleteById(emp.getId());
	}
	
	@Override
	public Employee insertEmp(Employee emp) {
		return employeeRepository.insert(emp);
	}
}
