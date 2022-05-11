package M.common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Utility {
	public WebDriver driver;
  @Parameters({"browsers"})
 
  
  @BeforeClass
  public void Browsers(String window) {
			if(window.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.navigate().to("https://www.facebook.com/");
				driver.manage().window().maximize();
			}else if(window.equalsIgnoreCase("Edge")){
				 System.setProperty("webdriver.edge.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
				 driver=new EdgeDriver();
				 driver.navigate().to("https://www.facebook.com/");
				 driver.manage().window().maximize();
			}else if(window.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.navigate().to("https://www.facebook.com/");
				driver.manage().window().maximize();
			}
	  }
	 
  
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
 
  
  
  public void Pictures() throws IOException{
		
		Date dt=new java.util.Date();
		String sk=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(sk);
		System.out.println(dt);

		  //to take a screenshot
		  File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  org.openqa.selenium.io.FileHandler.copy(screenshots, new File("C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\pictures\\"+sk+"Shot of homepage.jpg\\"));
}
  }
