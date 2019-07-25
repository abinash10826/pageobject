package abinash;

public class SavingAccount extends BankAccount
{
	double accbal;
     SavingAccount(double initbal)
	{
		accbal=initbal;
	}
	void deposite(double amt)
	{
	accbal=accbal+amt;
	System.out.println(amt +"/rs deposite");
	}
	void withdraw(double amt)
	{
		accbal=accbal-amt;
		System.out.println(amt +"/rs withdraw");
	}
	void balanceinquiry()
	{
		System.out.println("total balance is "+ accbal);
	}
}
