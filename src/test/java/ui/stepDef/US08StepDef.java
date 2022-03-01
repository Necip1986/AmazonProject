package ui.stepDef;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ui.pages.HomePage;
import ui.pages.YourListsPage;
import ui.utilities.Driver;
import ui.utilities.ReusableMethods;

public class US08StepDef {

    HomePage homePage=new HomePage();
    YourListsPage yourListsPage=new YourListsPage();
    Actions actions=new Actions(Driver.getDriver());

    @Then("select Create a List from Account & Lists menu")
    public void select_create_a_list_from_account_lists_menu() {
        ReusableMethods.waitFor(1);
        actions.moveToElement(yourListsPage.navigateToCreateShoppingLists).pause(1).perform();
        homePage.createListLink.click();

    }
    @Then("click create list button")
    public void click_create_list_button() {
        ReusableMethods.waitFor(2);
        actions.moveToElement(yourListsPage.navigateCreateShoppingListSection).doubleClick().perform();
        //yourListsPage.navigateCreateShoppingListSection.click();

    }
    @Then("enter {string} to the List name box")
    public void enter_to_the_list_name_box(String listName) {
        yourListsPage.listNameBox.clear();
        yourListsPage.listNameBox.sendKeys(listName);

    }
    @Then("click Create List button at Your List Page")
    public void click_create_list_button_at_your_list_page() {
        ReusableMethods.waitFor(1);
        ReusableMethods.waitForClickablility(yourListsPage.createListSectionCreateListButton,5);
        actions.moveToElement(yourListsPage.createListSectionCreateListButton).pause(1).doubleClick().perform();

        ReusableMethods.waitFor(10);
    }
    @Then("verify that {string} is created")
    public void verify_that_is_created(String expectedListName) {
        String actualListName=yourListsPage.createdShoppingListName.getText();
        Assert.assertEquals(expectedListName,actualListName);

    }
    @Then("select {string} from Account & Lists menu")
    public void select_from_account_lists_menu(String createdShoppingListName) {
        actions.moveToElement(homePage.HelloAccountMenu).perform();
        WebElement grocery=Driver.getDriver().findElement(By.xpath("(//span[text()='"+createdShoppingListName+"'])[1]"));
        actions.moveToElement(grocery).doubleClick().perform();
        //Driver.getDriver().findElement(By.xpath("(//span[text()='"+createdShoppingListName+"'])[1]")).click();

    }
    @Then("click Manage List from More menu")
    public void click_manage_list_from_more_menu() {
        yourListsPage.moreMenu.click();
        yourListsPage.manageListLink.click();

    }
    @Then("click Delete list button")
    public void click_delete_list_button() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.moveToElement(yourListsPage.deleteListButton).doubleClick().perform();
        ReusableMethods.waitFor(1);
        yourListsPage.confirmDelete.click();


    }
    @Then("verify the {string} is deleted")
    public void verify_the_is_deleted(String string) {

        ReusableMethods.waitFor(2);
        try{
            yourListsPage.createdShoppingListName.isDisplayed();
            Assert.assertTrue(false);

        }catch(Exception e){
            Assert.assertTrue(true);
        }

    }


}
