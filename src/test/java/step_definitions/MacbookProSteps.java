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

public class MacbookProSteps {
    private static final By SearchButton = By.id("ac-gn-link-search");
    private static final By TypeToSearch = By.id("ac-gn-searchform-input");
    private static final Logger LOGGER = LogManager.getLogger(MacbookProSteps.class);
    WebDriver driver = Hooks.driver;

    @Given("^a user navigate to the apple home page$")
    public void userNavigateToAppleHomePage() {
        ActOn.browser(driver).openBrowser("https://www.apple.com/");
        LOGGER.info("User navigates to the apple home page");
    }

    @Then("^user clicks on search button$")
    public void userClicksOnSearchButton() {
        ActOn.element(driver, SearchButton).click();
        LOGGER.info("User clicks search button");
    }

    @When("^user types a specific product to search$")
    public void userTypesToSearch() {
        ActOn.element(driver, TypeToSearch).setValue("Macbook Pro");
        LOGGER.info("User Types in search button");
    }
    @Then("^user lands on that products page$")
    public void userSearchResult(){
        LOGGER.info("User lands on the Specific page he searched for");


    }
}







