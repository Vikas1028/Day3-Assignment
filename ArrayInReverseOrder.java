package Array;

import java.util.Scanner;

public class ArrayInReverseOrder {

	public static void main(String[] args) {
		// input array
		String[] number = new String[10];
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("number[" + i + "] = ");
			number[i] = inp.next();
		}
		System.out.println("Array in Reverse Order");

		for (int i = number.length - 1; i >= 0; i--) {
			System.out.println(number[i]);
		}

		inp.close();
	}
}
