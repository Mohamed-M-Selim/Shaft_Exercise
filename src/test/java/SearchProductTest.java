import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProductTest {
    private SHAFT.GUI.WebDriver driver ;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "validate search product")
     private void SearchProduct(){
        new SearchProduct(driver).navigateToURL("https://www.automationexercise.com");
        new SearchProduct(driver).testHomePage();
        new SearchProduct(driver).clickOnProductButton();
        new SearchProduct(driver).testAllProducts();
        new SearchProduct(driver).fillProductName("men");
        new SearchProduct(driver).clickOnSearchProductButton();
        new SearchProduct(driver).testSearchedProductText();
        new SearchProduct(driver).testAllProductsVisible();



    }

    @AfterMethod
    @Description("Close browser after test")
    public void teardown(){
        driver.browser().closeCurrentWindow();
    }
}

