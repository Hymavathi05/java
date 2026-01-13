package com.pack1;
import java.util.Scanner;
public class isPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int OriginalNumber=sc.nextInt();
		OriginalNumber=Math.abs(OriginalNumber);
		int temp=OriginalNumber;
		int reverse=0;
		while(temp != 0)
		{
			int remainder=temp%10;
			reverse=reverse*10+remainder;
			temp=temp/10;
		}
		if(OriginalNumber==reverse)
		{
			System.out.println(OriginalNumber+" is a Palindrome");
		}
		else
		{
			System.out.println(OriginalNumber+" is a NOT Palindrome");
		}
		sc.close();
	}

}
