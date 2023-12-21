package com.kodnest.String;

public class String10frequncy {

	public static void main(String[] args) {
	String s="Hello";
	int a[]=new int[256];
	
	for(int i=0;i<s.length();i++) {
		//System.out.println(s.charAt(i));
		char ch=s.charAt(i);
		a[ch]++;
		
	}
	int count=0;
	for(int i=0;i<a.length;i++) {
		//System.out.print(a[i]);
		
		if(a[i]>0) {
			count++;
			System.out.println("character"+(char)i+"="+a[i]);
			//System.out.println(count);
			
		}
	}

	}

}
