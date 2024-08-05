import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RemoveProductTest {
    private SHAFT.GUI.WebDriver driver ;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "Remove Product")
    private void DeleteProduct(){
        new RemoveProduct(driver).navigateToURL("https://automationexercise.com/");
        new RemoveProduct(driver).clickProductButton();
        new RemoveProduct(driver).clickContinueShoppingButton();
        new RemoveProduct(driver).clickCartButton();
        new RemoveProduct(driver).clickDeleteItem();

    }

    @AfterMethod
    @Description("Close browser after test")
    public void teardown(){
        driver.browser().closeCurrentWindow();
    }
}

