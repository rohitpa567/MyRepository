package com.cs.PracticePages;

import org.openqa.selenium.By;

import com.cs.Pages.BasePage;
import com.cs.enums.WaitStrategy;

public class ActLoginPage extends BasePage {

	private static final By username = By.name("username");
	private static final By password = By.name("pwd");
	private static final By loginBtn = By.id("loginButton");

	public ActLoginPage enterUsername(String un) {

		sendKeys(username, un, WaitStrategy.PRESENCE, " Username Entered");
		return this;
	}

	public ActLoginPage enterPassword(String pw) {

		sendKeys(password, pw, WaitStrategy.PRESENCE, " Username Password");
		return this;
	}

	public ActHomePage clickOnLoginBtn() {

		click(loginBtn, WaitStrategy.CLICKABLE, " Click On LoginBtn");
		return new ActHomePage();
	}

}
