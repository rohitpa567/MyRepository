package com.cs.Practicetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cs.PracticePages.ActLoginPage;
import com.cs.PracticePages.CreateNewUserPage;
import com.cs.PracticePages.UserListPage;
import com.cs.tests.BaseTests;

public class ActitimeAddUserTest extends BaseTests {
	
	
	@Test
	
	public void addUserTest() {
		
		ActLoginPage lp = new ActLoginPage();
		CreateNewUserPage cnp = lp.enterUsername("testmanager").
				enterPassword("test123").clickOnLoginBtn().clickOnUsers().clickOnCreateNewUser();
		cnp.enterUsername("testengg").enterPassword("test123").enterReTypwd("test123").enterFirstName("test")
		.enterLastname("engg").enterEmail("rp@gamil.com").selectDept().clickOnCN();
		    
		UserListPage ulp= new UserListPage();
		String actConMsg=ulp.getConMsg();
		String expConMsg="User account has been successfully created.";
		
		Assert.assertEquals(actConMsg, expConMsg,"act and exp Msg are Not match");
		
	}

}
