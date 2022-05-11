package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DateAndTime {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		

	
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
	
		  //to click on the check-in link WebElement
		 WebElement Departure=driver.findElement(By.id("d1-btn"));
		  Departure.click();
		  
		  //to choose a date from the menu 
		  WebElement DepartureDate=driver.findElement(By.xpath("//*[@aria-label='May 26, 2022']"));
		  DepartureDate.click();
		 
		
		
		
	
		
		

		
		
		
		
		
	
		
		
		
		
		
		
		
	}

}
