package Array;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
             int[] a= {1,2,3,4};
             int[] b= {6,8,4,9};
             
             int[] c=new int[a.length+b.length];
             
             int count=0;
             
             for(int i=0;i<=a.length-1;i++)
             {
            	 c[i]=a[i];
            	 count++;
             }
             for(int j=0;j<=b.length-1;j++)
             {
            	 c[count++]=b[j];
             }
             for(int k=0;k<=c.length-1;k++)
             {
            	 System.out.print(c[k]+" ");
             }
             
	}

}
