package arrayProgram;

public class SumofArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int a1[]= {10,20,30,40,50,60};
		int sum1=0;
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum+=a[i];
		}
		
		for(int value:a1) {
			sum1+=value;
		}
		System.out.println(sum);
		System.out.println(sum1);
		
		
	}

}
