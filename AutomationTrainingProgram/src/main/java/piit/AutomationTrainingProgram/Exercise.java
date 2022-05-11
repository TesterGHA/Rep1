package piit.AutomationTrainingProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Exercise {

	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
// the Action class pis used for mouse operations and keyboard interactions.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.lambdatest.com/");
		driver.manage().window().maximize();

//using Selenium click() method
		
		driver.findElement(By.linkText("Login")).click();
		
//ticking a checkbox button
//Note: To confirm whether a checkbox or a radio button is selected or not, we make us of the isSelected().
		
		WebElement chkbox=driver.findElement(By.xpath("//*[@class='customcheckbox w-12 h-12 inline-block bg-white border border-black relative cursor-pointer mr-10']"));
		boolean flag=chkbox.isSelected();
		
		if(flag) {
			
			System.out.println("Check box is already selected");
			
		}else {
				
			System.out.println("select checkbox");
			chkbox.click();
		}
		
		 Thread.sleep(2000);
		
		
		
//performing(Automating) right-click in Seleniem
//will be using the Robot class here to capture the elements of the right-click menu and perform a click on one of those elements to automate using the Selenium click button method.
		
		
		 driver.get("https://www.lambdatest.com/feature");
	       Actions actions = new Actions(driver);
	       WebElement elementLocator = driver.findElement(By.xpath("//*[@id=\"vid\"]"));
	      actions.contextClick(elementLocator).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
	       Actions action = new Actions(driver);
	       action.contextClick(elementLocator).build().perform();
	       Robot robot = new Robot();
	       Thread.sleep(2000);
	       robot.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       robot.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       robot.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       robot.keyPress(KeyEvent.VK_ENTER);	
		
	}

}
