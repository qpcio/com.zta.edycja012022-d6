package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCartPage extends BasePage{
       @FindBy(css = ".product-total .value")
       private WebElement totalValueField;


       public float getSubtotal(){
           wait.until(ExpectedConditions.elementToBeClickable(totalValueField));
           String s = totalValueField.getText().replace("$","");
           return Float.valueOf(s);
       }
    

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }
}
