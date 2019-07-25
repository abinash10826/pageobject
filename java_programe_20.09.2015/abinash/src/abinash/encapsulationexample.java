
package abinash;

public class encapsulationexample {
	private String empname;
	private int empid;
	private void m1()
	{
		System.out.println("private method");
	}

	public static void main(String[] args) {
		
		encapsulationexample emp=new encapsulationexample();
		
		emp.m1();
		System.out.println(emp.empname);
		System.out.println(emp.empid);

	}

}
