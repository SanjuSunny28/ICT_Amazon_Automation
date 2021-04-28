package TestScript;

import DataProvider.DPInputs;
import PageObjectModel.AddCart;
import PageObjectModel.CartDetails;
import PageObjectModel.RemoveFromCart;
import PageObjectModel.Search;
import commons.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveFromCartTestScript extends Driver {
    @Test(dataProvider = "AddToCart",dataProviderClass = DPInputs.class)
    public void removeFROMcart(String product) throws InterruptedException {
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
        //changetab
        CartDetails.changeTab();
        //get text of correct product
        String correct_item=CartDetails.checkProductItem();
        //checking product deyails
        Assert.assertEquals(correct_item,itemlist);
        //clicking AddtoCart
        addCart.clickAddToCart();
        RemoveFromCart remove_from_cart=new RemoveFromCart();
        //clickCart
        remove_from_cart.cartClick();
        //get CartPageItem
        String cartitem=remove_from_cart.cartPageItem();
        //check product and Cart page product
        Assert.assertEquals(cartitem,correct_item);
        //click delete
        remove_from_cart.delete();
        //get empty message is present
        boolean emptymsg=remove_from_cart.isEmptyMsgPresent();
        //check empty message  is present
        Assert.assertEquals(emptymsg,true);
        //get cart count
        String cartnumber=remove_from_cart.cartCount();
        //check cart count is zero
        Assert.assertEquals(cartnumber,"0");

    }




}
