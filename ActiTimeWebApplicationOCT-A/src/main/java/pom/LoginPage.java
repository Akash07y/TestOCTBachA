package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@name='username']") 
	private WebElement userName;
	
	@FindBy (xpath = "//input[@name='pwd']") 
	private WebElement password;
	
	@FindBy (xpath = "//a[@id='loginButton']") 
	private WebElement login;
	
	@FindBy (xpath = "//input[@type='checkbox']") 
	private WebElement keepMeLoginCheckbox;
	
	public LoginPage(WebDriver driver) // driver123  = driver = new chromeDriver()
	{
		PageFactory.initElements(driver, this);
	}

	public void sendUserName(String userID) {
		userName.sendKeys(userID);
	}
	
	public void sendPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public String getTextOfLoginbutton() {
		String text = login.getText();
		return text;
	}
	
	public void clickOnLoginButton() {
		login.click();
	}

	public void selectKeepMeLoginCheckbox() {
		keepMeLoginCheckbox.click();
	}

	public void loginToApplication(String UserID, String pass)
	{
		userName.sendKeys(UserID);
		password.sendKeys(pass);
		keepMeLoginCheckbox.click();
		login.click();
	}
}
