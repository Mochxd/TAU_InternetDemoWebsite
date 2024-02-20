package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[contains(text(),'Click for JS Alert')]");
    private By triggerConfirmButton = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    private By triggerPrompt = By.xpath("//button[contains(text(),'Click for JS Prompt')]");
    private By resultText = By.id("result");
    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickJsAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String alertResultText(){
        return driver.findElement(resultText).getText();
    }
    public void clickJsConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void clickJsPrompt(){
        driver.findElement(triggerPrompt).click();
    }
    public void fillPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
    }
}
