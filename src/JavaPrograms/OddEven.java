package JavaPrograms;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the no");

		int a = reader.nextInt();

		if (a % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is odd");
		}

	}

}
