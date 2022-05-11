package PageObjectModel;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import M.common.Utility;

import org.testng.annotations.BeforeClass;

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

public class NewTest extends Utility {
	
//	WebDriver driver;
	
	
	
	
  @Test (priority=1)
  public void f() throws InterruptedException, IOException {
	  LogInPage obj=new LogInPage(driver); 
	  obj.UserID();
	  Pictures();
	  Thread.sleep(2000);
	  
	  Pictures();
      obj.Password();
	  Thread.sleep(2000);
	  obj.ForgotPass();
	  
	  ForgotPasswordPage obj2=new ForgotPasswordPage(driver);
	  obj2.UserID();
	  obj2.SearchButtonClick();
	  Thread.sleep(6000);
	  
 }
  
  
  
  
  @Test (priority=2,dependsOnMethods = "f")
  public void TextVarificationMethod() throws InterruptedException {
  	driver.navigate().back();
  	Thread.sleep(2000);
  	 ForgotPasswordPage obj2=new ForgotPasswordPage(driver);
  	String Questions =obj2.EnterEmailText();
  	SoftAssert SoftIt=new SoftAssert();
  	
  	SoftIt.assertEquals("Please enter your email or mobile number to search for your account.", Questions);
  	 System.out.println("This is after assertion");
  	SoftIt.assertAll();
  }
  
  
  
  
//  @BeforeClass
//  public void beforeClass() {
//	  
//	  //enter the name of the desired browser in the argument
//	  Browsers("edge");	
//  }

  
  
//  
//  @AfterClass
//  
//  public void afterClass() {
//	  driver.close();
//  }
  
  
  
  
//public void Browsers(String window) {
//	if(window.equalsIgnoreCase("Chrome")) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.navigate().to("https://www.facebook.com/");
//		driver.manage().window().maximize();
//	}else if(window.equalsIgnoreCase("edge")){
//		 System.setProperty("webdriver.edge.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe");
//		 driver=new EdgeDriver();
//		 driver.navigate().to("https://www.facebook.com/");
//		 driver.manage().window().maximize();
//	}else if(window.equalsIgnoreCase("Firefox")) {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
//		driver=new FirefoxDriver();
//		driver.navigate().to("https://www.facebook.com/");
//		driver.manage().window().maximize();
//	}
//	
//	
//}
//copy and paste the method throughout the class where ever you need to take a screenshot

//public void Pictures() throws IOException{
//	
//	Date dt=new java.util.Date();
//	String sk=dt.toString().replace(" ", "_").replace(":", "_");
//	System.out.println(sk);
//	System.out.println(dt);
//
//	  //to take a screenshot
//	  File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	  org.openqa.selenium.io.FileHandler.copy(screenshots, new File("C:\\Users\\ghaza\\eclipse-workspace\\AutomationTrainingProgram\\pictures\\"+sk+"Shot of page.jpg\\"));
//}
}
