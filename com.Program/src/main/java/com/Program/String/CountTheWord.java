package com.Program.String;

public class CountTheWord {

	public static void main(String[] args) {
		String str="sun and moon are same";
		int count = 0;
		String[] sa= str.split(" ");
		for( String s:sa){
			++count;
		}
		System.out.println(count);
	}

}
