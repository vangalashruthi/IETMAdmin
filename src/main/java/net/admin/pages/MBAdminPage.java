package net.admin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MBAdminPage {

	WebDriver driver;
	
	public MBAdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how = How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how = How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how = How.ID ,using= "snbtn")
	WebElement submit;
	
	@FindBy(how = How.XPATH ,using= "//a[text()=' MANAGE BOOKMARKS ']")
	WebElement manageBookmarks;
	
	@FindBy(how = How.XPATH ,using= "//input[@type='search']")
	WebElement searchTextbox;
	
	@FindBy(how = How.XPATH ,using= "//span[text()='data patterns']")
	WebElement bookmarks;
	
	@FindBy(how = How.NAME ,using= "tbllistid_length")
	WebElement entries;
	
	@FindBy(how = How.XPATH ,using= "//option[text()='25']")
	WebElement entriesOptions;
	
	@FindBy(how = How.ID ,using= "tbllistid_next")
	WebElement nextButton;
	
	@FindBy(how = How.ID ,using= "tbllistid_previous")
	WebElement previousButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='Print']")
	WebElement printButton;
	
	@FindBy(how = How.XPATH ,using= "(//th[@aria-sort='descending'])[1]")
	WebElement sortingIcons;
	
	@FindBy(how = How.XPATH ,using= "(//button[@type='button'])[6]")
	WebElement settingsButton;
	
	@FindBy(how = How.XPATH ,using= "//span[text()='tcs']")
	WebElement nameAndLink;
	
	@FindBy(how = How.XPATH ,using= "(//b[text()='Data Patterns India'])[1]")
	WebElement redirectModulePage;
	
	@FindBy(how = How.XPATH ,using= "//p[@class='mudule_title']")
	WebElement modulePage;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='History Navigation, Back']")
	WebElement backButton;
	
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
	
	public void clickManageBookmarks()
	{
		manageBookmarks.click();
	}
	
	public void clickSearchTextbox()
	{
		searchTextbox.click();
	}
	
	public void clearSearchTextbox()
	{
		searchTextbox.clear();
	}
	
	public void enterTextbox()
	{
		searchTextbox.sendKeys("patterns");
	}
	
	public void verifyBookmarks()
	{
		bookmarks.isSelected();
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
	
	public void clickSortingIcons()
	{
		sortingIcons.click();
	}
	
	public void clickSettingsMenu()
	{
		settingsButton.click();
	}
	
	public void verfiySettingsMenu()
	{
		settingsButton.click();
	}
	
	public void clickNameAndLink()
	{
		nameAndLink.click();
	}
	
	public void redirectModulePage()
	{
		redirectModulePage.isDisplayed();
	}
	
	public void verifyModulePage()
	{
		modulePage.isDisplayed();
	}
	
	public void clickBackButton()
	{
		backButton.click();
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
