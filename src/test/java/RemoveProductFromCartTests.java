import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveProductFromCartTests {
    private SHAFT.GUI.WebDriver driver ;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "removeProduct")
    private void removeProduct() {
        new RemoveProductFromCart(driver).navigateToURL("https://automationexercise.com/");
        new RemoveProductFromCart(driver).validateHomePageVisibility();
        new RemoveProductFromCart(driver).clickOnProductButton()
                .clickOnFirstProductViewButton()
                .clickOnFirstProductAddToCartButton()
                .clickOnFirstProductContinueShoppingButton()
                .clickOnHomePageCartButton();
        new RemoveProductFromCart(driver).validateCartPageVisibility();
        new RemoveProductFromCart(driver).clickOnRemoveProductButton();
        new RemoveProductFromCart(driver).validateProductIsRemoved();
    }
        @AfterMethod
        @Description("Close browser after test")
        public void teardown(){
            driver.browser().closeCurrentWindow();
    }}

















