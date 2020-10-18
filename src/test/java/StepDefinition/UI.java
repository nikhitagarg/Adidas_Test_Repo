package StepDefinition;

import Common.TestBase;
import PageMethods.CartMethods;
import PageMethods.CategoryMethods;
import PageMethods.LaptopMethods;
import Utility.Utilities;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import java.io.IOException;
import java.util.Map;

import static Utility.Utilities.*;

public class UI extends TestBase {
    public CategoryMethods categoryMethods = new CategoryMethods(driver);
    public LaptopMethods laptopMethods = new LaptopMethods(driver);
    public CartMethods cartMethods = new CartMethods(driver);

    @Given("^User opens the webpage$")
    public void user_opens_the_webpage() throws IOException {
        driver.get(getKeyValue("Site_URL"));
        categoryMethods.checkPageDisplay();
    }

    @And("^navigate to category \"([^\"]*)\"$")
    public void navigate_to_category_something(String category) {
        categoryMethods.navigateToCategory(category);
    }

    @And("^Add products in cart$")
    public void add_products_in_cart(DataTable table) {
        for (int i = 0; i < table.asList().size(); i++) {
            categoryMethods.clickOnProduct(table.asList().get(i));
            laptopMethods.verifyProductPage();
            laptopMethods.addToCart();
            laptopMethods.navigateBack();
        }
    }

    @When("^User navigates to cart$")
    public void user_navigates_to_cart() {
        categoryMethods.clickOnCart();
        categoryMethods.verifyCartPage();
    }

    @And("^deletes the product \"([^\"]*)\"$")
    public void deletes_the_product_something(String productName) {
        cartMethods.deleteItem(productName);
    }
    @Then("^User places order$")
    public void user_places_order(){
        cartMethods.placeOrder();
    }
    @And("^fills order details$")
    public void fills_order_details(Map<String,String> data){

    }
}
