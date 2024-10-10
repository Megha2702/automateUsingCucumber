package stepDefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	ChromeDriver driver;
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
	   driver.get("https://www.facebook.com");
	    
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	    driver.findElement(By.name("email")).sendKeys("abcxyz@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("123password");
	}

	@And("click login button")
	public void click_login_button() {
	    driver.findElement(By.name("login")).submit();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	   Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com","valid login");
	}
}
