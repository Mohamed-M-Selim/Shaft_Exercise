import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.lang.reflect.Constructor;

public class RegisterUserPage {
    private SHAFT.GUI.WebDriver driver;

    //Constructor
    public RegisterUserPage (SHAFT.GUI.WebDriver driver ){
        this.driver = driver;
    }

    //Locators
    private By signupLoginButton = By.xpath("//a[@href=\"/login\"]");
    private By newUserSignupIcon = By.xpath("//form[@action=\"/signup\"]");
    private By nameField = By.xpath("//input[@data-qa=\"signup-name\"]");
    private By emailAddressField = By.xpath("//input[@data-qa=\"signup-email\"]");
    private By signupButton = By.xpath("//button[@data-qa=\"signup-button\"]");
    private By enterAccountInformationIcon = By.xpath("//div[@class=\"login-form\"]");
    private By titleField = By.xpath("//div[@id=\"uniform-id_gender1\"]");
    private By passwordField = By.xpath("//input[@name=\"password\"]");
    private By signupForOurNewsletterCheckbox = By.xpath("//input[@name=\"newsletter\"]");
    private By receiveSpecialOffersFromOurPartnersCheckbox = By.xpath("//input[@name=\"optin\"]");
    private By firstNameField = By.xpath("//input[@data-qa=\"first_name\"]");
    private By lastNameField = By.xpath("//input[@data-qa=\"last_name\"]");
    private By companyField = By.xpath("//input[@data-qa=\"company\"]");
    private By addressField = By.xpath("//input[@data-qa=\"address\"]");
    private By address2Field = By.xpath("//input[@data-qa=\"address2\"]");
    private By stateField = By.xpath("//input[@data-qa=\"state\"]");
    private By cityField = By.xpath("//input[@data-qa=\"city\"]");
    private By zipCodeField = By.xpath("//input[@data-qa=\"zipcode\"]");
    private By mobileNumberField = By.xpath("//input[@data-qa=\"mobile_number\"]");
    private By createAccountButton = By.xpath("//button[@data-qa=\"create-account\"]");
    /*private By accountCreatedIcon = By.xpath("class=\"col-sm-9 col-sm-offset-1\"");*/
    private By continueButton = By.xpath("//a[@data-qa=\"continue-button\"]");
    private By loggedInAsUserNameIcon = By.xpath("//i[@class=\"fa fa-user\"]");
    private By deleteAccountButton = By.xpath("//a[@href=\"/delete_account\"]");
    private By accountDeletedIcon = By.xpath("//div[@class=\"col-sm-9 col-sm-offset-1\"]");

    //Actions
    public RegisterUserPage navigateToURL(String URL){
        driver.browser().navigateToURL(URL);
        return this;
    }
    public RegisterUserPage clickOnSignupLoginButton(){
        driver.element().click(signupLoginButton);
        return this;
    }
    public RegisterUserPage verifyingNewUserSignupIcon(){
        driver.element().verifyThat(newUserSignupIcon).isVisible().perform();
        return this;
    }
    public RegisterUserPage fillName(String Name){
        driver.element().type(nameField,Name);
        return this;
    }
    public RegisterUserPage fillEmailAddress(String EmailAddress){
        driver.element().type(emailAddressField,EmailAddress);
        return this;
    }
    public RegisterUserPage clickOnSignupButton(){
        driver.element().click(signupButton);
        return this;
    }
    public RegisterUserPage verifyingEnterAccountInformationIcon(){
        driver.element().verifyThat(enterAccountInformationIcon).isVisible().perform();
        return this;
    }
    public RegisterUserPage fillTitle(){
        driver.element().click(titleField);
        return this;
    }
    public RegisterUserPage fillPassword(String Password){
        driver.element().type(passwordField,Password);
        return this;
    }
    public RegisterUserPage clickOnSignupForOurNewsletterCheckbox(){
        driver.element().click(signupForOurNewsletterCheckbox);
        return this;
    }
    public RegisterUserPage clickOnReceiveSpecialOffersFromOurPartnersCheckbox(){
        driver.element().click(receiveSpecialOffersFromOurPartnersCheckbox);
        return this;
    }
    public RegisterUserPage fillFirstName(String FirstName){
        driver.element().type(firstNameField,FirstName);
        return this;
    }
    public RegisterUserPage fillLastName(String LastName){
        driver.element().type(lastNameField,LastName);
        return this;
    }
    public RegisterUserPage fillCompany(String Company){
        driver.element().type(companyField,Company);
        return this;
    }
    public RegisterUserPage fillAddress(String Address){
        driver.element().type(addressField,Address);
        return this;
    }
    public RegisterUserPage fillAddress2(String Address2){
        driver.element().type(address2Field,Address2);
        return this;
    }
    public RegisterUserPage fillState(String State){
        driver.element().type(stateField,State);
        return this;
    }
    public RegisterUserPage fillCity(String City){
        driver.element().type(cityField,City);
        return this;
    }
    public RegisterUserPage fillZipCode(String ZipCode){
        driver.element().type(zipCodeField,ZipCode);
        return this;
    }
    public RegisterUserPage fillMobileNumber(String MobileNumber){
        driver.element().type(mobileNumberField,MobileNumber);
        return this;
    }
    public RegisterUserPage clickOnCreateAccountButton(){
        driver.element().click(createAccountButton);
        return this;
    }
  /*  public RegisterUserPage verifyingAccountCreatedIcon(){
        driver.element().verifyThat(accountCreatedIcon).isVisible().perform();
        return this;
    }*/
    public RegisterUserPage clickOnContinueButton(){
        driver.element().click(continueButton);
        return this;
    }
    public RegisterUserPage verifyingLoggedInAsUserNameIcon(){
        driver.element().verifyThat(loggedInAsUserNameIcon).isVisible().perform();
        return this;
    }
    public RegisterUserPage clickOnDeleteAccount(){
        driver.element().click(deleteAccountButton);
        return this;
    }

    //Assertions
    @Step("Verify that 'ACCOUNT DELETED!' is visible")
    public RegisterUserPage verifyingAccountDeletedIcon(){
        driver.element().verifyThat(accountDeletedIcon).isVisible().perform();
        return this;
    }
}
