package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Selenium";
		String rev = "";

		int len = s.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println(rev);

		StringBuffer a = new StringBuffer(s);
		a = a.reverse();
		System.out.println(rev);

	}

}
