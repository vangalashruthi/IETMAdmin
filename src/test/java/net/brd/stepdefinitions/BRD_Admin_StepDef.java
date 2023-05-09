package net.brd.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.admin.pages.BRDAdminPage;
import net.admin.utility.BrowserOpen;


public class BRD_Admin_StepDef {

	
WebDriver driver;
	
	BrowserOpen bo = new BrowserOpen();
	
	BRDAdminPage brdadminpage;
	

	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
		
		 brdadminpage = new BRDAdminPage(driver);
	    
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
	    
		driver.get(url);
		
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
	    
		brdadminpage.enterUsername();
		
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
	    
		brdadminpage.enterPassword();
		
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		brdadminpage.clickSubmit();
	    
	}
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String backupAndRestore) {
	    
		brdadminpage.clickBackupAndRestoreData();
		
	}
	@Then("user is to verify the Backup Now button")
	public void user_is_to_verify_the_backup_now_button() {
	    
		brdadminpage.verifyBackupNowButton();
		
	}
	@Then("user is to verify the Restore Now button")
	public void user_is_to_verify_the_restore_now_button() {
	 
		brdadminpage.verifyRestoreNowButton();
		
	}
	@Then("user is to verify the Start Time in Last Backup Status")
	public void user_is_to_verify_the_start_time_in_last_backup_status() {
	  
		brdadminpage.verifyStartTimeLastBackup();
		
	}
	@Then("user is to verify the End Time in Last Backup Status")
	public void user_is_to_verify_the_end_time_in_last_backup_status() {
	 
		brdadminpage.verifyEndTimeLastBackup();
		
	}
	@Then("user is to verify the Status in Last Backup Status")
	public void user_is_to_verify_the_status_in_last_backup_status() {
	 
		brdadminpage.verifyStatusLastBackup();
		
	}
	@Then("user is to verify the Start Time in Last Restoration Status")
	public void user_is_to_verify_the_start_time_in_last_restoration_status() {
	    
		brdadminpage.verifyStartTimeLastRestoration();
		
	}
	@Then("user is to verify the End Time in Last Restoration Status")
	public void user_is_to_verify_the_end_time_in_last_restoration_status() {
	   
		brdadminpage.verifyEndTimeLastRestoration();
		
	}
	@Then("user is to verify the Last Restored File Name in Last Restoration Status")
	public void user_is_to_verify_the_last_restored_file_name_in_last_restoration_status() {
	   
		brdadminpage.verifyLastRestoredFileName();
		
	}
	@Then("user is to verify the Status in Last Restoration Status")
	public void user_is_to_verify_the_status_in_last_restoration_status() {
	 
		brdadminpage.verifyStatusLastRestoration();
		
	}
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() {
	   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Home']")));
		brdadminpage.clickHomeButton();
		
	}
	@Then("user is to click the Backup & Restore Data")
	public void user_is_to_click_the_backup_restore_data() {
	   
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='BACKUP & RESTORE DATA ']")));
		brdadminpage.clickBackupAndRestoreData();
		
	}
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page() {
	    
		brdadminpage.clickModulesButton();
		
	}
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException {
	    
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		brdadminpage.clickBackwardButton();
		
	}
	@Then("user is to click the Backup & Restore Data1")
	public void user_is_to_click_the_backup_restore_data1() {
	   
		brdadminpage.clickBackupAndRestoreData();
		
	}
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
	    
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
		brdadminpage.clickForwardButton();
		
	}
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
	    
		brdadminpage.clickHelpButton();
		
	}
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
	    
		brdadminpage.aboutIetmButton();
		
	}
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
	    
		brdadminpage.howToUseButton();
		
	}
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
	    
		brdadminpage.versionHistoryButton();
		
	}
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button() {
	    
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		brdadminpage.clickLogoutButton();
		
	}
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button() {
	    
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[4]")));
		brdadminpage.clickCloseButton();
		
	}
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button() 
	{
		
		brdadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()=' NO'])[last()]")));
		brdadminpage.clickNoButton();
		
	}
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
	    
		brdadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='YES'])[last()]")));
		brdadminpage.clickYesButton();
		
	}






   @After
   public void browserclose()
   {
	   driver.quit();
   }


	
	
	
	
	
	
	
	
	
	
	
}
