import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartQuantityTest {
    private SHAFT.GUI.WebDriver driver ;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "Verify Product quantity in cart")
    private void validateCartQuantity(){
        new CartPage(driver).navigateToURL("https://automationexercise.com/")
                .verifyHomePage().clickOnViewProductButton()
                .verifyProductDetails().fillQuantity("4")
                .clickAddToCart().clickViewCart()
                .validateProductAndQuantity();
    }

    @AfterMethod
    @Description("Close browser after test")
    public void teardown(){
        driver.browser().closeCurrentWindow();
    }
}
