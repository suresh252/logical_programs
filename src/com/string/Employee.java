package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

	public static void main(String[] args) {

		String[] str = new String[] { "wipro", "cts", "hcl", "tcs" };
		
		List<String> a = new ArrayList<String>();
		for (int i = str.length - 1; i >= 0; i--) {
			String str1="";
			char[] charArray = str[i].toCharArray();
			for (int j = charArray.length - 1; j >= 0; j--) {
				str1+=charArray[j];
				//System.out.print(charArray[j]);
			}
			a.add(str1);
		}
		
		String[] array = a.stream().toArray(String[]::new);
		
		System.out.println(Arrays.toString(array));
		
		
/*
		for (int i = str.length - 1; i >= 0; i--) {
			for (int j=i-1;j>=1;j--) {
				string[j]+=str[i];
				
			}
			//string += str[i] + " ";
		}*/

	//	System.out.println(a.toString());

		/*char[] charArray = string.toCharArray();
		for (int j = charArray.length - 1; j >= 0; j--) {
			System.out.print(charArray[j]);
		}*/
	}

}
