package com.pack1;
import java.util.Scanner;
public class Max_Of_Two 
{
    public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st number");
	int m=sc.nextInt();    
	System.out.println("Enter 2nd number");
	int n=sc.nextInt(); 
	if(m>n)
	{
		System.out.println(m + " is bigger");
	}
	else
	{
		System.out.println(n + " is bigger");
	}
	sc.close();
    }
    
}
