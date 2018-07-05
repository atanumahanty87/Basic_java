import java.io.*;
interface volume
{
	double in(double s1,double s2,double s3);
	double out(double s1,double s2,double s3);
}
class vol implements volume
{
	public double in(double s1,double s2,double s3)
	{
		return (22*s1*s2*s3)/(3*7);
	}
	public double out(double s1,double s2,double s3)
	{
		return (4*22*s1*s2*s3)/(3*7);
	}
}

class volmain
{
	public static void main(String ars[]) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		vol ob=new vol();
		System.out.println("For Inner Volume");
		System.out.println("Enter s1");
		double s1=Double.parseDouble(br.readLine());
		System.out.println("Enter s2");
		double s2=Double.parseDouble(br.readLine());
		System.out.println("Enter s3");
		double s3=Double.parseDouble(br.readLine());
		System.out.println("Inner volume is :"+ob.in(s1,s2,s3));
		System.out.println("Outer volume is :"+ob.out(s1,s2,s3));
	}
}
