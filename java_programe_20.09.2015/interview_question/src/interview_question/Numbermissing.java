package interview_question;

import java.util.ArrayList;
import java.util.List;

 class Numbermissing {
	
   
	public static void printMissingElement(int[] numbers, int totalelement) {
		List asList = new ArrayList();
		for (int i = 0; i < numbers.length; i++) {
		asList.add(numbers[i]);
		}

		while (totalelement >= 1) {
		if (!asList.contains(totalelement)) {
		System.out.println("missing element : " + totalelement);
		}
		totalelement--;

		}
		
	}
	
	public static void main(String[] args) {
		Numbermissing.printMissingElement(new int[]{1,2,5,8,9}, 9);
	}
}
