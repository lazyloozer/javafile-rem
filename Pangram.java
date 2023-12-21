package com.kodnest.String;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="quick";
		boolean[]a=new boolean[26];
		for(int i=0;i<s.length();i++);
		{
			char ch=s.charAt([i]);
			a[ch-'a']=true;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]==false) {
				System.out.println("Not pangram");
			}
		}
		System.out.println("Not pangram");

	}

}
