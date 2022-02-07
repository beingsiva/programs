package basicProgram;

public class ReverseNumberProgram {

	public static void main(String[] args) {
		int n=1234;
		int rev = 0;
		int num;
		while(n>0) {
			num=n%10;
	        rev=rev*10+num;
			n=n/10;
			}
		System.out.println(rev);
		
		//approach--->2
		int n1=1234;
		StringBuffer sb= new StringBuffer(String.valueOf(n1));
		StringBuffer rev1 = sb.reverse();
		System.out.println(rev1);
		
		//Approach--->3
		int n3=7890;
		StringBuilder sb1= new StringBuilder();
		sb1.append(n3);
		sb1.reverse();
		System.out.println(sb1);
		
		
	}

}
