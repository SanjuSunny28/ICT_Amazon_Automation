package TestScript;

import DataProvider.DPInputs;
import PageObjectModel.*;
import commons.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SaveForLaterTest extends Driver {

    @Test(dataProvider = "AddToCart",dataProviderClass = DPInputs.class)
    public void SaveforLater(String product) throws InterruptedException {
        AddCart addCart=new AddCart(driver);
        int cart_num=addCart.cartNumber();
        Assert.assertEquals(cart_num,0);
        Search search = new Search(driver);
        //search item
        search.searchItem(product);
        //result page
        String Srchrslt=search.CheckResultPage();
        //verify user should be in correct page
        Assert.assertEquals(Srchrslt,product);
        CartDetails CartDetails = new CartDetails(driver);
        //item list gettext
        String itemlist=CartDetails.itemList();
        //clicking in item list
        CartDetails.productDetails();
        // change tab
        CartDetails.changeTab();
        //get correct product text
        String correct_item=CartDetails.checkProductItem();
        //checking product details
        Assert.assertEquals(correct_item,itemlist);
        //clicking AddtoCart
        addCart.clickAddToCart();
        RemoveFromCart remove_from_cart=new RemoveFromCart();
        //click Cart
        remove_from_cart.cartClick();
        //get Cart Page Item
        String cartitem=remove_from_cart.cartPageItem();
        //check product and Cart page product
        Assert.assertEquals(cartitem,correct_item);
        SaveForLater saveForLater=new SaveForLater();
        //click save later button
        saveForLater.saveLater();
        //save for later page and message is present
        boolean msg_present=saveForLater.isItemInSaveForLater();
        //check save for later message is present
        Assert.assertEquals(msg_present,true);

        String cartnumber=remove_from_cart.cartCount();
        //check cart count is zero
        Assert.assertEquals(cartnumber,"0");


    }


}
