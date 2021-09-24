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

public class AppleStoreSteps {

    private static final By StoreButton = By.xpath("//li[contains(@class,'ac-gn-item ac-gn-item-menu')]//a");
    private static final By ClickMacLink = By.xpath("//a[@href='/shop/buy-mac']");
    WebDriver driver = Hooks.driver;
    private static final Logger LOGGER = LogManager.getLogger(AppleStoreSteps.class);


    @Given("^a user is at apple page$")
    public void userLandsAtApplePage() {
        ActOn.browser(driver).openBrowser("https://www.apple.com/");
        LOGGER.info("User is on Apple.com home page");

    }

    @When("^user clicks on store option in menu$")
    public void clickOnStoreOption() {
        ActOn.element(driver, StoreButton).click();
        LOGGER.info("User clicks on store option in menu");

    }
    @Then("^user lands on retail page$")
    public void landsOnRetailPage(){
        LOGGER.info("User is at the retail page");

    }

    @And("^user clicks on Mac option to navigate to the mac page$")
    public void clickOnFindNewDeals() {
        ActOn.element(driver, ClickMacLink).click();
        LOGGER.info("User clicks on Mac option to navigate to Mac page");

    }


    }

