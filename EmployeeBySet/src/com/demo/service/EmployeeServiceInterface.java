package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.bean.Employee;

public interface EmployeeServiceInterface {



	boolean addEmployee();

	//Employee displayId(int id);

	

	Set<Employee> displayAll();

	Employee searchId(int id);

	Set<Employee> searchByName(String ename);

	boolean upadteBySalary(int id, double sal);

	boolean deleteById(int id);

	boolean deleteBySalary(double sal);

	List<Employee> sortBySal();

	List<Employee> sortByName();

	Set<Employee> sortById();

	List<Employee> searchBySalary(double esal);

}
