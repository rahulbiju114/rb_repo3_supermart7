package a1_Prg35_testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import Constants.Constants;
import Pages.Category_Page;
import Pages.LoginPage_Page;
import Utilities.Exel_Utility;


public class Category_TestCase extends BaseClass{
	
	@Test
	public void enterValues() throws IOException {

//		String uA1 = "admin";
//		String pA1 = "admin";
		
		 String uA1 = Exel_Utility.getStringData(1, 0, "Login1");   // 6Exel. 2nd way - Read from exel  // throws IOException
		 String pA1 = Exel_Utility.getStringData(1, 1, "Login1");
		
		

		LoginPage_Page p1 = new LoginPage_Page(driver);
		p1.enterUsname(uA1);
		p1.enterPass(pA1);
		p1.getClicked();
	
	
	Category_Page p2 = new Category_Page(driver);
	
	p2.clickCategory();
	p2.clickNew();
	
//	p2.enterName();  													--- 1st way
	 String catField = Exel_Utility.getStringData2(1, 1, "Sheet1");  // --- 2nd way using excel
	 p2.enterName(catField);
	
	
	p2.clickGroup();
//	p2.chooseImage();
	
	p2.clickSave();
	p2.pageScrolldown(); 		// Work by 1st way of utility
	
	boolean isAlert = p2.isAlertDisplayed();
	assertTrue(isAlert, Constants.ERRORFORCATEGORYALERT);
	System.out.println(Constants.ERRORFORCATEGORYALERT);
	
	
}
	
}
