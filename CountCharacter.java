package com.capgemini.com;

public class CountCharacter {
	public static void main (String[]args) {
		String string = "The best of both worlds";
		int value=0;
		//count each character without space
		for(int i= 0;i<string.length();i++) {
			if (string.charAt(i)!= ' ')
				value++;
		}
	System.out.println("Total Number of Characters in a string:" +  value);
	}

}
