import com.shaft.driver.SHAFT;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactUsTests {
    private SHAFT.GUI.WebDriver driver ;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "ContactUs")
    public void verifySuccessMessage(){
        new ContactUs(driver).navigateToURL("http://automationexercise.com")
                .clickOnContactUsButton()
                .fillName("Abdoo")
                .fillEmail("abdelrafares@gmail.com")
                .fillSubject("Complain")
                .verifyingGetInTouchIcon()
                .fillMessage("The Product isn't Compatible")
                .clickOnSubmitButton()
                .clickOnButton();
        new ContactUs(driver).verifySuccessMessage();
        new ContactUs(driver).clickOnHomeButton();


    }


    @AfterMethod
    @jdk.jfr.Description("Close browser after test")
    public void teardown(){
        driver.browser().closeCurrentWindow();
    }


}
