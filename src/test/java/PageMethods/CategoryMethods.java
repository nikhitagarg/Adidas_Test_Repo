package PageMethods;

import Common.TestBase;
import PageObjects.Category;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CategoryMethods extends TestBase {
    Category category = new Category();

    public CategoryMethods(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, category);
    }

    public void checkPageDisplay() {
        Assert.assertTrue(category.categories.isDisplayed());
        log.info("Page is opened successfully");
    }

    public void navigateToCategory(String categoryName) {
        switch (categoryName) {
            case "Phones":
                category.phone.click();
                break;
            case "Laptops":
                category.laptop.click();
                break;
            case "Monitors":
                category.monitor.click();
                break;
        }
    }

    public void clickOnProduct(String name) {
        if (name.equalsIgnoreCase("Sony vaio i5"))
            category.laptopName1.click();
        else if (name.equalsIgnoreCase("Dell i7 8gb"))
            category.laptopName2.click();
    }
    public void clickOnCart(){
        category.cart.click();
    }
    public void verifyCartPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("cart.html"));
    }

}

