package assingement;

import java.util.Arrays;

public class YearToDays {

	public static void main(String[] args) {
		
		
		
		   String [] a ={"50 day","1 year","2 years","4 years","5 years"};
		   System.out.println("array is sorted="+isSorted(a));
	    }

			
		
			
			
			public static boolean isSorted(int[] a) {
				
				    for (int i = 0; i < a.length - 1; i++) {
				        if (a[i] > a[i + 1]) {
				            return false; // It is proven that the array is not sorted.
				        }
				    }

				    return true; // If this part has been reached, the array must be sorted.
				}
	
			
			public static boolean isSorted(String[] a) {
		        int [] numberArray=new int[a.length]; 
		        //convert year to date
		        for(int i=0;i<a.length;i++)
		        {
		            
		            if(a[i].contains("year"))
		            {
		                char date=a[i].charAt(0);
		                int year=Character.getNumericValue(date);
		                int convertToDays=year*365;
		                a[i]=a[i].replace(a[i], convertToDays+"").trim();
		                
		            }
		            
		            if(a[i].contains("day"))
		            {
		            	 a[i]=a[i].replace("days","").trim();
		                a[i]=a[i].replace("day","").trim();
		               
		                
		            }
		          
		        }
		        
		        
		        //convert array string to int array
		        for(int i=0;i<a.length;i++)
		        {
		            
		        	int number = Integer.parseInt(a[i]);
		        	numberArray[i]=number;
		          
		        }
		       
		        
		       return isSorted(numberArray) ;
			}
	}


