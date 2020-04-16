package testNGAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testsoft2 {
	SoftAssert softAssert1 = new SoftAssert();
	SoftAssert softAssert2 = new SoftAssert();

  @Test
  public void demotest() {
		softAssert1.assertEquals("welcome","Welcome");// False-- failed
		softAssert1.assertAll();
  }
  @Test
  public void demotest1() {
		
		softAssert2.assertEquals("welcome","welcome");// True -- passed
		softAssert2.assertAll();
	}
}
