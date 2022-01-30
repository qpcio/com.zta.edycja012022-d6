package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    @FindBy(css = "[itemprop=\"price\"]")
    private WebElement priceField;

    @FindBy(css = ".touchspin-up")
    private WebElement addProductButton;

    @FindBy(css = ".add-to-cart")
    private WebElement addToCartButton;

    public void addToCart(){
        addToCartButton.click();
    }


    public void addNProducts(int n) {
        for (int i = 0; i < n; i++) addProduct();
    }

    public void addProduct() {
        addProductButton.click();
    }

    public float getPrice() {
        return Float.valueOf(priceField.getAttribute("content"));
    }


    public ProductPage(WebDriver driver) {
        super(driver);
    }
}
