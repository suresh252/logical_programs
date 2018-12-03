package com.logical;

public class InterfaceExemple implements A {
	String a="p";

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(a);
		
	}
	
	public  void m2() {
		System.out.println("suresh");
	}
	
	public static void main(String[] args) {
		InterfaceExemple exemple = new InterfaceExemple();
		exemple.m1();
		exemple.m2();
		
	}
}
