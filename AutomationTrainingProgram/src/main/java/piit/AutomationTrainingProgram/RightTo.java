package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightTo {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();

		//since non of the locators supported by selenium is in this attributr we used the xpath
		
		WebElement RightClickMenu=driver.findElement(By.xpath("//*[@style+'cursor: pointer;']"));
		Actions obj= new Actions(driver);
		obj.contextClick(RightClickMenu);
		
		
		
		
		
	}

}
