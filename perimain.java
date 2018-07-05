class peri
{
	double a,b,p;
	char s;
	peri(double x)
	{
		p=(22*2*x)/7;
		System.out.println("perimeter of circle : "+p);
	}
	peri(double x,double y)
	{
		p=2*(x+y);
		System.out.println("perimeter of Rectangle : "+p);
	}
	peri(double x,char s)
	{
		p=4*x;
		System.out.println("perimeter of square : "+p);
	}
}
class perimain
{
	public static void main(String ars[])
	{
		double a=Double.parseDouble(ars[0]);
		peri ob=new peri(a);
		double b=Double.parseDouble(ars[1]);
		double c=Double.parseDouble(ars[2]);
		peri ob1=new peri(b,c);
		double d=Double.parseDouble(ars[3]);
		peri ob2=new peri(d,'s');
	}
}
