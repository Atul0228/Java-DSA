package Dao;

import java.util.ArrayList;
import java.util.List;

import Beans.Employe;

public class EmployeeDatabase implements EmployeeDatabaseInterfaceClass
{
	
	List<Employe> EmployeeList=new ArrayList<>();

	public void addEmployee(Employe e) 
	{
		
		EmployeeList.add(e);
	}

	@Override
	public List<Employe> displayAllData() 
	{
		EmployeeList.forEach(System.out::println);
		return EmployeeList;
	}

	@Override
	public Employe searcById(int sid)
	{
		int pos=EmployeeList.indexOf(new Employe(sid));
		
		if(pos!=-1)
		{
			return   EmployeeList.get(pos);
		}
			return null;
	}

	@Override
	public Employe searchByName(String sName) 
	{
		int pos=EmployeeList.indexOf(new Employe(sName));
		System.out.println(EmployeeList.get(pos));
		return null;
	}

	@Override
	public boolean updateSalary(int sid, double uSalary) 
	{
		
		int pos=EmployeeList.indexOf(new Employe(sid));
		
		if(pos!=-1)
		{
			Employe eData=EmployeeList.get(pos);
			eData.setSalary(uSalary);
			return true;
		}
		
		
		return false;
	}

	@Override
	public boolean deleteById(int sid) {
		int pos=EmployeeList.indexOf(new Employe(sid));
		if(pos!=-1)
		{
			EmployeeList.remove(pos);
			return true;
		}
		return false;
	}

	@Override
	public Employe searchBySalary(double sSalary) {
		int pos=EmployeeList.indexOf(new Employe(sSalary));
		return EmployeeList.get(pos);
	}


}
