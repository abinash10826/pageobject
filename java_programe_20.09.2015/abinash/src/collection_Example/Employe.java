package collection_Example;

public class Employe implements Comparable{
	
	int id;
	String name;
	int salary;
	
	Employe(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	/*public String toString()
	{
		return "ID :"+id+" Name :"+" Salary :"+salary;
	}*/

	
	public int compareTo(Object o) {
		 Employe emp=(Employe)o;
		return this.salary-emp.salary;
	}
	
	
	
	
	

}
