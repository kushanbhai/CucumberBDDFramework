package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_already_login_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kushan\\Desktop\\Selenium Setup\\SeleniumDrivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/login.cfm");
	}

	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM(){
		String title = driver.getTitle();
		System.out.println("The title is: " + title);
		Assert.assertEquals("CRMPRO Log In Screen", title);
	}

	
	@Then("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_password(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	
	
	@Then("^user is on home page$")
	public void user_on_home_page() {
		String title = driver.getTitle();
		System.out.println("homepage title is: " + title);
		Assert.assertEquals("CRMPRO", title);
	}

	@Then("^user moves to new contacts page$")
	public void user_moves_to_new_contacts_page() throws InterruptedException {
		driver.switchTo().frame("mainpanel");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(@title,'Contacts')]"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='New Contact']")).click();
	}

	@Then("^user enters contactdetails \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_enters_contact_details(String firstname, String lastname, String position) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		Thread.sleep(3000);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		Thread.sleep(3000);
		driver.findElement(By.id("company_position")).sendKeys(position);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Load From Company']//following::input[@class='button' and @value='Save']")).click();
		Thread.sleep(3000);
	}

	
	@Then("^close the browser$")
	public void user_close_browser() {
		driver.quit();
	}

}
