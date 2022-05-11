package piit.AutomationTrainingProgram;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExeAlertPopupHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
//clicking on the sign-in button
		
		WebElement SignInButton=driver.findElement(By.xpath("//*[@class='signinbtn']"));
		SignInButton.click();
		

//handling the popup window. first import Alert class
//since the popup window is on top of the original window we should switch to the original win to the popup window using the switch().alert();
//To accept the popup msg we use accept(); and to refuse the msg we use dismiss();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();//to click on ok and accept the popup msg
		
		
		
		
		
		
	}

}
