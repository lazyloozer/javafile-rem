
package com.kodnest.String;

import java.util.Scanner;

public class Palindram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String emp="";
		for(int i=s.length()-1;i>=0;i--) {
			emp=emp+s.charAt(i);
		}
		if(s.equals(emp)) {
			System.out.println("Not Paildrome");
		}else {
			System.out.println(" pailndrom");
		}
		//when we read form backside also same as forwards ex: front:level back :level

	}

}
