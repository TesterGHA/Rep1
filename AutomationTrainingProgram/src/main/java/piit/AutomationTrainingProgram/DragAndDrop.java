package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		
WebElement droppable=driver.findElement(By.linkText("Droppable"));
droppable.click();
//since the following elements are in iframe, we need to first tell selenium to handle the iframe. iframe is webpage inside another webpage and 
//can be located in the inspect page with <iframe> or having more than one <HTML>. 
//we should count any iframes from the top of the inspect page and write the index number inside the frame() action. index number starts from 0

driver.switchTo().frame(0);

//inspect both the element to drag and the location to drop:
WebElement ElementToDrag=driver.findElement(By.id("draggable"));
WebElement DropToHere=driver.findElement(By.id("droppable"));

//create the object of action class:
Actions obj=new Actions(driver);
obj.dragAndDrop(ElementToDrag, DropToHere).build().perform();

Thread.sleep(2000);


//since we switched to iframe on line 26, we have to first write a command to bring the action to the parent frame

driver.switchTo().parentFrame();

WebElement Sortable=driver.findElement(By.linkText("Sortable"));
Sortable.click();



	}

}
