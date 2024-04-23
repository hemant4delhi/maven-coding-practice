package pojo.example;

import java.util.Arrays;

public class AccessEmployee {

	public static void main(String[] args) {
		String arr [] = {"Adobe","Microsoft","Google"};
		Employee obj = new Employee("Hemant", "EM001", 200000, "Software",arr ) ; 
		System.out.println(obj.getEmpName());
		System.out.println(obj.getEmpID());
		System.out.println(obj.getSalary());
		System.out.println(obj.getDept());
		System.out.println(Arrays.toString(arr));
	
		obj.setEmpName("Sumit");
		obj.setEmpID("EM002");
		obj.setSalary(30000);
		obj.setDept("HR");
		String a [] = {"dd","gg","hh"};
		obj.setPastExp(a);
		
		System.out.println(obj.getEmpName());
		System.out.println(obj.getEmpID());
		System.out.println(obj.getSalary());
		System.out.println(obj.getDept());
		System.out.println(Arrays.toString(arr));
		
		System.out.println("to string print :"+ obj.toString());
	}

}
