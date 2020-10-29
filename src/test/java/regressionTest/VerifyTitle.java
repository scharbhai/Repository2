/*
 * Author: Shailaja Charbhai
 */

package regressionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle {

	//Test verifies page title  
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void testCorrectTitle() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Amazon.com");
		Thread.sleep(1000);
		Assert.assertTrue(driver.getTitle().contains("Amazon"));
		Thread.sleep(1000);
		driver.quit();
		

	}

}
