package interfacekeyword;

public class Mainclass {

	public static void main(String[] args) {
      SavingAccount acc1=new SavingAccount(500);
      LoanAccount acc2=new LoanAccount();
      
      teller txn=new teller();
      txn.deposition(acc1,500);
      txn.deposition(acc2, 30000);
      
      acc1.balanceenquiry();
      acc2.balanceenquiry();
	}

}
