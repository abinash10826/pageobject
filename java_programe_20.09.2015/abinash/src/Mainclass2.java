import java.util.Scanner;

class student
{
	int id;
	String name;
	double marks;
	char grade;
	student(String name,int id,double marks,char grade)
	{
		this.name=name;
		this.id=id;
		this.marks=marks;
		this.grade=grade;
	}
	void display()
	{
		System.out.println("name is"+  this.name);
		System.out.println("id is"+  this.id);
		System.out.println("marks is"+  this.marks);
		System.out.println("grade is"+  this.grade);
		
	}
}
public class Mainclass2 
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("name,enter id,marks,grade");
		String name=scan.nextLine();
		int id=scan.nextInt();
		double marks=scan.nextDouble();
		char grade=scan.next(".").charAt(0);
		student st1=new student(name,id,marks,grade);
		st1.display();
		
		

}

	
	}
