package JavaTraining;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		getPrimeNumber(10000);

	}

	public static void getPrimeNumber(int num) {

		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i + "");
			}
		}
	}

}
