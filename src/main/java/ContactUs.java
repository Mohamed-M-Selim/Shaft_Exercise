import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class ContactUs {
    private SHAFT.GUI.WebDriver driver ;

    //Constructor
    public ContactUs (SHAFT.GUI.WebDriver driver){
        this.driver = driver ;
    }

    //Locators
    private By contactUsButton = By.xpath("//a[@href=\"/contact_us\"]");
    private By getInTouchIcon = By.xpath("//div[@class=\"col-sm-12\"]");
    private By nameField = By.xpath("//input[@name=\"name\"]");
    private By emailField = By.xpath("//input[@name=\"email\"]");
    private By subjectField = By.xpath("//input[@name=\"subject\"]");
    private By messageField = By.xpath("//textarea[@name=\"message\"]");
    private By submitButton = By.xpath("//input[@name=\"submit\"]");
    private By successMessage = By.xpath("//div[@class=\"status alert alert-success\"]");
    private By homePage = By.xpath("//a[@class=\"btn btn-success\"]");

    //Actions
    public ContactUs navigateToURL(String URL){
        driver.browser().navigateToURL(URL);
        return this;
    }
    public ContactUs clickOnContactUsButton(){
        driver.element().click(contactUsButton);
        return this;
    }
    public ContactUs verifyingGetInTouchIcon(){
        driver.element().verifyThat(getInTouchIcon).isVisible().perform();
        return this;
    }

    public ContactUs fillName(String Name){
        driver.element().type(nameField,Name);
        return this;
    }
    public ContactUs fillEmail(String Email){
        driver.element().type(emailField,Email);
        return this;
    }
    public ContactUs fillSubject(String Subject){
        driver.element().type(subjectField,Subject);
        return this;
    }
    public ContactUs fillMessage(String Message){
        driver.element().type(messageField,Message);
        return this;
    }
    public ContactUs clickOnSubmitButton(){
        driver.element().click(submitButton);
        return this;
    }
    public void clickOnButton(){
        driver.browser().alert().acceptAlert();

    }
    public ContactUs clickOnHomeButton(){
        driver.element().click(homePage);
        return this;
    }




    //Assertions
    @Step("Verify success message 'Success! Your details have been submitted successfully.' is visible")
    public void verifySuccessMessage(){
        driver.element().verifyThat(successMessage).isVisible().perform();
    }

}
