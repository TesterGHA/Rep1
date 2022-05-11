package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyToFunction {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://amazon.com");
		driver.manage().window().maximize();
		
		
		
		WebElement SearchToField=driver.findElement(By.id("twotabsearchtextbox"));
				SearchToField.sendKeys("Computer");
		//use key down and key up actions
		//first create the actions obj
				Actions obj=new Actions(driver);
				//to press down the control and press a to select the text
				obj.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
				
				Thread.sleep(2000);
				//to press down the control and press c to copy the text
				obj.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
				
				//to clear the text  field
				SearchToField.clear();
				Thread.sleep(2000);

				//to paste the text
				SearchToField.click();
				
				obj.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
				
				//to press the search button
				WebElement SearchtheText=driver.findElement(By.id("nav-search-submit-button"));
				SearchtheText.click();
				SearchToField.clear();
				
				
				//Exercise:
				SearchToField.sendKeys("Computer");
		
		obj.keyDown(Keys.CONTROL).sendKeys("a");
		obj.keyDown(Keys.CONTROL).sendKeys("c");
		SearchToField.clear();
		Thread.sleep(2000);
		obj.keyDown(Keys.CONTROL).sendKeys("v");
		SearchtheText.click();
	}

}
