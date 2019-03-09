package com.customexception;

public final class Employee {

	public static void main(String[] args) {
		Employee1 e = new Employee1(101, "suresh");
		System.out.println(e.getEmpId());
		System.out.println(e.getName());
		Employee1 e2 = new Employee1(102, "ramesh");
		System.out.println(e2.getEmpId());
		System.out.println(e2.getName());
		
	}

}

final class Employee1 {

	private final int empId;

	private final String name;

	public Employee1(int empId, String name) {

		this.name = name;
		this.empId = empId;
	}

	public int getEmpId() {

		return empId;
	}

	public String getName() {

		return name;
	}
}
