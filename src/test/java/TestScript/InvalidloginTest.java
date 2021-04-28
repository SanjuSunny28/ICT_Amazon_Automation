package TestScript;

import DataProvider.DPInputs;
import PageObjectModel.InvalidLogin;
import commons.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidloginTest extends Driver {
    @Test(dataProvider = "InvalidLogin", dataProviderClass = DPInputs.class)
    public void invalidlogin(String UserName) throws InterruptedException {
        InvalidLogin invalidlogin=new InvalidLogin(driver);
        invalidlogin.enterUsername(UserName);
        Thread.sleep(4000);
        boolean ermsgflag=invalidlogin.isErrorMsgPresent();
        Assert.assertEquals(true,ermsgflag);
    }

}
