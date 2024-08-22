package a1_Prg35_testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import Constants.Constants;
import Pages.LoginPage_Page;
import Pages.SubCategory_Page;
import Utilities.Exel_Utility;

public class SubCategory_TestCase extends BaseClass {
  @Test
  public void enterValues() throws IOException {
	  
	  String uA1 = Exel_Utility.getStringData(1, 0, "Login1");   // 6Exel. 2nd way - Read from exel  // throws IOException
	  String pA1 = Exel_Utility.getStringData(1, 1, "Login1");
	  
	  LoginPage_Page p1 = new LoginPage_Page(driver);
		p1.enterUsname(uA1);
		p1.enterPass(pA1);
		p1.getClicked();
		
		SubCategory_Page p2 = new SubCategory_Page(driver);
		
		p2.clickSubCategory();  // 1.Locate SubCategory
		p2.clickNewButton(); 	// 2. Click new button
		p2.clickDropDownSub();  	// 3. click dropdown
		
//		p2.enterSubCat(); 		 //4. enter subcategory
		 String catField = Exel_Utility.getStringData2(2, 1, "Sheet1");  // --- 2nd way using excel
		 p2.enterSubCat(catField);
		
		p2.chooseImage();		//5.click save buttton
		p2.saveButton(); 		//6. save button
		
		boolean isAlert = p2.isAlertDisplayed();                        // 7.Assertion
		assertTrue(isAlert, Constants.ERRORFORSUBCATEGORYALERT);
		System.out.println(Constants.ERRORFORSUBCATEGORYALERT);
	  
  }
}
