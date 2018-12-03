package com.logical;

public class ReverseStringMethod {
	String str="sagar";
	String string="";
	
	public void reverseString() {
		
		for(int i=str.length()-1;i>=0;i--) {
			string=string+str.charAt(i);
		}
		System.out.println(string);
		
	}
	
	public static void main(String[] args) {
		ReverseStringMethod method = new ReverseStringMethod();
		method.reverseString();
	}

}
