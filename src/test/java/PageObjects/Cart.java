package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class Cart {
        @FindBy(xpath = "//*[@id='tbodyid']/tr")
        public List<WebElement> ProductList;

        @FindBy(xpath = "//*[text()='Place Order']")
        public WebElement placeOrder;
        @FindBy(xpath = "//*[@id='orderModalLabel']")
        public WebElement OrderPage;



}
