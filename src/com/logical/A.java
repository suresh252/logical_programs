package com.logical;

interface A {

	public final String a = "ramesh";

	public abstract void m1();

	public default void m2() {
		System.out.println("venu");
	}
}
