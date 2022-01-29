package com.Program.String;

import java.util.HashSet;

public class CountOccurenceOfEachWord {

	public static void main(String[] args) {
		String str="im the best u cant have me";
		String str1 = str.replaceAll(" ", "");
		char[] ca=str1.toCharArray();
		HashSet <Character>hs= new HashSet<Character>();
		for(int i=0;i<=ca.length-1;i++){
		hs.add(ca[i]);
		}
		for(char c:hs){
		int count=0;
		for(int i=0;i<=ca.length-1;i++){
		if(c==ca[i]){
		count++;
		}
		}
		System.out.println(c+ " is repeated "+count+" times");
		if(count>1) {
		System.out.println(c+" is duplicate character");	
		}else {
			System.out.println(c+" is unique character present in a string");
		}
		
		}
	}

}
