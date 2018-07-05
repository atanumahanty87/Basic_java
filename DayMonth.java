class DayMonth
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int day[]={31,28,31,30,31,30,31,31,30,31,30,31};
String month[]={"january","february","march","apr","may","june","july","aug","sep","oct","nov","dec"};
		switch(num)
		{
			case 1:
			System.out.println(month[0]+"="+day[0]);
			break;
			case 2:
			System.out.println(month[1]+"="+day[1]);
			break;
			case 3:
			System.out.println(month[2]+"="+day[2]);
			break;
			case 4:
			System.out.println(month[3]+"="+day[3]);
			break;
			case 5:
			System.out.println(month[4]+"="+day[4]);
			break;
			case 6:
			System.out.println(month[5]+"="+day[5]);
			break;
			case 7:
			System.out.println(month[6]+"="+day[6]);
			break;
			case 8:
			System.out.println(month[7]+"="+day[7]);
			break;
			case 9:
			System.out.println(month[8]+"="+day[8]);
			break;
			case 10:
			System.out.println(month[9]+"="+day[9]);
			break;
			case 11:
			System.out.println(month[10]+"="+day[10]);
			break;
			case 12:
			System.out.println(month[11]+"="+day[11]);
			break;
			default:
			System.out.println("invalid month");
		}

	}
}
