package TestScript;

import DataProvider.DPInputs;
import PageObjectModel.ValidPincode;
import commons.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidPincodeTestScript extends Driver {
    @Test(dataProvider = "Pincode", dataProviderClass = DPInputs.class)
    public void pincodeValidate(String pincode) throws InterruptedException {
        ValidPincode validPincode=new ValidPincode(driver);
        validPincode.selectYourAddressClick();
        validPincode.enterPincode(pincode);
        String extractpincode=validPincode.validateHeaderPincode();
        Assert.assertEquals(extractpincode,pincode);
    }



}
