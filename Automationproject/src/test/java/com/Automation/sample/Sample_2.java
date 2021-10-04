package com.Automation.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_2 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anynomous\\eclipse-workspace\\Orangehrm\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//Login Code 
		WebElement Username =driver.findElement(By.xpath("//input[@id='txtUsername']"));
		Username.sendKeys("Admin");
		System.out.println("Username Entered");
		
		WebElement Password =driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Password.sendKeys("admin123");
		System.out.println("Password Entered");
		WebElement Login =driver.findElement(By.xpath("//input[@id='btnLogin']"));
		Login.click();
		System.out.println("clicked on Login Button");
		System.out.println("User Login Successfully");
		
		//get Title code
		String title=driver.getTitle();     
		System.out.println(title);
		
		WebElement MyInfo=driver.findElement(By.xpath("//b[normalize-space()='My Info']"));
		MyInfo.click();
		System.out.println("clicked on Myinfro tab");
		//get Heading
		String Heading =driver.findElement(By.xpath("//h1[contains(.,'Personal Details')]")).getText();
		System.out.println(Heading);
		
		WebElement Editbutton =driver.findElement(By.xpath("//input[@id='btnSave']"));
		Editbutton.click();
		System.out.println("clicked on Edit Button");
		
		WebElement Firstname=driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
		Firstname.clear();
		System.out.println("Cleared first Name");
		Firstname.sendKeys("Vashim");
		System.out.println("Entered First Name");
		WebElement MiddleName=driver.findElement(By.xpath("//input[@id='personal_txtEmpMiddleName']"));
		MiddleName.sendKeys("N");
		System.out.println("Entered Middale Name");
		WebElement LastName=driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']"));
		LastName.clear();
		System.out.println("Cleared LastName");
		LastName.sendKeys("Sheikh");
		System.out.println("Entered Last Name");
		WebElement EmployeeID=driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']"));
		EmployeeID.clear();
		System.out.println("Cleared EmployeeID");
		EmployeeID.sendKeys("1919");
		System.out.println("Entered EmployeeID");
		WebElement OtherText=driver.findElement(By.xpath("//input[@id='personal_txtOtherID']"));
		OtherText.sendKeys("2020");
		System.out.println("Entered OtherID");
		WebElement LicenNo=driver.findElement(By.xpath("//input[@id='personal_txtLicenNo']"));
		LicenNo.clear();
		System.out.println("Cleared Licence No ");
		LicenNo.sendKeys("VAS1919");
		System.out.println("Entered Licence No");
		WebElement ExpDate=driver.findElement(By.xpath("//input[@id='personal_txtLicExpDate']"));
		ExpDate.click();
		System.out.println("Clicked on Expired Date ");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='17']")).click();
		System.out.println("Select Expired Date");
		WebElement SINNo=driver.findElement(By.xpath("//input[@id='personal_txtSINNo']"));
		SINNo.sendKeys("1234567");
		System.out.println("Entered SINNO");
		driver.findElement(By.xpath("//input[@id='personal_optGender_1']")).click();
		System.out.println("Gender Selected");
		driver.findElement(By.xpath("//select[@id='personal_cmbMarital']")).click();
		System.out.println("Clicked on Marital Status");
		driver.findElement(By.xpath("//option[@value='Single']")).click();
		System.out.println("Marital Status is Selected");
		driver.findElement(By.xpath("//select[@id='personal_cmbNation']")).click();
		WebElement Nationality =driver.findElement(By.xpath("//option[.='Afghan']"));
		Nationality.click();
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
