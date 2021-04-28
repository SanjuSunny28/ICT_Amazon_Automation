package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidLogin {

    @FindBy(xpath = "//span[@class='nav-action-inner']//parent::a[@class='nav-action-button']")
    private WebElement header;
    @FindBy(linkText="Sign in")
    private WebElement signIn;
    @FindBy(id="ap_email")
    private WebElement userName;
    @FindBy(className="a-button-input")
    private WebElement continueClick;
    @FindBy(xpath = "//h4[text()='Incorrect phone number']")
    private WebElement errorMessage;
    public InvalidLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void enterUsername(String Username) {
        signIn.click();
        userName.sendKeys(Username);
        continueClick.click();
    }
    public boolean isHeaderSignInPresent(){
        return header.isDisplayed();
    }
    public boolean isErrorMsgPresent() {
        return errorMessage.isDisplayed();
    }

}
