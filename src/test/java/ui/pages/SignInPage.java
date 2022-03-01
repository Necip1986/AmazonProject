package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.security.cert.X509Certificate;

public class SignInPage {

    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "ap_email")
    public WebElement emailBox;

    @FindBy (id = "continue")
    public WebElement continueButton;

    @FindBy (id = "ap_password")
    public WebElement passwordBox;

    @FindBy (id = "signInSubmit")
    public WebElement signInButton;

    @FindBy (xpath = "//span[text()='Sign Out']")
    public WebElement signOut;

    @FindBy (xpath = "//h4[text()='There was a problem']")
    public WebElement signInFailureMessage;

}
