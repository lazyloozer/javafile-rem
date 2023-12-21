package com.kodnest.String;

import java.util.Scanner;

public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		boolean res=comparetostings(s1,s2);
		//String s1="hello";
		//String s2="Hello";
		if(res) {
			System.out.println("Equals");
		}else {
			System.out.println("Not equals");
		}
		

	}

	private static boolean comparetostings(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length()!=s2.length()) {
			return false;
		}
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
	
		//return false;
	}

}
