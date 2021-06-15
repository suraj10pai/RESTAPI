package ArrayListPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCompare {

	public static void main(String[] args) {


  ArrayList<Integer> linklist1= new ArrayList<Integer>(Arrays.asList(12,243,512,343,90,478));
  ArrayList<Integer> linklist2= new ArrayList<Integer>(Arrays.asList(12,243,512,343,90,478));
  
   System.out.println(linklist1);
   System.out.println(linklist2); 

    boolean a=linklist1.equals(linklist2);
    System.out.println(a); 

   }
}
