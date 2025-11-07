package Dao;

import java.util.List;

import Beans.Employe;

public interface EmployeeDatabaseInterfaceClass {
	void addEmployee(Employe e);
	List<Employe> displayAllData();
	Employe searcById(int sid);
	Employe searchByName(String sName);
	boolean updateSalary(int id, double uSalary);
	boolean deleteById(int id);
	Employe searchBySalary(double sSalary);
}
