package com.pack1;

public class TestEmployee 
{
    public static void main(String[] args) 
    {
		Employee emp=new Employee();
		emp.setNmae("Sravani");
		emp.setSalary(50000);
		System.out.println("Employee Name: "+emp.getName());
		System.out.println("Employee Salary: "+emp.getSalary());
    }
}
