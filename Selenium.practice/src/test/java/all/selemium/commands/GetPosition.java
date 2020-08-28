package all.selemium.commands;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetPosition {
	private WebDriver driver;
	@BeforeMethod
    public void setupTest() throws InterruptedException{
    	System.setProperty("webdriver.chrome.driver","./browserserver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
       Thread.sleep(5);
    }
	@Test
	public void getPosition()
	{
		Point Position=driver.manage().window().getPosition();
		int x=Position.getX();
		int y=Position.getY();
		System.out.println("x co-ordinate::"+x);
		System.out.println("y co-ordinate::"+y);	
	}
	@Test
	public void changeBrowserPosition()
	{
		Point position=new Point(200,300);
		driver.manage().window().setPosition(position);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
