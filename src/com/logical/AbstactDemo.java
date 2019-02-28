package com.logical;

public class AbstactDemo {

	public static void main(String[] args) {
		SureshPhone mp = new SureshPhone();
		mp.calling();
		mp.camera();
		mp.data();
		mp.whatsapp();

	}

}

abstract class MaheshPhone {
	public void calling() {
		System.out.println("caling.......");
	}

	public abstract void data();

	public abstract void camera();

	public abstract void whatsapp();
}

abstract class RameshPhone extends MaheshPhone {

	public void data() {
		System.out.println("data activated...");
	}
}

class SureshPhone extends RameshPhone {

	public void whatsapp() {
		System.out.println("whatsapp is installed....");
	}

	public void camera() {
		System.out.println("camera is working...");
	}
}