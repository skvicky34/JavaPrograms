package com.sandeep.stringreverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverseMethod1 {

	public static void main(String[] args) {
		String input = "";
		
		System.out.println("Enter the String");
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			input = br.readLine();
			
			char[]ch = input.toCharArray();
			
			for (int i = ch.length-1; i >=0; i--) {
				System.out.print(ch[i]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
