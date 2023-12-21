package com.kodnest.String;

import java.util.Arrays;

public class Anagroms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//when we sorted in alpbhet order it should be samw
		//listen=eilnst
		//silent=eilnst
		String str1="Listen";
		String str2="silent";
		char[] charArray1=str1.toCharArray();
		char[]chararray2=str1.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(chararray2);
		
		
		String string=new String(charArray1);
		String string1=new String(chararray2);
		
		
		if(string1.equalsIgnoreCase(string)) {
			System.out.println("anagrams");
		}else {
			System.out.println("Not anagrams");
		}

	}

}
