package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IphoneSteps {
    private static final By IphoneButton = By.xpath("//*[@id='ac-globalnav']/div/ul[2]/li[5]/a");
    private static final By ShopIphoneButton = By.xpath("//*[@id='chapternav']/div/ul/li[12]/a/span");



    WebDriver driver = Hooks.driver;
    private static final Logger LOGGER = LogManager.getLogger(IphoneSteps.class);


    @Given("^a user browses to the apple home page$")
    public void browseToAppleHomepage() {
        ActOn.browser(driver).openBrowser("https://www.apple.com/");
        LOGGER.info("User is at Apple.com home page");
    }
    @Then("^user clicks on iphone option in the menu bar$")
    public void clickOnIphoneOption() {
        ActOn.element(driver, IphoneButton).click();
        LOGGER.info("User clicks on Iphone option in menu bar");
    }
    @And("^user clicks on shop iphone option$")
    public void clickOnShopIphoneOption() {
        ActOn.element(driver, ShopIphoneButton).click();
        LOGGER.info("User clicks on shop iphone option to view all available iphone to buy");
    }
    @Then("^user is able to view all available iphone to buy$")
    public void navigateToIphonePage() {
        LOGGER.info("User is able to view all available iphone models to buy");

    }

}
