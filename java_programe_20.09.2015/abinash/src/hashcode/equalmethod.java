package hashcode;

public class equalmethod {
	public static void main(String[] args) {
		student1 st1= new student1(1234,"abinash");
		student1 st2=new student1(1234,"abinash");
		System.out.println(st1.equals(st2));
		System.out.println(st1==st2);
		
	}

}
