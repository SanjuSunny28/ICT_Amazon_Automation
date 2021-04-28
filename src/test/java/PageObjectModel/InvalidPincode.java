package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvalidPincode {

    @FindBy(xpath ="//span[@id='glow-ingress-line2']")
    private WebElement selectAddress;
    @FindBy(xpath = "//input[@id='GLUXZipUpdateInput']")
    private WebElement enterPin;
    @FindBy(xpath ="//input[@aria-labelledby='GLUXZipUpdate-announce']" )
    private WebElement selectClick;
    @FindBy(xpath ="//span[@id='glow-ingress-line2']" )
    private WebElement headerPin;
    @FindBy(xpath ="//div[@class='a-box-inner a-alert-container']")
    private WebElement errorMessage;
    public InvalidPincode(WebDriver driver){
        PageFactory.initElements(driver,this); }
    public void selectYourAddressClick(){
        selectAddress.click();
    }
    public void enterPincode(String pincode) throws InterruptedException {
        Thread.sleep(4000);
        enterPin.sendKeys(pincode);
        selectClick.click();
        Thread.sleep(4000);
    }
    public boolean isErrorMsgPresent() {
        return errorMessage.isDisplayed();
    }




}
