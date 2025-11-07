package Service;

import java.util.List;

import Beans.Employe;

public interface EmployeeBasicServiceInterfaceClass {
	boolean addNewEmployeeService();

	List<Employe> displayAllData();

	Employe searchById(int sid);

	Employe searchByName(String sName);

	boolean updateSalary(int id, double uSalary);

	boolean deleteById(int id);

	Employe searchBySalary(double sSalary);

	Employe sortSalary(double sSalary);
}
