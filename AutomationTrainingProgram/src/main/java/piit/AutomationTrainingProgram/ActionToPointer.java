package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionToPointer {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://amazon.com");
		driver.manage().window().maximize();
		
		//First create the object of the Action class
		Actions obj=new Actions(driver);
		//first create the webElement
		WebElement hovers=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		//use the moveToElement action to locate
		//call the movetoelement
		obj.moveToElement(hovers).build().perform();
		
		
	}

}
