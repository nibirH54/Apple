package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);
    private final By BagsLink = By.xpath("//*[@id='ac-gn-bag']");
    private final By SignInLink = By.xpath("//a[@data-analytics-title='signIn']");

    public WebDriver driver;

    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }

    //Click on to Bags Link
    public NavigationBar clickOnBagsLink(){
        LOGGER.debug("Click on to Bags Link In the Navigation Bar");
        ActOn.element(driver,BagsLink).click();
        return this;
    }
    //Click on the Sign-in Link
    public NavigationBar clickOnSignInLink(){
        LOGGER.debug("Click on Sign In Link to navigate to the sign in page");
        ActOn.element(driver,SignInLink).click();
        return this;
    }




}
