package com.sandeep.stringreverse;

public class StringReverseMethod3 {

	public static void main(String[] args) {
		String input = "Be in present";
		
		char[] tempArray = input.toCharArray();
		
		int left, right=0;
		
		right= tempArray.length-1;
		
		for (left = 0; left < right; left++, right--) {
			char temp = tempArray[left];
			tempArray[left] = tempArray[right];
			tempArray[right] = temp;
		}
		
		for (char c : tempArray) {
			System.out.print(c);
		}

	}

}
