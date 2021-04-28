package TestScript;

import DataProvider.DPInputs;
import PageObjectModel.AddCart;
import PageObjectModel.CartDetails;
import PageObjectModel.Search;
import commons.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCartTestScript extends Driver {
    @Test(dataProvider = "AddToCart",dataProviderClass = DPInputs.class)
    public void AddToCart(String product) throws InterruptedException {
        AddCart addCart=new AddCart(driver);
        int cart_num=addCart.cartNumber();
        Assert.assertEquals(cart_num,0);
        Search search = new Search(driver);
        //search item
        search.searchItem(product);
        //result page
        String search_result=search.CheckResultPage();
        //verify user should be in correct page
        Assert.assertEquals(search_result,product);
        CartDetails CartDetails = new CartDetails(driver);
        //item list gettext
        String itemlist=CartDetails.itemList();
        //clicking in item list
        CartDetails.productDetails();
        //change tab
        CartDetails.changeTab();
        //get correct product text
        String correct_item=CartDetails.checkProductItem();

        Assert.assertEquals(correct_item,itemlist);
        //add item quantity to three
        addCart.QuantityToThree();
        //clicking AddtoCart
        addCart.clickAddToCart();

    }



}
