import java.util.Scanner;
class temparature
{
	public void cel(double f)//convert ferhenhit to celceius
	{
		double c=5*(f-32)/9;
		System.out.println("convert value is:"+c);
	}
	public void fer(double c)//convert celcius to ferhenhit
	{
		double f=(9*c+32)/5;
		System.out.println("convert value is:"+f);
	}
}
class cel_fer
{
  public static void main(String args[])
  {
    temparature t=new temparature();
	Scanner sc=new Scanner(System.in);
	double f=sc.nextDouble();
    t.cel(f);
	double c=sc.nextDouble();
    t.fer(c);
  }
}  
		