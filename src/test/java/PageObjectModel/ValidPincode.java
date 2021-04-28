package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidPincode {
    @FindBy(xpath ="//span[@id='glow-ingress-line2']")
    private WebElement select_address;
    @FindBy(xpath = "//input[@id='GLUXZipUpdateInput']")
    private WebElement enterPin;
    @FindBy(xpath ="//input[@aria-labelledby='GLUXZipUpdate-announce']" )
    private WebElement selectClick;
    @FindBy(xpath ="//span[@id='glow-ingress-line2']" )
    private WebElement headerPin;
    public ValidPincode(WebDriver driver){
        PageFactory.initElements(driver,this); }
    public void selectYourAddressClick(){
        select_address.click();
    }
    public void enterPincode(String pincode) throws InterruptedException {
        Thread.sleep(4000);
        enterPin.sendKeys(pincode);
        selectClick.click();
    }
    public String validateHeaderPincode() throws InterruptedException {
        Thread.sleep(4000);
        String header_pincode=headerPin.getText();
        String header_pin_code=header_pincode.replaceAll("[^0-9]","");
        return header_pin_code;
    }


}
