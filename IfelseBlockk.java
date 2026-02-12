package conditioalStatements;

public class IfelseBlockk {

	static void add() {
		int a = 10;
		int b = 20;
		if (a > b) {
			System.out.println("1");
		}
		if (a < b) {
			System.out.println("2");    // true 
		}
		if (a <= b) {
			System.out.println("3");    //true

		}
		if (a >= b) {
			System.out.println("4");

		}
		if (a == b) {
			System.out.println("5");

		}
		if (a != b) {
			System.out.println("6");   // true

		}
	}
	public static void main(String[] args) {
		add();
		
	}
}
