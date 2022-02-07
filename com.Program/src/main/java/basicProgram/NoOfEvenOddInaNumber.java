package basicProgram;

public class NoOfEvenOddInaNumber {

	public static void main(String[] args) {
		int num=12345678;
		int num1;
		int odd = 0,even = 0;
		while(num!=0) {
			num1=num%10;
			if(num1%2==0) {
				odd++;
			}else {
				even++;
			}
			num=num/10;
		}
		System.out.println(" OddCount "+odd+" EvenCount "+even);
	}

}
