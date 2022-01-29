package com.Program.String;

public class CharacterRepeatedInaWord {

	public static void main(String[] args) {
		String str = "good noon sivas";
		String[] sa = str.split(" ");   //1.good 2.noon 3.sivas
		for (String s : sa) { //---------->
			int count = 0;
			char[] c = s.toCharArray();
			for (int i = 0; i <= s.length() - 1; i++) {
				if (c[0] == c[i]) {
					++count;
				}
			}
			if (count > 1) {
				System.out.println(c[0] + " repeated"+count);
			} else {
				System.out.println(c[0] + " not repeated");
			}
	}

}
}