import com.shaft.driver.SHAFT;
import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterUserTests {
    private SHAFT.GUI.WebDriver driver ;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "RegisterUser")
    public void verifyingAccountDeletedIcon(){
        new RegisterUserPage(driver).navigateToURL("http://automationexercise.com")
                .clickOnSignupLoginButton()
                .verifyingNewUserSignupIcon()
                .fillName("Abdoo")
                .fillEmailAddress("body@gmail.com")
                .clickOnSignupButton()
                .verifyingEnterAccountInformationIcon()
                .fillTitle()
                .fillPassword("Abd1522004")
                .clickOnSignupForOurNewsletterCheckbox()
                .clickOnReceiveSpecialOffersFromOurPartnersCheckbox()
                .fillFirstName("Abdelrahman")
                .fillLastName("Fares")
                .fillCompany("Concentrix")
                .fillAddress("Gate4")
                .fillAddress2("173")
                .fillState("Giza")
                .fillCity("Dokki")
                .fillZipCode("16566")
                .fillMobileNumber("01000070407")
                .clickOnCreateAccountButton()
                /*.verifyingAccountCreatedIcon()*/
                .clickOnContinueButton()
                .verifyingLoggedInAsUserNameIcon()
                .clickOnDeleteAccount()
                .verifyingAccountDeletedIcon();

    }



    @AfterMethod
    @jdk.jfr.Description("Close browser after test")
    public void teardown(){
        driver.browser().closeCurrentWindow();
    }
}
