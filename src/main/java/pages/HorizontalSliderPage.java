package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By sliderValue = By.id("range");
    private By slider = By.xpath("//input[@type='range']");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }
    public void setSliderValue(String value){
        while(!getSliderValue().equals(value)){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public String getSliderValue(){
        return driver.findElement(sliderValue).getText();
    }

}
