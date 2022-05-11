package piit.AutomationTrainingProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowHandling {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		//to open a link in a new window
		//import Actions class
		
		Actions action=new Actions(driver);		
		
		
		//locate the element
		
		WebElement NewReleases=driver.findElement(By.linkText("New Releases"));
		
		
		//press shift key and click on hyperlink to open the link in a new window
		
		
		action.keyDown(Keys.SHIFT).build().perform();
		NewReleases.click();
		action.keyUp(Keys.SHIFT).build().perform();
		
		
		//Window handling to switch between windows
		//every window has a unique session Id that we can use the WindowHandle() to retrieve it 
        //WindowHandle() gets the current window session ID
		//to get multiple session ID's use WindowHandles()
		
		//You can get the window handle of the current window by using:
		
		driver.getWindowHandles();
		
		//since we are storing multiple values in the variable we should use set<> and specify the datatype in the brackets
		
		
		Set<String> WindowHandles=driver.getWindowHandles();
		
		
		//An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping. To use an Iterator, you must import it from the java
		
		Iterator<String> iterators=WindowHandles.iterator();
		
		//setting up the loop
		
		
		String CurrentWindow=iterators.next();
		String SecondWindow=iterators.next();
		
		
		//to print the session Id's so we know we are handling 2 windows
		
		
		System.out.println("This is my parent session ID"+CurrentWindow);
		System.out.println("This is my second session ID"+SecondWindow);
		
		//licking a link which opens in a new window will focus the new window or tab on screen, but WebDriver will not know which window the Operating System considers active. 
		//To work with the new window you will need to switch to it
		//switch to the second window to check whether the windowHanles worked
		
		
		driver.switchTo().window(SecondWindow);
		
		WebElement Products=driver.findElement(By.linkText("Camera & Photo Products"));
		Thread.sleep(6000);
		Products.click();
		Thread.sleep(2000);

		driver.switchTo().window(CurrentWindow);
	}

}
