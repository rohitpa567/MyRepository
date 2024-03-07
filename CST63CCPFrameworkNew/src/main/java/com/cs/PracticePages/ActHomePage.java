package com.cs.PracticePages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;
import com.cs.Pages.BasePage;
import com.cs.enums.WaitStrategy;

public class ActHomePage extends BasePage {

	private static final By getTitle = By.xpath("(//td[@class='pagetitle'])[2]");
	
	private static final By clickOnLogoutBtn=By.id("logoutLink");
	
	private static final By usersModule = By.xpath("(//div[@class='label'])[4]/following::img");

	public String getTitle() {
		
	String textHeader=	DriverManager.getDriver().findElement(getTitle).getText();
	return textHeader;
	}
	
	public ActLoginPage clickOnLogoutBtn() {
		
		click(clickOnLogoutBtn, WaitStrategy.CLICKABLE, " Logout Btn Clicked");
		return new ActLoginPage();
		}
	
	
	public UserListPage clickOnUsers() {
		
		click(usersModule, WaitStrategy.CLICKABLE, " ClickOnUsers");
		return new UserListPage();		
	}
}
