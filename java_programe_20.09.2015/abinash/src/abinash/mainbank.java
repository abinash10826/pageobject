package abinash;

public class mainbank {

	public static void main(String[] args) {
		//SavingAccount account1=new SavingAccount(300);
		//account1.deposite(400);
		//account1.withdraw(200);
		//account1.balanceinquiry();
		
		System.out.println("---------------");
		LoanAccount account2=new LoanAccount();
		account2.deposite(30000);
		account2.withdraw(10000);
		account2.Balanceinquiry();
		
		System.out.println("------------");
		            BankAccount account3=new SavingAccount(800);
		            account3.diposite(200);
		    		account3.withdraw(200);
		    		account3.balanceinquiry();
		    		
	}

}
