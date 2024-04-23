package pojo.example;

import java.util.Arrays;

public class Employee {
	private String empName;
	private String empID;
	private int salary;
	private String dept;
	private String pastExp[];
	public Employee(String empName, String eMPID, int salary, String dept, String[] pastExp) {
		super();
		this.empName = empName;
		this.empID = eMPID;
		this.salary = salary;
		this.dept = dept;
		this.pastExp = pastExp;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String[] getPastExp() {
		return pastExp;
	}
	public void setPastExp(String[] pastExp) {
		this.pastExp = pastExp;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empID=" + empID + ", salary=" + salary + ", dept=" + dept
				+ ", pastExp=" + Arrays.toString(pastExp) + "]";
	}

	

}
