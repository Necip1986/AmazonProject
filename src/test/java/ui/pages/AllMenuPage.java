package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.util.List;

public class AllMenuPage {

    public AllMenuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='hm-icon-label']")
    public WebElement navigateAllMenu;

    @FindBy (xpath = "//div[text()='Smart Home']")
    public WebElement navigateSmartHome;

    @FindBy (xpath = "//ul[@class='hmenu hmenu-visible hmenu-translateX']//li//a[@class='hmenu-item']")
    public List<WebElement> smartHomeSubCategory;
}
