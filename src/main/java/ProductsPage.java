import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class ProductsPage {
    private SHAFT.GUI.WebDriver driver ;

    SoftAssert softAssert = new SoftAssert();

    //Constructor
    public ProductsPage(SHAFT.GUI.WebDriver driver){
        this.driver = driver ;
    }

    //Locators
    private By ProductsButton = By.xpath("//a[@href=\"/products\"]");
    private By searchProductField = By.xpath("//input[@id=\"search_product\"]");
    private By sumbitSearchButton = By.xpath("//button[@id=\"submit_search\"]");
    private By searchedProductsText = By.xpath("//h2[@class=\"title text-center\"]");
    private By logoutButton = By.xpath("//a[@href=\"/logout\"]");

    private By firstProductImage =
            By.xpath("//div[@class=\"productinfo text-center\"]//img[@src=\"/get_product_picture/1\"]");
    private By firstProductAddToCartOverlay =
            By.xpath("//div[@class=\"overlay-content\"]//a[@data-product-id=\"1\"]");
    private By continueShoppingButton = By.xpath("//button[@data-dismiss=\"modal\"]");

    private By secondProductImage =
            By.xpath("//div[@class=\"productinfo text-center\"]//img[@src=\"/get_product_picture/2\"]");
    private By secondProductAddToCartOverlay =
            By.xpath("//div[@class=\"overlay-content\"]//a[@data-product-id=\"2\"]");

    private By viewCartButton = By.xpath("//div[@class=\"modal-body\"]//a[@href=\"/view_cart\"]");




    //Actions
    public ProductsPage navigateToURL(String URL){
        driver.browser().navigateToURL(URL);
        softAssert.assertEquals(driver.browser().getCurrentURL(),"https://automationexercise.com/");
        return this ;
    }

    public ProductsPage clickOnProductsButton(){
        driver.element().click(ProductsButton);
        softAssert.assertEquals(driver.browser().getCurrentURL(),"https://automationexercise.com/products");
        return this ;
    }

    public ProductsPage searchForProduct(String productName){
        driver.element().type(searchProductField,productName);
        driver.element().click(sumbitSearchButton);
        return this ;
    }

    public ProductsPage addFirstProductToCart(){
        driver.element().hover(firstProductImage);
        driver.element().click(firstProductAddToCartOverlay);
        return this ;
    }

    public ProductsPage clickContinueShopping(){
        driver.element().click(continueShoppingButton);
        return this;
    }

    public ProductsPage addSecondProductToCart(){
        driver.element().hover(secondProductImage);
        driver.element().click(secondProductAddToCartOverlay);
        return this ;
    }

    public ProductsPage clickViewCart(){
        driver.element().click(viewCartButton);
        return this;
    }

    //Assertions
    @Step("validate that searched products is displayed")
    public ProductsPage validateSearchedProducts(){
        driver.element().verifyThat(searchedProductsText).exists().perform();
        return this ;
    }
}
