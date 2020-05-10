package com.conferencedemo.controller;

import java.util.List;
import java.util.*;

//import com.conferencedemo.dao.EmployeeDAO;
import com.conferencedemo.model.Employee;
import com.conferencedemo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRESTController {
	
	@Autowired
	private EmployeeService employeeService;
	
	public List<Employee> listEmployees() {
		return employeeService.findAll();
	}

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to RestTemplate Demo.";
	}

	// URL - Get all employees - http://localhost:8080/employees
	@RequestMapping(value = "/employees", //
			method = RequestMethod.GET, //
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Employee> getEmployees() {
		List<Employee> list = employeeService.findAll();
		return list;
	}

	// URL - Get employee - http://localhost:8080/employee/{empNo}
	@RequestMapping(value = "/employee", //
			method = RequestMethod.GET, //
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public Optional<Employee> getEmployee(@RequestBody Employee emp) {
		return employeeService.getEmp(emp);
	}
	
	//URL - Update existing employee list - http://localhost:8080/employee
	@RequestMapping(value = "/employee",//
			method = RequestMethod.PUT, //
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public Employee updateEmployee(@RequestBody Employee emp) {
		return employeeService.updateEmp(emp);
	}
	
	//URL - Insert to existing employee list - http://localhost:8080/employee
	@RequestMapping(value = "/employee",//
			method = RequestMethod.POST, //
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public Employee insertEmployee(@RequestBody Employee emp) {
		return employeeService.insertEmp(emp);
	}
	
	// URL - Delete an employee - http://localhost:8080/employee
	@RequestMapping(value = "/employee",
			method = RequestMethod.DELETE,
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public void deleteEmployee(@RequestBody Employee emp) {		
		employeeService.deleteEmp(emp);
	}
}