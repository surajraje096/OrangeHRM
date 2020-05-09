package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\JARs\\\\chromeSelinium\\\\chrome80.387\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.close();
		System.out.println("hello");
	   
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
	    
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
	   
	}

	@Then("^user clicks on login page$")
	public void user_clicks_on_login_page() {
	 
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
	  
	}

	
	
	

}
