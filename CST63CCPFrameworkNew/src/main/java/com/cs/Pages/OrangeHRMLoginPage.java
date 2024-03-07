package com.cs.Pages;

import org.openqa.selenium.By;

import com.cs.enums.WaitStrategy;

public class OrangeHRMLoginPage extends BasePage {

	private static final By username = By.name("username");
	private static final By password = By.name("password");
	private static final By loginBtn = By.xpath("//button[@type='submit']");

	public OrangeHRMLoginPage enterUsername(String un) {
		sendKeys(username, un,WaitStrategy.PRESENCE,"USERNAME");
	//	DriverManager.getDriver().findElement(username).sendKeys(un);
		return this;
	}

	public OrangeHRMLoginPage enterPassword(String pw) {
		sendKeys(password, pw,WaitStrategy.PRESENCE,"PASSWORD");
	//	DriverManager.getDriver().findElement(password).sendKeys(pw);
		return this;
	}

	public OrangeHRMHomePage clickLoginBtn() {
           click(loginBtn,WaitStrategy.CLICKABLE,"LOGIN BUTTON"); 
		
		// DriverManager.getDriver().findElement(loginBtn).click();

		return new OrangeHRMHomePage();
	}

	public String getTitle() {
		return getPageTitle();
	}
}
