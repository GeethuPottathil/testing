package testing.testcases;



import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;
import testing.base.TestBase;

public class BankManagerLoginTest extends TestBase {
	
	@Test
	public void loginAsBankManager() throws InterruptedException {
		log.debug("Inside Login Test !!!");
		driver.findElement(By.cssSelector(OR.getProperty("bmlloginButton"))).click();
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn"))), "Login is not Successfull");
		
		Thread.sleep(3000);
		log.debug("Login Successfully executed !!!");
	}
	
}
