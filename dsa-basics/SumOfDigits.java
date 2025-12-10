package com.pack1;

public class SumOfDigits
{
       public void Sum_Of_Digits()
       {
    	   int num=4567;
    	   int sum=0;
    	   while(num>0)
    	   {   int digit=num%10;
    		   sum+=digit;
    		   num=num/10;
    	   }
    	   System.out.println("Sum of digits: " + sum);
       }
       public static void main(String[] args) 
       {
		SumOfDigits sod=new SumOfDigits();
		sod.Sum_Of_Digits();
	}
}
