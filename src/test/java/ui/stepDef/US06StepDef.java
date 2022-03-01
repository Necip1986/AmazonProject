package ui.stepDef;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import ui.pages.CartPage;
import ui.pages.HomePage;
import ui.pages.ProductDetailPage;
import ui.pages.SearchPage;
import ui.utilities.Driver;
import ui.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class US06StepDef {

    HomePage homePage=new HomePage();
    SearchPage searchPage=new SearchPage();
    CartPage cartPage=new CartPage();
    ProductDetailPage productDetailPage=new ProductDetailPage();

    List<Integer>prices;

    @Then("select first three products and add them to basket")
    public void select_first_three_products_and_add_them_to_basket() {

        Actions actions=new Actions(Driver.getDriver());
        prices=new ArrayList<>();
        for(int i=0; i<=2; i++){
            prices.add(Integer.parseInt(searchPage.ProductPricesList.get(i).getText().replaceAll("\\D","")));
            searchPage.ProductPricesList.get(i).click();
            ReusableMethods.waitForClickablility(productDetailPage.addToChartButton,2);
            //ReusableMethods.clickWithJS(productDetailPage.addToChartButton);
            //ReusableMethods.waitFor(10);
            actions.moveToElement(productDetailPage.addToChartButton).doubleClick().perform();
            //productDetailPage.addToChartButton.click();
            ReusableMethods.waitFor(2);
            Driver.getDriver().navigate().back();
            Driver.getDriver().navigate().back();
            /*homePage.searchBox.click();
            homePage.searchBox.sendKeys("lenovo");
            homePage.searchButton.click();*/
            ReusableMethods.waitFor(1);

        }

    }
    @Then("navigate to basket page")
    public void navigate_to_basket_page() {
        cartPage.navigateToCartPage.click();

    }
    @Then("verify the subtotal is correct")
    public void verify_the_subtotal_is_correct() {

        int selectedProductTotal=0;
        for(Integer w:prices){
            selectedProductTotal+=w;
        }
        System.out.println(selectedProductTotal);
        int cartSubTotal=Integer.parseInt(cartPage.subTotal.getText().replaceAll("\\D",""));
        System.out.println(cartSubTotal);

        Assert.assertEquals(selectedProductTotal,cartSubTotal);


    }


}
