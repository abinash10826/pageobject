package Threadmethod;

public class Mainclass1 {

	public static void main(String[] args) {
		
		
		
Sequence1 s=new Sequence1();
     Thread th1=new Thread(s);
     th1.start();
       Sequence2 s1=new Sequence2();
       Thread th2=new Thread(s1);
       th2.start();
       
       
      
       
	}
}
class Sequence1 implements Runnable
{
	public void run()
	{
		for(int i=11;i<=20;i++)
		{
			try {
				
			
			System.out.println(i+"th1");
			Thread.sleep(1000);
			}
			catch (InterruptedException a) {}
			}
		}
	}
	

class Sequence2 extends Sequence1 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				
				
				System.out.println(i+"th2");
				Thread.sleep(1000);
				}
				catch (InterruptedException a) {}
				}
		}
	}


