package Array;

import java.util.Scanner;

public class FrequencyOfArrayElement {

	public static void main(String[] args) {
		// input array
		Double[] number = new Double[10];
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("number[" + i + "] = ");
			number[i] = inp.nextDouble();
		}

		System.out.println("Frequency of Array number elements");
		for (int i = 0; i < number.length; i++) {
			int run = 0;
			// two count frequency
			int count = 1;
			// the value we get form loop i that value is same or not as compare to previous
			// element
			for (int j = 0; j < i; j++) {
				double x = number[i], y = number[j];
				if (x == y) {
					run = 1;
				}
			}
			// if run=0 means the value we get from loop is is not same to previous element
			// array
			if (run == 0) {
				for (int k = i + 1; k < number.length; k++) {
					double a = number[i], b = number[k];
					if (a == b) {
						count = count + 1;
					}
				}
				// print frequency of element
				System.out.println("number[" + i + "] = " + count);
			}

		}

		inp.close();
	}
}
