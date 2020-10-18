package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaptopPage {

        @FindBy(xpath = "//*[text()='Add to cart']")
        public WebElement addToCart;


}
