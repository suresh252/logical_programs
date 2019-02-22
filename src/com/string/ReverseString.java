package com.string;

public class ReverseString {

	public static void main(String[] args) {

		String str = "suresh";
		String str1 = "";
		int length = str.length();
		System.out.println(length);

		for (int i = length - 1; i >= 0; i--) {

			str1 = str1 + str.charAt(i);
		}
		System.out.println("revese str1 is :" + str1);

		String str3 = "suresh";
		String str4 = "";
		char[] charArray = str3.toCharArray();
		System.out.println(charArray);

		for (int i = charArray.length - 1; i >= 0; i--) {

			str4 = str4 + str3.charAt(i);
		}
		System.out.println("revese str4 is :" + str4);

		String str5 = "suresh shiva suvarna";
		String str6="";
		char[] charArray2 = str5.toCharArray();
		int left = 0;
		int right = 0;
		right = charArray2.length - 1;

		for (left = 0; left < right; left++, right--) {
			
			char temp = charArray2[left];
			charArray2[left]=charArray2[right];
			charArray2[right]=temp;
			
		}
		for (char c : charArray2) {
			System.out.print(c);
			
		}
	}

}
