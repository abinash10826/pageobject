package interfacekeyword;

public interface BankAccount {
	void deposite(double amt);
	void withdraw(double amt);
	void balanceenquiry();
	
	}
class SavingAccount  implements BankAccount
{
	double accbal;
	  SavingAccount(double initbal)
	{
	accbal=initbal;
	System.out.println("initial balance "+accbal);
	
}
	
	public void deposite(double amt)
	{
		
		new Runnable() {
			
			@Override
			public void run() {
								
			}
		};
		
		accbal=amt+accbal;
		System.out.println(amt+"/Rs deposite");
	}
	public void withdraw(double amt)
	{
		accbal=accbal-amt;
		System.out.println(amt+"/Rs withdraw");
	}
	public void balanceenquiry()
	{
		System.out.println("total bal is "+accbal);
	}
	}
     class LoanAccount implements BankAccount
    {
	double accbal=50000.00;
	
	public void deposite(double amt)
	{
		accbal=accbal-amt;
		System.out.println(amt+"/Rs deposite");
	}
	public void withdraw(double amt)
	{
		accbal=accbal+amt;
	System.out.println(amt+"/Rs withdraw");
	}
	public void balanceenquiry()
	{
		System.out.println("total balance"+accbal);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
