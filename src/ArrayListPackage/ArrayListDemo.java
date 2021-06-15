package ArrayListPackage;
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		//Static Array
		
		int i[] =new int[4];
		i[3]=100;
		System.out.println(i[0]);
		
		
		//ArrayList --> Maintains Order
	
		ArrayList<Object> ar= new ArrayList<Object>();
		ar.add(100);
		ar.add("Suraj");
		System.out.println(ar.get(0));
	
		ar.add(400);
		ar.add("Aditi");
		System.out.println(ar.size());
		

	}

}
