package net.admin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SQAdminPage {

WebDriver driver;
	
	public SQAdminPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(how = How.ID ,using= "user_name")
	WebElement username;
	
	@FindBy(how = How.NAME ,using= "user_pass")
	WebElement password;
	
	@FindBy(how = How.ID ,using= "snbtn")
	WebElement submit;
	
	@FindBy(how = How.XPATH ,using= "//a[text()='SECURITY QUESTIONS']")
	WebElement securityQuestions;
	
	@FindBy(how = How.ID ,using= "qustion1")
	WebElement question1;
	
	@FindBy(how = How.ID ,using= "qustion2")
	WebElement question2;
	
	@FindBy(how = How.NAME ,using= "ans1")
	WebElement answer1;
	
	@FindBy(how = How.NAME ,using= "ans2")
	WebElement answer2;
	
	@FindBy(how = How.ID ,using= "forgotsubmit")
	WebElement submitButton;
	
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
	
	public void clickSecurityQuestions()
	{
		securityQuestions.click();
	}
	
	public void question1Textbox()
	{
		question1.isDisplayed();
	}
	
	public void question2Textbox()
	{
		question2.isDisplayed();
	}
	
	public void answer1Textbox()
	{
		answer1.isDisplayed();
	}
	
	public void answer2Textbox()
	{
		answer2.isDisplayed();
	}
	
	public void clickQuestion1()
	{
		question1.click();
	}
	
	public void clickQuestion2()
	{
		question2.click();
	}
	
	public void clickAnswer1()
	{
		answer1.click();
	}
	
	public void clickAnswer2()
	{
		answer2.click();
	}
	public void clearQuestion1()
	{
		question1.clear();
	}
	
	public void clearQuestion2()
	{
		question2.clear();
	}
	
	public void clearAnswer1()
	{
		answer1.clear();
	}
	public void clearAnswer2()
	{
		answer2.clear();
	}
	
	public void clickSubmitButton()
	{
		submitButton.click();
	}
	
	public void enterQuestion1() 
	{
		
		question1.sendKeys("1+1");
	}
	
	public void enterQuestion2()
	{
		
		question2.sendKeys("2+2");
	}
	
	public void enterAnswer1()
	{
		
		answer1.sendKeys("2");
	}
	
	public void enterAnswer2()
	{
		
		answer2.sendKeys("4");
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
