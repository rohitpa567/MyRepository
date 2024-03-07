package com.cs.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cs.Pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTests {

	private OrangeHRMTests() {
	}

	@Test(dataProvider = "LoginTestData")
	public void loginLogoutTest(String username, String password) {

	//	ExtentReport.createTest("loginLogoutTest");

		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
		// OrangeHRMHomePage ohhp =
		String actTitle = ohlp.enterUsername(username).enterPassword(password).clickLoginBtn().clickOnProfilePicArrow()
				.clickOnOptionLogout().getTitle();

		String expTitle = "OrangeHRM";
		Assert.assertEquals(actTitle, expTitle, "actTilte and expTitle is not matching ");

	}

	@DataProvider(name = "LoginTestData", parallel = true)
	public Object[][] getData() {

		Object[][] arr = new Object[][] {
			{ "Admin", "admin123" }, 
			{ "Admin", "admin12345567" }
			};
		return arr;
	}

}
