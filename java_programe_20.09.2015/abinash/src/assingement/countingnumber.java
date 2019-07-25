package assingement;

public class countingnumber {

	public static void main(String[] args) {
                   
		String str="hagdh1324378";
		int count=0;
		
		char ch[]=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]>=48 && ch[i]<=57)
			{
				count++;
				//System.out.println(count);
			}
			//System.out.println(count);
		}
		System.out.println(count);
	}

}
