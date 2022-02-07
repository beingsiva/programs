package basicProgram;

public class Palindrome {

	public static void main(String[] args) {
		int num=12321;
		int num1 = num;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(rev==num1) {
			System.out.println("This "+num1+" is a palindrome");
		}else {
			System.out.println("This "+num1+" is not a palindrome");
		}
	}

}
