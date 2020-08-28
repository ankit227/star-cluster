package all.selemium.commands;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SizeOfWindow {
	 private WebDriver driver;
	@BeforeMethod
    public void setupTest(){
    	System.setProperty("webdriver.chrome.driver","./browserserver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
    }
	
	@Test
	public void windowSize()
	{
	Dimension size=driver.manage().window().getSize();
	System.out.println(size);
	int hight=size.getHeight();
	int width=size.getWidth();
	System.out.println(hight);
	System.out.println(width);
	}
	@Test
	public void changeWindowSize()
	{
		Dimension size=new Dimension(300,700);
		driver.manage().window().setSize(size);
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
