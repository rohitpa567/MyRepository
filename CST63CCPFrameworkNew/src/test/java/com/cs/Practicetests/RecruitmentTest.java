package com.cs.Practicetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.Pages.OrangeHRMHomePage;
import com.cs.Pages.OrangeHRMLoginPage;
import com.cs.PracticePages.DashBoardPage;
import com.cs.PracticePages.RecruitmentPage;
import com.cs.tests.BaseTests;

public class RecruitmentTest extends BaseTests {

	@Test
	public void aadRecTest() {

		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
		OrangeHRMHomePage ohhp = ohlp.enterUsername("Admin").enterPassword("admin123").clickLoginBtn();

		DashBoardPage dPage = new DashBoardPage();
		dPage.clickOnRecOpn().clickOnAddBtn();

		RecruitmentPage rp = new RecruitmentPage();
		rp.enterFname("rohit").enterLname("patil").
		enterEmail("rp1717@gmail.com").clickOnSaveBtn();
		
		String actText = "Successfully Saved";
		String expText = rp.getConfirmationMsg();

		Assert.assertEquals(actText, expText, "Customer Did Not Saved Successfully");

	}
}
