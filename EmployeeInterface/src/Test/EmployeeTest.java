package Test;
import java.util.List;
import java.util.Scanner;

import Beans.Employe;
import Service.EmployeeBasicServiceInterfaceClass;
import Service.EmployeeServiceCode;
public class EmployeeTest
{

	public static void main(String[] args) 
	{
		EmployeeBasicServiceInterfaceClass emp=new EmployeeServiceCode();
		
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		do {
		System.out.println("1)Add new Employee/n 2)Display All /n 3)Search by id/n");
		System.out.println("4)Search by name/n 5)Update Salary /n 6)Delete by id/n");
		System.out.println("7)Search by Salary/n 8)Sort by Salary /n 9)Exit/n");
		choice=sc.nextInt();
		
		switch(choice)
		{
		
		case 1->{
				if(emp.addNewEmployeeService())
				{
					System.out.println("The New Employee is Added");
				}else {
					System.out.println("Error is occured to save data");
				}
			}
		
		case 2->{
//			List<Employe> ReceiveData;
//			ReceiveData=(List<Employe>) emp.displayAllData();//go to EmployeeServiceCode
//			for(Employe e:ReceiveData)
//			{
//				System.out.println(e);
//			}
			
			List<Employe> elist=emp.displayAllData();
			//elist.forEach(System.out::println);
		}
		
		case 3->{
			System.out.println("Enter the ID");
			int Sid=sc.nextInt();
			Employe eData=emp.searchById(Sid);
			System.out.println(eData);
		}
		
		case 4->{sc.nextLine();
			System.out.println("Enter the Name");
			String sName=sc.nextLine();
			Employe edata=emp.searchByName(sName);
		}
		case 5->{
			System.out.println("Enter the Id to Update Salary");
			int id=sc.nextInt();
			System.out.println("Enter the Updated Salary");
			double uSalary=sc.nextDouble();
			if(emp.updateSalary(id,uSalary))
			{
				System.out.println("Salary is updated");
			}else {
				System.out.println("Salary is not updated");
			}
		}
		
		case 6->
		{
			System.out.println("Enter the Id to delete the Employee");
			int id=sc.nextInt();
			if(emp.deleteById(id))
			{
				System.out.println("The Employee is deleted");
			}else {
				System.out.println("The Employee is Not deleted");
			}
		}
		
		case 7->{
			System.out.println("Enter the salary to search");
			double sSalary=sc.nextDouble();
			Employe sameSalary=emp.searchBySalary(sSalary);
			System.out.println(sameSalary);
		}
		case 8->{
			System.out.println("Enter to sort");
			double sSalary=sc.nextFloat();
			Employe SortSalary=emp.sortSalary(sSalary);
			System.out.println(SortSalary);
			
		}
		default->{
				System.out.println("Wrong choice");
				}
			}
		} while(choice != 9);

	}
}
