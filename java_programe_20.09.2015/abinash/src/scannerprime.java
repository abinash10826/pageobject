import java.util.Scanner;

public class scannerprime {

	public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("enter a number");
         int number=scan.nextInt();
         boolean isprime;
         for(int i=2;i<number;i++)
         {
        	 if(number%i==0)
        	 {    isprime=false;
        		 System.out.println(isprime);
        		 break;
        	 }
        	 else
        	 {
        		 System.out.println("prime number");
        		 System.out.println(number);
        		 break;
        	 }
         }
	}

}
