package net.admin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MUAdminPage {
	
WebDriver driver;
	
	public MUAdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how = How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how = How.ID ,using= "snbtn")
	WebElement submit;
	
	@FindBy(how = How.XPATH ,using= "//a[text()=' MANAGE USERS']")
	WebElement manageUsers;
	
	@FindBy(how = How.XPATH ,using= "//input[contains(@placeholder,'ID No')]")
	WebElement searchTextBox;
	
	@FindBy(how = How.XPATH ,using= "(//th[contains(@aria-label,'ID No')])[1]")
	WebElement users;
	
	@FindBy(how = How.ID ,using= "tbllistid_next")
	WebElement nextButton;
	
	@FindBy(how = How.ID ,using= "tbllistid_previous")
	WebElement previousButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='Print']")
	WebElement printButton;
	
	@FindBy(how = How.NAME ,using= "tbllistid_length")
	WebElement entries;
	
	@FindBy(how = How.XPATH ,using= "//option[text()='50']")
	WebElement entriesOptions;
	
	@FindBy(how = How.XPATH ,using= "(//button[@type='button'])[7]")
	WebElement settingsMenu;
	
	@FindBy(how = How.ID ,using= "snbtn1")
	WebElement addUserButton;
	
	@FindBy(how = How.NAME ,using= "employee_id")
	WebElement idNoTextbox;
	
	@FindBy(how = How.ID ,using= "user_name")
	WebElement usernameTextbox;
	
	@FindBy(how = How.NAME ,using= "user_password")
	WebElement passwordTextbox;
	
	@FindBy(how = How.ID ,using= "user_type")
	WebElement roleDropdown;
	
	@FindBy(how = How.XPATH ,using= "//option[text()='Operator']")
	WebElement operatorOption;
	
	@FindBy(how = How.ID ,using= "adUser")
	WebElement submitButton;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Home']")
	WebElement homeButton;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Modules']")
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
	
	
	
	public void enterUserName()
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
	public void clickManageUsers()
	{
		manageUsers.click();
	}
	public void clickSearchTextBox()
	{
	  searchTextBox.click();
	}
	public void clearSearchTextBox()
	{
		searchTextBox.clear();
	}
	public void enterIDno()
	{
		searchTextBox.sendKeys("984");
	}
	public void enterUsernameSearchTextBox()
	{
		searchTextBox.sendKeys("sai");
	}
	public void verifyUsers()
	{
		users.isDisplayed();
	}
	public void clickNextButton()
	{
		nextButton.click();
	}
	public void clickPreviousButton()
	{
		previousButton.click();
	}
	public void verifyPrintButton()
	{
		printButton.isDisplayed();
	}
	public void clickEntries()
	{
		entries.click();
	}
	
	public void verifyEntries()
	{
		entriesOptions.isDisplayed();
	}
	
	public void clickEntriesOptions()
	{
		entriesOptions.click();
	}
	public void clickSettingsMenu()
	{
		settingsMenu.click();
	}
	public void clickAddUserButton()
	{
		addUserButton.click();
	}
	public void verifyIdNoTextbox()
	{
		idNoTextbox.click();
		idNoTextbox.clear();
		idNoTextbox.sendKeys("0023");
	}
	public void verifyUsernameTextbox()
	{
		usernameTextbox.click();
		usernameTextbox.clear();
		usernameTextbox.sendKeys("user");
	}
	public void verifyPasswordTextbox()
	{
		passwordTextbox.click();
		passwordTextbox.clear();
		passwordTextbox.sendKeys("5678");
	}
	public void verifyRoleDropdown()
	{
		roleDropdown.click();
		operatorOption.click();
	}
	public void clickSubmitButton()
	{
		submitButton.click();
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
