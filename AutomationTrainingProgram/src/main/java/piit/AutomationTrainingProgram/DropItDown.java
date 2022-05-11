package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropItDown {
	private static final String WebElement = null;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		
		
			
	
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.navigate().to("https://www.facebook.com");
			//to maximize Browser
			driver.manage().window().maximize();

			//to select from a dropdown menu create the object of select class
			
			org.openqa.selenium.WebElement creatAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
			creatAccount.click();
			Thread.sleep(6000);
			org.openqa.selenium.WebElement month=driver.findElement(By.name("birthday_month"));
			Select ob=new Select(month);
			ob.selectByValue("3");
			
			org.openqa.selenium.WebElement day=driver.findElement(By.name("birthday_day"));
			Select ob6=new Select(day);
			ob6.selectByVisibleText("12");
			
			org.openqa.selenium.WebElement SelectYourPronoun=driver.findElement(By.name("preferred_pronoun"));
			Select ob8=new Select(SelectYourPronoun);
			ob8.selectByValue("1");
	}

}
