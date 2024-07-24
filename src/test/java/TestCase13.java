import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase13 {

    private SHAFT.GUI.WebDriver driver ;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "Add Products in Cart")
    private void validateProductSearch(){
        new HomePage(driver)
                .navigateToHome();
        new ProductsPage(driver)
                .addFirstProductToCart()
                .clickContinueShopping()
                .addSecondProductToCart()
                .clickViewCart();
        new CartPage(driver).validateProductsAreAddedToCart()
                .validatePrices()
                .validateQuantities()
                .validateTotalPrices();
    }

    @AfterMethod
    @Description("Close browser after test")
    public void teardown(){
        driver.browser().closeCurrentWindow();
    }
}
