package net.mh.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.admin.pages.MHAdminPage;
import net.admin.utility.BrowserOpen;


public class MH_Admin_StepDef {

	WebDriver driver;
	BrowserOpen bo = new BrowserOpen();
	MHAdminPage mhadminpage;
	

	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
	   
		driver = bo.browseropen(browsername);
		 mhadminpage = new MHAdminPage(driver);
		
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
	 
		driver.get(url);
		
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
	   
		mhadminpage.enterUserName();
		
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
	 
		mhadminpage.enterPassword();
		
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
	   
		mhadminpage.clickSubmit();
		
	}
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String myHotspots) {
	 
		mhadminpage.clickMyHotspots();
		
	}
	@Then("user is to click the search textbox")
	public void user_is_to_click_the_search_textbox() {
	    
		mhadminpage.clickSearchTextBox();
		
	}
	@Then("user is to clear the search textbox")
	public void user_is_to_clear_the_search_textbox() {
	   
		mhadminpage.clearSearchTextBox();
		
	}
	@Then("user is to enter the Content Type in the search textbox")
	public void user_is_to_enter_the_content_type_in_the_search_textbox() {
	   
		mhadminpage.enterSearchTextBox();
		
	}
	@Then("user is to verify the hotspots related to Content Type")
	public void user_is_to_verify_the_hotspots_related_to_content_type() {
	   
		mhadminpage.verifyContentType();
		
	}
	@Then("user is to click the search textbox1")
	public void user_is_to_click_the_search_textbox1() {
	    
		mhadminpage.clickSearchTextBox();
		
	}
	@Then("user is to clear the search textbox1")
	public void user_is_to_clear_the_search_textbox1() {
	   
		mhadminpage.clearSearchTextBox();
		
	}
	@Then("user is to enter the Content Title in the search textbox")
	public void user_is_to_enter_the_content_title_in_the_search_textbox() {
	    
		mhadminpage.enterTextbox();
		
	}
	@Then("user is to verify the hotspots related to Content Title")
	public void user_is_to_verify_the_hotspots_related_to_content_title() {
	   
		mhadminpage.verifyContentTitle();
		
	}
	@Then("user is to click the Next button")
	public void user_is_to_click_the_next_button() {
	    
		mhadminpage.clickNextButton();
		
	}
	@Then("user is to click the Previous button")
	public void user_is_to_click_the_previous_button() {
	   
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("tbllistid_previous")));
		mhadminpage.clickPreviousButton();
		
	}
	@Then("user is to click the Settings menu")
	public void user_is_to_click_the_settings_menu() {
	   
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button'])[5]")));
		mhadminpage.clickSettingsMenu();
		
	}
	@Then("user is to verify the Edit action")
	public void user_is_to_verify_the_edit_action() {
	    
		mhadminpage.verfiySettingsMenu();
		
	}
	@Then("user is to click the dropdown arrows")
	public void user_is_to_click_the_dropdown_arrows() {
	    
		mhadminpage.clickEntries();
		
	}
	@Then("user is to verify the options in the list")
	public void user_is_to_verify_the_options_in_the_list() {
	   
		mhadminpage.verifyEntries();
		
	}
	@Then("user is to click the options in the list")
	public void user_is_to_click_the_options_in_the_list() {
	    
		mhadminpage.clickEntriesOptions();
		
	}
	@Then("user is to verify the Print button")
	public void user_is_to_verify_the_print_button() {
	   
		mhadminpage.verifyPrintButton();
		
	}
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException  {
		
		//Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='lni lni-home']")));
		mhadminpage.clickHomeButton();
	}
	
	@Then("user is to click the My Hotspots")
	public void user_is_to_click_the_my_hotspots() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='MY HOTSPOTS ']")));
		mhadminpage.clickMyHotspots();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-desktop']")));
		mhadminpage.clickModulesButton();
		
	}
	
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
		
	//	Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		mhadminpage.clickBackwardButton();
	}
	
	@Then("user is to click the My Hotspots1")
	public void user_is_to_click_the_my_hotspots1() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='MY HOTSPOTS ']")));
    	mhadminpage.clickMyHotspots();
	}
	
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
    	mhadminpage.clickForwardButton();
	}
	
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		mhadminpage.clickHelpButton();
	}
	
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
		mhadminpage.aboutIetmButton();
	
	}
	
	
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
		mhadminpage.howToUseButton();
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
		
		mhadminpage.versionHistoryButton();
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		mhadminpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button1()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[5]")));
		mhadminpage.clickCloseLogoutButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_nologout_button2() throws InterruptedException {
		
		Thread.sleep(1000);
		mhadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		mhadminpage.clickNoLogoutButton();
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
		
		mhadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='YES']")));
		mhadminpage.clickYesButton();
	}









    @After
	public void browserclose()
	{
    	driver.quit();
	}
	
}
