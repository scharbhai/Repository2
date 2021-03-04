/*
 * Author: Shailaja Charbhai
  */

package regressionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifySearch {

	/*
	 * This Test verifies the Search functionality  
	 */
	
	@Test
	public void testVerifySearch() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lntinfotech.com/");
		Thread.sleep(1000);
		Assert.assertTrue(driver.getTitle().contains("LTI"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='Search']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='search-text']")).sendKeys("LTI");
		Thread.sleep(1000);
		driver.quit();
		

	}

}
