package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PizzaHutAssignement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.pizzahut.com/");
		driver.manage().window().maximize();
		
		
		//Click on menu
		
		WebElement MenuTab=driver.findElement(By.className("MuiButton-label"));
		MenuTab.click();
		Thread.sleep(2000);
		
		//choose pizza from the drop down menu
		
		WebElement PizzaChoice=driver.findElement(By.xpath("//*[@data-testid='menu-pizza-link']"));
		PizzaChoice.click();
		
		Thread.sleep(2000);
//they removed this section from the page:
//click on popular pizza
//		WebElement PopularPizza=driver.findElement(By.linkText("Popular Pizzas"));
//		PopularPizza.click();
	
		WebElement CheesePizza=driver.findElement(By.cssSelector("a[data-analytics-index='5']"));
		CheesePizza.click();
		
		WebElement Delivery=driver.findElement(By.id("find-occasion-delivery"));
		Delivery.click();
		
		WebElement Address=driver.findElement(By.id("syo-address1"));
		Address.sendKeys("123 horseshoe Drive");
		
		WebElement Address2=driver.findElement(By.id("address2"));
		Address2.sendKeys("2");
		
		WebElement City=driver.findElement(By.id("city"));
		City.sendKeys("Golabdare");

		WebElement State=driver.findElement(By.id("state"));
		//creating the object of Select class
		Select obj=new Select(State);
		obj.selectByVisibleText("FL");
		
		WebElement ZipCode=driver.findElement(By.id("zip-input"));
		ZipCode.sendKeys("20153");
		
		WebElement FindAStore=driver.findElement(By.id("ph-find-store"));
		FindAStore.click();
	}

}
