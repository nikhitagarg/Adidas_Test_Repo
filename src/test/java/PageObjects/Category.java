package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Category {

    @FindBy(xpath = "//*[text()='CATEGORIES']")
    public WebElement categories;
    @FindBy(xpath = "//*[text()='Phones']")
    public WebElement phone;
    @FindBy(xpath = "//*[text()='Laptops']")
    public WebElement laptop;
    @FindBy(xpath = "//*[text()='Monitors']")
    public WebElement monitor;
    @FindBy(xpath = "//*[text()='Sony vaio i5']")
    public WebElement laptopName1;
    @FindBy(xpath = "//*[text()='Dell i7 8gb']")
    public WebElement laptopName2;
    @FindBy(xpath="//a[@href='cart.html]")
    public WebElement cart;
}
