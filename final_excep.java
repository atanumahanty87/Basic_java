import java.io.*;
class final_excep{
public static void main(String args[])
{
	double a=Double.parseDouble(args[0]);
	double b=Double.parseDouble(args[1]);
	double c=-1;
	try{
		double quotient=a/b;
		c=quotient;
	System.out.println(c);
	}	
	finally{
	if(c==-1)
	System.out.println("Exception occured");
	else
	System.out.println("Quotient is:"+c);
	

	}
}
}