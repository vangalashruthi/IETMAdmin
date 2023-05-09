package net.mb.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.admin.pages.MBAdminPage;
import net.admin.utility.BrowserOpen;


public class MB_Admin_StepDef {

	WebDriver driver;
	
	BrowserOpen bo = new BrowserOpen();
	MBAdminPage mbadminpage;

	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
	    
		driver = bo.browseropen(browsername);
		
		 mbadminpage = new MBAdminPage(driver);
		
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
	    
		driver.get(url);
		
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
	    
		mbadminpage.enterUserName();
		
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
	    
		mbadminpage.enterPassword();
		
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
	    
		mbadminpage.clickSubmit();
		
	}
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String managebookmarks) {
	   
		mbadminpage.clickManageBookmarks();
		
	}
	@Then("user is to click the search textbox")
	public void user_is_to_click_the_search_textbox() {
	    
		mbadminpage.clickSearchTextbox();
		
	}
	@Then("user is to clear the search textbox")
	public void user_is_to_clear_the_search_textbox() {
	    
		mbadminpage.clearSearchTextbox();
		
	}
	@Then("user is to enter the name in search textbox")
	public void user_is_to_enter_the_name_in_search_textbox() {
	    
		mbadminpage.enterTextbox();
		
	}
	@Then("user is to verify the bookmarks related to name")
	public void user_is_to_verify_the_bookmarks_related_to_name() {
	   
		mbadminpage.verifyBookmarks();
		
	}
	
	@Then("user is to click the dropdown arrows")
	public void user_is_to_click_the_dropdown_arrows() {
	   
		mbadminpage.clickEntries();
		
	}
	@Then("user is to verify the options in the list")
	public void user_is_to_verify_the_options_in_the_list() {
	  
		mbadminpage.verifyEntries();
		
	}
	@Then("user is to click the options in the list")
	public void user_is_to_click_the_options_in_the_list() {
	 
		mbadminpage.clickEntriesOptions();
		
	}
	@Then("user is to click the Next button")
	public void user_is_to_click_the_next_button() {
	    
		mbadminpage.clickNextButton();
		
	}
	@Then("user is to click the Previous button")
	public void user_is_to_click_the_previous_button() {
	    
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbllistid_previous")));
		mbadminpage.clickPreviousButton();
		
	}
	@Then("user is to verify the Print button")
	public void user_is_to_verify_the_print_button() {
	    
		mbadminpage.verifyPrintButton();
		
	}
	
	@Then("user is to click the Sorting icons")
	public void user_is_to_click_the_sorting_icons() {
	   
		mbadminpage.clickSortingIcons();
		
	}
	@Then("user is to click the Settings menu")
	public void user_is_to_click_the_settings_menu() {
	    
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[6]")));
		mbadminpage.clickSettingsMenu();
		
	}
	@Then("user is to verify the Edit and Delete actions")
	public void user_is_to_verify_the_edit_and_delete_actions() {
	   
		mbadminpage.verfiySettingsMenu();
		
	}
	@Then("user is to click the Name and Link")
	public void user_is_to_click_the_name_and_link() {
	    
		mbadminpage.clickNameAndLink();
		
	}
	@Then("user is to redirect to module page")
	public void user_is_to_redirect_to_module_page() {
	   
		
		
	}
	@Then("user is to verify the module page")
	public void user_is_to_verify_the_module_page() {
	   
		mbadminpage.verifyModulePage();
		
	}
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() {
	 
		mbadminpage.clickBackButton();
		
	}
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() {
	    
		mbadminpage.clickHomeButton();
		
	}
	@Then("user is to click the Manage Bookmarks")
	public void user_is_to_click_the_manage_bookmarks() {
	    
		mbadminpage.clickManageBookmarks();
		
	}
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page() {
	    
		mbadminpage.clickModulesButton();
		
	}
	@Then("user is to click the Backward navigation button1")
	public void user_is_to_click_the_backward_navigation_button1() {
	 
		mbadminpage.clickBackwardButton();
		
	}
	@Then("user is to click the Manage Bookmarks1")
	public void user_is_to_click_the_manage_bookmarks1() {
	    
		mbadminpage.clickManageBookmarks();
		
	}
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
	   
		mbadminpage.clickForwardButton();
		
	}
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
	   
		mbadminpage.clickHelpButton();
	}
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
	    
		mbadminpage.aboutIetmButton();
	}
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
	    
		mbadminpage.howToUseButton();
	}
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
	   
		mbadminpage.versionHistoryButton();
		
	}
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button() {
	   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		mbadminpage.clickLogoutButton();
		
	}
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button() {
	    
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[3]")));
		mbadminpage.clickCloseButton();
	}
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button() {
	   
		mbadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		mbadminpage.clickNoButton();
		
	}
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
	    
		mbadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='YES']")));
		mbadminpage.clickYesButton();
		
	}













	@After
	public void browserclose()
	{
		driver.quit();
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
