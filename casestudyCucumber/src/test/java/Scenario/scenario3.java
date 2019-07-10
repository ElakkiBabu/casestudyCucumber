package Scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class scenario3 {
	WebDriver driver;
	//Actions act=new Actions(driver);
	@Given("Alex enters url as {string}")
	public void alex_enters_url_as(String string) {
		String path="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium\\jar\\chromedriver_win32 (1)//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
	   driver=new ChromeDriver();
	   driver.get(string);
	}

	@When("Alex enters username in userfield as {string}")
	public void alex_enters_username_in_userfield_as(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("Alex enters Password in password field as {string}")
	public void alex_enters_Password_in_password_field_as(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("Alex clicks on Login button")
	public void alex_clicks_on_Login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@When("Alex enters {string} in search field")
	public void alex_enters_in_search_field(String string) {
		//Actions act=new Actions(driver);
		driver.findElement(By.name("products")).sendKeys(string);
		  
	}

	@When("Alex clicks on find details button")
	public void alex_clicks_on_find_details_button() {
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@When("Alex clicks on addcart button")
	public void alex_clicks_on_addcart_button() {
		driver.findElement(By.xpath("//a[contains(text(),' Add to cart')]")).click();
	}

	@When("Alex clicks on cart")
	public void alex_clicks_on_cart() {
		driver.findElement(By.xpath("//a[contains(@href,'displayCart.htm')]")).click();
		   
	}

	@When("Alex clicks on checkout button")
	public void alex_clicks_on_checkout_button() {
		driver.findElement(By.xpath("//a[contains(@href,'checkout.htm')]")).click();
		   //dir.findElement(By.name("ShippingAdd")).sendKeys("Bangalore");
		   
	}

	@When("Alex clicks on proceed to pay button")
	public void alex_clicks_on_proceed_to_pay_button() {
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	}

	@When("Alex enters into payment gateway clicks on Andhra bank")
	public void alex_enters_into_payment_gateway_clicks_on_Andhra_bank() {
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
	   driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
	}

	@When("Alex enters username as {string}")
	public void alex_enters_username_as(String string) {
	    driver.findElement(By.name("username")).sendKeys(string);
	}

	@When("Alex enters password as {string}")
	public void alex_enters_password_as(String string) {
	   driver.findElement(By.name("password")).sendKeys(string);
	}
	
	@When("Alex clicks on paymentLogin button")
	public void alex_clicks_on_paymentLogin_button() {
		driver.findElement(By.xpath("//div[3]/input")).click();
	}

	@When("Alex enters Transaction password as {string}")
	public void alex_enters_Transaction_password_as(String string) {
	    driver.findElement(By.name("transpwd")).sendKeys(string);
	}

	@When("Alex clicks on paynow button")
	public void alex_clicks_on_paynow_button() {
		driver.findElement(By.xpath("//div[2]/input")).click();
	}

	@Then("Alex enters into order details page")
	public void alex_enters_into_order_details_page() {
	    Assert.assertEquals("Order Details", driver.getTitle());
	}


}