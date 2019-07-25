package hashcode;

public class student {
	int id;
	String name;
	public student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public int hashCode()
	{
		return id;
	}

}
