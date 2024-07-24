import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SearchProductPage {
    private SHAFT.GUI.WebDriver driver ;


    //Constructor
    public SearchProductPage (SHAFT.GUI.WebDriver driver){
        this.driver = driver ;
    }

    //Locators
    private By productButton = By.xpath("//a[@href=\"/products\"]");
    private By searchBar = By.xpath("//input[@type=\"text\"]");
    private By searchBarButton = By.xpath("//button[@type=\"button\"]");
    private By viewProductButton = By.xpath("//a[@href=\"/product_details/8\"]");
    private By productName = By.xpath("//div[@class=\"product-details\"]//h2");

    //Actions
    public SearchProductPage navigateToURL(String URL){
        driver.browser().navigateToURL(URL);
        return this ;
    }

    public SearchProductPage clickOnProductButton(){
        driver.element().click(productButton);
        return this ;
    }

    public SearchProductPage clickOnSearchBar(){
        driver.element().click(searchBar);
        return this ;
    }

    public SearchProductPage fillProductName(String productName){
        driver.element().type(searchBar,productName);
        return this ;
    }

    public SearchProductPage searchBarButton(){
        driver.element().click(searchBarButton);
        return this ;
    }

    public SearchProductPage viewProductButton(){
        driver.element().click(viewProductButton);
        return this ;
    }

    public SearchProductPage productName(){
        driver.element().verifyThat(productName).exists().withCustomReportMessage("Fancy Green Top").perform();
        return this ;
    }

    //Assertions
    @Step("Validate that the right product appeared")
    public void validateProduct(){
        driver.element().verifyThat(productName).isVisible().perform();
    }



}