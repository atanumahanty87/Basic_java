class PatternAST
{
public static void main(String args[])
{
int x=Integer.parseInt(args[0]);
int a[][]=new int[x][];
for(int i=0;i<x;i++)
{
 a[i]=new int[i+1];
}

for(int i=0;i<x;i++)
{
 	
	for(int j=0;j<=i;j++)
	{
 	
	System.out.print("*");
	}
	System.out.println();
	}	
}
}

	