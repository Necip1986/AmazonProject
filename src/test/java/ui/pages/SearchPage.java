package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.util.List;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "a-autoid-0-announce")
    public WebElement sortByMenu;

    @FindBy (xpath = "//a[.='Price: Low to High']")
    public WebElement SortBylowToHigh;

    @FindBy (xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
    public List<WebElement> productList;

    @FindBy (xpath = "//div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 s-list-col-right']//div[@class='a-row a-size-base a-color-base']")
    public List<WebElement> prices;

    @FindBy (xpath = "//div[@class='sg-col sg-col-4-of-12 sg-col-8-of-16 sg-col-12-of-20 s-list-col-right']//span[@class='a-price']")
    public List<WebElement> ProductPricesList;

    //@FindBy (xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    //public List<WebElement>products;

    //@FindBy (xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    //public List<WebElement>products;

    @FindBy(xpath = "//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")
    public List<WebElement>products;


}
