package abinash;

public class emp {
	private String studentname;
	private int rollno;
	
	public String getStudentname()
	{
		return studentname;
	}
	public int getRollno()
	{
		return rollno;
	}
	public void setStudentname(String studentname)
	{
		this.studentname=studentname;
		System.out.println(studentname);
	}
public void setRollno(int rollno)
{
	this.rollno=rollno;
	System.out.println(rollno);
}
}
