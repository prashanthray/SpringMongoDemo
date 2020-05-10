package com.conferencedemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employee")
public class Employee {
 
	@Id
	private String Id;
	private String empNo;
    private String empName;
    private String position;
    
	
	public Employee() {	  
	}	
 
    public Employee(String Id, String empNo, String empName, String position) {
    	this.Id = Id;
        this.empNo = empNo;
        this.empName = empName;
        this.position = position;
    }
    
    public String getId() {
		return Id;
	}

	public void setId(String id) {
		this.Id = id;
	}
 
    public String getEmpNo() {
        return empNo;
    }
 
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
 
    public String getEmpName() {
        return empName;
    }
 
    public void setEmpName(String empName) {
        this.empName = empName;
    }
 
    public String getPosition() {
        return position;
    }
 
    public void setPosition(String position) {
        this.position = position;
    }
 
}