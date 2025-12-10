package com.pack1;

public class Student 
{
     String name;
     int age;
     String dept;
     public Student(String name,int age,String dept)
     {
    	 this.name=name;
    	 this.age=age;
    	 this.dept=dept;
     }
     public void displayDetails()
     {
    	 System.out.println("Name: " +name);
    	 System.out.println("Age: "+age);
    	 System.out.println("Department: "+dept);
     }
     public void displayDetails(String prefix)
     {
    	 System.out.println(prefix + ""+name+","+age+","+dept);
     }
     
}
