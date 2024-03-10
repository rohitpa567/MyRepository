package com.cs.Practicetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.PracticePackage.CheckoutPage1;
import com.cs.PracticePackage.CheckoutPage2;
import com.cs.PracticePackage.FinishPage;
import com.cs.PracticePackage.LoginSD;
import com.cs.PracticePackage.ProductsPage;
import com.cs.PracticePackage.YourCartPage;
import com.cs.tests.BaseTests;

public class SauceDemoTest extends BaseTests {

	@Test
	public void productBuyTest() {

		LoginSD lp = new LoginSD();
		ProductsPage pp = lp.enterUserName("standard_user").enterPassword("secret_sauce").clickOnLoginBtn();

		String actTittle = pp.getPageTittle();
		String expMsgS = "Products";

		Assert.assertEquals(actTittle, expMsgS, "act and exp pagetittle does not matchS");

		pp.clickOnDropDown().selectProduct().clickOnAddToCart();

		YourCartPage ycp = new YourCartPage();
		CheckoutPage1 cp1 = ycp.clickOnCheckOutBtn().enterFN("rohit").enterLN("patil").enterZipCode("450221");

		FinishPage fp = cp1.clickOnContinue().clickOnFinishBtn();

		String actMsg = fp.getConMsg();
		
		String expMsg= "THANK YOU FOR YOUR ORDER";
		
		Assert.assertEquals(actMsg, expMsg,"actual and expected con message not matched");

	}

}
