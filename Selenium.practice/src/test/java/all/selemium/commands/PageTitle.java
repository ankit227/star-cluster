package all.selemium.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTitle {
	private WebDriver driver;
	@BeforeMethod
    public void setupTest(){
    	System.setProperty("webdriver.chrome.driver","./browserserver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
}
	@Test
	public void getTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}