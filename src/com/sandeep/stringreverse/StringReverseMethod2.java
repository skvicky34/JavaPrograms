package com.sandeep.stringreverse;

public class StringReverseMethod2 {

	public static void main(String[] args) {
		String input = "JavaIsAwesome";
		
		StringBuilder input1 = new StringBuilder(input);
		
		input1 = input1.reverse();
		
		for (int i = 0; i < input1.length(); i++) {
			System.out.print(input1.charAt(i));
		}

	}

}
