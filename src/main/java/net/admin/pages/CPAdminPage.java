package net.admin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CPAdminPage {

	WebDriver driver;
	
	public CPAdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how = How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how = How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how = How.ID ,using= "snbtn")
	WebElement submit;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='CHANGE PASSWORD']")
	WebElement changePassword;
	
	@FindBy(how = How.ID ,using= "oldpassword")
	WebElement oldpasswordTextbox;
	
	@FindBy(how = How.NAME ,using= "newpwd")
	WebElement newpasswordTextbox;
	
	@FindBy(how = How.ID ,using= "retypepwd")
	WebElement reenterNewPasswordTextbox;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='SUBMIT']")
	WebElement submitButton;
	
	@FindBy(how = How.XPATH ,using= "(//a[@title='Show Password'])[1]")
	WebElement eyeOldPassword;
	
	@FindBy(how = How.XPATH ,using= "(//a[@title='Show Password'])[last()]")
	WebElement eyeNewPassword;
	
	@FindBy(how = How.XPATH ,using= "//i[@class='lni lni-home']")
	WebElement homeButton;
	
	@FindBy(how = How.XPATH ,using= "//i[@class='fa fa-desktop']")
	WebElement modulesButton;
	
	@FindBy(how = How.XPATH ,using= "//i[@class='fa fa-arrow-left']")
	WebElement backwardButton;
	
	@FindBy(how = How.XPATH ,using= "//i[@class='fa fa-arrow-right']")
	WebElement forwardButton;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Help']")
	WebElement helpButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='About IETM']")
	WebElement aboutIetm;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='How to Use IETM?']")
	WebElement howToUseIetm;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='Version & Revision History']")
	WebElement versionHistory;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Logout']")
	WebElement logoutButton;
	
	@FindBy(how = How.XPATH ,using= "(//button[@class='close'])[3]")
	WebElement closeButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()=' NO']")
	WebElement noButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='YES']")
	WebElement yesButton;
	
	
	public void enterUsername()
	{
		username.click();
		username.sendKeys("administrator");
	}
	
	public void enterPassword()
	{
		password.click();
		password.sendKeys("Admin_Ietm");
	}
	
	public void clickSubmit()
	{
		submit.click();
	}
	
	public void clickChangePassword()
	{
		changePassword.click();
	}
	
	public void clickOldPasswordTextBox()
	{
		oldpasswordTextbox.click();
	}
	
	public void clickNewPasswordTextbox()
	{
		newpasswordTextbox.click();
	}
	
	public void clickReenterNewPasswordTextbox()
	{
		reenterNewPasswordTextbox.click();
	}
	
	public void clearOldPasswordTextBox()
	{
		oldpasswordTextbox.clear();
	}
	
	public void clearNewPasswordTextbox()
	{
		newpasswordTextbox.clear();
	}
	
	public void clearReenterNewPasswordTextbox()
	{
		reenterNewPasswordTextbox.clear();
	}
	
	public void clickSubmitButton()
	{
		submitButton.click();
	}
	public void enterOldPassword()
	{
		oldpasswordTextbox.click();
		oldpasswordTextbox.sendKeys("Admin_Ietm");
	}
	
	public void enterNewPassword()
	{
		newpasswordTextbox.click();
		newpasswordTextbox.sendKeys("admin123");
	}
	
	public void invalidOldPassword()
	{
		oldpasswordTextbox.click();
		oldpasswordTextbox.sendKeys("12345");
	}
	
	public void validNewPassword()
	{
		newpasswordTextbox.click();
		newpasswordTextbox.sendKeys("admin123");
	}
	
	public void validReenterNewPassword()
	{
		reenterNewPasswordTextbox.click();
		reenterNewPasswordTextbox.sendKeys("admin123");
	}
	public void eyeIconOldPassword()
	{
		eyeOldPassword.click();
	}
	
	public void eyeIconNewPassword()
	{
		eyeNewPassword.click();
	}
	
	public void clickHomeButton()
	{
		homeButton.click();	
	}
	
	public void clickModulesButton()
	{
		modulesButton.click();
	}
	public void clickBackwardButton()
	{
		backwardButton.click();
	}
	
	public void clickForwardButton()
	{
		forwardButton.click();
	}
	
	public void clickHelpButton()
	{
		helpButton.click();
	}
	
	public void aboutIetmButton()
	{
		aboutIetm.isDisplayed();
	}
	
	public void howToUseButton()
	{
		howToUseIetm.isDisplayed();
	}
	
	public void versionHistoryButton()
	{
		versionHistory.isDisplayed();
	}
	
	public void clickLogoutButton()
	{
		logoutButton.click();
	}
	
	public void clickCloseButton()
	{
		closeButton.click();
	}
	
	public void clickNoButton()
	{
		noButton.click();
	}
	
	public void clickYesButton()
	{
		yesButton.click();
	}
	
	
	
	
}
