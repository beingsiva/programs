package com.Program.String;

public class RemoveSpecialSymbol {

	public static void main(String[] args) {
		String s="!@#$2345#$#$%%si#$va$%";
		String s1=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s1);
		

	}

}
