package com.kodnest.String;

public class AtCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="program";
		System.out.println(s.length());//7
		char[] c=s.toCharArray();
		System.out.println(c.length);
		for(int i=0;i<=c.length-1;i++) {
			System.out.print(c[i]+" ");
			
		}

	}

}
