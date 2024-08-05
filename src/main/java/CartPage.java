import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class CartPage {
    private SHAFT.GUI.WebDriver driver ;

    SoftAssert softAssert = new SoftAssert();

    //Constructor
    public CartPage(SHAFT.GUI.WebDriver driver){
        this.driver = driver ;
    }

    //Locators
    private By firstProductName =
            By.xpath("//a[@href=\"/product_details/1\"]");
    private By firstProductPrice =
            By.xpath("//tr[@id=\"product-1\"]//td[@class=\"cart_price\"]");
    private By firstProductQuantity =
            By.xpath("//tr[@id=\"product-1\"]//td[@class=\"cart_quantity\"]//button");
    private By firstProductTotalPrice =
            By.xpath("//tr[@id=\"product-1\"]//p[@class=\"cart_total_price\"]");
    private By secondProductName =
            By.xpath("//a[@href=\"/product_details/2\"]");
    private By secondProductPrice =
            By.xpath("//tr[@id=\"product-2\"]//td[@class=\"cart_price\"]");
    private By secondProductQuantity =
            By.xpath("//tr[@id=\"product-2\"]//td[@class=\"cart_quantity\"]//button");
    private By secondProductTotalPrice =
            By.xpath("//tr[@id=\"product-2\"]//p[@class=\"cart_total_price\"]");

    private By fourthProductQuantity =
            By.xpath("//tr[@id=\"product-4\"]//td[@class=\"cart_quantity\"]//button");



    //Actions

    public String firstProductQunatityValue(){
        String quantityValue;
        quantityValue = driver.element().getText(firstProductQuantity);
        return quantityValue;
    }

    //Assertions
    @Step("Verify both products are added to Cart")
    public CartPage validateProductsAreAddedToCart(){
        driver.element().verifyThat(firstProductName).isVisible();
        driver.element().verifyThat(secondProductName).isVisible();
        return this ;
    }

    @Step("Verify their prices")
    public CartPage validatePrices(){
        driver.element().verifyThat(firstProductPrice).isVisible();
        driver.element().verifyThat(secondProductPrice).isVisible();
        return this ;
    }

    @Step("Verify their quantity")
    public CartPage validateQuantities(){
        driver.element().verifyThat(firstProductQuantity).isVisible();
        driver.element().verifyThat(secondProductQuantity).isVisible();
        return this ;
    }

    @Step("Verify their total price")
    public CartPage validateTotalPrices(){
        driver.element().verifyThat(firstProductTotalPrice).isVisible();
        driver.element().verifyThat(secondProductTotalPrice).isVisible();
        return this ;
    }

    @Step("Verify that product is displayed in cart page with exact quantity")
    public CartPage validateProductQuantity(String quantity){
        driver.element().verifyThat(fourthProductQuantity).text().equals(quantity);
        return this ;
    }
}
