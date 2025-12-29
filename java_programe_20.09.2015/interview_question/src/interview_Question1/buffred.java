package interview_Question1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class buffred {
	
	public static void main(String[] args) {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int mul=1;
		for (int i = 0; i <2; i++) {
			
			try
			{
				int num=Integer.parseInt(br.readLine());
				mul=mul*num;
			}
			catch (Exception e) {
				System.exit(0);
			}
			
		}
		
		System.out.println(mul);
	}

}
