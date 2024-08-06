package com.ashokit.sorting;

public class B extends A{
	public void m2() {
		System.out.println("m1 method");
	}	
	
	public void m1() {
		System.out.println("m1 method");
	}
	
	//Compiletime - static - over loading
	//runtime- dynamic -overriding
	
	public static void main(String[] args) {
		//A
		//B
		B b= new B();
		b.m1();
		b.m2();
		b.m3();
		
		A a= new A();
		a.m1();
	}
}
