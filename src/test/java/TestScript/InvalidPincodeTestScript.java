package TestScript;

import DataProvider.DPInputs;
import PageObjectModel.InvalidPincode;
import commons.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidPincodeTestScript extends Driver {
    @Test(dataProvider = "InValidPincode", dataProviderClass = DPInputs.class)
    public void InValidPincode(String pincode) throws InterruptedException {
        InvalidPincode invalidPincode=new InvalidPincode(driver);
        invalidPincode.selectYourAddressClick();
        invalidPincode.enterPincode(pincode);
        boolean value=invalidPincode.isErrorMsgPresent();
        Assert.assertEquals(value,true);
    }



}
