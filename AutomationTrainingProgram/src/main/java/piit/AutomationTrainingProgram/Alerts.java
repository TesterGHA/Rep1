package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		
		WebElement Alert=driver.findElement(By.name("alert"));
		Alert.click();
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		
		
		WebElement prompting=driver.findElement(By.name("prompt"));
		prompting.click();
		Thread.sleep(4000);
		
		driver.switchTo().alert().sendKeys("tested");
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		
		
		
	}

}
