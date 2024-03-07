package com.cs.PracticePackage;

import org.openqa.selenium.By;

import com.cs.Pages.BasePage;
import com.cs.enums.WaitStrategy;

public class LoginSD extends BasePage {

	private static final By userName = By.id("user-name");
	private static final By password = By.id("password");
	private static final By clickOnLoginBtn = By.id("login-button");

	public LoginSD enterUserName(String un) {
		sendKeys(userName, un, WaitStrategy.PRESENCE, "Enter UserName");
      return this;
	}

	public LoginSD enterPassword(String pw) {
		sendKeys(password, pw, WaitStrategy.PRESENCE, "Enter Password");
          return this;
	}
	

	public ProductsPage clickOnLoginBtn() {
		click(clickOnLoginBtn,  WaitStrategy.CLICKABLE, "Click On Login Btn");
		return new ProductsPage();
	}
}
