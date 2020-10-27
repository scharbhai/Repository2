package regressionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void testCorrectTitle() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Amazon.com");
//test comment 12
		Assert.assertTrue(driver.getTitle().contains("AMAZON"));
		driver.quit();
		

	}

}
