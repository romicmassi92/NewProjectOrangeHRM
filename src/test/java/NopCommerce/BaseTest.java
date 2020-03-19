package NopCommerce;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends Utils{
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeTest
    public void openBrowser() {browserSelector.openBrowser();}

    @AfterTest
    public void closeBrowser(){browserSelector.CloseBrowser();}
}
