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
                .navigateToHome().clickViewProductOnProduct4();
        new ProductDetailsPage(driver)
                .setQuanatity("4").clickAddToCart().clickViewCart();
        new CartPage(driver).validateProductQuantity("4");
    }

    @AfterMethod
    @Description("Close browser after test")
    public void teardown(){
        driver.browser().closeCurrentWindow();
    }
}
