import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTests {
    private SHAFT.GUI.WebDriver driver ;

    private SHAFT.TestData.JSON testData;

    private String automationExerciseURL = "https://automationexercise.com/";
    private String name = "User1";
    private String email = "userx@gmail.com";
    private String password = "abcd123456";
    private String firstN = "User";
    private String lastN = "One";
    private String company = "Amit";
    private String addressOne = "Nasr City";
    private String addressTwo = "New Cairo";
    private String state = "Ontario";
    private String city = "Toronto";
    private String zipCode = "11835";
    private String mobileNumber = "01111111111";

    @BeforeClass
    public void beforeClass() {
        testData = new SHAFT.TestData.JSON("register.json");
    }

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "Verify user registration")
    private void validateRegistry(){
        new RegisterPage(driver).navigateToURL(automationExerciseURL)
                .verifyHomePage().clickOnSignPageButton()
                .verifySignUpTitle().fillLoginData(name,email)
                .clickOnSignUpButton().verifyAccountInfoTitle()
                .clickOnMale().fillInfoData(name, password)
                .verifyInfoEmail(email).fillBirthDate()
                .clickOnNewsletterCheckBox().clickOnReceiveOffersCheckBox()
                .fillAddressData(firstN, lastN, company, addressOne, addressTwo)
                .chooseCountry().fillRemainingInfo(state, city, zipCode,mobileNumber)
                .clickOnCreateAccountButton().verifyAccountCreated()
                .clickOnContinueButton().verifyLoggedInTitle()
                .clickOnDeleteAccountButton().validateAccountDeleted();
    }

    @AfterMethod
    @Description("Close browser after test")
    public void teardown(){
        driver.browser().closeCurrentWindow();
    }
}
