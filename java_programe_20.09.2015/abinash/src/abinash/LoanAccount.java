package abinash;

public class LoanAccount extends BankAccount
{
 double accbal=50000.00;
 void deposite(double amt)
 {
	 accbal=accbal-amt;
	 System.out.println(amt +" /rs deposite");
 }
 void withdraw(double amt)
 {
	 accbal=accbal+amt;
	 System.out.println(amt+ " /rs withdraw");
 }
 void Balanceinquiry()
 {
	 System.out.println("total balance is "+accbal);
 }
}
