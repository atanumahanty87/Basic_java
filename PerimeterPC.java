/*Write a program to compute perimeter of class Circle,Rectangle,Square using paramerised constructor 
A) Commandline Input
B) Buffer Reader*/

import java.io.*;
		class Circle
		{
		 Circle(int x){
		double Cir ;
		Cir = 2 *Math.PI*x;
		System.out.println("Circumfernce of the circle is : " + Cir);
		}
		}

class Rect
{
 Rect(int x,int y)
{
int re;
int a=x;
int b=y;
re = 2*(a+b);
System.out.println("Perimeter of the Rectangle is : "+ re);
} 
}
		class Sqr
		{
		 Sqr(int x)
{
		int R;
		R= 4*x;
		System.out.println("Perimeter of the Square is : "+R);
		}
		}



class PerimeterPC
{
public static void main(String args[]) throws IOException  {

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the radius of the circle : ");
int R =Integer.parseInt(br.readLine());
Circle ob1= new Circle(R);

System.out.println("Enter the length & breadth of the rectangal : ");
int Le=Integer.parseInt(br.readLine());
int Br=Integer.parseInt(br.readLine());
Rect ob2 = new Rect(Le,Br);

System.out.println("Enter the length of the square : ");
int A=Integer.parseInt(br.readLine());
Sqr ob3 = new Sqr(A);

/*ob1.Cir(R);
ob2.Rect(Le,Br);
ob3.Sqr(A);*/
}
}






