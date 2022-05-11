package piit.AutomationTrainingProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ChromeBrowserDriver {

	//calling the web-driver as a global variable web-driver org.openqa.selenium
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
//setup Chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		
		
		//to maximize Browser
		driver.manage().window().maximize();
		
		
		//TO GO BACK
		driver.navigate().back();
		
		
		//for wait time
		Thread.sleep(6000);
		
		
		//to move forward
		driver.navigate().forward();
		
		
		//to refresh the browser
		Thread.sleep(6000);
		driver.navigate().refresh();
		
		//to retreieve the current URL
		driver.getCurrentUrl();
		String ur=driver.getCurrentUrl();
		System.out.println(ur);
		
		
		//to retreive windoe handler or session ID
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		
		//to close the browser
		driver.close();
		
		
		
	}

}
