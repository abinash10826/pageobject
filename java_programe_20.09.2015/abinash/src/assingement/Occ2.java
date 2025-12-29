package assingement;

public class Occ2 {

	public static void main(String[] args) {
		String s="aasswa";
		
		char a[]=s.toCharArray();
		
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j] && a[i]!='-')
			{
				
				count++;
				a[j]='-';
				
				
			}
			}
			
			if(a[i]!='-')
			System.out.println(a[i]+"="+count);
			
		}

	}

}
