package DataProvider;

import org.testng.annotations.DataProvider;

public class DPInputs {

    @DataProvider(name ="InvalidLogin")
    public static Object[][] dataProviderInvalidLogin() {
        return new Object[][]{
                {"949754659725"}
        };
    }

    @DataProvider(name = "AddToCart")
    public static Object[][] dataProviderAddToCart(){
        return new  Object[][] {
                { "iphone 12"}
        };
    }
    @DataProvider(name = "Pincode")
    public static Object[][] dataProviderPincode(){
        return new  Object[][] {
                { "695011"}
        };
    }
    @DataProvider(name = "InValidPincode")
    public static Object[][] dataProviderInvalidPincode(){
        return new  Object[][] {
                { "1234"}
        };
    }




}
