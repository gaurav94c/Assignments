package com.manipal.spring_core_demo;

public class Employee {

		private long empId;
		private String empName;
		private double Salary;
		
		//Default Constructor	
		public Employee() {
			super();
		}

		public Employee(long empId, String empName, double salary) {
			super();
			this.empId = empId;
			this.empName = empName;
			Salary = salary;
		}
		
		public long getEmpId() {
			return empId;
		}
		public void setEmpId(long empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public double getSalary() {
			return Salary;
		}
		public void setSalary(double salary) {
			Salary = salary;
		}
		
		
		
		
}
