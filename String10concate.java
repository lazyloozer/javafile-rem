package com.kodnest.String;

public class String10concate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String s1="123";
		String s3="56";
		String emp="";
		for(int i=0;i<s.length();i++) {
			emp=emp+s.charAt(i);
		}
		for(int i=0;i<s1.length();i++) {
			emp=emp+s1.charAt(i);
		}
		for(int i=0;i<s3.length();i++) {
			emp=emp+s3.charAt(i);
		}
		System.out.println(emp);
			
			
				

	}

}
