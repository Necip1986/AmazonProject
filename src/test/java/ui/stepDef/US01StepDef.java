package ui.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import ui.utilities.ConfigReader;
import ui.utilities.Driver;

public class US01StepDef {

    Logger log = (Logger) LogManager.getLogger(US02StepDef.class);

    @Given("go to Amazon url")
    public void go_to_Amazon_url() {

       // Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get(ConfigReader.getProperty("Amazon_url"));
        log.info("Homepage opened");

    }
    @Then("verify Amazon page title")
    public void verify_amazon_page_title() {

        String actualTitle=Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        String expectedTitle=ConfigReader.getProperty("amazon_title");

        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @Then("navigate to {string}")
    public void navigate_to(String string) {

    }


}
