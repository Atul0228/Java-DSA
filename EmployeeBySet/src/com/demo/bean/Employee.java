package com.demo.bean;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
 private int eId;
 private String eName;
 private double eSalary;
 private LocalDate eJoinDate;
 
 


public Employee(int eId, String name, double eSalary, LocalDate ldt) {
	super();
	this.eId = eId;
	this.eName = name;
	this.eSalary = eSalary;
	this.eJoinDate = ldt;
}

public Employee(int eId) {
	super();
	this.eId = eId;
}

public Employee() {
	super();
}

public Employee(double eSalary) {
	super();
	this.eSalary = eSalary;
}

public Employee(String eName) {
	super();
	this.eName = eName;
}

public Employee(LocalDate eJoinDate) {
	super();
	this.eJoinDate = eJoinDate;
}

@Override
public String toString() {
	return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", eJoinDate=" + eJoinDate + "]";
}

public int geteId() {
	return eId;
}

public void seteId(int eId) {
	this.eId = eId;
}

public String geteName() {
	return eName;
}

public void seteName(String eName) {
	this.eName = eName;
}

public double geteSalary() {
	return eSalary;
}

public void seteSalary(double eSalary) {
	this.eSalary = eSalary;
}

public LocalDate geteJoinDate() {
	return eJoinDate;
}

public void seteJoinDate(LocalDate eJoinDate) {
	this.eJoinDate = eJoinDate;
}



}
