package ui.pages;

import org.apache.commons.compress.archivers.zip.ZipEightByteInteger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

public class ProductDetailPage {

    public ProductDetailPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "add-to-cart-button")
    public WebElement addToChartButton;

    @FindBy (id = "add-to-wishlist-button-submit")
    public WebElement addToListMenu;

    @FindBy (xpath = "//span[@class='a-size-small atwl-hz-dd-list-name a-nowrap']")
    public WebElement createdListAtAddToListMenu;

    @FindBy (xpath = "//span[text()='View Your List']")
    public WebElement viewYourListButton;

    @FindBy (xpath = "//h2[@class='a-size-base']")
    public WebElement productAtList;



    @FindBy (xpath = "//div[text()='Deleted']")
    public WebElement deletedMessage;



}
