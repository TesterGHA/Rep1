package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

	
		WebDriver driver;
		
		@FindBy(id="email") WebElement UserID;
		@FindBy(id="pass") WebElement Password;
		@FindBy(linkText="Forgot password?") WebElement ForgotPass;
		
		public LogInPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			}

		public void UserID() {
			UserID.sendKeys("John");
		}
		
		
		public void Password() {
			Password.sendKeys("Silver");
		}
		
		public void ForgotPass() {
			ForgotPass.click();
		}
	}


