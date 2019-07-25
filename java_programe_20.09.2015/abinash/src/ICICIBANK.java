class NetBanking
{
	void login(String usn,String pwd)
	{
		System.out.println("netbanking done using userid & password");
		System.out.println("userid "+usn);
		System.out.println("password "+pwd);
		
	}
	void login(long dcn,String pwd)
	{
		System.out.println("netbanking done using debitcard no & password");
		System.out.println("username as a debitcard no "+dcn);
		System.out.println("password "+pwd);
	}
}

class NetBankingUpdated extends NetBanking
{
	void login(String usn,long dcn,String pwd,int OTP)
	{
		System.out.println("netbanking done using userid or debit card,verify OTP & password");
		System.out.println("userid "+usn+ "or-debitcard no " +dcn);
		System.out.println("password "+pwd);
		System.out.println("one time password "+OTP);
		
	}
}

 public class ICICIBANK {

	public static void main(String[] args) {
		NetBankingUpdated ref=new NetBankingUpdated();
		ref.login("abinash10826@gmail.com ",1234562345l,"afdhhdgdff ",3464);
		
		System.out.println("----------------------");
		
        ref.login(1234562345l,"afdhhdgdff ");
        
		System.out.println("----------------------");
		
        ref.login("abinash10826@gmail.com ","afdhhdgdff ");
	}

}
