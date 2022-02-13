package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Browser;
import pom.ApplicationHeader;
import pom.LoginPage;
import utils.Utility;
public class ToVerifyHeadersOfApplication extends Browser{

	private WebDriver driver ;
	private LoginPage loginPage;
	private ApplicationHeader applicationHeader;
	private SoftAssert softAssert;
	private int testID;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {	
		System.out.println(browser);

		if(browser.equalsIgnoreCase("chrome")){
			driver = launchChromeBrowser();
		}
		if(browser.equalsIgnoreCase("firefox"))	{
			driver = launchFirefoxBrowser();
		}
		if(browser.equalsIgnoreCase("opera")){
			driver =  launchOperaBrowser();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void createPOMObjects() {
		loginPage = new LoginPage(driver);
		applicationHeader = new ApplicationHeader(driver);
	}
	
	@BeforeMethod
	public void loginToApplication() {
		
		String key = Utility.getDataFromExcelSheet("Sheet1", 1, 0);
		
		if(key.equals("NegativeTest"))
		{
			login Failuer test
		}
		
		if(key.equals("PositiveTest"))
		{
			login Success test
		}
		
		System.out.println("beforeMethod");
		driver.get("http://desktop-b2220qc/login.do");
		
		String useName = Utility.getDataFromExcelSheet("Sheet1", 1, 0);
		loginPage.sendUserName(useName);
		String password = Utility.getDataFromExcelSheet("Sheet1", 1, 1);
		loginPage.sendPassword(password);
		loginPage.clickOnLoginButton();
	}
	
	@Test
	public void toVerifyTaskButton() {
		testID = 101;
		softAssert = new SoftAssert();
		
		applicationHeader.openTaskPage();
		String url = driver.getCurrentUrl();
		String tital =  driver.getTitle();
		softAssert.assertEquals(url, "http://desktop-b2220qc/tasks/otasklist.do");
		softAssert.assertEquals(tital, "actiTIME - Open Tasks", "url of Task button not found");
		softAssert.assertAll();
	}
	
	@Test
	public void toVerifyUserButton() {
		testID = 102;
		softAssert = new SoftAssert();
		applicationHeader.openUserPage();
		String url = driver.getCurrentUrl();
		String tital =  driver.getTitle();
		softAssert.assertEquals(url, "http://desktop-b2220qc/tasks/otasklist.do");
		softAssert.assertEquals(tital, "actiTIME - Open Tasks", "url of Task button not found");
		softAssert.assertAll();
	}
			
	@AfterMethod
	public void logoutFromApplication(ITestResult result) {
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.getScreenShot(driver, testID);
		}
		applicationHeader.clickOnLogout();
	}
	
	@AfterClass
	public void clearPOMObjects() {
		loginPage = null;
		applicationHeader = null;
	}
	
	@AfterTest
	public void afterClass() {
		System.out.println("afterClass");
		driver.quit();
		driver = null;
		System.gc(); // delete all objects memory free 	
	}

	
	
}
