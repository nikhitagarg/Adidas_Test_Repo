package PageMethods;

import Common.TestBase;
import PageObjects.Cart;
import PageObjects.LaptopPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CartMethods extends TestBase {
    Cart cart = new Cart();

    public CartMethods(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, cart);
    }

    public void deleteItem(String name){
        for(int i=0;i<cart.ProductList.size();i++){
            String xpathName=cart.ProductList+"["+i+"]/td[2]";
            String deleteXpathName=cart.ProductList+"["+i+"]/td[4]/a";
           if(driver.findElement(By.xpath(xpathName)).getText().equalsIgnoreCase(name)){
               driver.findElement(By.xpath(deleteXpathName)).click();
               driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
               Assert.assertFalse(driver.findElement(By.xpath(xpathName)).isDisplayed());
           }
        }
    }
    public void placeOrder(){
        cart.placeOrder.click();
    }
        
}

