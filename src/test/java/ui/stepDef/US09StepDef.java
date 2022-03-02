package ui.stepDef;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import ui.pages.ProductDetailPage;
import ui.pages.SearchPage;
import ui.pages.YourListsPage;
import ui.utilities.Driver;
import ui.utilities.ReusableMethods;

public class US09StepDef {

    SearchPage searchPage=new SearchPage();
    ProductDetailPage productDetailPage=new ProductDetailPage();
    YourListsPage yourListsPage=new YourListsPage();
    Actions actions=new Actions(Driver.getDriver());

    String addedProductName;
    @Then("select first product and add it to {string}")
    public void select_first_product_and_add_it_to(String createdShoppingList) {
        addedProductName=searchPage.products.get(0).getText();
        ReusableMethods.waitForClickablility(searchPage.products.get(0),10);
        searchPage.products.get(0).click();
        //ReusableMethods.waitFor();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForClickablility(productDetailPage.addToListMenu,10);
        productDetailPage.addToListMenu.click();
        //ReusableMethods.waitForClickablility(productDetailPage.createdListAtAddToListMenu,5);
        //productDetailPage.createdListAtAddToListMenu.click();
        ReusableMethods.waitForClickablility(productDetailPage.viewYourListButton,10);
        productDetailPage.viewYourListButton.click();

    }
    @Then("verify the {string} in {string}")
    public void verify_the_in(String addedProductToList, String createdShoppingList) {
        ReusableMethods.waitFor(1);
        String productAtList=yourListsPage.productAtList.getText();
        Assert.assertEquals(addedProductName,productAtList);

    }
    @Then("click Remove button for added product")
    public void click_remove_button_for_added_product() {
        ReusableMethods.waitFor(1);
        yourListsPage.deleteFromList.click();

    }

    @Then("verify the {string} removed from {string}")
    public void verifyTheRemovedFrom(String addedProductToList, String createdShoppingList) {
        Assert.assertTrue(yourListsPage.confirmDelete.isDisplayed());
    }
}
