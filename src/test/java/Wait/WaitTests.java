package Wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPageEx1;
import pages.DynamicLoadingPageEx2;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {
    @Test
    public void example1Test(){
        DynamicLoadingPageEx1 example1 = homePage.ClickDynamicLoading().clickExample1();
        example1.clickStart();
        assertEquals(example1.getLoadedText(),"Hello World!","Error msg");
    }
    @Test
    public void example2Test(){
        DynamicLoadingPageEx2 example2 = homePage.ClickDynamicLoading().clickExample2();
        example2.clickStart();
        assertEquals(example2.getLoadedText(),"Hello World!","Error msg");
    }
}
