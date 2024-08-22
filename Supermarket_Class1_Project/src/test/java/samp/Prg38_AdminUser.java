package samp;

import org.testng.annotations.Test;

import Pages.LoginPage_Base;
import Pages.ManageProduct_Page;
import a1_Prg35_testscript.BaseClass;


public class Prg38_AdminUser extends BaseClass{
	
	@Test
	public void enterValues() {

		String uA1 = "admin";
		String pA1 = "admin";

		LoginPage_Base p1 = new LoginPage_Base(driver);
		p1.enterUsname(uA1);
		p1.enterPass(pA1);
		p1.getClicked();
	
	
	ManageProduct_Page p2 = new ManageProduct_Page(driver);
	
	p2.adminUser1();
	p2.adminUser2();
	
	  String adminUserA="FF11";
	  String adminUserB="1234";
	  
	  p2.adminUser3(adminUserA);
	  p2.adminUser4(adminUserB);
	  
	  p2.adminUser7();
	  
	  p2.adminUser5();
	  
	  p2.adminUser6();
	
	
	}
	
}