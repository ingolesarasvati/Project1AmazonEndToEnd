package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AssignTheValueOfArrayAtRuntime {
	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int[] rollno = new int[s1.nextInt()];
		for (int i = 0; i < rollno.length; i++) {
			System.out.println("Please enter the value At  index position:--> " + i);
			rollno[i] = s1.nextInt();

		}
		System.out.println(Arrays.toString(rollno));
		s1.close();

	}

}

/*
 Output will be 
 
 Enter the size of Array
4
Please enter the value At  index position:--> 0
15
Please enter the value At  index position:--> 1
20
Please enter the value At  index position:--> 2
36
Please enter the value At  index position:--> 3
45
[15, 20, 36, 45]

 */


