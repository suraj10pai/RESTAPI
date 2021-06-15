package ArrayListPackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparison {

	public static void main(String[] args) {

		// Sort and then Equals
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		Collections.sort(l1);
		Collections.sort(l2);

		System.out.println(l1.equals(l3));
		System.out.println(l2);

		// Compare 2 list and find out additional elements

		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		l4.removeAll(l5);
		System.out.println(l4);

		// missing Element
		l5.removeAll(l4);
		System.out.println(l5);
		
		//find out common elements 
		
		ArrayList<String> language1 = new ArrayList<String>(Arrays.asList("JAVA", "PHYTON", "RUBY", "C#", "JS"));

		ArrayList<String> language2 = new ArrayList<String>(Arrays.asList("JAVA", "PHYTON", "RUBY", "C#", "PHP"));
		
		language1.retainAll(language2);
		System.out.println(language1);

		

	}

}
