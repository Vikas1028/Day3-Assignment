package Array;

import java.util.Scanner;

public class SortArrayInAscendingOrder {

	public static void main(String[] args) {
		// input array
		Double[] number = new Double[10];
		double b = 0, e = 0, d = -1;
		int c = 0, f = -1;
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("number[" + i + "] = ");
			number[i] = inp.nextDouble();
		}
		for (int i = 0; i < number.length; i++) {
			if (number[i] > e) {
				e = number[i];
			}
		}

		// print array in ascending order
		for (int i = 0; i < number.length; i++) {
			b = e + 1;
			for (int j = 0; j < number.length; j++) {
				if (number[j] < b && number[j] > d) {
					b = number[j];
					c = j;
				}
			}
			d = b;

			// to avoid to print same element
			if (f != c) {
				System.out.println("number[" + c + "] = " + d);
				f = c;
			}

			// to print duplicate array element
			for (int k = c + 1; k < number.length; k++) {
				double x = number[c], y = number[k];
				if (x != y) {

				} else {
					System.out.println("number[" + k + "] = " + d);
				}
			}

		}
		inp.close();
	}
}
