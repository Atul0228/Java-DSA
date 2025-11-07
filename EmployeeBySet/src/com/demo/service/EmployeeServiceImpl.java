package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.bean.Employee;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.dao.EmployeeDaoInterfaceClass;

public class EmployeeServiceImpl implements EmployeeServiceInterface{

	EmployeeDaoInterfaceClass eDao;
	
	public EmployeeServiceImpl()
	{
		eDao=new EmployeeDaoImpl();
	}
	
	@Override
	public boolean addEmployee() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Employee Id");
		int eId=sc.nextInt();
		System.out.println("Enter the Employee Name");
		String name=sc.next();
		System.out.println("Enter the Salary of the employee");
		double salary=sc.nextDouble();
		System.out.println("Enter the Joining Date of Employee (dd/mm/yyyy)");
		String date=sc.next();
		LocalDate ldt=LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Employee e=new Employee(eId,name,salary,ldt);
		return eDao.save(e);
	}

	public Employee searchId(int id) {
		return eDao.searchId(id);
		
	}

	//public Employee displayId(int id) {
		// TODO Auto-generated method stub
		//return null;
	//}

	public Set<Employee> displayAll() {
		// TODO Auto-generated method stub
		return eDao.displayAll();
	}

	public Set<Employee> searchByName(String ename) {
		// TODO Auto-generated method stub
		return eDao.searchByName(ename);
	}

	public boolean upadteBySalary(int id, double sal) {
		// TODO Auto-generated method stub
		return eDao.upadteBySalary(id,sal);
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return eDao.deleteById(id);
	}

	@Override
	public boolean deleteBySalary(double sal) {
		// TODO Auto-generated method stub
		return eDao.deleteBySalary(sal);
	}

	@Override
	public List<Employee> sortBySal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Employee> sortById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> searchBySalary(double esal) {
		// TODO Auto-generated method stub
		return eDao.searchBySalary(esal);
	}

}
