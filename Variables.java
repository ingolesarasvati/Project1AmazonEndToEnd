package variables;

public class Variables {
	int noOfDays = 365; // global variable-instance variable

	static int noOfHours = 24; // global variable

	static boolean answer;

	public static void main(String[] args) {
		answer = true;
		System.out.println(answer);

		noOfHours = 36;
		System.out.println(noOfHours);

		Variables v1 = new Variables();

		System.out.println(v1.noOfDays);
	}

}
