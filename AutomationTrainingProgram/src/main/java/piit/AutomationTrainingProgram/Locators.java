package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		//to maximize Browser
		driver.manage().window().maximize();
		
		
		//to copy the value of thr locator from the browser
		
		
		//driver.findElement(By.id("nav-search-submit-button"));
		
		
		
		//to save the locator in a variable using WebElement keyword
		//WebElement searchIcon=driver.findElement(By.id("nav-search-submit-button"));
		
		
		//to call the  variable and create action
		//	searchIcon.click();
		
		//to use the name locator
		
		WebElement searchfieldtxt= driver.findElement(By.name("field-keywords"));
		
		searchfieldtxt.sendKeys("Computer");
		WebElement searchIcon=driver.findElement(By.id("nav-search-submit-button"));
		searchIcon.click();
		
		
		//to use linktext locator
		
		WebElement Linktxt=driver.findElement(By.linkText("Registry"));
		Linktxt.click();
	
		
		WebElement PartialLinkTxt=driver.findElement(By.partialLinkText("Friends Central Perk 3D Jigsaw Puzzle by WREBBIT 3D | 440 Pieces"));
		PartialLinkTxt.click();
	
		//Xpath locators
		
		
		
		
		
		
	}
	

}
