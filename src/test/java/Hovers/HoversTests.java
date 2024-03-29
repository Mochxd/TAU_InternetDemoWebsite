package Hovers;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoversTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"CaptionNotDisplayed");
        assertEquals(caption.getTitle(),"name: user1","caption title incorrect");
        assertEquals(caption.getLinkText(),"View profile","CaptionLinkText not correct");
        assertTrue(caption.getLink().endsWith("/users/1"),"link incorrect");
    }
}
