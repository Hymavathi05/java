package com.pack1;
import java.util.Scanner;
public class CheckLargestOfThree {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
	    a=Math.abs(a);
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
	    b=Math.abs(b);
		System.out.println("Enter 3rd number");
		int c=sc.nextInt();
	    c=Math.abs(c);
		if(a==b && b==c)
		{
			System.out.println("All three numbers are equal");
		}
		else if(a >= b && a >=c)
		{
			System.out.println(a + " is largest number");
		}
		else if(b>=a && b>=c)
			{
			System.out.println(b + "is largest number");
		}
		else
		{
			System.out.println(c + " is largest number");
		}
			sc.close();
	}

}

