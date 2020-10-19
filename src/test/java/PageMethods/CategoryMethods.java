package PageMethods;

import Common.TestBase;
import PageObjects.Category;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

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
        for (int i = 1; i <= category.category_item.size(); i++) {
            if (category.category_item.get(i).getText().equalsIgnoreCase(categoryName)) {
                category.category_item.get(i).click();
                break;
            }
        }
    }

    public void clickOnProduct(String name) {
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(category.items.get(1))));
        try {
            for (int i = 0; i < category.items.size(); i++) {
                if (category.items.get(i).getText().equalsIgnoreCase(name)) {
                    category.items.get(i).click();
                    break;
                }
            }
        } catch (Exception e) {
        }
    }

    public void clickOnCart() {
        category.cart.click();
    }

    public void verifyCartPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("cart.html"));
    }

}

