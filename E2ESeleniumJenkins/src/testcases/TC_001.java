package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 
{
	@Test
	public void testcase1() 
	{
		//Set System properties so system can get key (webdriver.chrome.driver)
		//and Webdriver executive directory "./WebDrivers/chromedriver.exe"
		System.setProperty("webdriver.chrome.driver", "./WebDrivers/chromedriver.exe");
		//Start Browser, with following command browser starts
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://thetestingworld.com/testings/");
		driver.findElementByXPath("//label[@for='tab2']").click();
		driver.findElementByXPath("//input[@name='_txtUserName']").sendKeys("hkniazi");
		driver.findElementByXPath("//input[@name='_txtPassword']").sendKeys("ABCDEF");
		driver.findElementByXPath("//input[@value='Login']").click();
		driver.quit();
	}
}