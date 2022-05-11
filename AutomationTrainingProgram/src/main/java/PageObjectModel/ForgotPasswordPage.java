package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

	WebDriver driver;
	
	@FindBy(xpath="(//*[@name='email'])[2]") WebElement UserID;
	@FindBy(id="did_submit") WebElement SearchButtonClick;
	@FindBy(xpath ="//*[contains(text(),'Please enter your email ')]") WebElement EnterEmail; 
	
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
    public void UserID() {
	UserID.sendKeys("Ali@gmail.com");
} 

    public void SearchButtonClick() {
	SearchButtonClick.click();
	
}
    public String EnterEmailText() {
    	String Questions=EnterEmail.getText();
    	return Questions;
    }
}
