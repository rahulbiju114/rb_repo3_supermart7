package samp;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.LoginPage_Base;
import Pages.ManageProduct_Page;
import a1_Prg35_testscript.BaseClass;




public class Prg39_Footer extends BaseClass{

	@Test
	public void enterValues() {

		String uA1 = "admin";
		String pA1 = "admin";

		LoginPage_Base p1 = new LoginPage_Base(driver);
		p1.enterUsname(uA1);
		p1.enterPass(pA1);
		p1.getClicked();
	
	
		ManageProduct_Page managefooter = new ManageProduct_Page(driver);
	
	 String updateaddress="xbzy.asys,";
	  String updateemail="tets@gmail.com";
	  String updatephone="12234587766";
	  
	  managefooter.clickmanagefooterlink();
	  managefooter.clickeditbutton();
	  managefooter.clearaddressfield();
	  managefooter.enteraddress(updateaddress);
	  managefooter.clearemailfield();
	  managefooter.enteremail(updateemail);
	  managefooter.clearphonenofield();
	  managefooter.enterphone(updatephone);
	  managefooter.clickupdatebutton();
	  
	  boolean isfooteralertshow=managefooter.isfooterupdatealertdisplay();
	  assertTrue(isfooteralertshow, "Failed!! Footer text not updated");
	
  }


}