package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy (id = "nav-search-submit-button")
    public WebElement searchButton;

    @FindBy (xpath = "//span[@class='hm-icon-label']")
    public WebElement allMenu;

    @FindBy (xpath = "//a[@id='nav-link-accountList']")
    public WebElement HelloAccountMenu;

    @FindBy (xpath = "//span[text()='No, thanks']")
    public WebElement helloExtraSection;

    @FindBy (xpath = "//span[text()='Sign in']")
    public WebElement navigateToSignInPage;

    @FindBy (xpath = "//span[text()='Create a List']")
    public WebElement createListLink;

}
