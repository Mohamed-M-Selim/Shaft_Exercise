import com.shaft.driver.SHAFT;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProductTests {
    private SHAFT.GUI.WebDriver driver ;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "Validate the ProductName")
    private void validateProduct(){
        new SearchProductPage(driver).navigateToURL("https://www.automationexercise.com/")
                .clickOnProductButton()
                .clickOnSearchBar()
                .fillProductName("green top")
                .searchBarButton()
                .viewProductButton()
                .validateProduct();


    }

    @AfterMethod
    @jdk.jfr.Description("Close browser after test")
    public void teardown(){
        driver.browser().closeCurrentWindow();
    }






}
