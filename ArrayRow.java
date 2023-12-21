
// 1st row elements
package com.kodnest.array;

import java.util.Scanner;

public class ArrayRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Matrix");
		int m=sc.nextInt();
		System.out.println("Enter the Size");
		int n=sc.nextInt();
		int [][]a=new int[m][n];
		System.out.println("Enter the" + m*n+ "is :");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				if(i==0) {
					System.out.println(a[i][j]);
				}
				
			}
		}

	}

}
