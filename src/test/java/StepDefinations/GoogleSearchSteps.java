package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	
	WebDriver driver = null;

	
	@Given("browser  is open")
	public void browser_is_open() {
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@And("user is on google home page")
	public void user_is_on_google_home_page() {
	}

	@When("user enters a text in searchbox")
	public void user_enters_a_text_in_searchbox() {

	}

	@And("press enter")
	public void press_enter() {

	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {

	}


}
