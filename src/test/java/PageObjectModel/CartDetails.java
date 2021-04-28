package PageObjectModel;

import commons.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class CartDetails extends Driver {

    @FindBy(xpath = "//span[contains(text(),'New Apple iPhone 12 (128GB) - Blue')]")
    private WebElement CartDetails;
    public CartDetails(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //item list
    public void productDetails(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        CartDetails.click();
    }
    //crct prdt
    public String checkProductItem()  {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement productName=driver.findElement(By.xpath("//span[@id='productTitle']"));
        String result=productName.getText();
        return result;
    }
    //item list gettext
    public String itemList(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String result=CartDetails.getText();
        return result;
    }
    public void changeTab(){
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }
}
