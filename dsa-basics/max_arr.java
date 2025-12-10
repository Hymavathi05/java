package com.pack1;

public class max_arr 
{
     public void max_array()
     {
    	 int[] arr= {10,20,5,40};
    	 int max=arr[0];
    	 for(int num:arr)
    		 if(num>max)
    		    max=num;
        System.out.println("The Maximum Number: " +max);
    	 
     }
     public static void main(String[] args) 
     {
		max_arr array=new max_arr();
		array.max_array();
	  }
}
