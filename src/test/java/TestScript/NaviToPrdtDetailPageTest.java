package TestScript;

import PageObjectModel.NaviToPrdtDetailPage;
import commons.Driver;
import org.testng.annotations.Test;

public class NaviToPrdtDetailPageTest extends Driver {
    @Test
    public void navigate() throws InterruptedException {
        NaviToPrdtDetailPage naviToPageDetailPage=new NaviToPrdtDetailPage(driver);
        naviToPageDetailPage.selectprdt();
    }
}
