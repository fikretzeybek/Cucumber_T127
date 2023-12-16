package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoPage {

    public SauceDemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "password")
    public WebElement passWordKutusu;

    @FindBy(id = "user-name")
    public WebElement usernameKutusu;

    @FindBy(id = "login-button")
    public WebElement loginButonu;

    @FindBy(id = "item_4_title_link")
    public WebElement ilkUrunElementi;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCartElementi;

    @FindBy(className = "shopping_cart_badge")
    public WebElement sepetElementi;

    @FindBy(className = "inventory_item_name")
    public WebElement sepeteEklenmisUrunElementi;
}
