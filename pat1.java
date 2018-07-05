class Pattern
{
public static void main(String args[])
{
int x=Integer.parseInt(ars[0]);
int a[][]=new int[x][];
int i,j,k;
for(i=0;i<x;i++)
{
 a[i]=new int[i=1];
}

for(int i=0;i<x;i++)
{
 k=1;
for(j=0;j<i;j++)
{
 a[i][j]=k;
System.out.print(a[i][j]+" ");
if(k==1)
k=0;
else
k=1;
}
System.out.println();
}
}