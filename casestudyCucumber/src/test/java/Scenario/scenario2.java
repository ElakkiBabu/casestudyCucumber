package Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class scenario2 {
	WebDriver driver;
	@Given("url is given as {string}")
	public void url_is_given_as(String string) {
		String path="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium\\jar\\chromedriver_win32 (1)//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
	   driver=new ChromeDriver();
	   driver.get(string);
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String string) {
		 driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.name("Login")).click();
		   
	}

	@Then("user is in homepage")
	public void user_is_in_homepage() {
	    Assert.assertEquals("Home", driver.getTitle());
	}


}

