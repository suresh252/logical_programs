package com.arrays;


class StringArrayReverse {

	public static void main(String[] args) {

		String[] str = { "Hai", "Hello", "Java", "World" };
		String string = "";

		for (int i = str.length - 1; i >= 0; i--) {
			string = string + str[i] + " ";
		}
		System.out.println(string);
	}

}

//Output  World Java Hello Hai 
