package JavaTraining;

public class Numbersfrom1to100 {

	public static void main(String[] args) {
	
		int number =1;
		
		printnumbers(number);

	}

	
	public static void printnumbers(int num)
	{
		if (num<=100) {
			
			System.out.println(num);
			printnumbers(num+1);
		}
	}
}
