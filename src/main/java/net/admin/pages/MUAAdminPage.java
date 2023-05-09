package net.admin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MUAAdminPage {

WebDriver driver;
	
	public MUAAdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how = How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how = How.ID ,using= "snbtn")
	WebElement submit;
	
	@FindBy(how = How.XPATH ,using= "//a[text()=' MANAGE USER ACTIVITY']")
	WebElement manageUserActivity;
	
	@FindBy(how = How.ID ,using= "fromDateInput")
	WebElement fromDateTextbox;
	
	@FindBy(how = How.ID ,using= "toDateInput")
	WebElement toDateTextbox;
	
	@FindBy(how = How.XPATH ,using= "//button[@class='current']")
	WebElement yearFromDate;
	
	@FindBy(how = How.XPATH ,using= "//span[@class='selected']")
	WebElement aYearFromDate;
	
	@FindBy(how = How.XPATH ,using= "//span[@class='selected']")
	WebElement aMonthFromDate;
	
	@FindBy(how = How.XPATH ,using= "//button[@class='next']")
	WebElement nextArrowFromDate;
	
	@FindBy(how = How.XPATH ,using= "//button[@class='previous']")
	WebElement previousArrowFromDate;
	
	@FindBy(how = How.XPATH ,using= "(//span[text()='1'])[1]")
	WebElement aDateFromDate;
	
	@FindBy(how = How.XPATH ,using= "//button[@class='current']")
	WebElement yearToDate;
	
	@FindBy(how = How.XPATH ,using= "//span[@class='selected']")
	WebElement aYearToDate;
	
	@FindBy(how = How.XPATH ,using= "//span[@class='selected']")
	WebElement aMonthToDate;
	
	@FindBy(how = How.XPATH ,using= "//button[@class='next']")
	WebElement nextArrowToDate;
	
	@FindBy(how = How.XPATH ,using= "//button[@class='previous']")
	WebElement previousArrowToDate;
	
	@FindBy(how = How.XPATH ,using= "(//span[text()='6'])[1]")
	WebElement aDateToDate;
	
	@FindBy(how = How.XPATH ,using= "//i[@class='lni lni-checkmark']")
	WebElement checkmarkButton;
	
	@FindBy(how = How.XPATH ,using= "//input[@type='search']")
	WebElement searchTextbox;
	
	@FindBy(how = How.XPATH ,using= "(//th[@class='sorting'])[2]")
	WebElement userActivities;
	
	@FindBy(how = How.NAME ,using= "tbllistid_length")
	WebElement entries;
	
	@FindBy(how = How.XPATH ,using= "//option[text()='50']")
	WebElement entriesOptions;
	
	@FindBy(how = How.XPATH ,using= "//button[@title='Sorting']")
	WebElement filterIconButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='Document Access History']")
	WebElement documentActionButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='Search History']")
	WebElement searchHistoryButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='User Accounts']")
	WebElement userAccountsButton;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='All']")
	WebElement allActionButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='Print']")
	WebElement printButton;
	
	@FindBy(how = How.XPATH ,using= "(//th[@aria-sort='descending'])[1]")
	WebElement sortingIcons;
	
	@FindBy(how = How.ID ,using= "tbllistid_next")
	WebElement nextButton;
	
	@FindBy(how = How.ID ,using= "tbllistid_previous")
	WebElement previousButton;
	
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
	
	public void clickManageUserActivity()
	{
		manageUserActivity.click();
	}
	
	public void clickFromDate()
	{
		fromDateTextbox.click();
	}
	
	public void clearFromDate()
	{
		fromDateTextbox.clear();
	}
	
	public void clickToDate()
	{
		toDateTextbox.click();
	}
	
	public void clearToDate()
	{
		toDateTextbox.clear();
	}
	
	public void clickYearFromDate()
	{
		yearFromDate.click();
	}
	
	public void selectYearFromDate()
	{
		aYearFromDate.click();
	}
	
	public void selectMonthFromDate()
	{
		aMonthFromDate.click();
	}
	
	public void clickNextArrowFromDate()
	{
		nextArrowFromDate.click();
	}
	
	public void clickPreviousArrowFromDate()
	{
		previousArrowFromDate.click();
	}
	
	public void selectDateFromDate()
	{
		aDateFromDate.click();
	}
	
	public void clickYearToDate()
	{
		yearToDate.click();
	}
	
	public void selectYearToDate()
	{
		aYearToDate.click();
	}
	
	public void selectMonthToDate()
	{
		aMonthToDate.click();
	}
	
	public void clickNextArrowToDate()
	{
		nextArrowToDate.click();
	}
	
	public void clickPreviousArrowToDate()
	{
		previousArrowToDate.click();
	}
	
	public void selectDateToDate()
	{
		aDateToDate.click();
	}
	
	public void clickCheckmarkButton()
	{
		checkmarkButton.click();
	}
	
	public void clickSearchTextbox()
	{
		searchTextbox.click();
	}
	
	public void clearSearchTextbox()
	{
		searchTextbox.clear();
	}
	
	public void enterPageName()
	{
		searchTextbox.sendKeys("safety");
	}
	
	public void userActivities()
	{
		userActivities.isDisplayed();
	}
	
	public void enterSearchUserName()
	{
		searchTextbox.sendKeys("administrator");
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
	
	public void clickFilterIconButton()
	{
		filterIconButton.click();
	}
	
	public void clickDocumentAccessHistory()
	{
		documentActionButton.click();
	}
	
	public void clickSearchHistory()
	{
		searchHistoryButton.click();
	}
	
	public void clickUserAccounts()
	{
		userAccountsButton.click();
	}
	
	public void clickAllAction()
	{
		allActionButton.click();
	}
	
	public void verifyPrintButton()
	{
		printButton.isDisplayed();
	}
	
	public void clickSortingIcons()
	{
		sortingIcons.click();
	}
	
	public void clickNextButton()
	{
		nextButton.click();
	}
	
	public void clickPreviousButton()
	{
		previousButton.click();
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
