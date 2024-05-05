package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By signupButton = By.xpath("//button[text()=\" Sign up \"]");
    private By firstNameField = By.cssSelector("input[name='firstName']");
    private By lastNameField = By.cssSelector("input[name='lastName']");
    private By emailField = By.cssSelector("input[name='emailOrphone']");
    private By phoneField = By.cssSelector("input.phone-number-input");
    private By passwordField = By.cssSelector("input[name='password']");
    private By agreeToPolicyCheckbox = By.cssSelector("svg.empty");
    private By createAccountButton = By.xpath("//div[@class=\"auth-body\"]//button[text()=\" Create account \"]");
    private By otpMessage = By.xpath("//h3[text()=\"Please enter the OTP to verify your phone number  \"]");
    public void clickSignupButton() {
        driver.findElement(signupButton).click();
    }
    public void setFirstName(String firstName) { driver.findElement(firstNameField).sendKeys(firstName); }
    public void setLastName(String lastName) { driver.findElement(lastNameField).sendKeys(lastName); }
    public void setEmail(String email) { driver.findElement(emailField).sendKeys(email); }
    public void setPhone(String phone) { driver.findElement(phoneField).sendKeys(phone); }
    public void setPassword(String password) { driver.findElement(passwordField).sendKeys(password); }
    public void clickAgreeToPolicy() {
        driver.findElement(agreeToPolicyCheckbox).click();
    }
    public void clickCreateAccountButton() {
        driver.findElement(createAccountButton).click();
    }

    public String getOTPMessageText() {
        var text = driver.findElement(otpMessage).getText();
        return text;
    }
    public HomePage(WebDriver driver){
        this.driver = driver;
    }



}