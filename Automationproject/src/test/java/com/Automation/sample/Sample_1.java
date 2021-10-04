package com.Automation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_1 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anynomous\\eclipse-workspace\\Automationproject\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//Login Code 
		WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(5000);
		Username.sendKeys("Admin");
		Thread.sleep(5000);
		System.out.println("Username Entered"+ Username.getAttribute(null));
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		System.out.println("Password Entered");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		System.out.println("clicked on Login Button");
		System.out.println("User Login Successfully");
//		
		//get Title code
		String title=driver.getTitle();     
		System.out.println(title);
		
		driver.findElement(By.xpath("//b[normalize-space()='My Info']")).click();
		System.out.println("clicked on Myinfro tab");
		
		//get Heading
		String Heading =driver.findElement(By.xpath("//h1[contains(.,'Personal Details')]")).getText();
		System.out.println(Heading);
		
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		System.out.println("clicked on Edit Button");
		
		driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).clear();
		System.out.println("Cleared first Name");
		
		driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']")).sendKeys("Vashim");
		System.out.println("Entered First Name");
		
		driver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']")).sendKeys("N");
		System.out.println("Entered Middale Name");
		
		driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).clear();
		System.out.println("Cleared LastName");
		
		driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']")).sendKeys("Sheikh");
		System.out.println("Entered Last Name");
		
		driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).clear();
		System.out.println("Cleared EmployeeID");
		
		driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).sendKeys("1919");
		System.out.println("Entered EmployeeID");
		
		driver.findElement(By.xpath("//input[@id='personal_txtOtherID']")).sendKeys("2020");
		System.out.println("Entered OtherID");
		
		driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']")).clear();
		System.out.println("Cleared Licence No ");
		
		driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']")).sendKeys("VAS1919");
		System.out.println("Entered Licence No");
		
		driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']")).click();
		System.out.println("Clicked on Expired Date ");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[normalize-space()='17']")).click();
		System.out.println("Select Expired Date");
		
		driver.findElement(By.xpath("//input[@id='personal_txtSINNo']")).sendKeys("1234567");
		System.out.println("Entered SINNO");
		
		driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
		System.out.println("Gender Selected");
		
		driver.findElement(By.xpath("//select[@id='personal_cmbMarital']")).click();
		System.out.println("Clicked on Marital Status");
		
		driver.findElement(By.xpath("//option[@value='Single']")).click();
		System.out.println("Marital Status is Selected");
		
		driver.findElement(By.xpath("//select[@id='personal_cmbNation']")).click();
		driver.findElement(By.xpath("//option[.='Afghan']")).click();
		System.out.println("Nationality Selected");
		
		driver.findElement(By.xpath("//input[@id='personal_DOB']")).click();
		System.out.println("Clicked On DOB");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[normalize-space()='31']")).click();
		System.out.println("DOB Selected");
		
		//Logout Code
		driver.findElement(By.xpath("//a[@class='panelTrigger']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
		System.out.println("User Logout Successfully");
	

	}

}
