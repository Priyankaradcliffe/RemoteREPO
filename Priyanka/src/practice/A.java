package practice;

import org.openqa.selenium.By;

public class A {

	
	
	public static void main(String[] args)
	
	{
		//Equals
			String EXP_result = "Account Created";
			String Act_result= "Account Created";
			boolean flag2= Act_result.equals(EXP_result);
			System.out.println("Equal comparision is =>"+flag2);
		
		//Equals comparison with case sensitive
			
			String eXP_result = "Account Created";
			String act_result= "Account created";
			boolean flag3= act_result.equals(eXP_result);
			System.out.println("Equal comparision is =>"+flag3);
			
		//Equals comparison with case sensitive
			
			String eXP_result1 = "Account Created";
			String act_result1= "Account created";
			boolean flag4= act_result1.equalsIgnoreCase(eXP_result1);
			System.out.println("Equal comparision is with case ignore =>"+flag4);		
			
		//contains
			
			String status = "Account Created 100 successful";
			boolean flag5= status.contains("100");
			System.out.println("Contains =>"+flag5);
		
		
		//SubString
			String accountnum="1234567891234568";
			String last_digits= accountnum.substring(12);
			System.out.println(last_digits);
			String middle_digits= accountnum.substring(4,12);
			System.out.println(middle_digits);
		
		//Length
			String mobile="1234567892";
			int len= mobile.length();
			System.out.println("lenght is =>"+len);
	
		//Starts with
			String ifsc_code= "HDFC124567891";
			boolean flag = ifsc_code.startsWith("HtFC");
			System.out.println("Starts with is  =>" +flag);
		
		//Trim
			String pin= "   500074   ";
			int oldpin = pin.length();
			System.out.println(oldpin);
			String newpin= pin.trim();
			int newtrimpin= newpin.length();
			System.out.println(newtrimpin);
		
		// isempty
			String var1 ="";
			String var2= "MQ";
			System.out.println("empty status is>"+ var1.isEmpty());		
			System.out.println("empty status is>"+ var2.isEmpty());		

	}	
	


}