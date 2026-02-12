package variables;

public class FinalVriable {
	int noOfDays=365;
	static int noOfHours=24;
	
	 static void method1() {
		 System.out.println(noOfHours);
	 }

	  static void method2() {
		  System.out.println(noOfHours);
	  }
	public static void main(String[] args) {
		final int second =60;
		 String name= "Ram Tiwari";
		 
		 System.out.println(noOfHours);
		 method1();
		 method2();

	}
}
