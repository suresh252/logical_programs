package com.logical;

import java.io.BufferedReader;
import java.io.FileReader;

public class CharCount {

	public static void main(String[] args) {
		BufferedReader reader = null;

		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		try {
			reader = new BufferedReader(new FileReader("D:\\CHENNAI\\sureshresume.docx"));

			String currentline = reader.readLine();
			while (currentline != null) {

				lineCount++;
				String[] words = currentline.split(" ");
				wordCount += words.length;

				for (String word : words) {

					charCount += word.length();

				}
				currentline = reader.readLine();

			}

			System.out.println("char count: " + charCount);
			System.out.println("word count: " + wordCount);
			System.out.println("line count: " + lineCount);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
