/*
 * Author: Shailaja Charbhai
 * Date : 26 Nov
 */

package regressionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle {

	//This Test verifies the page title 
	@Test
	public void testVerifyTitle() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lntinfotech.com/");
		Thread.sleep(1000);
		Assert.assertTrue(driver.getTitle().contains("LTI"));
		Thread.sleep(1000);
		driver.quit();
		

	}

}
