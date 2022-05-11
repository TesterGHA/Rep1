package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathLocator {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		//to maximize Browser
		driver.manage().window().maximize();
		
		
		//Absolute xpath
		WebElement searchtoclick=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span"));
		searchtoclick.click();
		
		WebElement searchtexttoclick=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));
		searchtexttoclick.click();
		searchtexttoclick.sendKeys("spoon");
		searchtexttoclick.clear();
		
		WebElement searchtoclick6=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span"));
		searchtoclick6.click();
		
		
		
		//Relative x-path
		
		WebElement searchToField= driver.findElement(By.xpath("//input[@aria-label=\"Search\"]"));
		searchToField.sendKeys("Desktop");
		WebElement searchtoclick7=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span"));
		searchtoclick7.click();
		
		WebElement newReleaseTab=driver.findElement(By.xpath("(//a[text()='New Releases'])[1]"));
		newReleaseTab.click();
		
		WebElement ChooseCountry=driver.findElement(By.xpath("//span[@class=\"icp-nav-flag icp-nav-flag-us\"]"));
		ChooseCountry.click();
		
	}

}
