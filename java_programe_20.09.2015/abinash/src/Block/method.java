package Block;

public class method {
	static int i=10;
	
	static
	{
		System.out.println("static block1");
	}

     public static void main(String[] args) {
    	 
    	 System.out.println(i);
    	 
    	 System.out.println("main class");
    	 
     }
     
     static 
     {
    	 System.out.println("static block2");
     }
		
	}
