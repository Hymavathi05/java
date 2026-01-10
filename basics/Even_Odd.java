package com.pack1;
import java.util.Scanner;
public class Even_Odd {
   public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
	    n=Math.abs(n);
		if(n==0)
		{
			System.out.println("0 is even");
		}
		else if(n%2==0)
		{
			System.out.println(n + " is Even");
		}
		else
		{
			System.out.println(n + "is Odd");
		}
		sc.close();
}
}

