package com.kodnest.String;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="55555511";
		String[] split=s1.split("5");
		for(int i=0;i<=split.length-1;i++) {
			System.out.print(split[i]);
		}

	}

}
