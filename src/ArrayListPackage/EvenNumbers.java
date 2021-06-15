package ArrayListPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumbers {

	public static void main(String[] args) {

		ArrayList<Integer> Al = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		Al.removeIf(num -> num % 2 == 0);

		System.out.println(Al);

	}

}
