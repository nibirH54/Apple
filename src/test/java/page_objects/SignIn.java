package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(SignIn.class);

    private final By AppleId = By.id("signIn.customerLogin.appleId");
    private final By Password = By.id("signIn.customerLogin.password");
    private final By SignInButton = By.xpath("//*[@id='signin-submit-button']");
    private final By InvalidPassword = By.xpath("//*[@id='signIn.customerLogin.password_error']");

    public SignIn(WebDriver driver) {super(driver);}

    public SignIn typeUserId(String value){
        LOGGER.debug("Enter user name is : " + value);
        ActOn.element(driver,AppleId).setValue(value);
        return this;
    }
    public SignIn enterPassword(String value){
        LOGGER.debug("Enter password is : " + value);
        ActOn.element(driver,Password).setValue(value);
        return this;
    }
    public SignIn clickOnSignInButton(){
        LOGGER.debug("Clicked on Sign in Button");
        ActOn.element(driver,SignInButton).click();
        return this;
    }
    public SignIn validateUserFailedToLogin() {
        LOGGER.debug("Invalid Password message shown");
        ActOn.element(driver, InvalidPassword);
        return this;
    }

}
