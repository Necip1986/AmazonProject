package ui.stepDef;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.pages.SearchPage;
import ui.utilities.Driver;

public class US04StepDef {

    SearchPage searchPage=new SearchPage();

    @Then("verify that all the products listed includes {string}")
    public void verify_that_all_the_products_listed_includes(String searchedProduct) {
        int count=0;
        for(WebElement w: searchPage.products ){
            if(w.getText().contains(searchedProduct)){
                count++;
            }else{
                System.out.println(w.getText());
            }
        }
        System.out.println("products Include Lenovo :"+count);
        System.out.println("searched product list: "+searchPage.productList.size());
        Assert.assertTrue(count==searchPage.productList.size());

    }


}
