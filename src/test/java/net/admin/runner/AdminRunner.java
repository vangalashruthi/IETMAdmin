package net.admin.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		 features = "C:\\Users\\vishn\\git\\IETMAdmin\\src\\test\\java\\net\\admin\\features\\EnterIETM.feature",
		 glue = "net.ei.stepdefinitions",
		 dryRun = false,
		 monochrome = true,
		 publish = true,
		 plugin = {"pretty","html:target/IETMReports/IETM.html","junit:target/IETMReports/IETM.json","junit:target/IETMReports/IETM.xml"}

		 
		 
		 
		 
		 
		 )









public class AdminRunner {

}
