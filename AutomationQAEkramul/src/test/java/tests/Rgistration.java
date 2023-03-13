package tests;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class Rgistration extends Base{
	
	 @Test
	 public void Registration() throws IOException, InterruptedException {
		
		ExtentTest test1 = extent.createTest("Nop Ecommerce", "Nop Ecommerce Registration Feature Test Case");
		
		test1.log(Status.INFO, "Go To Nop Ecommerce Registration Web Site");
		driver.get("https://training.nop-station.com/");
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		test1.log(Status.INFO, "Click Registration Button");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		test1.log(Status.INFO, "Set Gender");
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Monjur");
		test1.log(Status.INFO, "Set First name:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Haque");
		test1.log(Status.INFO, "Set Last name:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("7");
		driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("January");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1990");
		test1.log(Status.INFO, "Set Date of birth:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ekramulcsediu2010@gmail.com");
		test1.log(Status.INFO, "Enter Email Address:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("QA Automation");
		test1.log(Status.INFO, "Enter Company name:");
		

	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,-350)", "");
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("haque123");
		test1.log(Status.INFO, "Set Password:");
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("haque123");
		test1.log(Status.INFO, "Set Confirm password:");
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='register-button']")).click();
		test1.log(Status.INFO, "Click Registar Button");
		test1.log(Status.INFO, "Test Complite");
		String mseesge= driver.findElement(By.className("result")).getText();
		System.out.println(mseesge);
		if(mseesge.equals("Your registration completed")) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
		
		System.out.println("Test Complite");
		
		
	 } 
	 
}
