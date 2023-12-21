package com.kodnest.String;

public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java program is fun";
		String s1=s.trim();
		String[]a=s1.split(" ");
		//System.out.println(a);
		
       String ls=" ";
         int lsl=0;
        for(int i=0;i<a.length;i++) {
           if(a[i].length()>lsl) {
              ls=a[i];
             lsl=a[i].length();
			
			}
		}
		System.out.println(ls);
}
}
