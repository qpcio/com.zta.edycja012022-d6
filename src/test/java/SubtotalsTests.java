import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.TopMenuPage;

import java.util.concurrent.ThreadLocalRandom;

public class SubtotalsTests extends BaseTest{
    @Test
    public void shouldCorrectlyCountSubtotalForMultipleProducts(){
        //given
        TopMenuPage topMenuPage = new TopMenuPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        topMenuPage.openHomePage();
        //when
        homePage.openNthFeaturedProduct(8);
        float price = productPage.getPrice();
        int numberOfPRoducts = ThreadLocalRandom.current().nextInt(1,  8);
        float expectedValue = price*numberOfPRoducts;
        productPage.addNProducts(numberOfPRoducts-1);
        productPage.addToCart();
        //then
        Assert.assertEquals(addToCartPage.getSubtotal(),expectedValue);            // Todo: change floats to big decimals to have good rounding
    }
}
