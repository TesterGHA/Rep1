package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpediaAssignment {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		
		
		//Assignment 1
				WebElement CheckInLink=driver.findElement(By.id("d1-btn"));
				CheckInLink.click();
				
				WebElement CheckInDate=driver.findElement(By.xpath("//*[@aria-label='May 3, 2022']"));
				CheckInDate.click();
				
				WebElement CheckInDateDone=driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']"));
				CheckInDateDone.click();
				
				WebElement CheckOutLink=driver.findElement(By.id("d2-btn"));
				CheckOutLink.click();
				
				
				WebElement CheckOutDate=driver.findElement(By.xpath("//*[@aria-label='Jun 30, 2022']"));
				CheckOutDate.click();
				
				WebElement CheckOutDateDone=driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']"));
				CheckOutDateDone.click();
	}

}
