package net.admin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BRDAdminPage {

WebDriver driver;
	
	public BRDAdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how = How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how = How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how = How.ID ,using= "snbtn")
	WebElement submit;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='BACKUP & RESTORE DATA ']")
	WebElement backupAndRestoreData;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='Backup Now']")
	WebElement backupNowButton;
	
	@FindBy(how = How.XPATH ,using= "//button[text()='Restore Now']")
	WebElement restoreNowButton;
	
	@FindBy(how = How.XPATH ,using= "(//b[text()='Feb 15th 2023, 05:20 pm'])[1]")
	WebElement startTimeInLastBackup;
	
	@FindBy(how = How.XPATH ,using= "(//b[text()='Feb 15th 2023, 05:20 pm'])[2]")
	WebElement endTimeInLastBackup;
	
	@FindBy(how = How.XPATH ,using= "(//span[@class='text-success'])[1]")
	WebElement statusInLastBackup;
	
	@FindBy(how = How.XPATH ,using= "//b[text()='Sep 14th 2022, 03:59 pm']")
	WebElement startTimeInLastRestoration;
	
	@FindBy(how = How.XPATH ,using= "//b[text()='Sep 14th 2022, 04:02 pm']")
	WebElement endTimeInLastRestoration;
	
	@FindBy(how = How.XPATH ,using= "//b[text()='db_backup_140920221547.sql']")
	WebElement lastRestoredFileName;
	
	@FindBy(how = How.XPATH ,using= "(//b[text()='Completed'])[2]")
	WebElement statusInLastRestoration;
	
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
	WebElement closeButton;
	
	@FindBy(how = How.XPATH ,using= "(//button[text()=' NO'])[last()]")
	WebElement noButton;
	
	@FindBy(how = How.XPATH ,using= "(//button[text()='YES'])[last()]")
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
	public void clickBackupAndRestoreData()
	{
		backupAndRestoreData.click();
	}
	public void verifyBackupNowButton()
	{
		backupNowButton.isDisplayed();
	}
	public void verifyRestoreNowButton()
	{
		restoreNowButton.isDisplayed();
	}
    public void verifyStartTimeLastBackup()
    {
    	startTimeInLastBackup.isDisplayed();
    }
    public void verifyEndTimeLastBackup()
    {
    	endTimeInLastBackup.isDisplayed();
    }
    public void verifyStatusLastBackup()
    {
    	statusInLastBackup.isDisplayed();
    }
	public void verifyStartTimeLastRestoration()
	{
		startTimeInLastRestoration.isDisplayed();
	}
	public void verifyEndTimeLastRestoration()
	{
		endTimeInLastRestoration.isDisplayed();
	}
	public void verifyLastRestoredFileName()
	{
		lastRestoredFileName.isDisplayed();
	}
	public void verifyStatusLastRestoration()
	{
		statusInLastRestoration.isDisplayed();
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
