package TestScript;

import DataProvider.DPInputs;
import PageObjectModel.Search;
import commons.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTestScript extends Driver {
    @Test(dataProvider = "AddToCart",dataProviderClass = DPInputs.class)
    public void ValidSearch(String product) throws InterruptedException {
        Search search=new Search(driver);
        search.searchItem(product);
        String search_result=search.CheckResultPage();//check user should be in result page
        Assert.assertEquals(search_result,product);
    }



}
