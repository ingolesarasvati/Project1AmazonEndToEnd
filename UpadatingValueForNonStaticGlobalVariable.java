package variables;

public class UpadatingValueForNonStaticGlobalVariable {
	int noOfDays = 60;

	public static void main(String[] args) {
		UpadatingValueForNonStaticGlobalVariable v1 = new UpadatingValueForNonStaticGlobalVariable();
		System.out.println(v1.noOfDays = 100);

	}

}
