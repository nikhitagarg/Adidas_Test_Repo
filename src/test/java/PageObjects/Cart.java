package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class Cart {
        @FindBy(xpath = "//*[@class='success']")
        public List<WebElement> ProductList;
        @FindBy(xpath = "//*[text()='Delete']")
        public List<WebElement> Delete;

        @FindBy(xpath = "//button[text()='Place Order']")
        public WebElement placeOrder;
        @FindBy(xpath = "//*[@id='orderModalLabel']")
        public WebElement OrderPage;
        @FindBy(xpath = "//*[@id='name']")
        public WebElement Name;
        @FindBy(xpath = "//*[@id='country']")
        public WebElement Country;
        @FindBy(xpath = "//*[@id='city']")
        public WebElement City;
        @FindBy(xpath = "//*[@id='card']")
        public WebElement Card;
        @FindBy(xpath = "//*[@id='month']")
        public WebElement Month;
        @FindBy(xpath = "//*[@id='year']")
        public WebElement Year;
        @FindBy(xpath ="//*[text()='Purchase']")
        public WebElement Purchase;
        @FindBy(xpath = "//*[@id='totalm']")
        public WebElement Total;
        @FindBy(xpath = "//*[text()='Thank you for your purchase!']")
        public WebElement Text;
        @FindBy(xpath = "/html/body/div[10]/p")
        public WebElement Variables;

}
