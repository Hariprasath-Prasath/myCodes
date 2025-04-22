package org.stepdef;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;
	@Given("Login Application")
	public void loginApplication() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	    
	}
	@When("User Enter Valid Login And Password")
	public void userEnterValidLoginAndPassword() {
		driver.findElement(By.id("username")).sendKeys("OmrGreens");
		driver.findElement(By.id("password")).sendKeys("1YU0EO");
	    
	}
	@When("User Click On Login Button")
	public void userClickOnLoginButton() {
		driver.findElement(By.id("login")).click();
	    
	}
	@Then("User Navigate To Next Page")
	public void userNavigateToNextPage() {
		String title = driver.getTitle();
		boolean contains = title.contains("Search");
	    System.out.println(contains);
	    driver.quit();
	}

	@When("User Enter Invalid Login UserName and Password")
	public void userEnterInvalidLoginUserNameAndPassword() {
		driver.findElement(By.id("username")).sendKeys("Hi");
		driver.findElement(By.id("password")).sendKeys("Hi");
	}
	@Then("Invalid Login Error Message Should Display")
	public void invalidLoginErrorMessageShouldDisplay() {
	    WebElement invalid = driver.findElement(By.xpath("//b[contains(text(),'Invalid Login')]"));
	    boolean result = invalid.getText().contains("Invalid");
	    System.out.println("Verify Error Message:"+ result);
	    driver.quit();

	}
}
