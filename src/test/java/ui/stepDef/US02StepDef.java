package ui.stepDef;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import ui.pages.HomePage;
import ui.pages.SignInPage;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;
import ui.utilities.ReusableMethods;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class US02StepDef {

    HomePage homePage=new HomePage();
    SignInPage signInPage=new SignInPage();
    Actions actions=new Actions(Driver.getDriver());
    Logger log = (Logger) LogManager.getLogger(US02StepDef.class);

    @Then("navigate to sign in page")
    public void navigate_to_sign_in_page() {

        actions.moveToElement(homePage.HelloAccountMenu).doubleClick().perform();

        //actions.moveToElement(homePage.HelloAccountMenu).perform();

        ReusableMethods.waitFor(1);
        log.info("navigated to sign_in page");
        //homePage.navigateToSignInPage.click();

    }
    @Then("enter valid email address to the email box")
    public void enter_valid_email_address_to_the_email_box() {
        signInPage.emailBox.sendKeys(ConfigReader.getProperty("valid_email"));
        log.info("enetered valid email");

    }

    @Then("click continue button")
    public void clickContinueButton() {
        signInPage.continueButton.click();
        log.info("clicked continue button");

    }

    @Then("enter valid password to the password box")
    public void enterValidPasswordToThePasswordBox() {
        signInPage.passwordBox.sendKeys(ConfigReader.getProperty("valid_password"));
        log.info("entered valid password");

    }

    @Then("click sign in button")
    public void clickSignInButton() {
        signInPage.signInButton.click();
        ReusableMethods.waitFor(10);
        log.info("clicked sign_in button");
    }

    @Then("verify sign in is successful")
    public void verifySignInIsSuccessful() {
        actions.moveToElement(homePage.HelloAccountMenu).perform();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(signInPage.signOut.isDisplayed());
        log.info("verified sign_in successful");
    }

    @Then("enter invalid email address to the email box")
    public void enterInvalidEmailAddressToTheEmailBox() {
        signInPage.emailBox.sendKeys(ConfigReader.getProperty("invalid_email"));
    }

    @Then("enter invalid password to the password box")
    public void enterInvalidPasswordToThePasswordBox() {
        signInPage.passwordBox.sendKeys(ConfigReader.getProperty("invalid_password"));
    }

    @Then("verify sign in is not successful")
    public void verifySignInIsNotSuccessful() {
        Assert.assertTrue(signInPage.signInFailureMessage.isDisplayed());
    }
}
