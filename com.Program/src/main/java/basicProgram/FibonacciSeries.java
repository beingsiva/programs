package basicProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=0, n2=1;
		int n3;
		for(int n=1;n<=10;n++) {
		n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		}
	}

}
