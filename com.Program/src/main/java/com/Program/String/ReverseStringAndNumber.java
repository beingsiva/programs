package com.Program.String;

public class ReverseStringAndNumber {

	public static void main(String[] args) {
		String s="Sivasakthi";
		for(int i=s.length()-1;i>=0;i--){
		System.out.print(s.charAt(i));
		}
		System.out.println("");

		String num="6789";
		for(int i=num.length()-1;i>=0;i--) {
			System.out.print(num.charAt(i));
		}
		
		System.out.println();
		int n=12345678;
		StringBuffer sb= new StringBuffer(String.valueOf(n));
		System.out.println(String.valueOf(n));
		System.out.println(sb.reverse());
		
		System.out.println();
		int n1=87654321;
		StringBuilder sb1=new StringBuilder(n1);
		System.out.println(sb1.append(n1));
		System.out.println(sb1.reverse());
			
		}
	}

