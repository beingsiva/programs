package arrayProgram;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int num[] = {2,3,4,5,6,7,8,9};
		int evenCount=0, oddCount=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				evenCount++;
			}
			
			
			if((num[i]%2!=0)) {
				oddCount++;
			}
		}
		int[] evenNum= new int[evenCount];
		int[] oddNum= new int[oddCount];
		int t=0,p=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				evenNum[t]=num[i];
				t++;
			}
			if((num[i]%2!=0)) {
				oddNum[p]=num[i];
				p++;
			}
		}
		
		for(int i=0;i<evenNum.length;i++) {
			System.out.println(oddNum[i]);
		}
		//System.out.println(evenCount);
		//System.out.println(oddCount);
	}

}
