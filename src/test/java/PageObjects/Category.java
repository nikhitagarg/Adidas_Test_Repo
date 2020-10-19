package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Category {

    @FindBy(xpath = "//*[@id='cat']")
    public WebElement categories;
    @FindBy(xpath = "//*[@id='contcont']/div/div[1]/div/a")
    public List<WebElement> category_item;
    @FindBy(xpath = "//*[@class='hrefch']")
    public List<WebElement> items;
    @FindBy(xpath="//*[@id='cartur']")
    public WebElement cart;
}
