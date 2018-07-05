class CmdVol
{
  public static void main(String args[])
  {

double a = Double.parseDouble(args[0]);
double r = Double.parseDouble(args[1]);
double h = Double.parseDouble(args[2]);
double x = Double.parseDouble(args[3]);
double y = Double.parseDouble(args[4]);
double z = Double.parseDouble(args[5]);
Vol ob = new Vol();
ob.volume(a);
ob.volume(r,h);
ob.volume(x,y,z);
}
}


