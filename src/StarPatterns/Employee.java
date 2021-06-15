package StarPatterns;

public class Employee {

	// How to implement Encapsulation

	// 1.private data variables -so these variables cannot be accessed outside the
	// class

	private int ssn;
	private String empname;
	private int empage;

	// Getter & Setter methods
	// to set and get the values of the fields

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpname("SURAJ");
		emp.setSsn(123);
		emp.setEmpage(37);

		System.out.println("Employee NAME is" + " " + emp.getEmpname());

	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpage() {
		return empage;
	}

	public void setEmpage(int empage) {
		this.empage = empage;
	}

}
