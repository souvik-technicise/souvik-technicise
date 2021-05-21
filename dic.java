class A 
{
	public void change()
	{
		String[] words={"i","am","good","boy"};
		int p=words.length;
		for(int i=0;i<p-1;i++)
		{
          for(int j=i+1;j<p;j++)
		  {
            if(words[i].compareTo(words[j])>0)
			{
                String temp = words[i];
                words[i] = words[j];
                words[j] = temp;
			}
          }
        }
        for(int i = 0; i < p; i++) 
          System.out.println(words[i]);		
	}
}
class dic
{
  public static void main(String args[])
  {
    A a=new A();
    a.change();
	
  }
}  