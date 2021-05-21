class A
{
  void set()
  {
	  StringBuffer s1=new StringBuffer("souvik");
	  System.out.println(s1.reverse());
	  String s2=new String(s1);
	  System.out.println(s2);
	  String s3="india";
	  StringBuffer s4=new StringBuffer(s3);
	  System.out.println(s4);
  }	  
}	  
class V
{
	public static void main(String args[])
	{
		A ob=new A();
		ob.set();
	}
}		 		 
