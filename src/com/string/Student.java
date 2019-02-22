package com.string;

abstract class C {
	abstract void m3();

	public C() {
		System.out.println("Am the designer for common A and B");
	}
	

}

class A extends C {
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("Am a constructor");
	}
	void m1() {
		System.out.println("m1()");
	}

	@Override
	void m3() {
		// TODO Auto-generated method stub
		System.out.println("Am m3()");
	}
}

class B extends C {
	void m2() {
		System.out.println("m2()");
	}

	@Override
	void m3() {
		// TODO Auto-generated method stub
		System.out.println("Am m3()");
	}
}

public class Student {

	public static void main(String[] args) {
		A a = new A();
		//a.m1();
	}
}
