package arrayProgram;

public class ValueExistInaArray {

	public static void main(String[] args) {
		int a[]= {9,6,4,3,2};
		int b=2;
		int count=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==b) {
				count++;
			}
		}
			if(count>0) {
				System.out.println();
			}else {
				System.out.println("number is not present");
			}

	}

}
