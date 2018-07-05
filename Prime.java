class Prime
{
public static void main(String args[])
{
	int n=Integer.parseInt(args[0]);
	int f=1;
	for(int j=2;j<n;j++)
	{
	for(int i=2;i<=j/2;i++)
		{
			if(n%i==0)
				{
				System.out.println(“The number is not prime”);
				break;
				}
				else
		        
			       System.out.println(“the number is prime”);
			   f=0;
		}
	}
}
}