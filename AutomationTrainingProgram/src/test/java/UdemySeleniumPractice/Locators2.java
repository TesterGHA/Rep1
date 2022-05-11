package UdemySeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {
	static WebDriver driver;
   
	public static void main(String[] args) throws InterruptedException {
		
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		 String name ="rahul";
		 String PassWord=getPassword(driver);
		 
		driver.navigate().to("https://www.rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		 
		
		WebElement UserName=driver.findElement(By.id("inputUsername"));
		UserName.sendKeys(name);
		
		
		WebElement Password=driver.findElement(By.name("inputPassword"));
		Password.sendKeys(PassWord);
		
	
		WebElement SignInButton=driver.findElement(By.xpath("*//button[@class='submit signInBtn']"));
		SignInButton.click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		
		WebElement HelloName=driver.findElement(By.cssSelector("div[class='login-container'] h2"));
		Assert.assertEquals(HelloName.getText(), "Hello "+name+",");
		
		Thread.sleep(2000);
		WebElement PromoText=driver.findElement(By.tagName("p"));
		System.out.println(PromoText.getText());
		Assert.assertEquals(PromoText.getText(), "You are successfully logged in.");
		
		
		WebElement LogOut=driver.findElement(By.cssSelector("button.logout-btn"));
		LogOut.click();		
		driver.close();
		
	}
		
		
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.navigate().to("https://www.rahulshettyacademy.com/locatorspractice/");
		WebElement ForgotPassword=driver.findElement(By.linkText("Forgot your password?"));
		ForgotPassword.click();
		Thread.sleep(2000);
		
		WebElement ResetLogin=driver.findElement(By.xpath("//*[text()='Reset Login']"));
		ResetLogin.click();
		
		WebElement InfoMsg=driver.findElement(By.cssSelector("p.infoMsg"));
		String st1=InfoMsg.getText();
		String[] PassArray1=st1.split("'");
		String Password=PassArray1[1].split("'")[0];
		return Password;
	}	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
	


