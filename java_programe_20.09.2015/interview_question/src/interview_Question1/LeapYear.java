package interview_Question1;

public class LeapYear {
	
	public static void leap(int year)
	{
		if(year%400==0 || year%4==0 & year%100!=0)
		{
			System.out.println(year+ " lear year");
		}
		else
		{
			System.out.println(year+ " not a leap year");
		}
	}
	
	public static void main(String[] args) {
		
		leap(2019);
		leap(2020);
		leap(2021);
		leap(2022);
		leap(2012);
		leap(2023);
		leap(2024);
		leap(2016);
		
	}

}
