package Arrays;

import java.util.Arrays;

public class CopyTheValueFromOneArrayIntoAnotherArray {
	public static void main(String[] args) {
		int[] arr1 = new int[4];

		arr1[0] = 72;
		arr1[1] = 45;
		arr1[2] = 25;
		arr1[3] = 59;

		int[] arr2 = new int[arr1.length];

		for (int i = 0; i <arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		System.out.println("Input Array is : ---");
		System.out.println(Arrays.toString(arr1));
		System.out.println("Output Array is : ---");
		System.out.println(Arrays.toString(arr2));
	}

}

/*
 * Input Array is : --- [72, 45, 25, 59] 
 * Output Array is : --- [72, 45, 25, 59]
 */
