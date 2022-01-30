package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuPage extends BasePage{
    @FindBy(css = "[title=\"Log in to your customer account\"]")   
    private WebElement signInButton;

    @FindBy(css = "#_desktop_user_info .account>span")
    private WebElement userNameDisplyed;

    public void signIn(){
        signInButton.click();
    }

    public String getUserNameDisplyed() {
        return userNameDisplyed.getText();
    }

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }
}
