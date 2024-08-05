import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class ProductDetailsPage {
    private SHAFT.GUI.WebDriver driver ;

    SoftAssert softAssert = new SoftAssert();

    //Constructor
    public ProductDetailsPage(SHAFT.GUI.WebDriver driver){
        this.driver = driver ;
    }

    //Locators
    private By quantityBox = By.xpath("//input[@name=\"quantity\"]");
    private By addToCart = By.xpath("//button[@class=\"btn btn-default cart\"]");
    private By viewCartWindow = By.xpath("//a[@href=\"/view_cart\"]//u");

    //Actions
    public ProductDetailsPage setQuanatity(String quanatity){
        driver.element().setValueUsingJavaScript(quantityBox, quanatity);
        return this ;
    }

    public ProductDetailsPage clickAddToCart(){
        driver.element().click(addToCart);
        return this;
    }

    public ProductDetailsPage clickViewCart(){
        driver.element().click(viewCartWindow);
        return this;
    }

    //Assertions
    /*@Step("validate that searched products is displayed")
    public ProductDetailsPage validateSearchedProducts(){
        driver.element().verifyThat(searchedProductsText).exists().perform();
        return this ;
    }*/
}
