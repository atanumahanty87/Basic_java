//PROGRAM TO IMPLEMENT BUBBLESORT USING COMMAND LINE ARGUMENTS
class BubblesortCLA
{
public static void main(String args[])
{
int a[]=new int[20];
int temp;
for(int i=0;i<args.length;i++)
{
a[i]=Integer.valueOf(args[i]);
}
System.out.println( "Elements in the unsorted array are: ");
for(int i=0;i<args.length;i++)
{
System.out.println(a[i]+"\t");
}
for(int i=0;i<args.length;i++)             
{
for(int j=0;j<args.length-i-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}

}
System.out.println("Sorted array elements are: ");
for(int 




i=0;i<args.length;i++)
{
System.out.println(a[i]+"\t");       
}
}
}