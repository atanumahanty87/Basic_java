/*Write a program to compute perimeter of class Circle,Rectangle,Square using paramerised constructor 
A) Commandline Input
B) Buffer Reader*/

import java.io.*;
		class Circle
		{
		void CalCir(int x){
		int cir ;
		cir = 2 * pi * r;
		System.out.println("Circumfernce of the circle is : " + Cir);
		}
		}

class Rect
{
void CalRect(int x,int y){
int re;
int a;
int b;
re = 2*(a+b);
System.out.println("Perimeter of the Rectangle is : "+ re);
} 
}
		class Sqr
		{
		void CalSqr(int x){
		int x;
		int R;
		R= 4*x;
		System.out.println("Perimeter of the Square is : "+R);
		}
		}


class Perimeter
{

public static void main(String args[]) throws IOException  {
Circle ob1= new Circle();
Rect ob2 = new Rect();
Sqr ob3 = new Sqr();

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the radius of the circle : ");
int R=Integer.ParseInt(br.readLine());
System.out.println("Enter the length & breadth of the rectangal : ");
int Le=Integer.ParseInt(br.readLine());
int Br=Integer.ParseInt(br.readLine());
System.out.println("Enter the length of the square : ");






