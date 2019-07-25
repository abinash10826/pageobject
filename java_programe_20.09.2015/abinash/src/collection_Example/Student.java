package collection_Example;

public class Student {
	
	int id;
	String name;
	int age;
	
	Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
