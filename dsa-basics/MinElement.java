package com.pack1;

public class MinElement 
{
    public void Min_Element()
    {
    	int[] arr= {10,5,20,8,15};
    	int min=arr[0];
    	for(int num:arr)
    		if(num<min)
    			min=num;
    	System.out.println("Minimum Element: "+min);
    }
    public static void main(String[] args)
    {
		MinElement me=new MinElement();
		me.Min_Element();
	}
}
