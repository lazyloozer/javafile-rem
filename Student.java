package com.kodnest.oops;



class Student{
	String name;
	int id;
	int marks;
	int age;
	
	static void study() {
		System.out.println("Sleppping");
	}
	static void sleep() {
		System.out.println("Studing");
	}
	

//public  Student() {

	public Student(String name,int id,int marks, int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.id=id;
		this.marks=marks;
		this.age=age;
	}}

	 class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student("mike",10,30,20);
		System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s.marks);
		System.out.println(s.age);
		s.sleep();
		s.study();
		
		
	}

}
