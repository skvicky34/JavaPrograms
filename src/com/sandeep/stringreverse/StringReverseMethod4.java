package com.sandeep.stringreverse;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StringReverseMethod4 {

	public static void main(String[] args) {
		String input = "Be in present";
		
		char[] tempArray = input.toCharArray();
		
		List<Character> list = new LinkedList<>();
		
		for (char ch : tempArray) {
			list.add(ch);
		}
		
		Collections.reverse(list);
		
		Iterator<Character> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
			
		}
	}

}
