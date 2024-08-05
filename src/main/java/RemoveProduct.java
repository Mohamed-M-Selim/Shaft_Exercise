import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;

public class RemoveProduct {
    private SHAFT.GUI.WebDriver driver;

    //Constructor
    public RemoveProduct(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By productButton = By.xpath("(//a[@data-product-id='1' and @class='btn btn-default add-to-cart'])[1]");
    private By cartButton = By.xpath("//div[@class=\"shop-menu pull-right\"]//a[@href=\"/view_cart\"]");
    private By deleteItem = By.xpath("//a[@class=\"cart_quantity_delete\"]");
    private By continueShoppingButton = By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]");


    //Actions
    public RemoveProduct navigateToURL(String URL) {
        driver.browser().navigateToURL(URL);
        return this;
    }

    public RemoveProduct clickProductButton() {
        driver.element().click(productButton);
        return this;
    }

    public RemoveProduct clickCartButton() {
        driver.element().click(cartButton);
        return this;
    }

    public RemoveProduct clickDeleteItem() {
        driver.element().click(deleteItem);
        return this;

    }

    public RemoveProduct clickContinueShoppingButton() {
        driver.element().click(continueShoppingButton);
        return this;
    }


}

