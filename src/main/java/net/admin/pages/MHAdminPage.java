package net.admin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MHAdminPage {

	WebDriver driver;
	
	public MHAdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how = How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how = How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how = How.ID ,using= "snbtn")
	WebElement submit;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='MY HOTSPOTS ']")
	WebElement myHotspots;
	
	@FindBy(how = How.XPATH ,using= "//input[@type='search']")
	WebElement searchTextBox;
	
	@FindBy(how = How.XPATH ,using= "(//th[contains(@aria-label,'Content Type')])[1]")
	WebElement contentType;
	
	@FindBy(how = How.XPATH ,using= "(//th[contains(@aria-label,'Content Title')])[1]")
	WebElement contentTitle;
	
	@FindBy(how = How.NAME ,using= "tbllistid_length")
	WebElement entries;
	
	@FindBy(how = How.XPATH ,using= "//option[text()='50']")
	WebElement entriesOptions;
	
	@FindBy(how = How.ID ,using= "tbllistid_next")
	WebElement nextButton;
	
	@FindBy(how = How.ID ,using= "tbllistid_previous")
	WebElement previousButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='Print']")
	WebElement printButton;

	@FindBy(how = How.XPATH ,using= "(//button[@type='button'])[5]")
	WebElement settingsButton;
	
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
	
	@FindBy(how = How.XPATH ,using= "(//button[@class='close'])[5]")
	WebElement closeLogoutButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()=' NO']")
	WebElement noLogoutButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='YES']")
	WebElement yesLogoutButton;
	
	
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
	public void clickMyHotspots()
	{
		myHotspots.click();
	}
	public void clickSearchTextBox()
	{
		searchTextBox.click();
	}
	public void clearSearchTextBox()
	{
		searchTextBox.clear();
	}
	public void enterSearchTextBox()
	{
		searchTextBox.sendKeys("image hotspot");
	}
	public void verifyContentType()
	{
		contentType.isDisplayed();
	}
	public void enterTextbox()
	{
		searchTextBox.sendKeys("tablo");
	}
	public void verifyContentTitle()
	{
		contentTitle.isDisplayed();
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
	public void clickSettingsMenu()
	{
		settingsButton.click();
	}
	
	public void verfiySettingsMenu()
	{
		settingsButton.click();
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
	
	public void clickCloseLogoutButton()
	{
		closeLogoutButton.click();
	}
	
	public void clickNoLogoutButton()
	{
		noLogoutButton.click();
	}
	
	public void clickYesButton()
	{
		yesLogoutButton.click();
	}
	
	
}
