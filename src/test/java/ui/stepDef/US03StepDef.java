package ui.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import ui.pages.AllMenuPage;
import ui.pages.HomePage;

public class US03StepDef {

    HomePage homePage=new HomePage();
    AllMenuPage allMenuPage=new AllMenuPage();

    @Then("select All menu")
    public void select_all_menu() {
        allMenuPage.navigateAllMenu.click();

    }
    @And("select Smart Home department")
    public void selectSmartHomeDepartment() {
        allMenuPage.navigateSmartHome.click();
    }

    @Then("verify the sub-categories of the Smart Home department is {int}")
    public void verifyTheSubCategoriesOfTheSmartHomeDepartmentIs(int expextedSubCategory) {

        int actualSubCategory=allMenuPage.smartHomeSubCategory.size();
        Assert.assertEquals(expextedSubCategory,actualSubCategory);
    }
}
