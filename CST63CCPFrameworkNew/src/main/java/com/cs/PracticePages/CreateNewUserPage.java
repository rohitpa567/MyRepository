package com.cs.PracticePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cs.Driver.DriverManager;
import com.cs.Pages.BasePage;
import com.cs.enums.WaitStrategy;

public class CreateNewUserPage extends BasePage {
         
	private static final By username=By.name("username");
	private static final By password=By.name("passwordText");
	private static final By retypepwd=By.name("passwordTextRetype");
	private static final By fName=By.name("firstName");
	private static final By lName=By.name("lastName");
	private static final By eMail=By.xpath("(//input[@type='text'])[6]");
	private static final By userDept=By.name("userGroupId");
	private static final By clickOnCreateNewUser=By.xpath("//input[@value='   Create User   ']");
	
	public CreateNewUserPage enterUsername(String un) {
		sendKeys(username, un+System.currentTimeMillis(), WaitStrategy.PRESENCE, " Enter Username");
		return this;
	}
	public CreateNewUserPage enterPassword(String pw) {
		sendKeys(password, pw, WaitStrategy.PRESENCE, " Enter Password");
		return this;
	}
	
	public CreateNewUserPage enterReTypwd(String rpw) {
		sendKeys(retypepwd, rpw, WaitStrategy.PRESENCE, " Enter RetypePwd");
		return this;
	}
	
	
	public CreateNewUserPage enterFirstName(String fn) {
		sendKeys(fName, fn+System.currentTimeMillis(), WaitStrategy.PRESENCE, " Enter FirstName");
		return this;
	}
	public CreateNewUserPage enterLastname(String ln) {
		sendKeys(lName, ln+System.currentTimeMillis(), WaitStrategy.PRESENCE, " Enter Lastname");
		return this;
	}
	public CreateNewUserPage enterEmail(String em) {
		sendKeys(eMail, em, WaitStrategy.PRESENCE, " Enter Email");
		return this;
	}
	
	public CreateNewUserPage selectDept() {
	 WebElement webElement=   DriverManager.getDriver().findElement(userDept);
		selectFromDropdown(webElement ,"Testing","Dept Selected");
	    return this;
	}

		
		
	
	public void clickOnCN() {
		click(clickOnCreateNewUser, WaitStrategy.CLICKABLE, " ClickOnCN");
		
		
		
		
	}
	
}
