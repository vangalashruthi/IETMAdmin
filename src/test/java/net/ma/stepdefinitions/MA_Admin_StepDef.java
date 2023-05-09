package net.ma.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.admin.pages.MAAdminPage;
import net.admin.utility.BrowserOpen;


public class MA_Admin_StepDef {

	WebDriver driver;
	BrowserOpen bo = new BrowserOpen();
	
	MAAdminPage maadminpage;
	
	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
	     maadminpage = new MAAdminPage(driver);
		
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		
		driver.get(url);
	    
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
		
		maadminpage.enterUserName();
	   
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
		
		maadminpage.enterPassword();
	   
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		maadminpage.clickSubmit();
		
	}	
		
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String manageAnnotations) {
		
		maadminpage.clickAnnotations();
		
	}
	
	@Then("user is to click the search textbox")
	public void user_is_to_click_the_search_textbox()
	{
		maadminpage.clickSearchTextbox();
	}
	
	@Then("user is to clear the search textbox")
	public void user_is_to_clear_the_search_textbox()
	{
		maadminpage.clearSearchTextbox();
	}
	
	@Then("user is to enter the title name in the search textbox")
	public void user_is_to_enter_the_title_name_in_the_search_textbox()
	{
		maadminpage.enterTextbox();
	}
	
	@Then("user is to verify the Annotated text related to title name")
	public void user_is_to_verify_the_annotated_text_related_to_title_name()
	{
		maadminpage.verifyAnnotatedTexts();
	}
	
	@Then("user is to click the search textbox1")
	public void user_is_to_click_the_search_textbox1()
	{
		maadminpage.clickSearchTextbox();
	}
	
	@Then("user is to clear the search textbox1")
	public void user_is_to_clear_the_search_textbox1()
	{
		maadminpage.clearSearchTextbox();
	}
	
	@Then("user is to enter the description in the search textbox")
	public void user_is_to_enter_the_description_in_the_search_textbox()
	{
		maadminpage.enterSearchTextbox();
	}
	
	@Then("user is to verify the Annotated text related to description")
	public void user_is_to_verify_the_annotated_text_related_to_description()
	{
		maadminpage.verifyAnnotatedTexts();	
	}
	
	@Then("user is to click the dropdown arrows")
	public void user_is_to_click_the_dropdown_arrows()
	{
		maadminpage.clickEntries();
	}
	
	@Then("user is to verify the options in the list")
	public void user_is_to_verify_the_options_in_the_list()
	{
		maadminpage.verifyEntries();
	}
	
	@Then("user is to click the options in the list")
	public void user_is_to_click_the_options_in_the_list()
	{
		maadminpage.clickEntriesOptions();
	}
	
	@Then("user is to click the Next button")
	public void user_is_to_click_the_next_button()
	{
		maadminpage.clickNextButton();
	}
	
	@Then("user is to click the Previous button")
	public void user_is_to_click_the_previous_button()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("tbllistid_previous")));
		maadminpage.clickPreviousButton();
	}
	
	@Then("user is to verify the Print button")
	public void user_is_to_verify_the_print_button()
	{
		maadminpage.verifyPrintButton();
	}
	
	@Then("user is to click the filter icon button")
	public void user_is_to_click_the_filter_icon_button()
	{
		maadminpage.clickFilterIconButton();
	}
	
	@Then("user is to click the Notes action")
	public void user_is_to_click_the_notes_action()
	{
		maadminpage.clickNotesActions();
	}
	
	@Then("user is to click the filter icon button1")
	public void user_is_to_click_the_filter_icon_button1()
	{
		maadminpage.clickFilterIconButton();
	}
	
	@Then("user is to click the Feedback to Administrator action")
	public void user_is_to_click_the_feedback_to_administrator_action()
	{
		maadminpage.clickFeedbackToAdministrator();
	}
	
	@Then("user is to click the filter icon button2")
	public void user_is_to_click_the_filter_icon_button2()
	{
		maadminpage.clickFilterIconButton();
	}
	
	@Then("user is to click the All action")
	public void user_is_to_click_the_all_action()
	{
		maadminpage.clickAllActions();
	}
	
	@Then("user is to click the delete icon button without selecting checkbox")
	public void user_is_to_click_the_delete_icon_button_without_selecting_checkbox()
	{
		maadminpage.clickDeleteIconButton();
	}
	
	@Then("user is to select the checkbox")
	public void user_is_to_select_the_checkbox()
	{
		maadminpage.selectCheckbox();
	}
	
	@Then("user is to click the delete icon button")
	public void user_is_to_click_the_delete_icon_button()
	{
		maadminpage.clickDeleteIconButton();
	}
	
	@Then("user is to verify the Yes button of Delete Annotations")
	public void user_is_to_verify_the_yes_button_of_delete_annotations()
	{
		maadminpage.verifyYesButton();
	}
	
	@Then("user is to click the No button of Delete Annotations")
	public void user_is_to_click_the_no_button_of_delete_annotations()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='NO']")));
		maadminpage.clickNoButton();
	}
	
	@Then("user is to click the delete icon button1")
	public void user_is_to_click_the_delete_icon_button1()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-trash']")));
		maadminpage.clickDeleteIconButton();
	}
	
	@Then("user is to click the close button")
	public void user_is_to_click_the_close_button()
	{
		maadminpage.clickCloseButton();
	}
	
	@Then("user is to click the Sorting icons")
	public void user_is_to_click_the_sorting_icons()
	{
		
		maadminpage.clickSortingIcons();
	}
	
	@Then("user is to click the Settings menu")
	public void user_is_to_click_the_settings_menu()
	{
		
		maadminpage.clickSettingsMenu();
	}
	
	@Then("user is to verify the Edit and Comments actions")
	public void user_is_to_verify_the_edit_and_comments_actions()
	{
		maadminpage.verfiySettingsMenu();
	}
	
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException  {
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='lni lni-home']")));
		maadminpage.clickHomeButton();
	}
	
	@Then("user is to click the Manage Annotations")
	public void user_is_to_click_the_manage_annotations() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' MANAGE ANNOTATIONS ']")));
		maadminpage.clickAnnotations();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-desktop']")));
		maadminpage.clickModulesButton();
		
	}
	
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		maadminpage.clickBackwardButton();
	}
	
	@Then("user is to click the Manage Annotations1")
	public void user_is_to_click_the_manage_annotations1() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MANAGE ANNOTATIONS ']")));
    	maadminpage.clickAnnotations();
	}
	
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
    	maadminpage.clickForwardButton();
	}
	
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		maadminpage.clickHelpButton();
	}
	
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
		maadminpage.aboutIetmButton();
	
	}
	
	
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
		maadminpage.howToUseButton();
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
		
		maadminpage.versionHistoryButton();
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		maadminpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button1()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[4]")));
		maadminpage.clickCloseLogoutButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_nologout_button2() throws InterruptedException {
		
		Thread.sleep(1000);
		maadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		maadminpage.clickNoLogoutButton();
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
		
		maadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='YES']")));
		maadminpage.clickYesButton();
	}
	
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
}
