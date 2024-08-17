package a1_Prg35_testscript;

import org.testng.annotations.Test;

import a1_Prg35_Pages.Prg35_LoginPage;
import a1_Prg35_Pages.Prg36_ManageProduct;

public class Prg36_ManageProduct_Test1 extends Prg35_BaseClass {

	@Test
	public void enterValues() {

		String uA1 = "admin";
		String pA1 = "admin";

		Prg35_LoginPage p1 = new Prg35_LoginPage(driver);
		p1.enterUsname(uA1);
		p1.enterPass(pA1);
		p1.getClicked();

		Prg36_ManageProduct p2 = new Prg36_ManageProduct(driver);
		p2.getClicked1(); // 1. locate Manage Product
		p2.getClicked2(); // 2. Delete an item from the list
		p2.getClicked3(); // 3. search button

		String tA1 = "Milk"; // title
		p2.enterTitle(tA1);

		String pcA1 = "Veg"; // product code
		p2.enterproCode(pcA1);

		p2.clickCat(); // category

		p2.clickSubCat(); // sub category

		p2.clickSrchButn(); // serach button

	}

}
