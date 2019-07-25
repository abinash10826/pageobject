package interview_question;

import java.util.TreeSet;

public class Mainmethod {
	
	public static void main(String[] args) {
		
		TreeSet<Car> set=new TreeSet<Car>();
		
		set.add(new Car("Maruti",500000,180));
		set.add(new Car("Honda",600000,150));
		set.add(new Car("Tata",800000,120));
		
		for(Car o:set)
		{
			System.out.println(o);
		}
	}

}
