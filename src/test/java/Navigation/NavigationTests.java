package Navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigator(){
        homePage.ClickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.google.com");
    }
    @Test
    public void testSwitchTab(){
        homePage.ClickMultipleWindows().clickOpenWindow();
        getWindowManager().switchTabs("New Window");
    }
}
