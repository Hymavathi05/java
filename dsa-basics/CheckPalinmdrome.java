package com.pack1;

public class CheckPalinmdrome 
{
     public void Check_Palindrome()
     {
    	 String s="madam";
    	 String rev="";
    	 for(int i=s.length()-1;i>=0;i-- )
    		 rev +=s.charAt(i);
    	 System.out.println(s.equals(rev));
     }
     public static void main(String[] args) 
     {
		CheckPalinmdrome p=new CheckPalinmdrome();
		p.Check_Palindrome();
	 }
}
