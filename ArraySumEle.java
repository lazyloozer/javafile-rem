package com.kodnest.array;

import java.util.Scanner;

public class ArraySumEle {

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
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
			sum=sum+a[i][j];
			
				
				
				}

	}


	System.out.println("The Sum is :"+ sum);

	}
	}


