package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortPriceHightoLow {

    @FindBy(id="twotabsearchtextbox")
    private WebElement search;
    @FindBy(className = "nav-input")
    private WebElement search_button;
    @FindBy(xpath = "//span[@id='a-autoid-0-announce']")
    private WebElement sortBy;
    @FindBy(xpath ="//a[@id='s-result-sort-select_2']")
    private WebElement highToLowClick;
    @FindBy(xpath = "//span[@id='a-autoid-2-announce']")
    private WebElement getTextHighToLow;


    public SortPriceHightoLow(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void SetHightoLow() throws InterruptedException {
        sortBy.click();
        //Thread.sleep(2000);
        highToLowClick.click();
    }
    public String extractHighToLow(){
        String HighToLow=getTextHighToLow.getText();
        System.out.println(HighToLow);
        return HighToLow;
    }


}
