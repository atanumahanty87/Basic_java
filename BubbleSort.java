//10.	Write a java class which consists of 5 integer data. Overload constructor (Default & normal) to initialize those integer data members. Provide a method which sorts those integer data members using bubble sort.

class Num
{
int arr[]=new int[5];
Num()
{
		arr[0]=5;
		arr[1]=3;
		arr[2]=7;
		arr[3]=4;
		arr[4]=9;
}
Num(int arr[])
{
		for(int i=0;i<5;i++)
			this.arr[i]=arr[i];
}
void sort()
{
		int i,j,temp;
		for(i=5;i>0;i--)
		{
			for(j=0;j<i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<5;i++)
			System.out.print(arr[i]+ " ");
}
}
class BubbleSort
{
	public static void main(String args[])
	{
	int num[]=new int[args.length];
		for(int i=0;i<args.length;i++)
			num[i]=Integer.parseInt(args[i]);
		Num ob1=new Num();
		Num ob2=new Num(num);
		ob1.sort();
		//System.out.println("\nThe given array is");
		ob2.sort();
	}
}
