package JavaTraining;

public class Constructor {

	// class variables
	String name;
	int age;

	public Constructor() {
		System.out.println("This is default constructor"); // 0 Parameter constructor
	}

	public Constructor(int i) {
		System.out.println("1 Parameter constructor"); // 0 Parameter constructor
	}

	public Constructor(int i, int j) {
		System.out.println("2 Parameter constructor"); // 0 Parameter constructor
	}

	
	public Constructor(String name, int age) {
		this.name=name; //this.class var=loc var
		this.age=age;
		System.out.println("Name is"+" "+ name+" " +"Age is"+" "+age); 
	}

	public static void main(String[] args) {

		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(10);
		Constructor obj2 = new Constructor(10, 20);
		Constructor obj3 = new Constructor("Tom", 30);
		
		System.out.println(obj3.name);
		System.out.println(obj3.age);

	}

}
