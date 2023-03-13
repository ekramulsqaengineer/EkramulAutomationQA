package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsDemo{
	static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	@BeforeSuite
	public static void reportSetup() {
	  htmlReporter = new ExtentHtmlReporter("Checkout.html"); 
		
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");   
		  
	}
	
	@Test
	public void demoTest() {	
		
	}
	
	@AfterSuite
	public void reportTeardown() {
		
        extent.flush();
	
	}

}
