package com.Program.String;

public class AlternateCharInUpperLowercase {

	public static void main(String[] args) {
		String str="imthebest";
		char[] ca = str.toCharArray();
		
			for(int i=0;i<=str.length()-1;i++) {
				
				if(i%2==0) {
					System.out.print(Character.toUpperCase(ca[i]));
				}else {
					System.out.print(Character.toLowerCase(ca[i]));
				}
			}
				
		}

	}


