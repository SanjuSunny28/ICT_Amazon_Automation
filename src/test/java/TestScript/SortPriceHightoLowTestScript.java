package TestScript;

import DataProvider.DPInputs;
import PageObjectModel.Search;
import PageObjectModel.SortPriceHightoLow;
import commons.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SortPriceHightoLowTestScript extends Driver {
    @Test(dataProvider = "AddToCart",dataProviderClass = DPInputs.class)
    public void Sort(String pdt) throws InterruptedException {
        Search search=new Search(driver);
        search.searchItem(pdt);
        SortPriceHightoLow sorting=new SortPriceHightoLow(driver);
        sorting.SetHightoLow();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String text=sorting.extractHighToLow();
        Assert.assertEquals(text,"Sort by:Price: High to Low");
    }



}
