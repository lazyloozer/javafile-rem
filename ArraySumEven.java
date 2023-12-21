package com.kodnest.array;

import java.util.Scanner;

public class ArraySumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Matrix");
		int m=sc.nextInt();
		
		System.out.println("Enter the Size of Matrix");
		int n=sc.nextInt();
		int [][]a=new int [m][n];
		
		System.out.println("Enter the " +m*n+ " Matrix Marks");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				a[i][j]=sc.nextInt();
			}
		} 
		int sum=0;
		System.out.println("the Matrix Marks: ");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				if(a[i][j]%2==0) {
					sum=sum+a[i][j];
					
				}
				
			}
		}
		System.out.println("The sum is :" +sum);


	}

}
