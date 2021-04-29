package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class AddCart extends Driver {


    //cart count
    @FindBy(xpath = "//span[@id='nav-cart-count']")
    private WebElement cartNumberber;
    public AddCart(WebDriver driver){
        PageFactory.initElements(driver,this); }
    //get Cart Count
    public int cartNumber(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        int cart_no= Integer.parseInt(cartNumberber.getText());
        return cart_no;
    }
    //tab Change
    public void tabChange(){
        ArrayList<String> second_tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(second_tab.get(1));
    }
    //change Cart quantity to three
    public void QuantityToThree(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select drop_quantity = new Select(driver.findElement(By.xpath("//select[@id='quantity']")));//quantity locator
        drop_quantity.selectByVisibleText("3");
    }
    //click AddToCart
    public void clickAddToCart() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement addcart_location=driver.findElement(By.id("add-to-cart-button"));//add item to cart
        addcart_location.click();
        Thread.sleep(3000);
    }

}
