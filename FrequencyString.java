package com.kodnest.String;

public class FrequencyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String s="program";
		char ch='r';
		for(int i=0;i<=s.length()-1;i++) {
			//for(int j=0;j<s.length();j++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			System.out.println(count);
		//}
	}

}
//p-1
//r-2
//o-1;
//g-1
//a-1
//m-1