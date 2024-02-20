package HorizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void setSlider(){
        HorizontalSliderPage horizontalSlider = homePage.ClickHorizontalSlider();
        String sliderValue = "4";
        horizontalSlider.setSliderValue("4");
        assertEquals(horizontalSlider.getSliderValue(), sliderValue,"Slider value is incorrect");
    }
}
