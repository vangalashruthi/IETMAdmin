package net.mu.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.admin.pages.MUAdminPage;
import net.admin.utility.BrowserOpen;


public class MU_Admin_StepDef {

	
	WebDriver driver;
	BrowserOpen bo = new BrowserOpen();
	
	MUAdminPage muadminpage;
	
	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
	    muadminpage = new MUAdminPage(driver);
		
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		
		driver.get(url);
	    
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
		
		muadminpage.enterUserName();
	   
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
		
		muadminpage.enterPassword();
	   
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		muadminpage.clickSubmit();
		
	}	
		
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String manageUsers) {
		
		muadminpage.clickManageUsers();
	}
	
	@Then("user is to click the Search TextBox")
	public void user_is_to_click_the_search_textBox()
	{
		muadminpage.clickSearchTextBox();
	}
	
	@Then("user is to clear the Search TextBox")
	public void user_is_to_clear_the_search_textBox()
	{
		muadminpage.clearSearchTextBox();
	}
	
	@Then("user is to enter the ID no in the Search TextBox")
	public void user_is_to_enter_the_id_no_in_the_search_textBox()
	{
		muadminpage.enterIDno();
	}
	
	@Then("user is to verify the Users related to ID no")
	public void user_is_to_verify_the_users_related_to_id_no()
	{
		muadminpage.verifyUsers();
	}
	
	@Then("user is to click the Search TextBox1")
	public void user_is_to_click_the_search_textBox1()
	{
		muadminpage.clickSearchTextBox();
	}
	
	@Then("user is to clear the Search TextBox1")
	public void user_is_to_clear_the_search_textBox1()
	{
		muadminpage.clearSearchTextBox();
	}
	
	@Then("user is to enter the Username in the Search TextBox")
	public void user_is_to_enter_the_username_in_the_search_textBox()
	{
		muadminpage.enterUsernameSearchTextBox();
	}
	
	@Then("user is to verify the Users related to Username")
	public void user_is_to_verify_the_users_related_to_username()
	{
		muadminpage.verifyUsers();
	}
	@Then("user is to click the Next button")
	public void user_is_to_click_the_next_button()
	{
		muadminpage.clickNextButton();
	}
	
	@Then("user is to click the Previous button")
	public void user_is_to_click_the_previous_button()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbllistid_previous")));
		muadminpage.clickPreviousButton();
	}
	
	@Then("user is to verify the Print button")
	public void user_is_to_verify_the_print_button()
	{
		muadminpage.verifyPrintButton();
	}
	@Then("user is to click the dropdown arrows")
	public void user_is_to_click_the_dropdown_arrows()
	{
		muadminpage.clickEntries();
	}
	
	@Then("user is to verify the options in the list")
	public void user_is_to_verify_the_options_in_the_list()
	{
		muadminpage.verifyEntries();
	}
	
	@Then("user is to click the options in the list")
	public void user_is_to_click_the_options_in_the_list()
	{
		muadminpage.clickEntriesOptions();
	}
	
	@Then("user is to verify all the actions in the Settings menu")
	public void user_is_to_verify_all_the_actions_in_the_settings_menu() throws InterruptedException
	{
		Thread.sleep(1000);
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("(//button[@type='button'])[7]")));
		muadminpage.clickSettingsMenu();
	}
	@Then("user is to click the Add User button")
	public void user_is_to_click_the_add_user_button()
	{
		muadminpage.clickAddUserButton();
	}
	
	@Then("user is to verify the ID No Textbox")
	public void user_is_to_verify_the_id_no_textbox()
	{
		muadminpage.verifyIdNoTextbox();
	}
	
	@Then("user is to verify the Username Textbox")
	public void user_is_to_verify_the_username_textbox()
	{
		muadminpage.verifyUsernameTextbox();
	}
	
	@Then("user is to verify the Password Textbox")
	public void user_is_to_verify_the_password_textbox()
	{
		muadminpage.verifyPasswordTextbox();
	}
	
	@Then("user is to verify the Role Dropdown menu")
	public void user_is_to_verify_the_role_dropdown_menu()
	{
		muadminpage.verifyRoleDropdown();
	}
	
	@Then("user is to verify the Submit button")
	public void user_is_to_verify_the_submit_button()
	{
		muadminpage.clickSubmitButton();
	}
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException
	{
	//	Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Home']")));
		muadminpage.clickHomeButton();
	}
	
	@Then("user is to click the Manage Users")
	public void user_is_to_click_the_manage_users()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MANAGE USERS']")));
		muadminpage.clickManageUsers();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page()
	{
		muadminpage.clickModulesButton();
	}
	
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
		
	//	Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		muadminpage.clickBackwardButton();
	}
	
	@Then("user is to click the Manage Users1")
	public void user_is_to_click_the_manage_users1() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MANAGE USERS']")));
    	muadminpage.clickManageUsers();
	}
	
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
    	muadminpage.clickForwardButton();
	}
	
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		muadminpage.clickHelpButton();
	}
	
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
		muadminpage.aboutIetmButton();
	
	}
	
	
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
		muadminpage.howToUseButton();
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
		
		muadminpage.versionHistoryButton();
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		muadminpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[3]")));
		muadminpage.clickCloseButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button() {
		
		muadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		muadminpage.clickNoButton();
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
		
		muadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='YES']")));
		muadminpage.clickYesButton();
	}
	
	
	
	
	
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
}
