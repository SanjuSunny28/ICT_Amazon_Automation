package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SaveForLater extends Driver {
    //click save for later
    public void saveLater() throws InterruptedException {
        driver.findElement(By.xpath("//input[@value='Save for later']")).click();
        Thread.sleep(4000);
    }
    //save for later page and the message is present 
    public boolean isItemInSaveForLater(){
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement message_present=driver.findElement(By.xpath("//div[@id='sc-saved-cart-list-caption-text']"));
        return message_present.isDisplayed();
    }


}
