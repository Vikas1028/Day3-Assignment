package Array;

import java.util.Scanner;

public class EvenPositionArrayElement {
	public static void main(String[] args) {
		// input array
		Double[] number = new Double[10];
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("number[" + i + "] = ");
			number[i] = inp.nextDouble();
		}
		for (int i = 2; i < number.length; i = i + 2) {
			System.out.println("number[" + i + "] = " + number[i]);
		}

		inp.close();
	}
}
