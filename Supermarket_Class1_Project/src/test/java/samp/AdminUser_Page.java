package samp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminUser_Page {

	
//////////////////////////////////////////////////////////////////
	
/////////// Admin User ///////////////

//Locate Admin User
@FindBy(xpath="(//a[@class='small-box-footer'])[1]")WebElement admin1;

public void adminUser1() {
admin1.click();
}

// Admin User new button
@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement admin2;
public void adminUser2() {
admin2.click();
}

// Username
@FindBy(xpath="//input[@id='username']")WebElement admin3;
public void adminUser3(String adminname) {
admin3.sendKeys(adminname);
}

//Passwsord
@FindBy(xpath="//input[@id='password']")WebElement admin4;
public void adminUser4(String adminpassword) {
admin4.sendKeys(adminpassword);
}


// Save Button
@FindBy(xpath="//button[@name='Create']")WebElement admin5;
public void adminUser5() {
admin5.click();
}

//Assertion
@FindBy(xpath="//button[@class='close']")WebElement admin6;
public boolean adminUser6() {
return admin6.isDisplayed();

}

// user type
// @FindBy(xpath="//select[@id='user_type']")WebElement usertype;
public void adminUser7() {
Select select = new Select(driver.findElement(By.xpath("//select[@id='user_type']")));
select.selectByIndex(2);

}
	
}
