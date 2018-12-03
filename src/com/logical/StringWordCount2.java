package com.logical;

import java.util.Scanner;

public class StringWordCount2 {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		
		String string = scanner.nextLine();
		
		//String input="welcome to java session session session java";
		String[] words=string.split(" ");
		int wrc=1;
		
		for(int i=0; i<words.length;i++) {
			
			for(int j=i+1;j<words.length;j++) {
				
				if(words[i].equals(words[j])) {
					wrc=wrc+1;
					words[j]="0";
					
				}
				
			}
			if(words[i]!="0") {
				System.out.println(words[i]+"="+wrc);
				wrc=1;
			}
		}
	}
}
