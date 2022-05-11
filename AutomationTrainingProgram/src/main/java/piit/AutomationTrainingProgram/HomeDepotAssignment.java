package piit.AutomationTrainingProgram;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomeDepotAssignment {
	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		//click on my account
		
		WebElement MyAccount=driver.findElement(By.linkText("My Account"));
		MyAccount.click();
		
		//click on register
		
		Thread.sleep(2000);
		WebElement Register=driver.findElement(By.xpath("//*[@class='bttn-outline']"));
		Register.click();
		
		//click on Personal Account
		
		WebElement SelectAndContinue=driver.findElement(By.xpath("//span[text()='Select & Continue']"));
		SelectAndContinue.click();
		
		//input email address
		Thread.sleep(2000);
		WebElement InputEmailAddress=driver.findElement(By.cssSelector("input#email"));
		InputEmailAddress.sendKeys("John.smith@gmail.com");
		
		//input password
		
		WebElement InputPassword=driver.findElement(By.id("password-input-field"));
		InputPassword.sendKeys("Jsmith9876");
		
		//input zipcode
		
		WebElement  InputZipcodde=driver.findElement(By.xpath("//input[@name='zipcode']"));
		InputZipcodde.sendKeys("20153");
		
		//input phone number
		
		WebElement InputPhoneNumber=driver.findElement(By.id("phone"));
		InputPhoneNumber.sendKeys("5719632528");
		
		//check the keep me signed in check box
		
		WebElement KeepMeInChkBox=driver.findElement(By.cssSelector("span.u__inline-block"));
		KeepMeInChkBox.click();
		
		//check the Im not a robot check box
		Thread.sleep(2000);
		//div[class='recaptcha-checkbox-border']:nth-child(1)
		
		//driver.switchTo().frame(1);
		WebElement NotARobotChkBox=driver.findElement(By.cssSelector("div[class='recaptcha-checkbox-checkmark']"));
		NotARobotChkBox.click();
		
		//click on create an account
		
		WebElement CreateAnAccount=driver.findElement(By.xpath("//span[text()='Create an Account']"));
		CreateAnAccount.click();
	}

}
