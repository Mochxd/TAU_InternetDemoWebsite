package Frame;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;
import static org.testng.Assert.assertEquals;


public class FrameTests extends BaseTests {
    @Test
    public void frameTest(){
        WYSIWYGEditorPage WYSIWYGEditorPage = homePage.ClickWYSIWYGEditor();
        WYSIWYGEditorPage.clearTextArea();
        WYSIWYGEditorPage.setTextArea("Hello");
        WYSIWYGEditorPage.clickIncreaseIndent();
        WYSIWYGEditorPage.setTextArea("World");
        assertEquals(WYSIWYGEditorPage.getTextArea(),"Hello World", "Text from Editor Text is incorrect");
    }
}
