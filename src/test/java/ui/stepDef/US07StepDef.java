package ui.stepDef;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import ui.pages.BottomLinksPages;
import ui.utilities.Driver;
import ui.utilities.ReusableMethods;

import java.util.Arrays;

public class US07StepDef {

    BottomLinksPages bottomLinks=new BottomLinksPages();

    @Then("scroll down to the bottom of the home page")
    public void scroll_down_to_the_bottom_of_the_home_page() {

        Actions actions=new Actions(Driver.getDriver());
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.END).perform();

    }
    @Then("click the links in the second column and verifies page name")
    public void click_the_links_in_the_second_column_and_verifies_page_name() {

        String linkName="";
        int count=0;
        for(int i=0; i<bottomLinks.linkList.size(); i++){
            linkName=bottomLinks.linkList.get(i).getText().replace("Amazon ","").
                    replace(bottomLinks.linksExtraInformation.get(i).getText(),"").toLowerCase().trim();
            String []arrLinkname=linkName.split(" ");
            System.out.println(arrLinkname[0]);

            bottomLinks.linkList.get(i).click();
            System.out.println(Driver.getDriver().getTitle().toLowerCase());
            System.out.println(Driver.getDriver().getCurrentUrl().toLowerCase());

            if(Driver.getDriver().getTitle().toLowerCase().contains(arrLinkname[0]) ){//Driver.getDriver().getCurrentUrl().toLowerCase().contains(arrLinkname[0]
                count++;
                System.out.println(arrLinkname[0]);
            }
            Driver.getDriver().navigate().back();
            ReusableMethods.waitFor(1);

        }

        System.out.println("count: "+ count);

        Assert.assertTrue(count==bottomLinks.linkList.size());

    }

}
