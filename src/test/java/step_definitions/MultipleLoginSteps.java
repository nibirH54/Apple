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

public class MultipleLoginSteps {

    private static final By ClickBagsLink = By.xpath("//*[@id='ac-gn-bag']");
    private static final By ClickSignInLink = By.xpath("//a[@data-analytics-title='signIn']");
    private static final By TypeUserId = By.id("signIn.customerLogin.appleId");
    private static final By TypePassword = By.id("signIn.customerLogin.password");
    private static final By ClickSignInButton = By.xpath("//*[@id='signin-submit-button']");

    WebDriver driver = Hooks.driver;
    private static final Logger LOGGER = LogManager.getLogger(MultipleLoginSteps.class);


    @Given("^a user browses to the apple page$")
    public void userGoesToToAppleHomePage() {
        ActOn.browser(driver).openBrowser("https://www.apple.com/");
        LOGGER.info("User is on the Apple Home page ");
    }

    @And("^user lands to apple sign in page$")
    public void landToSignInPage(){
        ActOn.element(driver, ClickBagsLink).click();
        ActOn.element(driver, ClickSignInLink).click();
        LOGGER.info("User navigates to Apple sign in page");
    }

    @When("^user clicks on sign in upon entering userid \"(.+?)\" and password \"(.+?)\"$")
    public void clickSignIn(String userid, String password) {
        ActOn.element(driver, TypeUserId).setValue(userid);
        ActOn.element(driver, TypePassword).setValue(password);
        ActOn.element(driver, ClickSignInButton).click();
        LOGGER.info("User clicks on sign in upon entering user name and password");
    }
    @Then("^user signs in to the apple account$")
    public void loginToAppleAccount() {
        LOGGER.info("User signs in to apple account");
    }


}

