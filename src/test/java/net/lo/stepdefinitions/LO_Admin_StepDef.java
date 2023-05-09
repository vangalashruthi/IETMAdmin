package net.lo.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.admin.pages.LOAdminPage;
import net.admin.utility.BrowserOpen;


public class LO_Admin_StepDef {

	
	WebDriver driver;
	
	BrowserOpen bo = new BrowserOpen();
	
	LOAdminPage loadminpage;
	
	
	@Given("user opens the {string} browser")
	public void user_opens_the_browser(String browsername) {
		
		driver = bo.browseropen(browsername);
		loadminpage = new LOAdminPage(driver);
		
	}
	
	@When("user enters the url as {string}")
	public void user_enters_the_url_as(String url) {
		
		driver.get(url);
	}
	
	@Then("user is to enter username as {string}")
	public void user_is_to_enter_username_as(String username) throws InterruptedException {
		
		Thread.sleep(1000);
		loadminpage.enterUsername();
	}
	
	@Then("user is to enter password as {string}")
	public void user_is_to_enter_password_as(String password) {
		
		loadminpage.enterPassword();
	}
	
	@Then("user is to click the button {string}")
	public void user_is_to_click_the_button(String submit) {
		
		loadminpage.clickSubmit();
	}
	
	@Then("user is to click the {string}")
	public void user_is_to_click_the(String LOGOUT) throws InterruptedException {
		
		Thread.sleep(1000);
		loadminpage.clickLogout();
	}
	
	@Then("user is to verify the Yes button")
	public void user_is_to_verify_yes_button() 
	{
		
		
	}
	
	@Then("user is to verify the No button")
	public void user_is_to_verify_no_button()
	{
	
	}
	
	@Then("user is to verify the Close button")
	public void user_is_to_verify_close_button()
	{
	
	}
	
	@Then("user is to click the No button")
	public void user_is_to_click_the_no_button() throws InterruptedException
	{
		Thread.sleep(1000);
		loadminpage.clickNo();
	}
	
	@Then("user is to click the Logout")
	public void user_is_to_click_the_logout() throws InterruptedException
	{
		Thread.sleep(1000);
		loadminpage.clickLogout();
	}
	
	@Then("user is to click the Close button")
	public void user_is_to_click_the_close_button() throws InterruptedException
	{
		Thread.sleep(1000);
		loadminpage.clickClose();
	}
	
	@Then("user is to click the Logout1")
	public void user_is_to_click_the_logout1() throws InterruptedException
	{
		Thread.sleep(1000);
		loadminpage.clickLogout();
	}
	
	@Then("user is to click the Yes button")
	public void user_is_to_click_the_yes_button() throws InterruptedException
	{
		Thread.sleep(1000);
		loadminpage.clickYes();
	}
	
	@After
	public void browserclose()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
}
