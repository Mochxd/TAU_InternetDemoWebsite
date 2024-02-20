package ContextMenu;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void contextMenuTest(){
        ContextMenuPage contextMenuPage = homePage.ClickContextMenu();
        contextMenuPage.clickSquare();
        assertEquals(contextMenuPage.getAlertText(),"You selected a context menu", "Error Message");
        contextMenuPage.acceptAlert();
    }
}
