import com.shaft.driver.SHAFT;
import com.shaft.validation.Validations;
import io.qameta.allure.Step;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProduct {
    private SHAFT.GUI.WebDriver driver;

    //Constructor
    public SearchProduct(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By ProductButton = By.xpath("//a[@href=\"/products\"]");
    private By ProductNamefield = By.xpath("//input[@id=\"search_product\"]");
    private By SearchProductButton = By.xpath("//button[@id=\"submit_search\"]");
    private By SearchProductText = By.xpath("//h2[@class=\"title text-center\"]");
    private By Allproducts = By.xpath("//div[@class=\"features_items\"]");


    //Actions
    public SearchProduct navigateToURL(String URL) {
        driver.browser().navigateToURL(URL);
        return this;
    }

    public SearchProduct clickOnProductButton() {
        driver.element().click(ProductButton);
        return this;
    }

    public SearchProduct fillProductName(String ProductName) {
        driver.element().type(ProductNamefield, ProductName);
        return this;
    }

    public SearchProduct clickOnSearchProductButton() {
        driver.element().click(SearchProductButton);
        return this;
    }

    //Assertions
    @Step(" Verify that home page is visible successfully")
    public void testHomePage() {
        driver.browser().verifyThat().attribute("url").contains("https://www.automationexercise.com").perform();
    }

    @Step("Verify user is navigated to ALL PRODUCTS page successfully")
    public void testAllProducts() {
        driver.browser().verifyThat().attribute("url").contains("https://www.automationexercise.com/products").perform();
    }

    @Step("Verify 'SEARCHED PRODUCTS' is visible")
    public void testSearchedProductText() {
        driver.element().verifyThat(SearchProductText).exists().perform();
    }

    @Step("Verify all the products related to search are visible")
    public void testAllProductsVisible() {
        driver.element().verifyThat(Allproducts).exists().perform();
    }
}




