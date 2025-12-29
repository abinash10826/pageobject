package hashcode;

public class mainmethod {

	public static void main(String[] args) {
		student st1=new student(1234,"abinash");
		System.out.println(st1.hashCode());
		student st2=new student(1534,"pintu");
		  System.out.println(st2.hashCode());

	}

}
