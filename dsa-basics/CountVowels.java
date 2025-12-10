package com.pack1;

public class CountVowels 
{
    public void Count_Vowels()
    {
    	String d="Hymavathi";
    	int count=0;
    	d=d.toLowerCase();
    	for(char c:d.toCharArray())
    		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
    			count++;
    	System.out.println("Number of Vowels: " +count);
    }
    public static void main(String[] args) 
    {
		CountVowels vowels=new CountVowels();
		vowels.Count_Vowels();
	}
}
