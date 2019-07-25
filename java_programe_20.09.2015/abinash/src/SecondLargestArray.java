
public class SecondLargestArray {
	 

		public static void main(String[] args) {
			int k[] = { 19, 43, 8, 97, 54, 76 };

			int largest = k[0];
			int secondlargest = k[0];
			int thirdlargest = k[0];

			for (int i = 1; i <= k.length - 1; i++) {

				if (k[i] > largest) 
				{
					secondlargest = largest;
					largest = k[i];
				} 
				else if (k[i] >secondlargest) 
				{
					secondlargest = k[i];
				}
			}
			System.out.println("secondlargest =" + secondlargest);

		}
	
}
