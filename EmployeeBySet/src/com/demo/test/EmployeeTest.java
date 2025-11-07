package com.demo.test;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.bean.Employee;
import com.demo.service.*;
public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		EmployeeServiceInterface eService = new EmployeeServiceImpl();
		do{
			System.out.println("1)Add Employee\n 2) Display All \n 3)Search by id");
			System.out.println("4)Search by name \n 5)Update sal\n 6)Delete by id\n");
			System.out.println("7) Delete by sal\n 8)Search by salary \n 9)Sort by id  \n 10)Sort by name\n");
			System.out.println("11) Sort by id");
			   choice=sc.nextInt();
			   switch(choice) 
			   {
			   case 1->{
				   System.out.println("Add Employee");
				   boolean e= eService.addEmployee();
			   }
			   case 2->{
				   System.out.println("Display All");
				   Set<Employee> eset=eService.displayAll();
				   eset.forEach(System.out::println);
				 
			  }
			   case 3->{
				   System.out.println("Enter Id");
				   int id=sc.nextInt();
				   Employee e=eService.searchId(id);
				   if(e!=null) {
					   System.out.println(e);
				   }else {
					   System.out.println("not found");
				   }
			   }
			   case 4->{
				   sc.nextLine();
				   System.out.println("search by name");
				   String ename=sc.nextLine();
				   Set<Employee> eset=eService.searchByName(ename);
				   if(eset!=null) {
					   eset.forEach(System.out::println);
				   }else {
				   System.out.println("Name not found");}
				   
			   }
			   case 5->{
				   System.out.println("Enter id");
				   int id=sc.nextInt();
				   System.out.println("Enter Salary");
				  double sal=sc.nextDouble();
				   
				   boolean status =eService.upadteBySalary(id,sal);
				   if(status) {
					   System.out.println("updated Successfully");
				   }else {
					   System.out.println("Not found");
				   }
			   }
			   case 6->{
				   System.out.println("Enter id to delete");
				   int id =sc.nextInt();
				   boolean status=eService.deleteById(id);
				   if(status) {
					   System.out.println("the id is deleted");
				   }else {
					   System.out.println("id not found");
				   }
			   }
			   
			   case 7->{
				   System.out.println("Enter Salary to be deleted");
				   double sal =sc.nextDouble();
				   boolean status=eService.deleteBySalary(sal);
				   if(status) {
					   System.out.println("the Salary is deleted");
				   }else {
					   System.out.println("id not found");
				   }
			   }
			   
			   case 8->{
				   System.out.println("Enter Salary to search");
				   double esal=sc.nextDouble();
				   List<Employee> esalary=eService.searchBySalary(esal);
				   if(esalary!=null) {
					   esalary.forEach(System.out::println);
				   }else {
					   System.out.println("not found");
				   }
			   }
			   
			   case 9->{
				   List<Employee> elist=eService.sortBySal();
						   elist.forEach(System.out::println);
			   }
			   
			   
			   case 10->{
				   List<Employee> elist=eService.sortByName();
					elist.forEach(System.out::println);
			   }
			   case 11->{
				   Set<Employee> eset=eService.sortById();
					eset.forEach(System.out::println);
			   }
			   
			   
			    }
		
			
		}while(choice!=11);

	}

}
