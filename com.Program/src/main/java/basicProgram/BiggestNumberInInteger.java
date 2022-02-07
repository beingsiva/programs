package basicProgram;

public class BiggestNumberInInteger {

	public static void main(String[] args) {
		int n=1238975;
		int b=0;
		while(n!=0) {
			int num=n%10;
			if(num>b) {
				b=num;
			}
			n=n/10;
		}
		System.out.println(b);
	}

}
