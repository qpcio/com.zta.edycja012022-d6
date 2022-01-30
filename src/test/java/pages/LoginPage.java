package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(css = ".no-account>a")
    private WebElement createNewAccountLink;

    public void goToCreateNewAccountPage(){
        createNewAccountLink.click();
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
