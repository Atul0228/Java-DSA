package Beans;
import java.util.*;

import Dao.EmployeeDatabase;
import Service.EmployeeServiceCode;
import Service.EmployeeBasicServiceInterfaceClass;


public class Employe {
	
	
	
	private int Id;
	private String Name;
	private double Salary;

	public Employe(int eId, String eName, double eSalary) {
		Id=eId;
		Name=eName;
		Salary=eSalary;
	}
	
	public Employe()
	{
		
	}

	public Employe(int sid) {
		this.Id=sid;
	}
	

	public Employe(String sName) {
		Name =sName;
	}
	
	public Employe(double sSalary) {
		Salary =sSalary;
	}

	

	@Override
	public boolean equals(Object obj) {
		
		Employe other = (Employe) obj;
		return Id == other.Id || Objects.equals(Name, other.Name)
				|| Double.doubleToLongBits(Salary) == Double.doubleToLongBits(other.Salary);
	}

	@Override
	public String toString() {
		return "Employe [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}

	

	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	
}
