package UdemySeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.navigate().to("https://www.rahulshettyacademy.com/locatorspractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			
			//working on https://rahulshettyacademy.com/AutomationPractice/
		
//		WebElement SelectCountry=driver.findElement(By.id("autocomplete"));
//		SelectCountry.sendKeys("Iran");
		
//		WebElement EnterYourName=driver.findElement(By.name("enter-name"));
//		EnterYourName.sendKeys("Samin");
		
		//Thread.sleep(2000);
		//driver.findElement(By.name("enter-name")).sendKeys("Sara");
		//Thread.sleep(2000);
		//driver.findElement(By.linkText("REST API")).click();
		
		
		//Locating web elements using css locator: Tag#ID value 
		//driver.findElement(By.cssSelector("button#openwindow")).click();
		
		
		//Locating web elements using css locator: Tag.class value 
		//driver.findElement(By.cssSelector("btn-style class1")).click();
		
		
		//Locating web elements using css locator: Tag[attribute='value']
		//driver.findElement(By.id("name")).sendKeys("Asghar");
		//driver.findElement(By.xpath("*//button[@text()='Signup']")).click();
		
		
		//stop working on https://rahulshettyacademy.com/AutomationPractice/
		
			
			
			
			
			
//			
			
			//start working on https://www.rahulshettyacademy.com/locatorspractice/
			
			
			WebElement UserName=driver.findElement(By.id("inputUsername"));
			UserName.sendKeys("Hoda");
			
			WebElement Password=driver.findElement(By.name("inputPassword"));
			Password.sendKeys("Ghajar");
			
			WebElement SignInButton=driver.findElement(By.xpath("*//button[@class='submit signInBtn']"));
			SignInButton.click();
			//we used driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); to override the syncronization issue
			
		WebElement InvalidCredentialsError=driver.findElement(By.cssSelector("p.error"));
			System.out.println(InvalidCredentialsError.getText());
			
			WebElement ForgotPassword=driver.findElement(By.linkText("Forgot your password?"));
			ForgotPassword.click();
			
			WebElement ForgotPassName=driver.findElement(By.cssSelector("input[placeholder='Name']"));
			ForgotPassName.sendKeys("John");
			
			WebElement ForgotPassEmail=driver.findElement(By.xpath("*//input[@placeholder='Email']"));
			ForgotPassEmail.sendKeys("john@aol.com");		
			WebElement ForgotPassPhoneNumber=driver.findElement(By.cssSelector("input[placeholder='Phone Number']"));
			ForgotPassPhoneNumber.sendKeys("703-606-8956");
			
			WebElement ForgotPassClearEmail=driver.findElement(By.cssSelector("input[type='text']:nth-child(3)"));
			ForgotPassClearEmail.clear();
			Thread.sleep(2000);
			WebElement ForgotPassEmailAgain=driver.findElement(By.xpath("*//input[@type='text'][2]"));
			ForgotPassEmailAgain.sendKeys("khanoumjan@aol.com");
			
			Thread.sleep(2000);
			ForgotPassPhoneNumber.clear();
			
			WebElement PhoneNumber=driver.findElement(By.xpath("//form/input[3]"));
			PhoneNumber.sendKeys("707235698");
			
			WebElement ResetLogin=driver.findElement(By.cssSelector("button.reset-pwd-btn"));
			ResetLogin.click();
			WebElement ResetLoginMsg=driver.findElement(By.cssSelector("form p"));
			System.out.println(ResetLoginMsg.getText());
			
			Thread.sleep(2000);
			WebElement GoToLogin=driver.findElement(By.cssSelector("button.go-to-login-btn"));
			GoToLogin.click();
			
			WebElement EnterUser=driver.findElement(By.cssSelector("input#inputUsername"));
			EnterUser.sendKeys("rahul");
			
			WebElement EnterPass=driver.findElement(By.xpath("*//input[@placeholder='Password']"));
			EnterPass.sendKeys("rahulshettyacademy");
			
			WebElement RememberCheckBox=driver.findElement(By.id("chkboxOne"));
			RememberCheckBox.click();
			
			WebElement SignIn=driver.findElement(By.linkText("Sign In"));
			SignIn.click();
			
			
			
			
			//stop working on https://www.rahulshettyacademy.com/locatorspractice/
			
			
			
	}

}
