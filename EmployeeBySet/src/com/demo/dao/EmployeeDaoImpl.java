package com.demo.dao;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Optional;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import com.demo.bean.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class EmployeeDaoImpl implements EmployeeDaoInterfaceClass{

	static Set<Employee> eSet=new HashSet<>();
	@Override
	public boolean save(Employee e) {
		
		
		eSet.add(e);
		
		return true;
	}
	
	@Override
	public Set<Employee> displayAll() {
		// TODO Auto-generated method stub
		return eSet;
	}
	
	@Override
	public Employee searchId(int id) {
		
		Optional<Employee> ob=eSet.stream().filter(e->e.geteId()==id).findFirst();
		if(ob!=null)
		{
			return ob.get();
		}
		return null;
	}

	@Override
	public Set<Employee> searchByName(String ename) {
		Set<Employee> eDataSet=new HashSet<>();
		for(Employee e:eSet)
		{
			if(e.geteName().equals(ename)) {
				eDataSet.add(e);
			}
		}
		if(eDataSet.size()>0) {
			   return eDataSet;
		   }
			return null;
		
	}

	@Override
	public boolean upadteBySalary(int id, double salary) {
		
		Employee e=searchId(id);
		e.seteSalary(salary);
		
		
		return true;
	}

	
	@Override
	public boolean deleteById(int id) {
		Employee e=searchId(id);
		if(e!=null)
		{
			eSet.remove(e);
			return true;
		}
		return false;
	}


	public boolean deleteBySalary(double sal) {
		
		return eSet.removeIf(e->e.geteSalary()>=sal);
	}

	
	@Override
	public List<Employee> searchBySalary(double esal) {
		
		return eSet.stream()
	               .filter(e -> e.geteSalary() == esal)
	               .collect(Collectors.toList());
	}

}
