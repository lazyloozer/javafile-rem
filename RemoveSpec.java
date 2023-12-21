package com.kodnest.String;

public class RemoveSpec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello  java";
		char[] ch=s.toCharArray();
		int left=0;
		int right=ch.length-1;
		while(left<right) {
			if(ch[left]!=' ' && ch[right]!=' ') {
				char temp;
				temp=ch[left];
				ch[left]=ch[right];
				ch[right]=temp;
				left++;
				right--;
				
				
			}
			else if(ch[left]==' ') {
			left++;
			
		} else if(ch[right]==' ') {
			right--;
			
		}

	}
		System.out.println(new String(ch));

}
}

