package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class retrievePage {
    private WebDriver driver;
    private By message = By.tagName("h1");
    public retrievePage(WebDriver driver){
        this.driver = driver;
    }
    public String getMessage(){
        return driver.findElement(message).getText();
    }

}
