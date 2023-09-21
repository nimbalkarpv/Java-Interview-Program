package Array;

import java.util.Scanner;
/*
 * Calculate the Average of Given Array
 * -------------------------------------
 * 
 * This is one basic program using array.
 * Steps
 * 1. Declare a variable sum with 0
 * 2. Iterate the array and add with sum variable
 * 3. Divide the sum with array length
 *
 * array = {10, 10, 10, 10, 10};
 * sum is 50
 * array length is 5
 * average is 10

 */

public class array1 {
	static int total = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			total = total + array[i];
		}

		float avg = total / size;
		System.out.println("Given array size = " + size);
		System.out.print("Given array = ");
		for (int v : array) {
			System.out.print(v + "  ");
		}
		System.out.println();
		System.out.println("Average of this array = " + avg);
	}

}
/*
 * output
 * 
 * Given array size = 3 
 * Given array = 2 3 4 
 * Average of this array = 3.0
 */
