package com.pack1;

public class TestStudent 
{
   public static void main(String[] args) 
   {
	  Student st=new Student("Hyma",22,"IT");
	  System.out.println("Using normal methods");
	  st.displayDetails();
	  System.out.println("Using method overloading");
	  st.displayDetails("StudentDetails:");
   }
}
