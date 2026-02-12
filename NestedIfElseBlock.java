package conditioalStatements;

public class NestedIfElseBlock {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		if (a < b) {
			System.out.println("Statement 1");

			if (a >= 10) {
				System.out.println("Statement 2");

				if (a == 25) {
					System.out.println("Statement 3");
				}

			} else {
				System.out.println("Statement 4");

			}
		} else {
			System.out.println("Statement 5");

		}

	}

}
