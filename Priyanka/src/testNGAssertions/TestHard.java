package testNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHard {
  @Test
  public void DemoTest() {
	  
	  Assert.assertTrue(true);//passed
	  Assert.assertEquals("welcome","Welcome");// False-- failed

	  Assert.assertEquals("welcome","welcome");//True-- passed


  }
}
