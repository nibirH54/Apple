package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Iphone13Steps {
    private static final By ClickBagsLink = By.xpath("//*[@id='ac-gn-bag']");
    private static final By ClickSignInLink = By.xpath("//a[@data-analytics-title='signIn']");
    private static final By TypeUserId = By.id("signIn.customerLogin.appleId");
    private static final By TypePassword = By.id("signIn.customerLogin.password");
    private static final By ClickSignInButton = By.xpath("//*[@id='signin-submit-button']");
    private static final By ClickOnCurrentPage = By.xpath("//a[@href='/iphone-13-pro/']");

    WebDriver driver = Hooks.driver;
    private static final Logger LOGGER = LogManager.getLogger(Iphone13Steps.class);


    @Given("^a user enters on apple website$")
    public void userEntersAppleWebsite(){
        ActOn.browser(driver).openBrowser("https://www.apple.com/");
        LOGGER.info("User lands on the Apple home page");
    }

    @Then("^user clicks on the bags link to sign in$")
    public void clicksOnBagsLink() {
        ActOn.element(driver, ClickBagsLink).click();
        ActOn.element(driver, ClickSignInLink).click();
        LOGGER.info("User clicks on bags link then sign in link to navigate to sign in page");
    }
    @When("^user clicks on sign in upon entering the valid credentials$")
    public void clickOnSignIn() {
        ActOn.element(driver, TypeUserId).setValue("Nibirh54@gmail.com");
        ActOn.element(driver, TypePassword).setValue("Appletest12345");
        ActOn.element(driver, ClickSignInButton).click();
        LOGGER.info("User clicks on sign in button upon entering the valid credentials");
    }

    @Then("^user clicks on the page they are in$")
    public void clickOnCurrentPage() {
        ActOn.element(driver, ClickOnCurrentPage).click();
        LOGGER.info("User clicks on current page to land on new iphone 13 feature page");
    }
    @And("^user lands on new iphone 13 feature page$")
    public void clickOnSignOut(){
        LOGGER.info("User is on the new iphone 13 feature page");

    }


}
