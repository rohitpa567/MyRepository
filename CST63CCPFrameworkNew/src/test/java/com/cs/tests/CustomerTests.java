package com.cs.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.Pages.AddCustomerDetailsPage;
import com.cs.Pages.OrangeHRMHomePage;
import com.cs.Pages.OrangeHRMLoginPage;
import com.cs.Pages.PIMPage;

public class CustomerTests extends BaseTests {

	@Test
	public void addCustomerTest() {

		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
		OrangeHRMHomePage ohhp = ohlp.enterUsername("Admin").enterPassword("admin123").clickLoginBtn();

		PIMPage pp = ohhp.clickOnPIMOpt().clickOnAddBtn();

		AddCustomerDetailsPage acd = new AddCustomerDetailsPage();
		acd.enterFName("Cyber").enterMName("Success").enterLName("Training").clickOnSaveBtn();

		String actText = "Successfully Saved";
		String expText = acd.getConfirmationMsg();

		Assert.assertEquals(actText, expText, "Customer Did Not Saved Successfully");

	}

}
