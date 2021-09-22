package step_definitions;

import command_providers.ActOn;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_objects.NavigationBar;
import page_objects.SignIn;
import java.util.List;
import java.util.Map;


public class LoginSteps {

    WebDriver driver = Hooks.driver;

    @Given("^a user is on the apple home page$")
    public void navigateToAppleHomePage() {
        ActOn.browser(driver).openBrowser("https://www.apple.com/");
    }

    @And("^user navigate to apple sign in page$")
    public void navigateToSignInPage(){
        new NavigationBar(driver)
                .clickOnBagsLink()
                .clickOnSignInLink();
    }

    @When("^user clicks on sign in upon entering the data$")
    public void clicksSignInButtonUponEnteringTheData(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps(String.class, String.class);
        for (Map<String, String> cells : dataTable) {
            new SignIn(driver)
                    .typeUserId(cells.get("userid"))
                    .enterPassword(cells.get("password"));

        }


    }

        @Then("^user logs into apple account$")
    public void navigateToAppleAccount() {
        new SignIn(driver)
                .clickOnSignInButton();

    }

    @Then("^user is failed to login$")
    public void validateUserIsFailedToLogin() {
        new SignIn(driver)
                .validateUserFailedToLogin();


    }
}
