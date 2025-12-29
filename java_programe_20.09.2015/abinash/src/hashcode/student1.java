package hashcode;

public class student1 {
	int id;
	String name;
	student1(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	public boolean equals(Object obj)
	{
		student1 st=(student1)obj;
		return this.id==st.id;
		
	}
	

}
