package basicProgram;

public class PalindromeString {

	public static void main(String[] args) {
		String s="madaM";
		String rev ="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			}
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Given string is not a palindrome");
		}
		}

}
