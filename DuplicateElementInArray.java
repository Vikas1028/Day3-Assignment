package Array;

import java.util.Scanner;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// input array
		Double[] number = new Double[10];
		double w = -1;
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("number[" + i + "] = ");
			number[i] = inp.nextDouble();
		}

		// to print duplicate array element
		for (int c = 0; c < number.length; c++) {
			for (int k = c + 1; k < number.length; k++) {
				double x = number[c], y = number[k], z;
				if (x == y && y != w) {
					z = number[k];
					System.out.println(z);
					w = y;
				}
			}

		}
		inp.close();
	}
}
