/// Manage Product - Delete

package testscripts;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.LoginPage_Page;
import Pages.ManageProduct_Page;



public class ManageProduct_TestCase_Delete extends BaseClass {

	@Test
	public void enterValues() {

		String uA1 = "admin";
		String pA1 = "admin";

		LoginPage_Page p1 = new LoginPage_Page(driver);
		p1.enterUsname(uA1);
		p1.enterPass(pA1);
		p1.getClicked();

		ManageProduct_Page p2 = new ManageProduct_Page(driver);
		p2.getClickedLocate(); // 1. locate Manage Product
		p2.getClickedDelete(); // 2. Delete an item from the list
		
		boolean isDeleteAlert1 = p2.isDeleteAlert();          //3. Delete alert
		  assertTrue(isDeleteAlert1, "Alert not loaded");
		
	}

}
