//9.	Create a class named complex with data members as real and imaginary. Overload three constructors to initialize the data members (i.e. default, normal, and through object initialization). Provide methods which returns objects of the complex class as the result for addition, subtraction, multiplication of two complex numbers.


import java.io.*;
class Complex
{
	int real,img;
	Complex()
	{
		real=5;
		img=3;
	}
	Complex(int a,int b)
	{
		real=a;
		img=b;
	}
	Complex(Complex ob)
	{
		real=ob.real+5;
		img=ob.img+5;
	}
	Complex add(Complex ob)
	{
		Complex ob1=new Complex();
		ob1.real=real+ob.real;
		ob1.img=img+ob.img;
		return ob1;
	}
	Complex sub(Complex ob)
	{
		Complex ob1=new Complex();
		ob1.real=ob.real-real;
		ob1.img=ob.img-img;
		return ob1;
	}
	Complex mul(Complex ob)
	{
		Complex ob2=new Complex();
	ob2.real=real*ob.real+(img*ob.img)*(-1);
		ob2.img=real*ob.img+img*ob.real;
		return ob2;

	}
}
class ComplexDemo
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Complex ob=new Complex();
		System.out.println("Enter the real part");
		int real=Integer.parseInt(br.readLine());
		System.out.println("Enter the imaginary part");
		int img=Integer.parseInt(br.readLine());
		Complex ob1=new Complex(real,img);
		System.out.println("Enter 2nd complex no.");
		System.out.println("Enter the real part");
		real=Integer.parseInt(br.readLine());
		System.out.println("Enter the imaginary part");
		img=Integer.parseInt(br.readLine());
		Complex ob4=new Complex(real,img);
		Complex ob3=new Complex(ob1);
		Complex ob2;
		ob2=ob4.add(ob1);
		System.out.println("complex add with normal: "+ob2.real+"+"+ob2.img+"i");
		ob2=ob4.sub(ob1);
		System.out.println("complex sub with normal : "+ob2.real+"+"+ob2.img+"i");
		ob2=ob4.mul(ob1);
		System.out.println("complex mul with normal : "+ob2.real+"+"+ob2.img+"i");
		ob2=ob.add(ob1);
		System.out.println("complex add with default : "+ob2.real+"+"+ob2.img+"i");
		ob2=ob.sub(ob1);
		System.out.println("complex sub with default: "+ob2.real+"+"+ob2.img+"i");
		ob2=ob.mul(ob1);
		System.out.println("complex mul with default: "+ob2.real+"+"+ob2.img+"i");
		ob2=ob4.add(ob3);
		System.out.println("complex add with object: "+ob2.real+"+"+ob2.img+"i");
		ob2=ob4.sub(ob3);
		System.out.println("complex sub with object: "+ob2.real+"+"+ob2.img+"i");
		ob2=ob4.mul(ob3);
		System.out.println("complex mul with object: "+ob2.real+"+"+ob2.img+"i");
	}
}

