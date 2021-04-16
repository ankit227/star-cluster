package all.selemium.commands;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

	
		@BeforeMethod
	    public void beforeMethod() {
			System.out.println("before method started");	

	    }
		@Test
		public void test1()
		{
			System.out.println("Test 1 started");	
		}
		@Test
		public void test2()
		{
			System.out.println("Test 2  started");	
		}
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("closing browser");
		}
	}


