import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class HomePage {
    private SHAFT.GUI.WebDriver driver ;

    SoftAssert softAssert = new SoftAssert();

    //Constructor
    public HomePage(SHAFT.GUI.WebDriver driver){
        this.driver = driver ;
    }

    //Locators
    private By subscriptionText = By.xpath("//div[@class=\"single-widget\"]//h2");
    private By subscribeEmail = By.xpath("//input[@id=\"susbscribe_email\"]");
    private By arrowButton = By.xpath("//i[@class=\"fa fa-arrow-circle-o-right\"]");
    private By sucessSubscribe = By.xpath("//div[@id=\"success-subscribe\"]");
    private By ProductsButton = By.xpath("//a[@href=\"/products\"]");
    private By viewProductButton =
            By.xpath("//a[@href=\"/product_details/4\"]//i[@class=\"fa fa-plus-square\"]");


    //Actions
    public HomePage navigateToHome(){
        driver.browser().navigateToURL("https://automationexercise.com/");
        softAssert.assertEquals(driver.browser().getCurrentURL(),"https://automationexercise.com/");
        return this ;
    }

    public HomePage clickOnProductsButton(){
        driver.element().click(ProductsButton);
        softAssert.assertEquals(driver.browser().getCurrentURL(),"https://automationexercise.com/products");
        return this ;
    }

    public HomePage enterEmailinSubscriptionField(){
        driver.element().type(subscribeEmail, "selimporto@fady.com");
        return this ;
    }

    public HomePage clickArrowButton(String productName){
        driver.element().click(arrowButton);
        return this ;
    }

    //Assertions
    @Step("Verify text 'SUBSCRIPTION'")
    public HomePage validateTextSubscription(){
        softAssert.assertTrue(driver.element().isElementDisplayed(subscriptionText));
        return this ;
    }

    @Step("7. Verify success message 'You have been successfully subscribed!' is visible")
    public HomePage validateSubscriptionSucess(){
        driver.element().verifyThat(sucessSubscribe).isVisible();
        return this ;
    }
}
