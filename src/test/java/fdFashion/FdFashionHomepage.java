package fdFashion;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
public class FdFashionHomepage  {

	public static void main(String [] args) throws Throwable {

		//System.setProperty("webdriver.driver.gecko","C:\\Users\\Mosarrof Hossain\\Utilities\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Mosarrof Hossain\\Utilities\\MicrosoftWebDriver.exe");

		
		
		
		
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://fdfashionbd.com/");
	}
	@Given("^I want to go to the home page of the fd fashion$")
	public void i_want_to_go_to_the_home_page_of_the_fd_fashion() throws Throwable {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://fdfashionbd.com/");
		//System.out.println("The is passed ");
	}

	@When("^I open the home page of the fd fashion home page$")
	public void i_open_the_home_page_of_the_fd_fashion_home_page() throws Throwable {
		System.out.println("I see the Hompe loaded successfully ");
	}

	@Then("^I can see the home page$")
	public void i_can_see_the_home_page() throws Throwable {
		WebDriver driver = new FirefoxDriver();
		if(driver.getPageSource().contains("OUR CLIENTS"))
		{

			System.out.println("The home page of the fd fashion is loading successfully");

		}
		else {
			System.out.println("It is failed ");
			Assert.assertEquals(driver.getPageSource().contains("OUR CLIENTS"), true);		

		}
	}
}
