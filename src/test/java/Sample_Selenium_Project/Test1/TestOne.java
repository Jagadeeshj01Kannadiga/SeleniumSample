package Sample_Selenium_Project.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOne {
	
	 static WebDriver driver;

	
	@BeforeTest
	public void beforeTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Jagadeesh/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	
	@Test
	public void testOne() {
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}
	
	

}
