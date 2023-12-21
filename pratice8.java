package com.kodnest.String;

public class pratice8 {

	public static void main(String[] args) {
		// find the first non repeating values.
		String str="program";
//		for(int i=0;i<str.length();i++) {
//			String ch=str.charAt(i)+"";
//			if(str.substring(i+1).contains(ch)) {
//				continue;
//			}else {
//				System.out.println(ch);
//				break;
//			}
//		}
		
		//method2 last non reapting values
		char charcount[]=new char[256];
		for(int i=0;i<str.length();i++) {
			charcount[str.charAt(i)]++;
			
		}
		for(int i=0;i<str.length();i++) {
			if(charcount[str.charAt(i)]>1) {
				System.out.println(str.charAt(i));
				break;
			}
		}

	}

}
