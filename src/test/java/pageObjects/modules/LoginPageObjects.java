package pageObjects.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import ru.yandex.qatools.allure.annotations.Step;
import utils.RandomGenerator;

/**
 * Created by cccce on 09/02/2017.
 */
public class LoginPageObjects extends PageFactoryInitializer {

    @FindBy(xpath="//button[@class='register']")
    private WebElement registerButton;

    @FindBy(xpath="//button[@class='forgot-password']")
    private WebElement forgotPasswordButton;

    @FindBy(css=".back-to-login")
    private WebElement backToLoginButton;

    @FindBy(css="div > button > span")
    private WebElement submitButton;

    @FindBy(id="emailOrUsername")
    private WebElement emailOrUsernameField;

    @FindBy(id="name")
    private WebElement nameField;

    @FindBy(id="email")
    private WebElement emailField;

    @FindBy(id="pass")
    private WebElement passwordField;

    @FindBy(id="confirm-pass")
    private WebElement confirmPasswordField;

    @FindBy(xpath="//*[@id='login-card']/div[1]/div[1]/div/div")
    private WebElement emailOrUsernameInvalidText;

    @FindBy(xpath="//*[@id='login-card']/div[1]/div[1]/div/div")
    private WebElement nameInvalidText;

    @FindBy(xpath="//*[@id='login-card']/div[1]/div[2]/div/div")
    private WebElement emailInvalidText;

    @FindBy(xpath="//*[@id='login-card']/div[1]/div[3]/div/div")
    private WebElement passwordInvalidText;

    @FindBy(xpath="//*[@id='login-card']/div[1]/div[4]/div/div")
    private WebElement confirmPasswordInvalidText;




    @Step("To Login in RocketChat")
    public void login(){
        utils.FluentWaiting.waitUntillElementToBeClickable(10, 500, emailOrUsernameField);
        emailOrUsernameField.sendKeys("testAccount1");

        utils.FluentWaiting.waitUntillElementToBeClickable(10, 500, passwordField);
        passwordField.sendKeys("testAccount1");

        utils.FluentWaiting.waitUntillElementToBeClickable(10, 500, submitButton);
        submitButton.click();
    }


//////////////////////   EXAMPLE    //////////////////////////////
//    @FindBy(xpath="//input[@id='Email']")
//    private WebElement emailIDTextBox;
//
//    @FindBy(xpath="//input[@id='next']")
//    private WebElement nextButton;
//
//    @Step("To Enter Email ID and Click Next Button")
//    public void enterEmailID()
//    {
//        utils.FluentWaiting.waitUntillElementToBeClickable(30, 500, emailIDTextBox);
//        emailIDTextBox.sendKeys(RandomGenerator.GenerateRandomEMAILIDs("google.com"));
//        nextButton.click();
//    }




}
