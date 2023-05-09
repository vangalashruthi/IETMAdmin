package net.ei.stepdefinitions;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.admin.pages.EIAdminPage;
import net.admin.utility.BrowserOpen;


public class EI_Admin_StepDef {

	WebDriver driver;
	
	BrowserOpen bo = new BrowserOpen();
	EIAdminPage eiadminpage;
	

	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
	   
		driver = bo.browseropen(browsername);
		 eiadminpage = new EIAdminPage(driver);
		
	}
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
	   
		driver.get(url);
		
	}
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) {
	   
		eiadminpage.enterUserName();
		
	}
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
	   
		eiadminpage.enterPassword();
		
	}
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
	   
		eiadminpage.clickSubmit();
		
	}
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String enterIETM) {
	  
		eiadminpage.clickEnterIETM();
		
	}
	@Then("user is to click the Centrifugal Pumps module")
	public void user_is_to_click_the_centrifugal_pumps_module() {
	    
		eiadminpage.clickCentrifugalPumps();
		
	}
	@Then("user is to click the Installation content")
	public void user_is_to_click_the_installation_content() {
	  
		eiadminpage.clickInstallation();
		
	}
	@Then("user is to click the Maintenance content")
	public void user_is_to_click_the_maintenance_content() {
	   
		eiadminpage.clickMaintenance();
		
	}
	@Then("user is to click the Technical Data content")
	public void user_is_to_click_the_technical_data_content() {
	   
		eiadminpage.clickTechnicalData();
		
	}
	@Then("user is to click the Assembly content")
	public void user_is_to_click_the_assembly_content() {
	    
		eiadminpage.clickAssembly();
		
	}
	@Then("user is to click the Structural Diagram & Parts List content")
	public void user_is_to_click_the_structural_diagram_parts_list_content() {
	   
		eiadminpage.clickStructuralDiagram();
		
	}
	@Then("user is to click the Operation content")
	public void user_is_to_click_the_operation_content() {
	   
		eiadminpage.clickOperation();
		
	}
	@Then("user is to click the Safety content")
	public void user_is_to_click_the_safety_content() {
	   
		eiadminpage.clickSafety();
		
	}
	@Then("user is to click the Search Textbox")
	public void user_is_to_click_the_search_textbox()
	{
		eiadminpage.clickSearchTextbox();
	}
	
	@Then("user is to clear the Search Textbox")
	public void user_is_to_clear_the_search_textbox()
	{
		eiadminpage.clearSearchTextBox();
	}
	
	@Then("user is to enter the Search Textbox")
	public void user_is_to_enter_the_search_textbox()
	{
		eiadminpage.enterSearchTextBox();
	}
	
	@Then("user is to verify the related text")
	public void user_is_to_verify_the_related_text()
	{
		eiadminpage.verifyRelatedText();
	}
	
	@Then("user is to click the Feedback to Administrator action")
	public void user_is_to_click_the_feedback_to_administrator_action() throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Feedback to Administrator']")));
		eiadminpage.clickFeedbackToAdministrator();
	}
	
	@Then("user is to close the Feedback to Administrator action")
	public void user_is_to_close_the_feedback_to_administrator_action() throws InterruptedException 
	{
		Thread.sleep(1000);
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Close']")));
		eiadminpage.clickCloseFeedback();
	}
	
	@Then("user is to click the Notes action")
	public void user_is_to_click_the_notes_action() 
	{
		eiadminpage.clickNotes();
	}
	
	@Then("user is to close the Notes action")
	public void user_is_to_close_the_notes_action()
	{
		eiadminpage.clickcloseNotes();
	}
	@Then("user is to click the Next button")
	public void user_is_to_click_the_next_button()
	{
		eiadminpage.clickNextButton();
	}
	
	@Then("user is to click the Previous button")
	public void user_is_to_click_the_previous_button()
	{
		eiadminpage.clickPreviousButton();
	}
	@Then("user is to click the Zoom dropdown action")
	public void user_is_to_click_the_zoom_dropdown_action()
	{
		eiadminpage.clickZoomDropdown();
	}
	
	@Then("user is to click the Increase")
	public void user_is_to_click_the_increase()
	{
		eiadminpage.clickIncrease();
	}
	
	@Then("user is to click the Decrease")
	public void user_is_to_click_the_decrease() 
	{
		eiadminpage.clickDecrease();
	}
	
	@Then("user is to click the Slider")
	public void user_is_to_click_the_slider() 
	{
		eiadminpage.clickSlider();
	}
	
	@Then("user is to click the Reset")
	public void user_is_to_click_the_reset()
	{
		eiadminpage.clickReset();
	}
	@Then("user is to click the FullScreen action")
	public void user_is_to_click_the_fullscreen_action()
	{
		eiadminpage.clickFullScreen();
	}
	
	@Then("user is to click the Escape key in keyboard")
	public void user_is_to_click_the_escape_key_in_keyboard() throws AWTException
	{
		eiadminpage.clickEscape();
	}
	
	@Then("user is to click the Bookmark action")
	public void user_is_to_click_the_bookmark_action()
	{
		eiadminpage.clickBookmarkAction();
	}
	
	@Then("user is to close the Bookmark action")
	public void user_is_to_close_the_bookmark_action()
	{
		eiadminpage.closeBookmarkAction();
	}
	
	@Then("user is to click the Search action")
	public void user_is_to_click_the_search_action() throws InterruptedException
	{  
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='lni lni-search']")));
		eiadminpage.clickSearchAction();
	}
	
	@Then("user is to click the Back navigation button")
	public void user_is_to_click_the_back_navigation_button()
	{
		eiadminpage.clickBackButton();
	}
	@Then("user is to verify the Print action")
	public void user_is_to_verify_the_print_action()
	{
		eiadminpage.verifyPrintAction();
	}
	@Then("user is to click the Manuals button")
	public void user_is_to_click_the_manuals_button()
	{
		eiadminpage.clickManualsButton();
	}
	
	@Then("user is to click the Drawings button")
	public void user_is_to_click_the_drawings_button()
	{
		eiadminpage.clickDrawingsButton();
	}
	
	@Then("user is to click the Glossary button")
	public void user_is_to_click_the_glossary_button()
	{
		eiadminpage.clickGlossarybutton();
	}
	
	@Then("user is to click the Home button of the page")
	public void user_is_to_click_the_home_button_of_the_page() throws InterruptedException
	{
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Home']")));
		eiadminpage.clickHomeButton();
	}
	
	@Then("user is to click the Enter IETM")
	public void user_is_to_click_the_enter_ietm()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' ENTER IETM ']")));
		eiadminpage.clickEnterIETM();
	}
	
	@Then("user is to click the Modules button of the page")
	public void user_is_to_click_the_modules_button_of_the_page()
	{
		eiadminpage.clickModulesButton();
	}
	@Then("user is to click the Backward navigation button")
	public void user_is_to_click_the_backward_navigation_button() throws InterruptedException  {
		
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-left']")));
		eiadminpage.clickBackwardButton();
	}
	
	@Then("user is to click the Enter IETM1")
	public void user_is_to_click_the_enter_ietm1() throws InterruptedException {
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' ENTER IETM ']")));
    	eiadminpage.clickEnterIETM();
	}
	
	@Then("user is to click the Forward navigation button")
	public void user_is_to_click_the_forward_navigation_button() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(30));
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-arrow-right']")));
    	eiadminpage.clickForwardButton();
	}
	
	@Then("user is to click the Help dropdown button")
	public void user_is_to_click_the_help_dropdown_button() {
		
		eiadminpage.clickHelpButton();
	}
	
	@Then("user is to verify About IETM in the dropdown")
	public void user_is_to_verify_about_ietm_in_the_dropdown() {
		
		eiadminpage.aboutIetmButton();
	
	}
	
	
	@Then("user is to verify How to use IETM? in the dropdown")
	public void user_is_to_verify_how_to_use_ietm_in_the_dropdown() {
		
		eiadminpage.howToUseButton();
	}
	
	@Then("user is to verify Version & Revision History in the dropdown")
	public void user_is_to_verify_version_revision_history_in_the_dropdown() {
		
		eiadminpage.versionHistoryButton();
		
	}
	
	@Then("user is to click the Logout button")
	public void user_is_to_click_the_logout_button()  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Logout']")));
		eiadminpage.clickLogoutButton();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button()   {
		
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[last()]")));
		eiadminpage.clickCloseButton();
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button() {
		
		eiadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' NO']")));
		eiadminpage.clickNoButton();
		
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() {
		
		eiadminpage.clickLogoutButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[text()='YES'])[last()]")));
		eiadminpage.clickYesButton();
	}
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
	
}
