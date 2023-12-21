package com.kodnest.array;

import java.util.Scanner;

public class ArrayOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total matrix");
		int m=sc.nextInt();
		
		System.out.println("Enter the total students");
		int n=sc.nextInt();
		
		int [][]a=new int[m][n];
		
		System.out.println("Enter the " + m*n+ "values");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				if(a[i][j]%2==1) {
					
				
				System.out.println(a[i][j]);
				}

	}

}


	}

}
