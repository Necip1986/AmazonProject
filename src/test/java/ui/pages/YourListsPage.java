package ui.pages;

import io.cucumber.java.bs.I;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.security.cert.X509Certificate;

public class YourListsPage {

    public YourListsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Account & Lists']")
    public WebElement navigateToCreateShoppingLists;

    @FindBy (id = "createList-announce")
    public WebElement navigateCreateShoppingListSection;

    @FindBy (id = "list-name")
    public WebElement listNameBox;

    @FindBy (xpath = "//*[text()='Create List']")
    public WebElement createListSectionCreateListButton;

    @FindBy (id = "profile-list-name")
    public WebElement createdShoppingListName;

    @FindBy (id = "overflow-menu-popover-trigger")
    public WebElement moreMenu;

    @FindBy (id = "editYourList")
    public WebElement manageListLink;

    @FindBy (xpath = "//span[text()='Delete list']")
    public WebElement deleteListButton;

    @FindBy (xpath = "//input[@name='submit.deleteItem']")
    public WebElement deleteFromList;

    @FindBy (xpath = "//div[text()='Deleted']")
    public WebElement confirmDelete;

    @FindBy (xpath = "//h2[@class='a-size-base']")
    public WebElement productAtList;





}
