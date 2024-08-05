import com.shaft.driver.SHAFT;
import com.shaft.validation.Validations;
import io.qameta.allure.Step;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import static java.awt.Color.getColor;
import static java.awt.Color.orange;

public class RegisterPage {
    private SHAFT.GUI.WebDriver driver ;

    //Constructor
    public RegisterPage (SHAFT.GUI.WebDriver driver){
        this.driver = driver ;
    }

    //Locators
    private By signupPageButton = By.xpath("//a[@href=\"/login\"]");
    private By registerName = By.xpath(" //input[@data-qa=\"signup-name\"]");
    private By registerMail = By.xpath("//input[@data-qa=\"signup-email\"]");
    private By submitSignupButton = By.xpath("//button[@data-qa=\"signup-button\"]");
    private By genderMale = By.xpath(" //input[@id=\"id_gender1\"]");
    private By infoName = By.id("name");
    private By registerPassword = By.id("password");
    private By infoDay = By.id("days");
    private By birthDay = By.xpath("//select[@id=\"days\"]//option[@value=\"26\"]");
    private By infoMonth = By.id("months");
    private By birthMonth = By.xpath("//select[@id=\"months\"]//option[@value=\"10\"]");
    private By infoYear = By.id("years");
    private By birthYear = By.xpath("//option[@value=\"1998\"]");
    private By newsLetterCheckBox = By.id("newsletter");
    private By offersCheckBox = By.id("optin");
    private By firstNameField = By.id("first_name");
    private By lastNameField = By.id("last_name");
    private By companyField = By.id("company");
    private By addressOneField = By.id("address1");
    private By adressTwoField = By.id("address2");
    private By countryField = By.id("country");
    private By canadaSlot = By.xpath("//option[@value=\"Canada\"]");
    private By stateField = By.id("state");
    private By cityField = By.id("city");
    private By zipCodeField = By.id("zipcode");
    private By mobileNumberField = By.id("mobile_number");
    private By creatAccountButton = By.xpath("//button[@data-qa=\"create-account\"]");
    private By deleteAccountButton = By.xpath("//a[@href=\"/delete_account\"]");
    private By continueButton = By.xpath("//a[@data-qa=\"continue-button\"]");
    private By homePageImg = By.xpath("//img[@src=\"/static/images/home/logo.png\"]");
    private By signUpTitle = By.xpath("//div[@class=\"signup-form\"]//h2");
    private By accountInfoTitle = By.xpath("//b[text()=\"Enter Account Information\"]");
    private By infoEmail = By.id("email");
    private By loggedInAsUserTitle = By.xpath("//i[@class=\"fa fa-user\"]");
    private By accountCreatedTitle = By.xpath("//h2[@data-qa=\"account-created\"]");
    private By accountDeletedTitle = By.xpath("//h2[@data-qa=\"account-deleted\"]");

    //Actions
    public RegisterPage navigateToURL(String URL){
        driver.browser().navigateToURL(URL);
        return this ;
    }

    public RegisterPage verifyHomePage(){
        driver.element().verifyThat(homePageImg).isVisible();
        return this ;
    }

    public RegisterPage clickOnSignPageButton(){
        driver.element().click(signupPageButton);
        return this ;
    }

    public RegisterPage verifySignUpTitle() {
        driver.element().verifyThat(signUpTitle).isVisible();
        return this;
    }

    public RegisterPage fillName(String name){
        driver.element().type(registerName,name);
        return this ;
    }

    public RegisterPage fillRegisterEmail(String email){
        driver.element().type(registerMail,email);
        return this;
    }

    public RegisterPage fillLoginData (String name, String email) {
        fillName(name);
        fillRegisterEmail(email);
        return this ;
    }

    public RegisterPage clickOnSignUpButton(){
        driver.element().click(submitSignupButton);
        return this ;
    }

    public RegisterPage clickOnMale() {
        driver.element().click(genderMale);
        return this;
    }

    public RegisterPage verifyAccountInfoTitle() {
        driver.element().verifyThat(accountInfoTitle).isVisible();
        return this;
    }

    public RegisterPage clearInfoName(){
        driver.element().clear(infoName);
        return this ;
    }

    public RegisterPage fillInfoName(String name){
        driver.element().type(infoName,name);
        return this ;
    }
    public RegisterPage fillInfoPassword(String password){
        driver.element().type(registerPassword,password);
        return this ;
    }
    public RegisterPage fillInfoData (String name, String password){
        clearInfoName();
        fillInfoName(name);
        fillInfoPassword(password);
        return this ;
    }


    public RegisterPage verifyInfoEmail(String email) {
        driver.element().verifyThat(infoEmail).attribute("Value").isEqualTo(email);
        return this;
    }

    public RegisterPage fillDay(){
        driver.element().click(infoDay);
        driver.element().click(birthDay);
        return this ;
    }

    public RegisterPage fillMonth(){
        driver.element().click(infoMonth);
        driver.element().click(birthMonth);
        return this ;
    }
    public RegisterPage fillYear(){
        driver.element().click(infoYear);
        driver.element().click(birthYear);
        return this ;
    }

    public RegisterPage fillBirthDate (){
        fillDay();
        fillMonth();
        fillYear();
        return this ;
    }

    public RegisterPage clickOnNewsletterCheckBox() {
        driver.element().click(newsLetterCheckBox);
        return this ;
    }

    public RegisterPage clickOnReceiveOffersCheckBox() {
        driver.element().click(offersCheckBox);
        return this ;
    }

    public RegisterPage fillFirstName(String firstN) {
        driver.element().type(firstNameField, firstN);
        return this ;
    }

    public RegisterPage fillLastName(String lastN) {
        driver.element().type(lastNameField,lastN);
        return this ;
    }

    public RegisterPage fillCompany(String company) {

        driver.element().type(companyField,company);
        return this ;
    }

    public RegisterPage fillAddress(String addressOne) {
        driver.element().type(addressOneField,addressOne);
        return this ;
    }

    public RegisterPage fillAddressTwo(String addressTwo) {
        driver.element().type(adressTwoField,addressTwo);
        return this ;
    }
    public RegisterPage fillAddressData(String firstN, String lastN,
                                String company, String addressOne, String addressTwo) {
        fillFirstName(firstN);
        fillLastName(lastN);
        fillCompany(company);
        fillAddress(addressOne);
        fillAddressTwo(addressTwo);
        return this ;
    }
    public RegisterPage chooseCountry() {
        driver.element().click(countryField);
        driver.element().click(canadaSlot);
        return this ;
    }

    public RegisterPage fillState(String state) {
        driver.element().type(stateField,state);
        return this ;
    }

    public RegisterPage fillCity(String city) {
        driver.element().type(cityField,city);
        return this ;
    }

    public RegisterPage fillZipCode(String zipCode) {
        driver.element().type(zipCodeField,zipCode);
        return this ;
    }

    public RegisterPage fillMobileNumber(String mobileNumber) {
        driver.element().type(mobileNumberField,mobileNumber);
        return this ;
    }

    public RegisterPage fillRemainingInfo (String state, String city,
                                   String zipCode, String mobileNumber){
        fillState(state);
        fillCity(city);
        fillZipCode(zipCode);
        fillMobileNumber(mobileNumber);
        return this ;
    }

    public RegisterPage clickOnCreateAccountButton (){
        driver.element().click(creatAccountButton);
        return this ;
    }

    public RegisterPage verifyAccountCreated (){
        driver.element().verifyThat(accountCreatedTitle).isVisible();
        return this ;
    }

    public RegisterPage clickOnContinueButton (){
        driver.element().click(continueButton);
        return this ;
    }

    public RegisterPage verifyLoggedInTitle (){
        driver.element().verifyThat(loggedInAsUserTitle).isVisible();
        return this ;
    }

    public RegisterPage clickOnDeleteAccountButton (){
        driver.element().click(deleteAccountButton);
        return this ;
    }


    //Assertions
    @Step("Validate that account is deleted")
    public void validateAccountDeleted(){
        driver.element().verifyThat(accountDeletedTitle).isVisible().perform();
    }


}
