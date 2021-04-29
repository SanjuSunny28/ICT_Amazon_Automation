package TestScript;

import PageObjectModel.NaviToHomePage;
import commons.Driver;
import org.testng.annotations.Test;

public class NaviToHomePageTest extends Driver {

    @Test
    public void navigateSymbol() throws InterruptedException {
        NaviToHomePage naviToHomeDetailPage = new NaviToHomePage(driver);
        naviToHomeDetailPage.selectLogo();
    }
}
