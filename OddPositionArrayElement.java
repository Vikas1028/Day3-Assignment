package Array;

import java.util.Scanner;

public class OddPositionArrayElement {

	public static void main(String[] args) {
		// input array
		String[] number = new String[10];
		Scanner inp = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.print("number[" + i + "] = ");
			number[i] = inp.next();
		}
		System.out.println("Print Odd Position Array");
		for (int i = 1; i < number.length; i = i + 2) {
			System.out.println("number[" + i + "] = " + number[i]);
		}

		inp.close();
	}
}
