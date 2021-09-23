package step_definitions;

import command_providers.ActOn;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_objects.NavigationBar;
import page_objects.SignIn;
import java.util.List;
import java.util.Map;


public class LoginSteps {

    WebDriver driver = Hooks.driver;
    private static final Logger LOGGER = LogManager.getLogger(LoginSteps.class);

    @Given("^a user is on the apple home page$")
    public void navigateToAppleHomePage() {
        ActOn.browser(driver).openBrowser("https://www.apple.com/");
        LOGGER.info("User is on apple home page");
    }

    @And("^user navigate to apple sign in page$")
    public void navigateToSignInPage(){
        new NavigationBar(driver)
                .clickOnBagsLink()
                .clickOnSignInLink();
        LOGGER.info("User navigates to apple sign in page");
    }

    @When("^user clicks on sign in upon entering the data$")
    public void clicksSignInButtonUponEnteringTheData(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps(String.class, String.class);
        for (Map<String, String> cells : dataTable) {
            new SignIn(driver)
                    .typeUserId(cells.get("userid"))
                    .enterPassword(cells.get("password"));
            LOGGER.info("User clicks on sign in after entering userid and password");
        }
    }

    @Then("^user logs into apple account$")
    public void navigateToAppleAccount() {
        new SignIn(driver)
                .clickOnSignInButton();
        LOGGER.info("User logs into apple account");

    }

    @Then("^user is failed to login$")
    public void validateUserIsFailedToLogin() {
        new SignIn(driver)
                .validateUserFailedToLogin();
        LOGGER.info("User is failed to log in for using invalid credentials");

    }
}
