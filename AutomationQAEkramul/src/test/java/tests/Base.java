package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base extends ExtentReportsDemo{
	WebDriver driver;
	@BeforeTest
	public void init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/afcuser/Desktop/chromedriver");
		//WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		Thread.sleep(20);
	}
	
	@AfterTest
	public void tearDwon() {
		
	}
	

}
