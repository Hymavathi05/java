package com.pack1;

public class CountDigits 
{
    public void Count_Digits()
    {
    	int num=4567;
    	int count=0;
    	while(num>0)
    	{
    		num=num/10;
    	count++;
    }
    	System.out.println("Number of Digits in a Number: "+count);
    
    }
    public static void main(String[] args)
    {
		CountDigits cd=new CountDigits();
		cd.Count_Digits();
	}
}
