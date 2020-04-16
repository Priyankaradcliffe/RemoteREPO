package practice;

public class Global_initiation 
{
	 // globally defined variable
	int a = 10; 
	String name= "mq_dsnr";

	public void m1() 
	{
		System.out.println(a);
		
	}
	
	public void m2() 
	{
		System.out.println(name);
		
	}
	public static void main(String[] args) 
	{
		Global_initiation obj = new Global_initiation();
		 obj.m1();
		 obj.m2();
		
		
	}

}
