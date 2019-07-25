package collection1;

public class Student_comparable implements Comparable<Student_comparable>{
	
	int age;
	String name;
	int id;
	public Student_comparable(int age, String name, int id) {
		
		this.age = age;
		this.name = name;
		this.id = id;
	}






	@Override
	public String toString() {
		return "Student_comparable [age=" + age + ", name=" + name + ", id=" + id + "]";
	}






	@Override
	public int compareTo(Student_comparable o) {
		
		return this.name.compareTo(name);
	}

}
