package com.pack1;

public class CountWords 
{
     public void Count_Words()
     {
    	 String s=" Java is awesome ";
    	 s.trim();
    	 if(s.length()==0)
    	 {
    		 System.out.println(0);
    		 return;
    	 }
    	 String[] words=s.split("\\s+");
    	 System.out.println("Word Count = " +words.length);
     }
     public static void main(String[] args) 
     {
		CountWords cw=new CountWords();
		cw.Count_Words();
	}
     
}
