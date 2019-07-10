package Scenario;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenario4 {
	WebDriver driver;
	@Given("Alex has registered into testme app")
	public void alex_has_registered_into_testme_app() {
		String path="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium\\jar\\chromedriver_win32 (1)//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
	   driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	   driver.findElement(By.name("userName")).sendKeys("lalitha");
	   driver.findElement(By.name("password")).sendKeys("password123");
	   driver.findElement(By.name("Login")).click();
	}

	@When("Alex search a particular product like headphones")
	public void alex_search_a_particular_product_like_headphones() {
		driver.findElement(By.name("products")).sendKeys("headphone");
	}

	@When("try to procced to payment without adding item in cart")
	public void try_to_procced_to_payment_without_adding_item_in_cart() {
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	@Then("Testme app doesn't display the cart icon")
	public void testme_app_doesn_t_display_the_cart_icon() {
		try {
	 WebElement cart=driver.findElement(By.xpath("//a[contains(text(),'Cart')]"));
	 System.out.println("cart status is "+cart.isDisplayed());
		}
		catch (Exception exp){
			System.out.println(exp.getMessage());
			
		}
	}


}

