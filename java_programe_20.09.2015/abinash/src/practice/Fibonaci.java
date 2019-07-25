package practice;

public class Fibonaci {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		int third=0;
		
		System.out.print(first+","+second+",");
		
		for(int i=3;i<=10;i++)
		{
			third=first+second;
			System.out.print(third+(","));
			
	        first=second;
	        second=third;
		}

	}

}
