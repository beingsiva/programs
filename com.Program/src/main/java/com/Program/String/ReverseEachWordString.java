package com.Program.String;

public class ReverseEachWordString {

	public static void main(String[] args) {
		String s1="Good morning chellam";
		String[] sa=s1.split(" ");
		String rs ="";
		for(String s:sa){
			String rw="";
		char[] ch=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--){
		rw=rw+ch[i];
		}
		rs=rs+rw+" ";
		}
		System.out.println(rs);
		
		

	}

}
