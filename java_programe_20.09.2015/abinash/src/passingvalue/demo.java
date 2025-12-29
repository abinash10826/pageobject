package passingvalue;

public class demo {
	
   final int a;
   demo(int a)
   {
	   this.a=a;
   }
   
   void disp()
   {
	   System.out.println(a);
   }
}

class demo1
{
	demo test(int b){
	
		return new demo(b);
		
		
	}
}
