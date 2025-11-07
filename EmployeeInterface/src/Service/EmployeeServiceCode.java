package Service;
import java.util.List;
import java.util.Scanner;

import Beans.Employe;
import Dao.EmployeeDatabase;
import Dao.EmployeeDatabaseInterfaceClass;


public class EmployeeServiceCode implements EmployeeBasicServiceInterfaceClass{

	private EmployeeDatabaseInterfaceClass eDao=new EmployeeDatabase();
	
	public  boolean addNewEmployeeService() {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Employee Id");
			int eId=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the Employee Name");
			String eName=sc.nextLine();
			
			System.out.println("Enter the Employee Salary");
			double eSalary=sc.nextDouble();
			
			Employe e=new Employe(eId,eName,eSalary);
			
			eDao.addEmployee(e);
			
		return true;
	}

	@Override
	public List<Employe> displayAllData() {
		
		return eDao.displayAllData();//go to EmployeeDatabase code
		
	}

	@Override
	public Employe searchById(int sid) {
		
		return eDao.searcById(sid);
	}

	@Override
	public Employe searchByName(String sName) {
		
		return eDao.searchByName(sName);
	}

	@Override
	public boolean updateSalary(int id, double uSalary) {
		
		return eDao.updateSalary(id,uSalary);
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return eDao.deleteById(id);
	}

	@Override
	public Employe searchBySalary(double sSalary) {
		Employe sameSalary=eDao.searchBySalary(sSalary);
		return sameSalary;
	}

	@Override
	public Employe sortSalary(double sSalary) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
