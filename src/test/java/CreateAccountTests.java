import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.LoginPage;
import pages.TopMenuPage;

public class CreateAccountTests extends BaseTest {

    @Test
    public void shouldCreateNewAccountAndLogUserInForRandomEmail() {
        //given
        String firstName = "Tester",
                lastname = "Testowy",
                birthdate = "12/12/1212",
                password = "12345",
                email = generateRandomEmail();
        String expectedName = firstName+" "+lastname;
        driver.get("http://146.59.32.4/index.php");
        TopMenuPage topMenuPage = new TopMenuPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        //when
        topMenuPage.signIn();
        loginPage.goToCreateNewAccountPage();
        createAccountPage.registerUser(firstName,lastname,email,password,birthdate);
        //then
        Assert.assertEquals(topMenuPage.getUserNameDisplyed(),expectedName);

    }


    private String generateRandomEmail() {
        String email = RandomStringUtils.randomAlphabetic(10);
        email += "@test.com";
        return email;
    }

}
