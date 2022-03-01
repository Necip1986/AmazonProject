package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.utilities.Driver;

import java.util.List;

public class BottomLinksPages {

    public BottomLinksPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//tbody//td[3]")
    public List<WebElement> linkList;

    @FindBy (xpath = "//tbody//td[3]//span[@class='navFooterDescText']")
    public List<WebElement>linksExtraInformation;
}
