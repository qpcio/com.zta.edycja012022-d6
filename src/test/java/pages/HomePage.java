package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{
    @FindBy(css = ".featured-products [itemprop=\"itemListElement\"]")
    private List<WebElement> featuredProductsLinks;

    public void openNthFeaturedProduct(int n){
        featuredProductsLinks.get(n-1).click();
    }
    
    public HomePage(WebDriver driver) {
        super(driver);
    }
}
