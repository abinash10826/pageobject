package ArraysQuestion;

public class Printduplicateno {
	
	
	
	public static void main(String[] args) {
		
		
int[] a={2,2,2,2,2,4,4,4,4,8,8,5,9,10};
	

for(int j=0;j<a.length;j++) {
	int count=0;
	
    for(int k =j+1;k<a.length;k++) {
        if(a[j]==a[k]) {
          count++;    
        }
       
    }
    if(count==1)
    {
       System.out.println(a[j]);
    }
   
}
}

}
