package abinash;
import java.util.Scanner;
public class switchstatement1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter month number");
		int val=scan.nextInt();
		
		int month=val;
		switch(month)
		{
		case 1:System.out.println("january");
		break;
		
		case 2:System.out.println("febuary");
		break;
		case 3:System.out.println("march");
		break;
		case 4:System.out.println("april");
		break;
		case 5:System.out.println("may");
		break;
		case 6:System.out.println("june");
		break;
		case 7:System.out.println("july");
		break;
		case 8:System.out.println("august");
		break;
		case 9:System.out.println("september");
		break;
		case 10:System.out.println("october");
		break;
		case 11:System.out.println("november");
		break;
		case 12:System.out.println("december");
		break;
		default:case2:System.out.println("Invalid Month!");
		

	}}

}
