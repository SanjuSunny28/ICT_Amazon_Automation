package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class RemoveFromCart extends Driver {

    //clickCart
    public void cartClick(){
        driver.findElement(By.xpath("//*[@id='attach-view-cart-button-form']")).click();
    }
    //getcart PageItem
    public String cartPageItem(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement ctm=driver.findElement(By.xpath("//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-mini sc-info-block']//span[1]"));
        String cartitem=ctm.getText();
        return cartitem;
    }
    //click Delete
    public void delete() throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='Delete']")).click();
        Thread.sleep(4000);
    }
    //check the empty message is present
    public boolean isEmptyMsgPresent(){
        WebElement emptymsg=driver.findElement(By.xpath("//div[@class='a-row sc-your-amazon-cart-is-empty']//h2"));
        return emptymsg.isDisplayed();
    }
    //get the cart count 
    public String cartCount(){
        String cart_number=driver.findElement(By.xpath("//span[@id='nav-cart-count']")).getText();
        return cart_number;
    }

}
