package Array;

public class mainclass {

	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=11;
		arr[1]=12;
		arr[2]=13;
		arr[3]=14;
		arr[4]=15;
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("------------------------");
		
		for (int j=arr.length-1;j>=0;j--) {
			
			System.out.println(arr[j]);
			
		}

	}

}
