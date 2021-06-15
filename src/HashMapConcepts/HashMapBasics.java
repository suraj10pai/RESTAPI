package HashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {

		// No order and no indexing
		// Key Value Pair
		// Key cannot be duplicate
		// can store n number of null value but only one null key
		// not thread safe

		HashMap<String, String> countries = new HashMap<String, String>();
		countries.put("India", "NewDelhi");
		countries.put("SL", "Bangalore");
		countries.put("US", "Washington");
		countries.put(null, "SURAJ");
	

		// System.out.println(countries.get("India"));
		// System.out.println(countries.get(null));

		// Iterator over the keys

		// Iterator<String> it=countries.keySet().iterator();

		// while (it.hasNext()) {
		// String Key=it.next();
		// System.out.println(Key);
		// System.out.println(countries.get(Key));
		// }

		// Iterator over the Set (Pair) using Entry set

		//Iterator<Entry<String, String>> it = countries.entrySet().iterator();

		//while (it.hasNext()) {
			//Entry<String, String> KeyValue = it.next();
			//System.out.println("Key=" + KeyValue.getKey() + "   " + "Value=" + KeyValue.getValue());

		//}

		// Java 8 using for each and lambda
		
		countries.forEach((k,v) -> System.out.println("Key=" + k + "   " + "Value=" + v));
		
	}

}
