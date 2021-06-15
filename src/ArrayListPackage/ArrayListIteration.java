package ArrayListPackage;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> studentlist = new ArrayList<String>();
		studentlist.add("Suraj");
		studentlist.add("Aditi");
		studentlist.add("Shloka");

		for (int i = 0; i < studentlist.size(); i++) {
			System.out.println(studentlist.get(i));
		}

		// for each loop

		for (String s : studentlist) {
			System.out.println(s);
		}

		// JDK -8 Streams with Lambda
		studentlist.stream().forEach(ele -> System.out.println(ele));

		// Iterator
		Iterator<String> it = studentlist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}