package com.string;

public class Test {

	public static void main(String[] args) {
		System.out.println(Singleton.getSingleton());
		System.out.println(Singleton.getSingleton());
	}
}

class Singleton {
	private static Singleton singleton = null;

	private Singleton() {
		System.out.println("Am from constructor");
	}

	public static synchronized Singleton getSingleton() {

		 singleton=new Singleton();
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}