package com.kodnest.String;

public class SolutionString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//way 1 to create Strings
		
		String s1=new  String("Java");
		
		//way 2 to create Strings
		
		String s2="program";
		
		//way 3 to create Strings
		
		char[] ch= {'3','4','5','6'};
		
		String s3=new String(ch);
		
		//way 4 to create Strings
		
		StringBuffer s4=new StringBuffer("Super");
		
		//way 5 to create Strings
		
		
		StringBuilder s5=new StringBuilder("Progrmming");
		
		
		System.out.println(s1+" " + s2 +" " + s3 +" "+ s4 + " " + s5);
		

	}

}
