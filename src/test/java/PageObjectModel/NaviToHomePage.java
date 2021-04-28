package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaviToHomePage {
    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    private WebElement hamburger;
    @FindBy(xpath = "//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[28]/a[1]")
    private WebElement customer;
    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    private WebElement logo;


    public NaviToHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectLogo() throws InterruptedException {
        hamburger.click();
        Thread.sleep(2000);
        customer.click();
        Thread.sleep(2000);
        logo.click();
        Thread.sleep(2000);
    }


}




