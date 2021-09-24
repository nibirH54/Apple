package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IpadSteps {
    private static final By ClickIpad = By.xpath("(//li[contains(@class,'ac-gn-item ac-gn-item-menu')]//a)[3]");
    private static final By ClickShopIpad = By.xpath("//a[@href='/us/shop/goto/buy_ipad']//figure[1]");


    WebDriver driver = Hooks.driver;
    private static final Logger LOGGER = LogManager.getLogger(IpadSteps.class);



    @Given("^a user goes to the apple home page$")
    public void userGoesToAppleHomePage() {
        ActOn.browser(driver).openBrowser("https://www.apple.com/");
        LOGGER.info("User is at Apple.com home page");

    }

    @Then("^user clicks on ipad option in the menu bar$")
    public void clickOnIpadOption() {
        ActOn.element(driver, ClickIpad).click();
        LOGGER.info("User clicks on ipad option in menu bar");

    }

    @And("^user clicks on shop ipad option$")
    public void clickOnShopIpad() {
        ActOn.element(driver, ClickShopIpad).click();
        LOGGER.info("User clicks on shop ipad option to navigate to ipad page");

    }

    @Then("^user is able to view all available ipad to buy$")
    public void navigateToIpadPage() {
        LOGGER.info("User navigates to ipad page to view all available ipad models to buy");

    }
}
