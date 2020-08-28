package all.selemium.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigateTo {
	private WebDriver driver;
	@BeforeMethod
    public void setupTest(){
    	System.setProperty("webdriver.chrome.driver","./browserserver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();
}
	@Test
	public void navigateTo() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}