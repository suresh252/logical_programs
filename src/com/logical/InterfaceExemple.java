package com.logical;

public class InterfaceExemple implements A {
	String a = "p";
	int x = 10;

	@Override
	public void m1() {

		System.out.println(a);

	}

	public void m2() {
		System.out.println("suresh");
	}

	public static void main(String[] args) {
		InterfaceExemple exemple = new InterfaceExemple();
		exemple.m1();
		exemple.m2();

	}
}
