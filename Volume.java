/*write a program to design a class volume and then find out the volume of a cube,cylinder and elipsoid using methOdoverloading
a) buffer reader
b) Command line arguement*/

import java.io.*;

class Volume {
 public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter lenght of the cube : ");
double a =Double.parseDouble(br.readLine());
System.out.print("Enter the radius and height of the cylinder : ");
double r =Double.parseDouble(br.readLine());
double h =Double.parseDouble(br.readLine());
System.out.print("Enetr the value of a,b,c :");
double x =Double.parseDouble(br.readLine());
double y =Double.parseDouble(br.readLine());
double z =Double.parseDouble(br.readLine());
Vol ob =new Vol();
ob.volume(a);
ob.volume(r,h);
ob.volume(x,y,z);

}
}







class Vol
{
double volm;

void volume(double a)
    {
	volm = a*a*a; 
  	System.out.println("Volume of the cube is : "+volm);
    }
void volume(double r, double h)
  {
   volm = (4*(3.14*r*r*h))/3;
   System.out.println("Volume of the Cylinder is : "+volm);

  }
  void volume(double a,double b,double c)

   {
    volm= (4*(3.14*a*b*c))/3;
   System.out.println("Volume of the Elipsoid is : "+volm);
   }
}
 