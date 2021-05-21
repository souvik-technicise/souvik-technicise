
//array list
import java.util.*;
class ch
{
  public static void main(String args[])
  {
	ArrayList<String>a=new ArrayList<>();
	ArrayList<Integer>b=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++)
    {
	  String s=sc.next();
      a.add(i,s);
    }
    /*for(int i=0;i<5;i++)
    {
	  int s=sc.nextInt();
      b.add(i,s);
    }
	for(int i=0;i<5;i++)
    {
	  
      System.out.print(b.get(i));
    }*/
	String s1="a";
	Object ia[]=a.toArray();
	for(int i=0;i<ia.length;i++)
	{
        if(ia[i].equals(s1))
          System.out.print("ok");		   
    }	
	System.out.println(a);
	
  }
}	