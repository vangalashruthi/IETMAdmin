package net.cp.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.admin.pages.CPAdminPage;
import net.admin.utility.BrowserOpen;


public class CP_Admin_StepDef {

	
WebDriver driver;
	
	BrowserOpen bo = new BrowserOpen();
	
	CPAdminPage cpadminpage;
	

	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
		
		 cpadminpage = new CPAdminPage(driver);
	    
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
	    
		driver.get(url);
		
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
	    
		cpadminpage.enterUsername();
		
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
	    
		cpadminpage.enterPassword();
		
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		cpadminpage.clickSubmit();
	    
	}
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String changepassword) {
	    
		cpadminpage.clickChangePassword();
		
	}
	@Then("user is to click the Old password textbox")
	public void user_is_to_click_the_old_password_textbox() {
	 
		cpadminpage.clickOldPasswordTextBox();
		
	}
	@Then("user is to click the New password textbox")
	public void user_is_to_click_the_new_password_textbox() {
	    
		cpadminpage.clickNewPasswordTextbox();
		
	}
	@Then("user is to click the Re-enter new password textbox")
	public void user_is_to_click_the_re_enter_new_password_textbox() {
	    
		cpadminpage.clickReenterNewPasswordTextbox();
		
	}
	@Then("user is to clear the Old password textbox")
	public void user_is_to_clear_the_old_password_textbox() {
	   
		cpadminpage.clearOldPasswordTextBox();
		
	}
	@Then("user is to clear the New password textbox")
	public void user_is_to_clear_the_new_password_textbox() {
	   
		cpadminpage.clearNewPasswordTextbox();
		
	}
	@Then("user is to clear the Re-enter new password textbox")
	public void user_is_to_clear_the_re_enter_new_password_textbox() {
	   
		cpadminpage.clearReenterNewPasswordTextbox();
		
	}
	@Then("user is to click the submit button")
	public void user_is_to_click_the_submit_button() {
	   
		cpadminpage.clickSubmitButton();
		
	}
	@Then("user is to enter the value in Old password textbox")
	public void user_is_to_enter_the_value_in_old_password_textbox() {
	   
		cpadminpage.enterOldPassword();
		
	}
	@Then("user is to enter the value in New password textbox")
	public void user_is_to_enter_the_value_in_new_password_textbox() {
	  
		cpadminpage.enterNewPassword();
		
	}
	@Then("user is to click the submit button1")
	public void user_is_to_click_the_submit_button1() {
	   
		cpadminpage.clickSubmitButton();
		
	}
	@Then("user is to enter the invalid value in Old password textbox")
	public void user_is_to_enter_the_invalid_value_in_old_password_textbox() {
	    
		cpadminpage.invalidOldPassword();
		
	}
	@Then("user is to enter the valid value in New password textbox")
	public void user_is_to_enter_the_valid_value_in_new_password_textbox() {
	    
		cpadminpage.validNewPassword();
		
	}
	@Then("user is to enter the valid value in Re-enter new password textbox")
	public void user_is_to_enter_the_valid_value_in_re_enter_new_password_textbox() {
	   
		cpadminpage.validReenterNewPassword();
		
	}
	@Then("user is to enter the value in Old password textbox1")
	public void user_is_to_enter_the_value_in_old_password_textbox1() {
	   
       	cpadminpage.enterOldPassword();
		
	}
	@Then("user is to enter the value in New password textbox1")
	public void user_is_to_enter_the_value_in_new_password_textbox1() {
	  
		cpadminpage.enterNewPassword();
		
	}
	@Then("user is to click the eye icon of Old password textbox")
	public void user_is_to_click_the_eye_icon_of_old_password_textbox() {
	    
		cpadminpage.eyeIconOldPassword();
		
	}
	@Then("user is to click the eye icon of New password textbox")
	public void user_is_to_click_the_eye_icon_of_new_password_textbox() {
	    
		cpadminpage.eyeIconNewPassword();
		
	}
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException {
	 
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Home']")));
		cpadminpage.clickHomeButton();
		
	}
	@Then("user is to click the Change Password")
	public void user_is_to_click_the_change_password() throws InterruptedException {
	  
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='CHANGE PASSWORD']")));
		cpadminpage.clickChangePassword();
		
	}
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page() {
	    
	
		cpadminpage.clickModulesButton();
		
	}
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException {
	    
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		cpadminpage.clickBackwardButton();
		
	}
	@Then("user is to click the Change Password1")
	public void user_is_to_click_the_change_password1() {
	  
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' CHANGE PASSWORD']")));
		cpadminpage.clickChangePassword();
		
	}
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
	    
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
		cpadminpage.clickForwardButton();
		
	}
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
	    
		cpadminpage.clickHelpButton();
		
	}
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
	    
		cpadminpage.aboutIetmButton();
		
	}
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
	    
		cpadminpage.howToUseButton();
		
	}
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
	    
		cpadminpage.versionHistoryButton();
		
	}
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button() {
	    
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		cpadminpage.clickLogoutButton();
		
	}
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button() {
	    
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[3]")));
		cpadminpage.clickCloseButton();
		
	}
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button() {
	    
		cpadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		cpadminpage.clickNoButton();
		
	}
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
	    
		cpadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='YES']")));
		cpadminpage.clickYesButton();
		
	}

	
	
	
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
}
