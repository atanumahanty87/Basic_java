import java.io.*;
class Employee
{
	String emp_code,emp_name,address;
	long ph_no;
	double hra,da;
	Employee(String code,String name,String add,long ph)
	{
		emp_code=code;
		emp_name=name;
		address=add;
		ph_no=ph;
		hra=0.2;
		da=0.1;
	}
}
class Teaching extends Employee
{
	String sub_spl,dgn;
	Teaching(String code,String name,String add,long ph,String sub,String dtn)
	{
		super(code,name,add,ph);
		sub_spl=sub;
		dgn=dtn;
	}
}
class Office extends Employee
{
	String dgn;
	Office(String code,String name,String add,long ph,String dtn)
	{
		super(code,name,add,ph);
		dgn=dtn;
	}
}
class Faculty extends Teaching
{
	double basic,salary;
	Faculty(String code,String name,String add,long ph,String sub,String dtn,double basic)
	{
		super(code,name,add,ph,sub,dtn);
		this.basic=basic;
	}
	double tSal()
	{
		salary=basic+hra*basic+da*basic;
		return salary;
	}	
}
class Technical extends Teaching
{
	double basic,salary;
	Technical(String code,String name,String add,long ph,String sub,String dtn,double basic)
	{
		super(code,name,add,ph,sub,dtn);
		this.basic=basic;
	}
	double tSal()
	{
		salary=basic+hra*basic+da*basic;
		return salary;
	}		
}
class Administrative extends Office
{
	double basic,salary;
	Administrative(String code,String name,String add,long ph,String dtn,double basic)
	{
		super(code,name,add,ph,dtn);
		this.basic=basic;
	}
	double tSal()
	{
		salary=basic+hra*basic+da*basic;
		return salary;
	}	
}
class Accounts extends Office
{
	double basic,salary;
	Accounts(String code,String name,String add,long ph,String dtn,double basic)
	{
		super(code,name,add,ph,dtn);
		this.basic=basic;
	}
	double tSal()
	{
		salary=basic+hra*basic+da*basic;
		return salary;
	}	
}
class DemoEmployee
{
	public static void main(String args[])throws IOException
	{
		String name,code,add,dgn,sub;
		long ph;
		double basic;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name of employee");
		name=br.readLine();
		System.out.println("Enter code of employee");
		code=br.readLine();
		System.out.println("Enter address of employee");
		add=br.readLine();
		System.out.println("Enter designation of employee");
		dgn=br.readLine();
		System.out.println("Enter phone of employee");
		ph=Long.parseLong(br.readLine());
		System.out.println("Enter type of employee");
		int type=Integer.parseInt(br.readLine());
		switch(type)
		{
		case 1:
			System.out.println("Enter subject");
			sub=br.readLine();
			System.out.println("Enter basic salary");
			basic=Double.parseDouble(br.readLine());
			Faculty ob1=new Faculty(code,name,add,ph,sub,dgn,basic);
			System.out.println("Faculty :"+"\n"+ob1.emp_code+"\n"+"salary =" +ob1.tSal());
			break;
		case 2:
			System.out.println("Enter subject");
			sub=br.readLine();
			System.out.println("Enter basic salary");
			basic=Double.parseDouble(br.readLine());
			Technical ob2=new Technical(code,name,add,ph,sub,dgn,basic);
			System.out.println("Technical :"+"\n"+ob2.emp_code+"\n"+"salary =" +ob2.tSal());
			break;
		case 3:
			System.out.println("Enter basic salary");
			basic=Double.parseDouble(br.readLine());
			Administrative ob3=new Administrative(code,name,add,ph,dgn,basic);
			System.out.println("Administrative :"+"\n"+ob3.emp_code+"\n"+"salary =" +ob3.tSal());
			break;
		case 4:
			System.out.println("Enter basic salary");
			basic=Double.parseDouble(br.readLine());	
			Accounts ob4=new Accounts(code,name,add,ph,dgn,basic);
			System.out.println("Accounts :"+"\n"+ob4.emp_code+"\n"+"salary =" +ob4.tSal());
			break;
		default:
			System.out.println("Invalid Entry");
		}
	}	
}
