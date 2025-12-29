package interview_Question1;

public class Longest_Sortest_Word {
	
	public static void shortAndLongWord(String str)
    {
        
        String sw="",lw="";
        int s=str.length(),l=0;
        String words[]=str.split(" ");
        for(String word:words)
        {
                if(word.length()<s)
                {
                        sw=word;
                        s = word.length();
                }
                if(word.length()>l)
                {
                        lw=word;
                        l = word.length();
                }
                
        }
        
        System.out.println("LONGEST WORD : "+lw);
        System.out.println("SHORTEST WORD : "+sw);
    }
    public static void main(String[] args) {
       String str="abinash java ram apple";
        shortAndLongWord(str);
    }

}
