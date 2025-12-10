package com.pack1;

public class min_arr 
{
     public void min_arrs()
     {
    	 int[] arr= {10,5,20,8,15};
    	 int min=arr[0];
    	 for(int num:arr)
    		 if(num<min)
    			 min=num;
    	 System.out.println("The Minimum Number: " +min);
     }
     public static void main(String[] args)
     {
		min_arr at=new min_arr();
		at.min_arrs();
	} 
}
