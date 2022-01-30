package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage{
    @FindBy(css = "[name=\"id_gender\"][value=\"1\"]")
    private WebElement socialTitleMrRadioButton;

    @FindBy(name = "firstname")
    private WebElement firstNameTextBox;

    @FindBy(name = "lastname")
    private WebElement lastNameTextBox;

    @FindBy(name = "email")
    private WebElement emailTextBox;

    @FindBy(name = "password")
    private WebElement passwordTextBox;

    @FindBy(name = "birthday")
    private WebElement birthdayTextBox;

    @FindBy(name = "customer_privacy")
    private WebElement customerPrivacyCheckBox;

    @FindBy(name = "psgdpr")
    private WebElement acceptGDPRcheckBox;

    @FindBy(css = ".form-footer>button")
    private WebElement saveButton;

    public void registerUser(String firstName,
                             String lastName,
                             String email,
                             String password,
                             String birthdate){
        socialTitleMrRadioButton.click();
        firstNameTextBox.sendKeys(firstName);
        lastNameTextBox.sendKeys(lastName);
        emailTextBox.sendKeys(email);
        passwordTextBox.sendKeys(password);
        birthdayTextBox.sendKeys(birthdate);
        customerPrivacyCheckBox.click();
        acceptGDPRcheckBox.click();
        saveButton.click();
    }

    public boolean isPageDisplayed(){
        return firstNameTextBox.isDisplayed();
    }


    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }
}
