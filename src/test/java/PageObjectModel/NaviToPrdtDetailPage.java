package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaviToPrdtDetailPage {
    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    private WebElement hamburger;
    @FindBy(xpath = "//a[@class='hmenu-item' and @data-menu-id=8]")
    private WebElement category;
    @FindBy(xpath = "//ul[@data-menu-id=8]//a[@class='hmenu-item']")
    private WebElement subcategory;
    public NaviToPrdtDetailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void selectprdt() throws InterruptedException {

        hamburger.click();
        Thread.sleep(2000);
        category.click();
        Thread.sleep(2000);
        subcategory.click();
    }




}
