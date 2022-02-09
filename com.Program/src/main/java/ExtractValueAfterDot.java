
public class ExtractValueAfterDot {
	

	public static void main(String[] args) {
		float i=12345.4566f;
		int intPart = (int) i;
		System.out.println("Float"
				+ " Number: " + i);
		System.out.println("Integer Part: " + intPart);
		System.out.println("Decimal Part: " + (i - intPart));
		

	}

}
