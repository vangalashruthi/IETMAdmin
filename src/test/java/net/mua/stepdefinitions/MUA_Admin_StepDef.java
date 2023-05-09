package net.mua.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.admin.pages.MUAAdminPage;
import net.admin.utility.BrowserOpen;


public class MUA_Admin_StepDef {

	WebDriver driver;
	BrowserOpen bo = new BrowserOpen();
	MUAAdminPage  muaadminpage;
	
	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
	   muaadminpage = new MUAAdminPage(driver);
		
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		
		driver.get(url);
	    
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
		
		muaadminpage.enterUserName();
	   
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
		
		muaadminpage.enterPassword();
	   
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		muaadminpage.clickSubmit();
		
	}	
		
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String manageUserActivity) {
		
		muaadminpage.clickManageUserActivity();	
	}
	
	@Then("user is to click the From Date Textbox")
	public void user_is_to_click_the_from_date_textbox()
	{
		muaadminpage.clickFromDate();
	}
	
	@Then("user is to clear the From Date Textbox")
	public void user_is_to_clear_the_from_date_textbox()
	{
		muaadminpage.clearFromDate();
	}
	
	@Then("user is to click the To Date Textbox")
	public void user_is_to_click_the_to_date_textbox()
	{
		muaadminpage.clickToDate();
	}
	
	@Then("user is to clear the To Date Textbox")
	public void user_is_to_clear_the_to_date_textbox()
	{
		muaadminpage.clearToDate();
	}
	
	@Then("user is to click the year on the From Date textbox calender menu")
	public void user_is_to_click_the_year_on_the_from_date_textbox_calender_menu()
	{
		muaadminpage.clickFromDate();
		muaadminpage.clickYearFromDate();
	}
	
	@Then("user is to select a year on the From Date textbox calendar menu")
	public void user_is_to_select_a_year_on_the_from_date_textbox_calendar_menu()
	{
		muaadminpage.selectYearFromDate();
	}
	
	@Then("user is to select a month on the From Date textbox calendar menu")
	public void user_is_to_select_a_month_on_the_from_date_textbox_calendar_menu()
	{
		muaadminpage.selectMonthFromDate();
	}
	
	@Then("user is to click the next arrow on the From Date textbox calendar menu")
	public void user_is_to_click_the_next_arrow_on_the_from_date_textbox_calendar_menu()
	{
		muaadminpage.clickNextArrowFromDate();
	}
	
	@Then("user is to click the previous arrow on the From Date textbox calendar menu")
	public void user_is_to_click_the_previous_arrow_on_the_from_date_textbox_calendar_menu()
	{
		muaadminpage.clickPreviousArrowFromDate();
	}
	
	@Then("user is to select a date on the From Date textbox calendar menu")
	public void user_is_to_select_a_date_on_the_from_date_textbox_calendar_menu()
	{
		muaadminpage.selectDateFromDate();
	}
	
	@Then("user is to click the year on the To Date textbox calender menu")
	public void user_is_to_click_the_year_on_the_to_date_textbox_calender_menu()
	{
		muaadminpage.clickToDate();
		muaadminpage.clickYearToDate();
	}
	
	@Then("user is to select a year on the To Date textbox calendar menu")
	public void user_is_to_select_a_year_on_the_to_date_textbox_calendar_menu()
	{
		muaadminpage.selectYearToDate();
	}
	
	@Then("user is to select a month on the To Date textbox calendar menu")
	public void user_is_to_select_a_month_on_the_to_date_textbox_calendar_menu()
	{
		muaadminpage.selectMonthToDate();
	}
	
	@Then("user is to click the next arrow on the To Date textbox calendar menu")
	public void user_is_to_click_the_next_arrow_on_the_to_date_textbox_calendar_menu()
	{
		muaadminpage.clickNextArrowToDate();
	}
	
	@Then("user is to click the previous arrow on the To Date textbox calendar menu")
	public void user_is_to_click_the_previous_arrow_on_the_to_date_textbox_calendar_menu()
	{
		muaadminpage.clickPreviousArrowToDate();
	}
	
	@Then("user is to select a date on the To Date textbox calendar menu")
	public void user_is_to_select_a_date_on_the_to_date_textbox_calendar_menu()
	{
		muaadminpage.selectDateToDate();
	}
	
	@Then("user is to click the checkmark button")
	public void user_is_to_click_the_checkmark_button()
	{
		muaadminpage.clickCheckmarkButton();
	}
	
	@Then("user is to click the search textbox")
	public void user_is_to_click_the_search_textbox()
	{
		muaadminpage.clickSearchTextbox();
	}
	
	@Then("user is to clear the search textbox")
	public void user_is_to_clear_the_search_textbox()
	{
		muaadminpage.clearSearchTextbox();
	}
	
	@Then("user is to enter the page name in the search textbox")
	public void user_is_to_enter_the_page_name_in_the_search_textbox()
	{
		muaadminpage.enterPageName();
	}
	
	@Then("user is to verify the User activities related to page name")
	public void user_is_to_verify_the_User_activities_related_to_page_name()
	{
		muaadminpage.userActivities();
	}
	
	@Then("user is to click the search textbox1")
	public void user_is_to_click_the_search_textbox1()
	{
		muaadminpage.clearSearchTextbox();
	}
	
	@Then("user is to clear the search textbox1")
	public void user_is_to_clear_the_search_textbox1()
	{
		muaadminpage.clearSearchTextbox();
	}
	
	@Then("user is to enter the user name in the search textbox")
	public void user_is_to_enter_the_user_name_in_the_search_textbox()
	{
		muaadminpage.enterSearchUserName();
	}
	
	@Then("user is to verify the User activities related to user name")
	public void user_is_to_verify_the_User_activities_related_to_user_name()
	{
		muaadminpage.userActivities();
	}
	@Then("user is to click the dropdown arrows")
	public void user_is_to_click_the_dropdown_arrows()
	{
		muaadminpage.clickEntries();
	}
	
	@Then("user is to verify the options in the list")
	public void user_is_to_verify_the_options_in_the_list()
	{
		muaadminpage.verifyEntries();
	}
	
	@Then("user is to click the options in the list")
	public void user_is_to_click_the_options_in_the_list()
	{
		muaadminpage.clickEntriesOptions();
	}
	
	@Then("user is to verify the Print button")
	public void user_is_to_verify_the_Print_button()
	{
		muaadminpage.verifyPrintButton();
	}
	
	@Then("user is to click the Filter icon button")
	public void user_is_to_click_the_filter_icon_button()
	{
		muaadminpage.clickFilterIconButton();
	}
	
	@Then("user is to click the Document Access History action")
	public void user_is_to_click_the_document_access_history_action()
	{
		muaadminpage.clickDocumentAccessHistory();
	}
	
	@Then("user is to click the Filter icon button1")
	public void user_is_to_click_the_filter_icon_button1()
	{
		muaadminpage.clickFilterIconButton();
	}
	
	@Then("user is to click the Search History action")
	public void user_is_to_click_the_search_history_action()
	{
		muaadminpage.clickSearchHistory();
	}
	
	@Then("user is to click the Filter icon button2")
	public void user_is_to_click_the_filter_icon_button2()
	{
		muaadminpage.clickFilterIconButton();
	}
	
	@Then("user is to click the User Accounts action")
	public void user_is_to_click_the_user_accounts_action()
	{
		muaadminpage.clickUserAccounts();
	}
	
	@Then("user is to click the Filter icon button3")
	public void user_is_to_click_the_filter_icon_button3()
	{
		muaadminpage.clickFilterIconButton();
	}
	
	@Then("user is to click the All action")
	public void user_is_to_click_the_all_action()
	{
		muaadminpage.clickAllAction();
	}
	@Then("user is to click the Sorting icons")
	public void user_is_to_click_the_Sorting_icons()
	{
		muaadminpage.clickSortingIcons();
	}
	
	@Then("user is to click the Next button")
	public void user_is_to_click_the_Next_button()
	{
		muaadminpage.clickNextButton();
	}
	
	@Then("user is to click the Previous button")
	public void user_is_to_click_the_Previous_button()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbllistid_previous")));
		muaadminpage.clickPreviousButton();
	}
	
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Home']")));
		muaadminpage.clickHomeButton();
	}
	
	@Then("user is to click the Manage User Activity")
	public void user_is_to_click_the_manage_user_activity()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MANAGE USER ACTIVITY']")));
		muaadminpage.clickManageUserActivity();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page()
	{
		muaadminpage.clickModulesButton();
	}
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		muaadminpage.clickBackwardButton();
	}
	
	@Then("user is to click the Manage User Activity1")
	public void user_is_to_click_the_manage_user_activity1() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' MANAGE USER ACTIVITY']")));
    	muaadminpage.clickManageUserActivity();
	}
	
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
    	muaadminpage.clickForwardButton();
	}
	
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		muaadminpage.clickHelpButton();
	}
	
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
		muaadminpage.aboutIetmButton();
	
	}
	
	
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
		muaadminpage.howToUseButton();
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
		
		muaadminpage.versionHistoryButton();
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		muaadminpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[3]")));
		muaadminpage.clickCloseButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button() {
		
		muaadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		muaadminpage.clickNoButton();
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
		
		muaadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='YES']")));
		muaadminpage.clickYesButton();
	}
	
	
	
	
	
	
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
}
