package com.lk.dynamicprogramming.tracxn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MessageDycriptor {

	static List<String> messag = new ArrayList<>();

	public boolean case1(String message) {

		boolean flag = false;
		/*
		 * Checking message contain pure no and (.)dot as seperator
		 */
		String[] dotSplitter = message.split("\\.");
		// length of dotSplitter
		int lengthOfDotSplit = dotSplitter.length;
		System.out.println(lengthOfDotSplit);
		/*
		 * fetch pure number at each split string
		 */
		for (int i = 0; i < lengthOfDotSplit; i++) {
			if (lengthOfDotSplit >= 2) {
				flag = checkNumber(dotSplitter[i]);
				System.out.println(flag + " " + dotSplitter[i]);
				if (flag == false) {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	/*
	 * private method return type is boolean used by case1 method
	 */
	private static boolean checkNumber(String splitMessage) {
		try {
			System.out.println("splitMessage  " + splitMessage);
			Long number = Long.parseLong(splitMessage);
			System.out.println("number  " + number);
			messag.add(number.toString());
			System.out.println("try sucsessfull" + "  " + messag);
		} catch (Exception exception) {
			return false;
		}
		return true;
	}

	/*
	 * number of digits is equal to no.of digit after it otherwise two more
	 * digits after it i.e. 12345.45648.123.345.1 or 12345.123.1
	 */
	public boolean case2(String message) {
		System.out.println("case2:::orignal message   "+message);
		boolean flag = false;
		if (case1(message)) {
			System.out.println("message size = " + messag.size());
			for (int i = 0; i < (messag.size() - 1); i++) {
				if ((messag.get(i).length() == messag.get(i + 1).length())
						|| (2 == ((messag.get(i).length() - messag.get(i + 1).length())))) {
					flag = true;
				} else {
					return false;
				}

			}

		}

		return flag;
	}

	/*
	 * return type is boolean perameter is String check every word should not
	 * start with zero
	 */
	/*
	 * public boolean case3(String message) {
	 * 
	 * boolean flag = false; if (case2(message)) {
	 * 
	 * for (String str : messag) { System.out.println(str.charAt(0)); if
	 * (str.charAt(0) != '0') {
	 * 
	 * flag = true; } else {
	 * 
	 * return false; } } } return flag;
	 * 
	 * }
	 */

	/*
	 * 
	 * 
	 */

	public boolean case4(String message) {

		final double twoBiThree = 2.0 / 3.0;
		boolean flag = false;
		if (case2(message)) {
			for (String str : messag) {
				int noOfDigits = str.length();
				StringBuffer buffer = new StringBuffer();
				for (int i = 0; i < noOfDigits; i++) {
					buffer.append("9");
				}
				double noOfNines = Double.parseDouble(new String(buffer));
				if (Integer.parseInt(str) <= (int) (noOfNines * twoBiThree)) {
					flag = true;
				} else {
					return false;
				}
			}
		}
		return flag;
	}
	/*
	 * remove padding data at the end of each word padding data wourld be
	 * increaseing sequnce of digit by 2.
	 */

	public boolean case5(String message) {
		System.out.println(message+"   :: case 5:: actual message");
		boolean flag = false;
		int index = 0;
		StringBuilder builder = new StringBuilder();
		String string = null;
		if (case1(message)) {
			for (String str : messag) {

				builder.append(removePadding(str));
				builder.append('.');
			}
			builder.deleteCharAt(builder.length() - 1);

			string = new String(builder);
			
			messag.removeAll(messag);

		}
		if (case4(string)) {
			flag = true;
		}

		return flag;
	}

	private String removePadding(String str) {

		char[] charArry = str.toCharArray();
		String s = null;
		int k = 0;
		int i = 0;
		
		StringBuilder builder = new StringBuilder(str);
		for (i = (charArry.length / 2); i < charArry.length - 1; i++) {
			char j = charArry[i];
			/* System.out.println(j); */
			k = charArry[i + 1] - charArry[i];
		}
		if (k == 2) {
			builder.replace(charArry.length / 2, charArry.length, "");
		}
		/* builder.append(charArry[charArry.length-1]); */
		System.out.println(builder);

		if (builder != null) {
			System.out.println(new String(builder)+"   :: case 5:: actual message");
			return new String(builder);
			
		}

		return null;
	}

	/*public static void main(String[] args) {

		MessageDycriptor dycriptor = new MessageDycriptor();
		String str = "1234502468.123.456135";
		String str2 = "12345.123.512";
		System.out.println(dycriptor.case5(str));

	}*/
}
