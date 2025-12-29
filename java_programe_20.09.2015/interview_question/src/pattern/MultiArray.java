package pattern;

public class MultiArray {
	
	public static void main(String[] args) {
		
		int arr[][]= {{30,20,10},{40,50,60}};
		
		System.out.println(arr.length-1);
		
		for (int i =0; i <2; i++) {
			
			for (int j = 2; j <=0; j--) {
				
				System.out.println(arr[i][j]);
				
			}
			
		}
	}

}
