class  sumint
{
	public static void main(String[] args) 
	{
		int op=pintu(584);
		System.out.println(op);
	}




public static int pintu(int num)
{
	int sum=0;
	while(num>0)
	{
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
	}
	return sum;
}}
