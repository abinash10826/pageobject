package assingement;

public class arrey {
	
	int temp=0;

	public static void main(String[] args) {
          int[] a={1,8,4,9,6,3};
          
          for (int i = 0; i < a.length; i++) {
        	  
        	  for (int j = 1+i; j < a.length; j++) {
        		  
        		  if(a[i]<a[j])
        		  { 
        		  int temp=a[i];
        		  a[i]=a[j];
        		  
        		  a[j]=temp;
        		  
        		 // System.out.println(a[i]);
        		  
        		  
        		  }
			}
        	  
        	  System.out.println(a[i]);
        	 
		}
	}

}
