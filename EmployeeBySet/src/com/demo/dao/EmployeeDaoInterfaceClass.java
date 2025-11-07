package com.demo.dao;
import java.util.List;
import java.util.Set;

import com.demo.bean.*;
public interface EmployeeDaoInterfaceClass {

	boolean save(Employee e);

	Set<Employee> displayAll();

	Employee searchId(int id);

	Set<Employee> searchByName(String ename);

	boolean upadteBySalary(int id, double salary);

	boolean deleteById(int id);

	boolean deleteBySalary(double sal);

	List<Employee> searchBySalary(double esal);

}
