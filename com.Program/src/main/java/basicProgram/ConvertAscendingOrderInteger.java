package basicProgram;


public class ConvertAscendingOrderInteger {

	public static void main(String[] args) {
		int n=16845;
		int r,num;
		for(int i=0;i<=9;i++) {
			num=n;
			while(num!=0) {
				r=num%10;
				if(r==i) {
					System.out.print(r);
				}
				num=num/10;
			}
			
		}
		
	}

}
