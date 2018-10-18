package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTests {
	
	WebDriver driver;
	
	@Given("^Launch browser and navigate to application URL$")
	public void launch_browser_and_navigate_to_application_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--start-maximized");
		
		System.setProperty("webdriver.chrome.driver", "/Users/sandeepkoar/eclipse-workspace/myBDD_Suite/Drivers/chromedriver");
		driver = new ChromeDriver(options);
		driver.get("http://newtours.demoaut.com/");
	    throw new PendingException("Error in Given Block");
	}

	@When("^I enter valid credentials$")
	public void i_enter_valid_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys("ranju.koar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Orange@123");
		driver.findElement(By.name("login")).click();
		
	    throw new PendingException("Error in When block");
	}

	@Then("^I should be able to login successfully$")
	public void i_should_be_able_to_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.findElement(By.linkText("Home")).getText(),"Home");
	    throw new PendingException("error in Then block");
	}

	@Then("^Verify I am in Home page$")
	public void verify_I_am_in_Home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    throw new PendingException("Error in 2nd Then Block");
	}
}
