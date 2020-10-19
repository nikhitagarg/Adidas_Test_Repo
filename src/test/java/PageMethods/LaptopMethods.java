package PageMethods;

import Common.TestBase;
import PageObjects.Category;
import PageObjects.LaptopPage;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LaptopMethods extends TestBase {
    LaptopPage laptop = new LaptopPage();

    public LaptopMethods(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, laptop);
    }

    public void verifyProductPage(){
        Assert.assertTrue(laptop.addToCart.isDisplayed());
        log.info("Laptop product Page is opened successfully");
    }
    public void addToCart(){
        laptop.addToCart.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals("Product added",driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
    public void navigateBack(){
        driver.navigate().back();
        driver.navigate().back();
    }
        
}

