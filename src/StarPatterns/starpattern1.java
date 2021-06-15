package StarPatterns;

public class starpattern1 {

	public static void main(String[] args) {
		
		//Star Pattern

	for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//Star Pattern2

				for (int i = 0; i<= 5; i++) {
					for (int j = 5; j>= i; j--) {
						System.out.print("*");
					}
					System.out.println("");
				}
		

	}

}
