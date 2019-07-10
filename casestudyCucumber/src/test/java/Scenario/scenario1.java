package Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class scenario1 {
	WebDriver driver;
	@Given("url for TestMe app is {string}")
	public void url_for_TestMe_app_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String path="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium\\jar\\chromedriver_win32 (1)//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
	   driver=new ChromeDriver();
	   driver.get(string);
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("user enters {string} as Firstname")
	public void user_enters_as_Firstname(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("firstName")).sendKeys(string);
	}

	@When("user enters {string} as Lastname")
	public void user_enters_as_Lastname(String string) {
	   
		 driver.findElement(By.name("lastName")).sendKeys(string);
	}

	@When("user enters {string} as Password")
	public void user_enters_as_Password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	    
	}

	@When("user enters {string} as ConfirmPassword")
	public void user_enters_as_ConfirmPassword(String string) {
		driver.findElement(By.name("confirmPassword")).sendKeys(string);
	}

	@When("user clicks on {string} in gender")
	public void user_clicks_on_in_gender(String string) {
		 driver.findElement(By.xpath("//input[@id='gender'][2]")).click();
	}

	@When("user enters {string} as Email")
	public void user_enters_as_Email(String string) {
		driver.findElement(By.name("emailAddress")).sendKeys(string);
	}

	@When("user enters {string} as MobileNumber")
	public void user_enters_as_MobileNumber(String string) {
		driver.findElement(By.name("mobileNumber")).sendKeys(string);
	}

	@When("user enters {string} as DOB")
	public void user_enters_as_DOB(String string) {
		driver.findElement(By.name("dob")).sendKeys(string);
	}

	@When("user enters {string} as address")
	public void user_enters_as_address(String string) {
		driver.findElement(By.name("address")).sendKeys(string);
	}

	@When("user selects {string} as Securityquestion")
	public void user_selects_as_Securityquestion(String string) {
		Select sel=new Select(driver.findElement(By.name("securityQuestion")));
		   sel.selectByIndex(1);
	}

	@When("user enters {string} as Answer")
	public void user_enters_as_Answer(String string) {
		 driver.findElement(By.name("answer")).sendKeys(string);
		   driver.findElement(By.name("Submit")).click();
	}

	@Then("user registered successfully")
	public void user_registered_successfully() {
		Assert.assertEquals("Login", driver.getTitle());
	}


}
