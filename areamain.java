/*8.Write a program to compute area of class circle rectangle & square using parameterized constructor using BufferedReader class objects.*/

import java.io.*;
class area
{
	double a,b,p;
	char s;
	area(double x)
	{
		p=(22*x*x)/7;
		System.out.println("Area of circle : "+p);
	}
	area(double x,double y)
	{
		p=x*y;
		System.out.println("Area of Rectangle : "+p);
	}
	area(double x,char s)
	{
		p=x*x;
		System.out.println("Area of square : "+p);
	}
}
class areamain
{
	public static void main(String ars[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the radius of circle :");
		double a=Double.parseDouble(br.readLine());
		area ob=new area(a);
		System.out.println("Enter the length of rectangle :");
		double b=Double.parseDouble(br.readLine());
		System.out.println("Enter the width of rectangle :");
		double c=Double.parseDouble(br.readLine());
		area ob1=new area(b,c);
		System.out.println("Enter the length of square :");
		double d=Double.parseDouble(br.readLine());
		area ob2=new area(d,'s');
	}
}
