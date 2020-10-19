package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaptopPage {

        @FindBy(xpath = "//*[@class='row']/div/a")
        public WebElement addToCart;


}
