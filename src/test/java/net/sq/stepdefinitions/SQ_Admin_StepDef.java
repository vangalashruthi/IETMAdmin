package net.sq.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.admin.pages.SQAdminPage;
import net.admin.utility.BrowserOpen;


public class SQ_Admin_StepDef {

	WebDriver driver;
	BrowserOpen bo = new BrowserOpen();
	SQAdminPage sqadminpage;
	
	

	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
		 sqadminpage = new SQAdminPage(driver);
		
		
	    
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		
		driver.get(url);
	    
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username)  {
		
		
		sqadminpage.enterUserName();
	   
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
		
		sqadminpage.enterPassword();
	   
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		sqadminpage.clickSubmit();
		
	   
	}
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String securityquestions)  {
		
	   
		sqadminpage.clickSecurityQuestions();
		
	}
	@Then("user is to verify the Question1 textbox")
	public void user_is_to_verify_the_question1_textbox()  {
		
		
		sqadminpage.question1Textbox();
	    
	}
	@Then("user is to verify the Question2 textbox")
	public void user_is_to_verify_the_question2_textbox() {
		
		sqadminpage.question2Textbox();
	    
	}
	@Then("user is to verify the Answer1 textbox")
	public void user_is_to_verify_the_answer1_textbox() {
		
		sqadminpage.answer1Textbox();
	   
	}
	@Then("user is to verify the Answer2 textbox")
	public void user_is_to_verify_the_answer2_textbox() {
		
		sqadminpage.answer2Textbox();
	    
	}

	@Then("user is to click the Question1 textbox")
	public void user_is_to_click_the_question1_textbox()  {
		
		
		sqadminpage.clickQuestion1();
	}
	
	@Then("user is to click the Question2 textbox")
	public void user_is_to_click_the_question2_textbox() {
		
		sqadminpage.clickQuestion2();
		
	}
	
	@Then("user is to click the Answer1 textbox")
	public void user_is_to_click_the_answer1_textbox() {
		
		
		sqadminpage.clickAnswer1();
	}
	
	@Then("user is to click the Answer2 textbox")
	public void user_is_to_click_the_answer2_textbox() {
		
		sqadminpage.clickAnswer2();
		
	}
	@Then("user is to clear the Question1 textbox")
	public void user_is_to_clear_the_question1_textbox()  {
		
		
		sqadminpage.clearQuestion1();
	}
	
	@Then("user is to clear the Question2 textbox")
	public void user_is_to_clear_the_question2_textbox() {
		
		sqadminpage.clearQuestion2();
	}
	
	@Then("user is to clear the Answer1 textbox")
	public void user_is_to_clear_the_answer1_textbox() {
		
		sqadminpage.clearAnswer1();
	}
	
	@Then("user is to clear the Answer2 textbox")
	public void user_is_to_clear_the_answer2_textbox() {
		
		sqadminpage.clearAnswer2();
	}
	
	@Then("user is to click the submit button")
	public void user_is_to_click_the_submit_button() {
		
		sqadminpage.clickSubmitButton();
	}
	
	@Then("user is to clear the value in Question1 textbox")
	public void user_is_to_clear_the_value_in_question1_textbox() throws InterruptedException  {
		
		Thread.sleep(1000);
		sqadminpage.clearQuestion1();
	}
	
	@Then("user is to clear the value in Question2 textbox")
	public void user_is_to_clear_the_value_in_question2_textbox()  {
		
		
		sqadminpage.clearQuestion2();
	}
	
	@Then("user is to clear the value in Answer1 textbox")
	public void user_is_to_clear_the_value_in_answer1_textbox()  {
		
		
		sqadminpage.clearAnswer1();
	}
	
	@Then("user is to clear the value in Answer2 textbox")
	public void user_is_to_clear_the_value_in_answer2_textbox()  {
		
		
		sqadminpage.clearAnswer2();
	}
	
	@Then("user is to enter the value in Question1 textbox")
	public void user_is_to_enter_the_value_in_question1_textbox() throws InterruptedException {
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("qustion1")));
		sqadminpage.enterQuestion1();
		
	}
	
	@Then("user is to enter the value in Question2 textbox")
	public void user_is_to_enter_the_value_in_question2_textbox() {
		
		sqadminpage.enterQuestion2();
		
	}
	
	@Then("user is to enter the value in Answer1 textbox")
	public void user_is_to_enter_the_value_in_answer1_textbox() {
	
		sqadminpage.enterAnswer1();
		
	}
	@Then("user is to click the submit1 button")
	public void user_is_to_click_the_submit1_button() {
		
		sqadminpage.clickSubmitButton();
	}
	
	@Then("user is to clear the value in Question1 textbox1")
	public void user_is_to_clear_the_value_in_question1_textbox1()  {
		
		
		sqadminpage.clearQuestion1();
	}
	
	@Then("user is to clear the value in Question2 textbox1")
	public void user_is_to_clear_the_value_in_question2_textbox1()  {
		
		
		sqadminpage.clearQuestion2();
	}
	
	@Then("user is to clear the value in Answer1 textbox1")
	public void user_is_to_clear_the_value_in_answer1_textbox1()  {
		
		
		sqadminpage.clearAnswer1();
	}
	
	@Then("user is to clear the value in Answer2 textbox1")
	public void user_is_to_clear_the_value_in_answer2_textbox1()  {
		
		
		sqadminpage.clearAnswer2();
	}
	
	@Then("user is to enter the value in Question1 textbox1")
	public void user_is_to_enter_the_value_in_question1_textbox1() throws InterruptedException  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("qustion1")));
		sqadminpage.enterQuestion1();
		
	}
	
	@Then("user is to enter the value in Question2 textbox1")
	public void user_is_to_enter_the_value_in_question2_textbox1() {
		
		sqadminpage.enterQuestion2();
		
	}
	
	@Then("user is to enter the value in Answer1 textbox1")
	public void user_is_to_enter_the_value_in_answer1_textbox1() {
		
		sqadminpage.enterAnswer1();;
		
	}
	
	@Then("user is to enter the value in Answer2 textbox")
	public void user_is_to_enter_the_value_in_answer2_textbox() {
		
		sqadminpage.enterAnswer2();
		
	}
	
	@Then("user is to click the submit2 button")
	public void user_is_to_click_the_submit2_button() {
		
		sqadminpage.clickSubmitButton();
	}
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException  {
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Home']")));
		sqadminpage.clickHomeButton();
	}
	
	@Then("user is to click the Security Questions")
	public void user_is_to_click_the_security_questions() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='SECURITY QUESTIONS']")));
		sqadminpage.clickSecurityQuestions();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page()  {
		
		
		sqadminpage.clickModulesButton();
	}
	
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		sqadminpage.clickBackwardButton();
	}
	
	@Then("user is to click the Security Questions1")
	public void user_is_to_click_the_security_questions1()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='SECURITY QUESTIONS']")));
		sqadminpage.clickSecurityQuestions();
	}
	
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
		sqadminpage.clickForwardButton();
	}
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		sqadminpage.clickHelpButton();
	}
	
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
		sqadminpage.aboutIetmButton();
	}
	
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
		sqadminpage.howToUseButton();
		
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
	
		sqadminpage.versionHistoryButton();
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		sqadminpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[3]")));
		sqadminpage.clickCloseButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button()  {
		
		sqadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		sqadminpage.clickNoButton();
		
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button()  {
		
		sqadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='YES']")));
		sqadminpage.clickYesButton();
	}
	
	
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
}
