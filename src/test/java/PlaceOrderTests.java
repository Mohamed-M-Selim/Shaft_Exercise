import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlaceOrderTests {
    private SHAFT.GUI.WebDriver driver ;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup (){
        driver = new SHAFT.GUI.WebDriver();
    }
    @Test(description = "PlaceOrder")
    private void PlaceOrder() {
        new PlaceOrder(driver).navigateToURL("https://automationexercise.com/");
        new PlaceOrder(driver).validateHomePageVisibility();
        new PlaceOrder(driver).clickOnProductHomeButton()
                .clickOnFirstProductViewButton()
                .clickOnFirstProductAddToCartButton()
                .clickOnFirstProductContinueShoppingButton()
                .navigateBack()
                .clickOnSecondProductViewButton()
                .clickOnSecondProductAddToCartButton()
                .clickOnSecondProductContinueShoppingButton()
                .clickOnHomePageCartButton();
        new PlaceOrder(driver).validateCartPageVisibility();
        new PlaceOrder(driver).clickOnCheckOutButton()
                .clickOnLoginRegisterButton()
                .fillName("Mohamed").
                fillEmail("GODOFWAR12120@gmail.com").
                clickOnSignUpButton()
                .clickOnTitleButton()
                .fillAccountName("Mohamed")
                .fillAccountPassword("Mohamed259")
                .selectDayOfBirthDate("25")
                .selectMonthOfBirthDate("9")
                .selectYearsOfBirthDate("1998")
                .clickOnNewsLetterButton()
                .clickOnSpeicalOfferButton()
                .addressFirstName("cairo")
                .addressLastName("khanka")
                .companyNameField("ICE")
                .addressField("cairo")
                .addressFieldTwo("cairo-c")
                .selectCountryName("United States")
                .stateField("cairo")
                .cityField("Benha")
                .zipCodeField("0000")
                .mobileNumber("01113635939");
        new PlaceOrder(driver).clickOnCreateAccountButton();
        new PlaceOrder(driver).verifyThatAccountCreatedIsVisible();
        new PlaceOrder(driver).clickOnContinueButton();
        new PlaceOrder(driver).verifyLoggedInAsMohamedIsVisible();
        new PlaceOrder(driver).clickOnHomePageCartButton()
                .clickOnCheckOutButton();
        new PlaceOrder(driver).validateAddressFieldVisibility();
        new PlaceOrder(driver).validateAddressFieldContent();
        new PlaceOrder(driver).validateReviewOrderFieldVisibility();
        new PlaceOrder(driver).validateFirstProductContent();
        new PlaceOrder(driver).validateSecondProductContent();
        new PlaceOrder(driver).validateActualProductPrice();
        new PlaceOrder(driver).fillComment("this is my project")
                .clickOnPlaceOrderButton()
                .fillCardNumber("123456789123456")
                .fillCardName("Mohamed")
                .fillCardCvc("555")
                .fillCardExpirationMonth("09")
                .fillCardExpirationYear("25")
                .clickOnPayAndConfirmOrderButton()
                .navigateBack();
        new PlaceOrder(driver).validateSuccessfullOrderMessageVisibility();
        new PlaceOrder(driver).clickOnDeleteAccountButton()
                .verifyDeletedAccountIsVisible();
    }
    @AfterMethod
    @Description("Close browser after test")
    public void teardown() {
        driver.browser().closeCurrentWindow();
    }
}
