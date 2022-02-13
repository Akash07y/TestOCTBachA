package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationHeader {

	private WebDriver driver;
	private WebDriverWait wait  ;
	
	@FindBy (xpath = "sdfgh") 
	private  WebElement timeTrack;
	
	@FindBy (xpath = "//a[@class='content tasks']") 
	private WebElement task;
	
	@FindBy (xpath = "//a[@class='content reports']") 
	private WebElement report;
	
	@FindBy (xpath = "//a[@class='content users']") 
	private WebElement user;
	
	@FindBy (xpath = "//a[text()='Logout']") 
	private WebElement logout;
	
	public ApplicationHeader(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait = new WebDriverWait(driver,20);
	}
	
	public void openTimeTrackPage() {
		
		wait.until(ExpectedConditions.visibilityOf(timeTrack));
		timeTrack.click();
	}
	
	public void openTaskPage() {
		
		wait.until(ExpectedConditions.visibilityOf(task));
		task.click();
	}
	
	public void openReportPage() {
		wait = new WebDriverWait(driver,30);
		report.click();
	}
	
	public void openUserPage() {
		user.click();
	}
	
	public void clickOnLogout() {
		logout.click();
	}
}
