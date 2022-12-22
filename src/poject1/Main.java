package poject1;

import java.util.Iterator;
import java.util.Random;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in); // user input
		int arraySize;
		int randomSize;
		int i;
		int j;
		int k;
		int sum = 0;
		float average = 0;

		////////////////////////

		System.out.print("Enter your array size:");
		arraySize = input.nextInt();

		int arr[] = new int[arraySize];
		System.out.print("Enter your array element:");
		for (i = 0; i < arraySize; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print("Your array elements is : ");
		for (i = 0; i < arraySize; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
			average = sum / arraySize;
		}
		System.out.println();
		System.out.println("Summition is = " + sum);
		System.out.println("Average is = " + average);

		for (k = 0; k < arraySize; k++) 
			for (j = k + 1; j < arraySize; j++) {
				if ((arr[k] == arr[j]) && (k != j)) {
					System.out.println("Duplicate Element :" + arr[j]);
				}
			
		}
		System.out.println();

		/////////////////////////////
		////// RANDOM ARRAY///////////

		System.out.print("Enter your random array size:");
		randomSize = input.nextInt();

		byte[] randomArray = new byte[randomSize];
		random.nextBytes(randomArray);
		System.out.print("Your Random array elements is :[ ");
		for (i = 0; i < randomSize; i++) {
			System.out.print(randomArray[i] + " ");
		}
		System.out.print("]");

		System.out.println();

	}
}
