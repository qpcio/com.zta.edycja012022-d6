package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;

public class TopMenuPage extends BasePage{
    @FindBy(css = "[title=\"Log in to your customer account\"]")   
    private WebElement signInButton;

    @FindBy(css = "#_desktop_user_info .account>span")
    private WebElement userNameDisplayed;

    public void signIn(){
        signInButton.click();
    }

    public String getUserNameDisplayed() {
        File screenshot =  userNameDisplayed.getScreenshotAs(OutputType.FILE);
        File dest = new File("screenshot.png");
        try {
            FileHandler.copy(screenshot,dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userNameDisplayed.getText();
    }

    public void openHomePage(){
        driver.get("http://146.59.32.4/index.php");

    }

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }
}
