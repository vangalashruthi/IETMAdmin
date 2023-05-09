package net.admin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MAAdminPage {

WebDriver driver;
	
	public MAAdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how = How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how = How.ID ,using= "snbtn")
	WebElement submit;
	
	@FindBy(how = How.XPATH ,using= "//a[text()=' MANAGE ANNOTATIONS ']")
	WebElement manageAnnotations;
	
	@FindBy(how = How.XPATH ,using= "//input[@type='search']")
	WebElement searchTextbox;
	
	@FindBy(how = How.XPATH ,using= "(//th[contains(@aria-label,'Annotated Text')])[1]")
	WebElement annotatedTexts;
	
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
	
	@FindBy(how = How.ID ,using= "contentFilter")
	WebElement filterIconButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='Notes']")
	WebElement notesButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='Feedback to Administrator']")
	WebElement feedbackButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='All']")
	WebElement allButton;
	
	@FindBy(how = How.XPATH ,using= "//li[@title='Delete Item']")
	WebElement deleteIconButton;
	
	@FindBy(how = How.XPATH ,using= "//td[text()='1']")
	WebElement checkbox;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='YES']")
	WebElement yesButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='NO']")
	WebElement noButton;
	
	@FindBy(how = How.XPATH ,using= "(//button[@class='close'])[4]")
	WebElement closeButton;
	
	@FindBy(how = How.XPATH ,using= "(//th[@aria-sort='descending'])[1]")
	WebElement sortingIcons;
	
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
	
	@FindBy(how = How.XPATH ,using= "(//button[@class='close'])[4]")
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
	
	public void clickAnnotations()
	{
		manageAnnotations.click();
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
		searchTextbox.sendKeys("gk");
	}
	
	public void verifyAnnotatedTexts()
	{
		annotatedTexts.isDisplayed();
	}
	
	public void enterSearchTextbox()
	{
		searchTextbox.sendKeys("change");
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
	
	public void clickFilterIconButton()
	{
		filterIconButton.click();
	}
	
	public void clickNotesActions()
	{
		notesButton.click();
	}
	
	public void clickFeedbackToAdministrator()
	{
		feedbackButton.click();
	}
	
	public void clickAllActions()
	{
		allButton.click();
	}
	
	public void clickDeleteIconButton()
	{
		deleteIconButton.click();
	}
	
	public void selectCheckbox()
	{
		checkbox.click();
	}
	
	public void verifyYesButton()
	{
		yesButton.isDisplayed();
	}
	
	public void clickNoButton()
	{
		noButton.click();
	}
	
	public void clickCloseButton()
	{
		closeButton.click();
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
