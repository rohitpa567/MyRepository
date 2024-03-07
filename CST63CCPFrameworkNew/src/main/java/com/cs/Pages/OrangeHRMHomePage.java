  package com.cs.Pages;

import org.openqa.selenium.By;

import com.cs.enums.WaitStrategy;

public final class OrangeHRMHomePage extends BasePage {

	private static final By profilePicArrow = By.xpath("(//img[@alt='profile picture'])[1]");
	private static final By optionLogout = By.xpath("(//a[@role='menuitem'])[4]");
	private static final By pimOption=By.xpath("//div[@id=\"app\"]//ul/li[2]/a");
	
	
	public PIMPage clickOnPIMOpt() {
		
		click(pimOption, WaitStrategy.CLICKABLE, "PIM OPTION");
		
		return new PIMPage();
		
	}

	public OrangeHRMHomePage clickOnProfilePicArrow() {
		
	//	ExtentReport.test.pass("Profile Pic Arrow button clicked");
		//ExtentManager.getExtentTest().pass("Profile Pic Arrow button clicked");
		
//	ExtentLogger.pass("Profile pic clicked");	
		
		
		click(profilePicArrow,WaitStrategy.CLICKABLE,"PROFILE PIC");
	//	DriverManager.getDriver().findElement(profilePicArrow).click();
		return this;
	}

	public OrangeHRMLoginPage clickOnOptionLogout() {
	//	ExtentReport.test.pass("Logout Option clicked");
		
	//	ExtentManager.getExtentTest().pass("Logout Option clicked");
		
	//	ExtentLogger.pass("Logout Option Clicked");
		
		click(optionLogout,WaitStrategy.CLICKABLE,"LOGOUT OPTION");
		
	//	WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(5));
      //  wait.until(ExpectedConditions.presenceOfElementLocated(optionLogout)).click();
		
		//DriverManager.getDriver().findElement(optionLogout).click();
		return new OrangeHRMLoginPage();

	}
}
