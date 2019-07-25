package Threadmethod;

public class Mainclass 
{
        public static void main(String[] args) {
		System.out.println("Main Started");
		Sequence th1=new Sequence();
		th1.start();
		System.out.println("Main Ended");
		
	

	}

}
class Sequence extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
		}
	}

