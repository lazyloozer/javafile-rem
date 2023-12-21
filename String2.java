package com.kodnest.String;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="the java programming is fun";
		String[] arr=s.split( " ");
		String emp="";
		for(int i=0;i<arr.length;i++) {
			//System.out.println("formatted Sentence :");
			
			String temp1=(arr[i].charAt(0)+"").toUpperCase();
			String temp2=temp1+arr[i].substring(1);
			
			System.out.print("Formatted Sentence"+temp2);
		}
		

	}

}
