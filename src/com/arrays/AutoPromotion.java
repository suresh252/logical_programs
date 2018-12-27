package com.arrays;

public class AutoPromotion {
	
	public void methodOne(int i) {
		System.out.println("int-arg");

	}

	public void methodOne(float f) {
		System.out.println("float argumenet");

	}

	public void methodOne(Object o) {
		System.out.println("object type");
	}

	public void methodOne(String s) {
		System.out.println("string type");
	}

	public void methiodOne(StringBuffer sb) {
		System.out.println("String buffer");
	}

	public static void main(String[] args) {
		AutoPromotion ap = new AutoPromotion();
		// ap.methodOne('a'); // int arg
		// ap.methodOne(101); // int arg
		// ap.methodOne("vishnu"); // string arg
		ap.methodOne(null);
		// ap.methiodOne(new StringBuffer("sai"));
		// ap.methodOne(10.5);//c.e
	}

}
