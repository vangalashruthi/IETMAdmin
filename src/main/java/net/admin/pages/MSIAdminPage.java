package net.admin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MSIAdminPage {

WebDriver driver;
	
	public MSIAdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how = How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how = How.ID ,using= "snbtn")
	WebElement submit;
	
	@FindBy(how = How.XPATH , using= "//a[text()=' MANAGE SEARCH INDEX']")
	WebElement manageSearchIndex;
	
	@FindBy(how = How.XPATH ,using= "//input[@type='search']")
	WebElement searchTextbox;
	
	@FindBy(how = How.XPATH ,using= "(//th[@class='sorting'])[1]")
	WebElement searchKeywords;
	
	@FindBy(how = How.NAME ,using= "tbllistid_length")
	WebElement entries;
	
	@FindBy(how = How.XPATH ,using= "//option[text()='50']")
	WebElement entriesOptions;
	
	@FindBy(how = How.ID ,using= "tbllistid_next")
	WebElement nextButton;
	
	@FindBy(how = How.ID ,using= "tbllistid_previous")
	WebElement previousButton;
	
	@FindBy(how = How.XPATH ,using= "(//i[@class='lni lni-cog'])[2]")
	WebElement settingsButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()=' Add ']")
	WebElement addButton;
	
	@FindBy(how = How.NAME ,using= "m_name")
	WebElement searchKeywordTextbox;
	
	@FindBy(how = How.XPATH ,using="//textarea[@name='suggestions']")
	WebElement searchSuggestions;
	
	@FindBy(how = How.ID ,using="ietm-page-id-input")
	WebElement FrameNo;
	
	@FindBy(how = How.XPATH ,using="(//select)[last()]")
	WebElement contentType;
	
	@FindBy(how = How.XPATH ,using="//option[text()='Annotations']")
	WebElement annotations;
	
	@FindBy(how = How.XPATH ,using="(//button[text()=' Add '])[last()]")
	WebElement add;
	
	@FindBy(how = How.XPATH ,using="//i[@class='lni lni-trash']")
	WebElement deleteButton;
	
	@FindBy(how = How.XPATH ,using="//button[text()='Save']")
	WebElement saveButton;
	
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
	
	public void clickManageSearchIndex()
	{
		manageSearchIndex.click();
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
		searchTextbox.sendKeys("ietm");
	}
	
	public void verifySearchKeywords()
	{
		searchKeywords.isDisplayed();
	}
	
	public void enterSearchTextbox()
	{
		searchTextbox.sendKeys("display");
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
	public void clickSettingsMenu()
	{
		settingsButton.click();
	}
	
	public void verfiySettingsMenu()
	{
		settingsButton.click();
	}
	public void clickAddButton()
	{
		addButton.click();
	}
	public void verifySearchKeyword()
	{
		searchKeywordTextbox.click();
		searchKeywordTextbox.clear();
		searchKeywordTextbox.sendKeys("change");
	}
	public void verifySearchSuggestions()
	{
		searchSuggestions.click();
		searchSuggestions.clear();
		searchSuggestions.sendKeys("checking");
	}
	public void verifyFrameNo()
	{
		FrameNo.click();
	}
	public void verifyContentType()
	{
		contentType.click();
		annotations.click();
	}
	public void verifyAddButton()
	{
		add.click();
	}
	public void verifyDeleteButton()
	{
		deleteButton.click();
	}
	public void verifySaveButton()
	{
		saveButton.isDisplayed();
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
