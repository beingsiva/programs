package arrayProgram;

public class ValueExistInaArray {

	public static void main(String[] args) {
		int a[]= {9,6,4,9,3,2,3};
		int b1[]=a;
		int b=2;
		
		for(int j=0;j<b1.length;j++) {
			int count=0;
		for(int i=j;i<a.length;i++) {
			if(a[i]==b1[j]) {
				count++;
			}
		}
		if(count>1) {
		System.out.println("Duplicate element is "+b1[j]+" is present "+count+" times");
		}
		}
	}
	}
