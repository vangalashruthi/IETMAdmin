package net.admin.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpen {

	
	WebDriver driver;
	
	public static void main(String[] args) {
		
		
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*");
	     WebDriver driver = new ChromeDriver(chromeoptions);
		
		
	}
	
	public WebDriver browseropen(String browsername)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else
		{
			System.out.println(browsername + "is invalid browser");
		}
		
		
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	   driver.manage().window().maximize();
	   
		return driver;
	}

	
	}


	  


