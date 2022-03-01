package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;


public class CartPage {

    public CartPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "nav-cart-count-container")
    public WebElement navigateToCartPage;

    @FindBy (id = "sc-subtotal-amount-buybox")
    public WebElement subTotal;
}
