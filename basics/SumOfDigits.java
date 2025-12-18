package com.pack1;

public class SumOfDigits {
public static int Sum_Of_Digits(int n)
{
	int sum=0;
	while(n>0)
	{
		sum=sum+n%10;
		n=n/10;
	}
	return sum;
}
public static void main(String[] args) {
	System.out.println("Sum of Digits: " +Sum_Of_Digits(538));
}
}
