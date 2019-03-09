package com.arrays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateExe {

	public static void main(String[] args) throws ParseException {
		String str = "10/11/2019,14/12/2019,22/5/2018,1/5/2019";
		
		Date date=null;
		String[] split = str.split(",");
		for(String string:split) {
			Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(string);
			System.out.println(date1);
		}
		
		
		

	}
	

}
