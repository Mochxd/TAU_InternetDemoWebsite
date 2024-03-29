package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1 = By.xpath("//a[contains(@href, 'loading/1')]");
    private By example2 = By.xpath("//a[contains(@href, 'loading/2')]");
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    public DynamicLoadingPageEx1 clickExample1(){
        driver.findElement(example1).click();
        return new DynamicLoadingPageEx1(driver);
    }
    public DynamicLoadingPageEx2 clickExample2(){
        driver.findElement(example2).click();
        return new DynamicLoadingPageEx2(driver);
    }
}
