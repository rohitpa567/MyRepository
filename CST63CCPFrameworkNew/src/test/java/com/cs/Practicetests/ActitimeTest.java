package com.cs.Practicetests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cs.PracticePages.ActHomePage;
import com.cs.PracticePages.ActLoginPage;
import com.cs.tests.BaseTests;

public class ActitimeTest extends BaseTests { 

	@Test(dataProvider = "LoginTestData")

	public void loginLogoutTest(String username, String password) {

		ActLoginPage lp = new ActLoginPage();
		ActHomePage hPage = lp.enterUsername(username).enterPassword(password).clickOnLoginBtn();
		String actTitle = hPage.getTitle();
		String expTile = "Enter Time-Track";
		Assert.assertEquals(actTitle, expTile, "act and exp title didn't match");

		hPage.clickOnLogoutBtn();

	}

	@DataProvider(name = "LoginTestData")

	public Object[][] getData() {
		Object[][] arr = { { "testmanager", "test123" }, { "testmanager", "test567" } };
		return arr;

	}
}
