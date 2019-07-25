package interview_Question1;

public class amstrongno {
	
	public static void main(String[] args) {
		
		int num=153;
		int c=0;
		int a=0;
		int temp=0;
		temp=num;
		
		while(num>0)
		{
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
		}
		
		if(c==temp)
		{
			System.out.println("no is amstrong");
		}
		else
		{
			System.out.println("not amstrong");
		}
	}

}
