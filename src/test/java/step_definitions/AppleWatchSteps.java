package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppleWatchSteps {
    private static final By ClickWatch = By.xpath("//a[@class='ac-gn-link ac-gn-link-watch']");
    private static final By ClickShopWatch = By.xpath("//a[@href='/us/shop/goto/buy_watch']//figure[1]");

    WebDriver driver = Hooks.driver;
    private static final Logger LOGGER = LogManager.getLogger(AppleWatchSteps.class);


    @Given("^a user lands on the apple home page$")
    public void userLandsOnAppleHomePage() {
        ActOn.browser(driver).openBrowser("https://www.apple.com/");
        LOGGER.info("User is at Apple.com home page");
    }

    @Then("^user clicks on watch option in the menu bar$")
    public void clickOnWatch() {
        ActOn.element(driver, ClickWatch).click();
        LOGGER.info("User clicks on watch option");
    }

    @And("^user clicks on shop watch option$")
    public void clickOnShopWatch() {
        ActOn.element(driver, ClickShopWatch).click();
        LOGGER.info("User clicks on shop watch option to navigate to the apple watch page");

    }

    @Then("^user is able to view all available apple watch to buy$")
    public void navigateToAppleWatchPage() {
        LOGGER.info("User lands on the apple watch page to view all apple watch models available to buy");
    }

}
