package net.msi.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.admin.pages.MSIAdminPage;
import net.admin.utility.BrowserOpen;


public class MSI_Admin_StepDef {

	WebDriver driver;
	
	BrowserOpen bo = new BrowserOpen();
	
	MSIAdminPage msiadminpage;
	

	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
	    
		driver = bo.browseropen(browsername);
		msiadminpage = new MSIAdminPage(driver);
		
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
	   
		driver.get(url);
		
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
	   
		msiadminpage.enterUserName();
		
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
	   
		msiadminpage.enterPassword();
		
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
	   
		msiadminpage.clickSubmit();
		
	}
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String manageSearchIndex) {
	    
		msiadminpage.clickManageSearchIndex();
		
	}
	@Then("user is to click the search textbox")
	public void user_is_to_click_the_search_textbox() {
	    
		msiadminpage.clickSearchTextbox();
		
	}
	@Then("user is to clear the search textbox")
	public void user_is_to_clear_the_search_textbox() {
	   
		msiadminpage.clearSearchTextbox();
		
	}
	@Then("user is to enter the Search keyword in the search textbox")
	public void user_is_to_enter_the_search_keyword_in_the_search_textbox() {
	 
		msiadminpage.enterTextbox();
		
	}
	@Then("user is to verify the keywords related to Search Keyword")
	public void user_is_to_verify_the_keywords_related_to_search_keyword() {
	   
		msiadminpage.verifySearchKeywords();
		
	}
	@Then("user is to click the search textbox1")
	public void user_is_to_click_the_search_textbox1() {
	   
		msiadminpage.clickSearchTextbox();
		
	}
	@Then("user is to clear the search textbox1")
	public void user_is_to_clear_the_search_textbox1() {
	   
		msiadminpage.clearSearchTextbox();
		
	}
	@Then("user is to enter the Search suggestion in the search textbox")
	public void user_is_to_enter_the_search_suggestion_in_the_search_textbox() {
	    
		msiadminpage.enterSearchTextbox();
		
	}
	@Then("user is to verify the keywords related to Search suggestion")
	public void user_is_to_verify_the_keywords_related_to_search_suggestion() {
	   
		msiadminpage.verifySearchKeywords();
		
	}
	@Then("user is to click the dropdown arrows")
	public void user_is_to_click_the_dropdown_arrows() {
	    
		msiadminpage.clickEntries();
		
	}
	@Then("user is to verify the options in the list")
	public void user_is_to_verify_the_options_in_the_list() {
	   
		msiadminpage.verifyEntries();
		
	}
	@Then("user is to click the options in the list")
	public void user_is_to_click_the_options_in_the_list() {
	    
		msiadminpage.clickEntriesOptions();
		
	}
	@Then("user is to click the Next button")
	public void user_is_to_click_the_next_button() {
	   
		msiadminpage.clickNextButton();
		
	}
	@Then("user is to click the Previous button")
	public void user_is_to_click_the_previous_button() {
	    
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("tbllistid_previous")));
		msiadminpage.clickPreviousButton();
		
	}
	@Then("user is to click the Settings menu")
	public void user_is_to_click_the_settings_menu() {
	   
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//i[@class='lni lni-cog'])[2]")));
		msiadminpage.clickSettingsMenu();
		
	}
	@Then("user is to verify the Edit and Comments actions")
	public void user_is_to_verify_the_edit_and_comments_actions() {
	    
		msiadminpage.verfiySettingsMenu();
		
	}
	@Then("user is to click the Add button")
	public void user_is_to_click_the_add_button() {
	    
		msiadminpage.clickAddButton();
		
	}
	@Then("user is to verify the Search Keyword Textbox")
	public void user_is_to_verify_the_search_keyword_textbox() {
	    
		msiadminpage.verifySearchKeyword();
		
	}
	@Then("user is to verify the Search Suggestions Textbox")
	public void user_is_to_verify_the_search_suggestions_textbox() {
	 
		msiadminpage.verifySearchSuggestions();
		
	}
	@Then("user is to verify the Frame No Textbox")
	public void user_is_to_verify_the_frame_no_textbox() {
	   
		msiadminpage.verifyFrameNo();
		
	}
	@Then("user is to verify the Add button")
	public void user_is_to_verify_the_add_button() {
	    
		msiadminpage.verifyAddButton();
		
	}
	@Then("user is to verify the Delete button")
	public void user_is_to_verify_the_delete_button() {
	    
		msiadminpage.verifyDeleteButton();
		
	}
	@Then("user is to verify the Content Type Dropdown")
	public void user_is_to_verify_the_content_type_dropdown() {
	   
		msiadminpage.verifyContentType();
		
	}
	@Then("user is to verify the Save button")
	public void user_is_to_verify_the_save_button() {
	   
		msiadminpage.verifySaveButton();
		
	}
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException  {
		
	//	Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='lni lni-home']")));
		msiadminpage.clickHomeButton();
	}
	
	@Then("user is to click the Manage Search Index")
	public void user_is_to_click_the_manage_search_index() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' MANAGE SEARCH INDEX']")));
		msiadminpage.clickManageSearchIndex();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-desktop']")));
		msiadminpage.clickModulesButton();
		
	}
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		msiadminpage.clickBackwardButton();
	}
	
	@Then("user is to click the Manage Search Index1")
	public void user_is_to_click_the_manage_search_index1() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MANAGE SEARCH INDEX']")));
    	msiadminpage.clickManageSearchIndex();
	}
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
    	msiadminpage.clickForwardButton();
	}
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		msiadminpage.clickHelpButton();
	}
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
		msiadminpage.aboutIetmButton();
	
	}
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
		msiadminpage.howToUseButton();
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
		
		msiadminpage.versionHistoryButton();
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		msiadminpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button1()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[3]")));
		msiadminpage.clickCloseLogoutButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_nologout_button2() throws InterruptedException {
		
		Thread.sleep(1000);
		msiadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		msiadminpage.clickNoLogoutButton();
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
		
		msiadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='YES']")));
		msiadminpage.clickYesButton();
	}








	
	
	
	
	
	
	
	@After
	public void browserClose()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
