package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class CheckoutAsGuest extends Base{
//	WebDriver driver;
	
	@Test
	public void PlaceOrder() throws InterruptedException {
		Actions action = new Actions(driver);
		ExtentTest test2 = extent.createTest("Nop Ecommerce", "Nop Ecommerce Place Order Feature Test Case");
		
		Thread.sleep(1000);
		test2.log(Status.INFO, "Go To Nop Ecommerce Registration Web Site");
		driver.get("https://training.nop-station.com/");
		
		Thread.sleep(10000);
		WebElement select = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));
		action.moveToElement(select).perform();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/ul/li[2]/a")).click();
		test2.log(Status.INFO, "Click Cell phones");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")).click();
		test2.log(Status.INFO, "Click Nokia Lumia 1020");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).sendKeys("2");
		test2.log(Status.INFO, "Set Qty 2");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-button-20']")).click();
		test2.log(Status.INFO, "Click Add To Cart Button");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		test2.log(Status.INFO, "Click Shopping Cart Menu");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		test2.log(Status.INFO, "Chehcked Terms of Service");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		test2.log(Status.INFO, "Click Checkout button");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Checkout as Guest']")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_FirstName']")).sendKeys("Jakir");
		test2.log(Status.INFO, "Enter First name:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_LastName']")).sendKeys("Durjoy");
		test2.log(Status.INFO, "Enter Last name:");
	
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Email']")).sendKeys("jakir@gmail.com");
		test2.log(Status.INFO, "Enter Email Address:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Company']")).sendKeys("Arena");
		test2.log(Status.INFO, "Enter Company name:");
		
		Thread.sleep(10000);
		
		Select country = new Select(driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")));
		country.selectByValue("19");
	
		
		test2.log(Status.INFO, "Select Country:");
		
		Thread.sleep(1000);
		Select State = new Select(driver.findElement(By.xpath("//select[@id='BillingNewAddress_StateProvinceId']")));
		State.selectByValue("70");
		
		test2.log(Status.INFO, "Select State / province:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_City']")).sendKeys("Dhaka");
		test2.log(Status.INFO, "Enter City");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address1']")).sendKeys("648 Mirpur");
		test2.log(Status.INFO, "Enter Address 1:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_Address2']")).sendKeys("Kazipara Mirpur 10");
		test2.log(Status.INFO, "Enter Address 2:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("1216");
		test2.log(Status.INFO, " Enter Zip / postal code:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("01758871165");
		test2.log(Status.INFO, "Enter Phone number: ");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_FaxNumber']")).sendKeys("123456");
		test2.log(Status.INFO, "Enter Fax number:");
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='Billing.save()']")).click();
		test2.log(Status.INFO, "Click Continue Button");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='shippingoption_1']")).click();
		test2.log(Status.INFO, "Select Next Day Air ($0.00)");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']")).click();
		test2.log(Status.INFO, "Click Continue Button");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='paymentmethod_1']")).click();
		test2.log(Status.INFO, "Select Credit Card");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']")).click();
		test2.log(Status.INFO, "Click Continue Button");
		
		Thread.sleep(10000);
		
		Select card = new Select(driver.findElement(By.id("CreditCardType")));
		card.selectByValue("visa");
		
		test2.log(Status.INFO, "Select credit card:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"CardholderName\"]")).sendKeys("Mr.A");
		test2.log(Status.INFO, "Enter Cardholder name:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='CardNumber']")).sendKeys("4242424242424242424242");
		test2.log(Status.INFO, "Enter Card number:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='ExpireMonth']")).sendKeys("01");
		test2.log(Status.INFO, "Enter Expiration Month");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='ExpireYear']")).sendKeys("2024");
		test2.log(Status.INFO, "Enter Expiration date:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='CardCode']")).sendKeys("4242");
		test2.log(Status.INFO, "Enter Card code:");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']")).click();
		test2.log(Status.INFO, "Click Continue Button");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Confirm']")).click();
		test2.log(Status.INFO, "Click Continue Button");
		Thread.sleep(1000);
		String title = driver.findElement(By.className("title")).getText();
		Thread.sleep(1000);
		System.out.println(title);
		if(title.equals("Your order has been successfully processed!")) {
			System.out.println("Test Pass");	
		}else {
			System.out.println("Test Fail");	
		}
		test2.log(Status.INFO, "Test Complite");
	}

}
