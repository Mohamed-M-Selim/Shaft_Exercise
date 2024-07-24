import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

    public class PlaceOrder {
        private SHAFT.GUI.WebDriver driver ;

        //Constructor
        public PlaceOrder(SHAFT.GUI.WebDriver driver){
            this.driver = driver ;
        }

        //Locators
        private By homePageLogoFeild = By.xpath("//div[@class=\"logo pull-left\"]//img[@src=\"/static/images/home/logo.png\"]");
        private By loginHomePageButton = By.xpath("//a[@href=\"/login\"]");
        private By newUserSignup = By.xpath("//div[@class=\"signup-form\"]//h2");
        private By nameField = By.xpath("//input[@name=\"name\"]");
        private By emailField = By.xpath("//input[@data-qa=\"signup-email\"]");
        private By signupButton = By.xpath("//button[@data-qa=\"signup-button\"]");
        private By enterAccountInformationText = By.xpath("//b[contains(text(), 'Enter Account Information')]");
        private By createAccountnameField = By.xpath("//input[@name=\"name\"]");
        private By createAccountEmailField = By.xpath("//input[@name=\"email\"]");
        private By createAccountPasswordField = By.xpath("//input[@name=\"password\"]");
        private By daysForDateOfBirth = By.xpath("//select[@name=\"days\"]");
        private By monthsForDateOfBirth = By.xpath("//select[@name=\"months\"]");
        private By yearsForDateOfBirth = By.xpath("//select[@name=\"years\"]");
        private By tilteButton = By.xpath("//input[@id=\"id_gender1\"]");
        private By newsletter = By.xpath("//input[@id=\"newsletter\"]");
        private By speicalOfferButton = By.xpath("//input[@name=\"optin\"]");
        private By addressFirstNameField = By.xpath("//input[@name=\"first_name\"]");
        private By addressLastNameField = By.xpath("//input[@name=\"last_name\"]");
        private By companyNameField = By.xpath("//input[@ name=\"company\"]");
        private By addressField = By.xpath("//input[@name=\"address1\"]");
        private By addressFieldTwo = By.xpath("//input[@name=\"address2\"]");
        private By countryName = By.xpath("//select[@name=\"country\"]");
        private By stateName = By.xpath("//input[@name=\"state\"]");
        private By cityName = By.xpath("//input[@name=\"city\"]");
        private By zipCode = By.xpath("//input[@name=\"zipcode\"]");
        private By mobileNumber = By.xpath("//input[@name=\"mobile_number\"]");
        private By createAccountButton = By.xpath("//button[@data-qa=\"create-account\"]");
        private By accountCreatedVerification = By.xpath("//h2[@data-qa=\"account-created\"]");
        private By continueButton = By.xpath("//a[@data-qa=\"continue-button\"]");
        private By loggedInAs = By.xpath("//a[contains(text(), \"Logged in as\")]");
        private By homePageProductButton = By.xpath("//ul[@class=\"nav navbar-nav\"]//a[@href=\"/products\"]");
        private By firstProductViewButton = By.xpath("//ul [@class=\"nav nav-pills nav-justified\"]//li//a[@href=\"/product_details/1\"]");
        private By addToCartButton = By.xpath("//span//button[@ type=\"button\"]");
        private By continueShoppingButton = By.xpath("//div[@class=\"modal-footer\"]//button[@class=\"btn btn-success close-modal btn-block\"]");
        private By homePageCartButton = By.xpath("//ul[@class=\"nav navbar-nav\"]//a[@href=\"/view_cart\"]");
        private By checkOutButton = By.xpath("//a[@class=\"btn btn-default check_out\"]");
        private By addressField = By.xpath("//a[@class=\"btn btn-default check_out\"]");
        //Actions
        //Before create account
        public PlaceOrder navigateToURL(String URL){
            driver.browser().navigateToURL(URL);
            return this ;
        }
        public PlaceOrder clickOnLoginHomePageButton(){
            driver.element().click(loginHomePageButton);
            return this ;
        }
        public PlaceOrder fillName(String Name){
            driver.element().type(nameField, Name);
            return this ;
        }
        public PlaceOrder fillEmail(String Email){
            driver.element().type(emailField, Email);
            return this ;
        }
        public PlaceOrder clickOnSignUpButton(){
            driver.element().click(signupButton);
            return this ;
        }
        //Enter Account Information
        public PlaceOrder fillAccountName(String AccountName){
            driver.element().type(createAccountnameField, AccountName);
            return this ;
        }
        public PlaceOrder fillAccountEmail(String AccountEmail){
            driver.element().type(createAccountEmailField, AccountEmail);
            return this ;
        }
        public PlaceOrder fillAccountPassword(String AccountPassword){
            driver.element().type(createAccountPasswordField, AccountPassword);
            return this ;
        }
        public PlaceOrder selectDayOfBirthDate(String SelectDay){
            driver.element().select(daysForDateOfBirth, SelectDay);
            return this ;
        }
        public PlaceOrder selectMonthOfBirthDate(String SelectMonth){
            driver.element().select(monthsForDateOfBirth, SelectMonth);
            return this ;
        }
        public PlaceOrder selectYearsOfBirthDate(String SelectYear){
            driver.element().select(yearsForDateOfBirth, SelectYear);
            return this ;
        }
        public PlaceOrder clickOnTitleButton(){
            driver.element().click(tilteButton);
            return this ;
        }
        public PlaceOrder clickOnNewsLetterButton(){
            driver.element().click(newsletter);
            return this ;
        }
        public PlaceOrder clickOnSpeicalOfferButton(){
            driver.element().click(speicalOfferButton);
            return this ;
        }
        //Address Information
        public PlaceOrder addressFirstName(String AddressFirstName){
            driver.element().type(addressFirstNameField, AddressFirstName);
            return this ;
        }
        public PlaceOrder addressLastName(String AddressLastName){
            driver.element().type(addressLastNameField, AddressLastName);
            return this ;
        }
        public PlaceOrder companyNameField(String CompanyName){
            driver.element().type(companyNameField, CompanyName);
            return this ;
        }
        public PlaceOrder addressField(String Address){
            driver.element().type(addressField, Address);
            return this ;
        }
        public PlaceOrder addressFieldTwo(String AddressTwo){
            driver.element().type(addressFieldTwo, AddressTwo);
            return this ;
        }
        public PlaceOrder selectCountryName(String SelectCountry){
            driver.element().select(countryName, SelectCountry);
            return this ;
        }
        public PlaceOrder stateField(String StateName){
            driver.element().type(stateName,StateName);
            return this ;
        }
        public PlaceOrder cityField(String CityName){
            driver.element().type(cityName,CityName);
            return this ;
        }
        public PlaceOrder zipCodeField(String ZipCode){
            driver.element().type(zipCode,ZipCode);
            return this ;
        }
        public PlaceOrder mobileNumber(String MobileNumber){
            driver.element().type(mobileNumber,MobileNumber);
            return this ;
        }
        public PlaceOrder clickOnCreateAccountButton(){
            driver.element().click(createAccountButton);
            return this ;
        }
        public PlaceOrder clickOnContinueButton() {
            driver.element().click(continueButton);
            return this;
        }
        public PlaceOrder clickOnProductHomeButton(){
            driver.element().click(homePageProductButton);
            return this ;
        }
        public PlaceOrder clickOnFirstProductViewButton() {
            driver.element().click(firstProductViewButton);
            return this;
        }

        public PlaceOrder clickOnFirstProductAddToCartButton() {
            driver.element().click(addToCartButton);
            return this;
        }

        public PlaceOrder clickOnFirstProductContinueShoppingButton() {
            driver.element().click(continueShoppingButton);
            return this;
        }

        public PlaceOrder clickOnHomePageCartButton() {
            driver.element().click(homePageCartButton);
            return this;
        }
        public PlaceOrder clickOnCheckOutButton() {
            driver.element().click(homePageCartButton);
            return this;
        }



        //Assertions
        @Step("Verify that home page is visible successfully")
        public void validateHomePageVisibility(){
            driver.element().verifyThat(homePageLogoFeild).isVisible().perform();
        }
        @Step("Verify that ENTER ACCOUNT INFORMATION is visible")
        public void verifyThatEnterAccountInformationIsVisible(){
            driver.element().verifyThat(enterAccountInformationText).isVisible().perform();
        }
        @Step("Verify that Account Created is visible")
        public void verifyThatAccountCreatedIsVisible(){
            driver.element().verifyThat(accountCreatedVerification).isVisible().perform();
        }
        @Step("Verify that User Logged In")
        public void verifyLoggedInAsMohamedIsVisible(){
            driver.element().verifyThat(loggedInAs).isVisible().perform();
        }
        @Step("Verify that cart page is displayed")
        public void validateCartPageVisibility() {
            driver.element().verifyThat(checkOutButton).isVisible().perform();
        }



















}
