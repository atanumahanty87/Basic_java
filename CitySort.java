/*4.	Write a program to accept the following city name as argument in the command line and sort them in alphabetical order.
city name = {Kolkata, Chennai, Mumbai, Delhi, Bangalore, Ahmedabad}*/


class CitySort
{
		public static void main(String args[])
		{
			int len=args.length;
			Sort ob1=new Sort();
			ob1.arrange(args, len);
		}
}
class Sort
{
		String temp;
		void arrange(String city[],int len)
{
			for(int i=0;i<len;i++)
			{
				for(int j=i;j<len-1;j++)
				{
					if(city[i].compareTo(city[j+1])>0)
					{
						temp=city[i];
						city[i]=city[j+1];
						city[j+1]=temp;
					}
				}
			}
			for(int i=0;i<len;i++)
				System.out.println(city[i]);
		}
}
