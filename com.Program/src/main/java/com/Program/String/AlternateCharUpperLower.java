package com.Program.String;

public class AlternateCharUpperLower {

	public static void main(String[] args) {
		String s="ASfFgGHh";
		char[] c = s.toCharArray();
		for(char ch:c) {
			char cha;
			if(ch>='A' && ch<='Z') {           //A-65 Z-90 //a-97 z-122
				cha = (char) (ch+32);
			}else {
				cha = (char) (ch-32);
				}
			System.out.print(cha);
			
		}
		
		/*
		 * for(char ch:c) { char cha; if(Character.isUpperCase(ch)) {
		 * cha=Character.toLowerCase(ch); System.out.print(cha); }else {
		 * cha=Character.toUpperCase(ch); System.out.print(cha); } }
		 */
	}

}
