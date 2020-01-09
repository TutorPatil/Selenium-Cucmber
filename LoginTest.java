This is the Step defination file for logintest.feature file

package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginnTests {
	
	public WebDriver driver;
	
@Given("^I Launch the actitime application$")
public void i_Launch_the_actitime_application() throws Exception {
	
	System.setProperty("webdriver.chrome.driver","./src/test/java/utilities/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://localhost:9999");
	   
}

@When("^I enter \"([^\"]*)\" as username and \"([^\"]*)\" as password$")
public void i_enter_as_username_and_as_password(String arg1, String arg2) throws Exception {
  
	driver.findElement(By.name("username")).sendKeys(arg1);
	driver.findElement(By.name("pwd")).sendKeys(arg2);	
   
}

@When("^click on Login button$")
public void click_on_Login_button() throws Exception {
    
	driver.findElement(By.id("loginButton")).click();
}

@Then("^User should login and logoutlinks should be displayed$")
public void user_should_login_and_logoutlinks_should_be_displayed() throws Exception {
    
	driver.findElement(By.className("logout")).click();
	driver.close();
   
}



}
