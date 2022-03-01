package ui.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.pages.HomePage;
import ui.pages.SearchPage;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;
import ui.utilities.ReusableMethods;

import java.nio.file.WatchEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class US05StepDef {

    HomePage homePage=new HomePage();
    SearchPage searchPage=new SearchPage();

    @Given("go to AmazonUK url")
    public void goToAmazonUKUrl() {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonUk_url"));
        Driver.getDriver().findElement(By.id("sp-cc-accept")).click();
    }

    @Then("enter {string} into search box")
    public void enter_into_search_box(String searchedItem) {
        homePage.searchBox.sendKeys(searchedItem);

    }

    @Then("click the search button")
    public void click_the_search_button() {
        homePage.searchButton.click();

    }

    @Then("click the Sort By button")
    public void click_the_sort_by_button() {
        searchPage.sortByMenu.click();
    }

    @And("Select Low to High")
    public void selectLowToHigh() {
        searchPage.SortBylowToHigh.click();
    }


    @Then("verify the product prices are listed Low to High")
    public void verifyTheProductPricesAreListedLowToHigh() {

        ReusableMethods.waitFor(3);

        System.out.println(searchPage.ProductPricesList.size());

        List<Integer> actualPrices=new ArrayList<>();
        for(WebElement w:searchPage.ProductPricesList){
            actualPrices.add(Integer.parseInt(w.getText().replaceAll("\\D", "")));

        }
        System.out.println(actualPrices);
        List<Integer>ascendingPrices=new ArrayList<>();
        for(Integer w:actualPrices){
            ascendingPrices.add(w);
        }
        Collections.sort(ascendingPrices);
        System.out.println(ascendingPrices);

        int count=0;
        for(int i=0; i<actualPrices.size(); i++){
            if(actualPrices.get(i)!=ascendingPrices.get(i)){
                count++;
            }
        }
        System.out.println(count);
        if(count==0){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }

    }


}