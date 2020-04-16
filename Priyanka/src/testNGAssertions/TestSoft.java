package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestSoft {
  
	SoftAssert softAssert = new SoftAssert();
	@Test
	public void demotest() {
		softAssert.assertTrue(true);//passed
		softAssert.assertEquals("welcome","Welcome");// False-- failed
		System.out.println("Succuessfully passed");
		softAssert.assertAll();//we have to use it in order to continue execution on failure of previous statement 
  }
	
}
