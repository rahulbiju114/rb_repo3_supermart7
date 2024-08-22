// manage Product - Search

package a1_Prg35_testscript;


import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.LoginPage_Base;
import Pages.ManageProduct_Page;


public class ManageProduct_TestCase_Search extends BaseClass{
	
	@Test
	public void enterValues()  {

		String uA1 = "admin";
		String pA1 = "admin";

		LoginPage_Base p1 = new LoginPage_Base(driver);
		p1.enterUsname(uA1);
		p1.enterPass(pA1);
		p1.getClicked();
	
	
	ManageProduct_Page p2 = new ManageProduct_Page(driver);
	p2.getClickedLocate(); // 1. locate Manage Product
	p2.getClicked_SearchButton(); // 3. search button

	String title3 = "Hi";			// 4. Enter title
	p2.enterTitle(title3);
	

	String proCode3 = "Veg"; 			 //5. // product code
	p2.enterProductCode(proCode3);

	p2.clickCategory(); // category			 //6. Category ---> normal way
	
	p2.clickSubCategory(); // sub category		 //7. Enter Sub Category ---> normal way

	p2.clickSearchButton(); // search button		 //8. //click on search button
	
	p2.scrollDown1();								// 10.Scroll Down
	
	boolean isSearchAssert1 = p2.isSerachAssert();           //  //9.  Assertion : Search no results 
	  assertTrue(isSearchAssert1, "Search not happened");
	
	
	//////////////////////////////////////////////////////////////////////////////////////

//	p2.scroll1();
	
//	boolean isSearchAssert1 = p2.isSerachAssert();
//	  assertTrue(isSearchAssert1, "Search not happened");
	
	
//	String tA1 = "Milk"; // title
//	p2.enterTitle(tA1);
 
}
	
}
