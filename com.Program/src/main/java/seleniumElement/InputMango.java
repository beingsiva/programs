package seleniumElement;

public class InputMango {

	public static void main(String[] args) {
		String str="mobile";
		char[] ca = str.toCharArray();
		
			for(int i=0;i<str.length();i++) {
				
				if(i%2==0) {
					char ch= (char)(ca[i]+2);
					System.out.print(ch);
				}else {
					char ch= (char)(ca[i]-2);
					System.out.print(ch);	
				}
			}
				

	}

}
