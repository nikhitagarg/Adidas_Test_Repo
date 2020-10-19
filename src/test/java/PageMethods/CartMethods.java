package PageMethods;

import Common.TestBase;
import PageObjects.Cart;

import static Common.PropertyHolder.setProperty;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CartMethods extends TestBase {
    Cart cart = new Cart();

    public CartMethods(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, cart);
    }

    public void deleteItem(String name) {
        int size = cart.ProductList.size();
        for (int i = 0; i < size; i++) {
            if (cart.ProductList.get(i).getText().contains(name)) {
                cart.Delete.get(i).click();
                wait.until(ExpectedConditions.invisibilityOf(cart.ProductList.get(i)));
                break;
            }
        }
    }

    public void placeOrder() {
        cart.placeOrder.click();
        wait.until(ExpectedConditions.visibilityOf(cart.OrderPage));
        Assert.assertTrue(cart.OrderPage.isDisplayed());
    }

    public void fillDetails(Map<String, String> data) {
        for (Map.Entry<String, String> entrySet : data.entrySet()) {
            if (entrySet.getKey().equalsIgnoreCase("NAME"))
                cart.Name.sendKeys(entrySet.getValue());
            else if (entrySet.getKey().equalsIgnoreCase("COUNTRY"))
                cart.Country.sendKeys(entrySet.getValue());
            else if (entrySet.getKey().equalsIgnoreCase("CITY"))
                cart.City.sendKeys(entrySet.getValue());
            else if (entrySet.getKey().equalsIgnoreCase("CREDIT CARD"))
                cart.Card.sendKeys(entrySet.getValue());
            else if (entrySet.getKey().equalsIgnoreCase("MONTH"))
                cart.Month.sendKeys(entrySet.getValue());
            else if (entrySet.getKey().equalsIgnoreCase("YEAR"))
                cart.Year.sendKeys(entrySet.getValue());
        }
        cart.Purchase.click();
        Assert.assertTrue(cart.Text.isDisplayed());
    }

    public void getTotal(String var) {
        wait.until(ExpectedConditions.textToBePresentInElement(cart.Total,"Total: "));
        String[] total = cart.Total.getText().split(":");
        setProperty(var, total[1].trim());
    }

    public void fetchData(String PurchaseId, String amount) {
        String[] values = cart.Variables.getText().split("\\n");
        String[] idVal = values[0].split(" ");
        setProperty(PurchaseId, idVal[1]);
        String[] amountVal = values[1].split(" ");
        setProperty(amount, amountVal[1]);
    }

}

